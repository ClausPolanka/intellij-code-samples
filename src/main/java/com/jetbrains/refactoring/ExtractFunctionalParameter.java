package com.jetbrains.refactoring;

import static java.lang.Double.valueOf;

public class ExtractFunctionalParameter {
    public static void main(String[] args) {
        doStuff();
    }

    private static void doStuff() {
        long i = 0;
        String s = "d";

        //Extract functional parameter as BiFunction (Ctrl/Cmd+Alt+Shift+P)
        Double d = stringToDouble(i + s);
    }


    @FunctionalInterface
    public interface MyFunction<A, B, C, D> {
        public D convert(A a, B b, C c);
    }

    public static double stringToDouble(String s) {
        return valueOf(s);
    }

    class MyClass {
        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        String s = "";
        Integer i = 1;
    }
}
