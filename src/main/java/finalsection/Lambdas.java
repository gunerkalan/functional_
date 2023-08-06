package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        BiFunction<String,Integer, String> upperCaseNameTwo = (name,age) -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        System.out.println(upperCaseNameTwo.apply("Alex",20));
    }

    Function<String, String> upperCaseName = name -> {
        if(name.isBlank()) throw new IllegalArgumentException("");
        return name.toUpperCase();
    };


    class Service{

        public Consumer<String> blah = s -> {

        };
    }
}
