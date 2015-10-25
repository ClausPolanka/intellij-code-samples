package com.jetbrains.inspections;

import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.out;

public class LocateDuplicates {
    public static void main(String[] args) {
        String concat = "";
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            out.println(arg);

            concat += arg + ", ";
        }

        try {
            FileWriter fw = new FileWriter("temp");
            fw.write(concat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Locate via Analyze > Locate Duplicates
    //Notice renamed variable names are not considered
    public class DuplicateClass {
        public void duplicate(String[] params) {
            String string = "";
            for (int i = 0; i < params.length; i++) {
                String param = params[i];
                out.println(param);

                string += param + ", ";
            }

            try {
                FileWriter writer = new FileWriter("file");
                writer.write(string);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
