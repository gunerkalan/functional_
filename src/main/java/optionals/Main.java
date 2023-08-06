package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                .orElseGet(()->"default value");

        System.out.println(value);

        Supplier<IllegalArgumentException> exceptionSupplier = ()-> new IllegalArgumentException("exception");

        Object valueTwo = Optional.ofNullable("Hello")
                .orElseThrow(exceptionSupplier);

        System.out.println(valueTwo);

        //business logis
        Optional.ofNullable("Merhaba")
                .ifPresent(System.out::println);

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        ()->{
                            System.out.println("can not sent email");
                        });


    }
}
