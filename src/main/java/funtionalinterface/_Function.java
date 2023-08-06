package funtionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = integerIntegerFunction.apply(1);
        System.out.println(increment2);

        int multipleBy10Function = multipleBy10.apply(increment2);
        System.out.println(multipleBy10Function);

        //Function<Integer,Integer> addByOne =
                //integerIntegerFunction.andThen(multipleBy10Function);
    }

    static Function<Integer, Integer> integerIntegerFunction = number -> number +1;

    static Function<Integer,Integer> multipleBy10 = number -> number *10;

    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiply){
        return (number+1) * numToMultiply;
    }
}
