package com.jetbrains.debugging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class LambdaEvaluation {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.addAll(asList(("I do not know where family doctors acquired illegibly perplexing handwriting; " +
            "nevertheless, extraordinary pharmaceutical intellectuality counterbalancing indecipherability " +
            "transcendentalizes intercommunication’s incomprehensibleness").split(" ")));
        //Evaluate the following lambda in debugger: words.stream().filter(s -> s.length() < 13).toArray()
    }
}
