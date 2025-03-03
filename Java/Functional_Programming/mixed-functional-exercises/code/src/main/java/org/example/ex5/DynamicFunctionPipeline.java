package org.example.ex5;

import java.util.List;
import java.util.function.Function;

public class DynamicFunctionPipeline {

    public static Integer dynamicFunctionPipeline(List<Function<Integer, Integer>> functionList, Integer value) {
        int returnValue = value;
        for (Function<Integer, Integer> function : functionList) {
            returnValue = function.apply(returnValue);
        }
        return returnValue;
    }

}
