package finalsection;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        hello("John","",value ->{
            System.out.println("no lastname povided" + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }
    }
}
