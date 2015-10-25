package com.jetbrains.inspections;

import com.jetbrains.CallMe;

import static com.jetbrains.CallMe.*;
import static java.lang.System.out;

public class NullityInference {
    public void testAnnotationInference(Object nullityUnknown) {
        if (neverReturnsNull() == null) {
            //Condition 'CallMe.neverReturnsNull() == null' is always 'false'.
        }

        if (alwaysReturnsSame(new Object()) == null) {
            //Condition 'CallMe.alwaysReturnsSame(new Object()) == null' is always 'false'.
        }

        if (alwaysReturnsSame(null) == null) {
            //Condition 'CallMe.alwaysReturnsSame(new Object()) == null' is always 'true'.
        }

        if (!isNull(nullityUnknown)) {
            out.println(nullityUnknown.toString());
            return;
        }

        out.println(nullityUnknown.toString());
        //Method invocation 'nullityUnknown.toString()' may produce 'java.lang.NullPointerException'

        out.println(nullityUnknown.toString());

        //These do not seem to work correctly:
        out.println(alwaysReturnsNull().toString());
        out.println(sometimesReturnsNull().toString());

        alwaysExpectsNull(null);
        neverExpectsNull(null);
        //Passing 'null' argument to parameter annotated as @NotNull (never explicitly annotated)
    }
}
