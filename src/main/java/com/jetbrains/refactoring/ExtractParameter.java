package com.jetbrains.refactoring;

import java.lang.reflect.Parameter;

import static java.lang.System.out;

public class ExtractParameter {
    public void extractParameter(Parameter p) {
        //Extract parameter via Ctrl/Cmd+Alt+P
        Parameter parameter = getClass().getEnclosingMethod().getParameters()[0];

        out.println(parameter.getName());
    }
}
