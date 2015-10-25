package com.jetbrains.inspections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

import static java.lang.System.out;
import static java.util.Arrays.sort;

public class Java8Inspections {
    public void lambdas() {
        //Anonymous function Function<Function, Function>() can be replaced with lambda
        Function<Function, Function> f1 = new Function<Function, Function>() {
            @Override
            public Function apply(Function function) {
                return function.compose(function);
            }
        };

        //Expand lambda expression body to {...}
        Function<Function, Function> f2 = function -> function.compose(function);

        //Remove redundant types
        Function<Function, Function> f3 = (Function function) -> function.compose(function);

        //Statement lambda can be replaced with expression lambda
        Function<Function, Function> f4 = (Function function) -> {
            return function.compose(function);
        };

        //Lambda can be replaced with method reference
        String[] stringArray = {"IntelliJ IDEA", "AppCode", "CLion", "0xDBE", "Upsource"};
        sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //Replace with forEach
        ArrayList<String> foo = new ArrayList<>();
        for (String s : foo) {
            if (s != null) {
                out.println(s);
            }
        }
    }
}
