package org.example.ex6;

import org.example.ex5.DynamicFunctionPipeline;

import java.util.List;
import java.util.function.Function;

public class Ex6Tester {

    private static String applyTransformations(String str, Transformer<String> ... transformers) {
        String transformedString = str;
        for (Transformer<String> transformer : transformers) {
            transformedString = transformer.transform(transformedString);
        }
        return transformedString;

    }

    public static void test() {
        System.out.println("Test: Ex6 --------------------");

        Transformer<String> convertToUppercase = String::toUpperCase;
        Transformer<String> removeSpaces = str -> str.replaceAll(" ", "");
        Transformer<String> reverseString = str -> (new StringBuilder(str)).reverse().toString();

        String str = "abc de fgH";
        System.out.println("Uppercase > remove spaces > reverse string To: " + str);
        System.out.println(applyTransformations(str, convertToUppercase, removeSpaces, reverseString));

    }

}
