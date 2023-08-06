package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+05053331199",
                LocalDate.of(2000,1,1)
        );

        System.out.println(new CustomerValidateService().isValid(customer));

        //using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isValidPhoneNumber())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
