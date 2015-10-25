package com.jetbrains.refactoring;

import static java.lang.System.out;

public class MakeStatic {
    private String s;
    private int i;

    /**
     * Apply "Make static" refactoring.
     */
    public void printMe() {
        for (int j = 0; j < i; j++) {
            out.println(s);
        }
    }
}
