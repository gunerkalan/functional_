package funtionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //System.out.println(isPhoneNumberValid("07000000000"));
        //System.out.println(isPhoneNumberValid("12121212121"));

        //System.out.println(isPhoneNumberValidPredicate.test("07111111111"));

        //System.out.println(containsNumber3.test("1544530564"));

        System.out.println(
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000000231")
        );

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
