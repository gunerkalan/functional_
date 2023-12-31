package com.guner.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.guner.functional.Main.Gender.FEMALE;
import static com.guner.functional.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("John",MALE),
                new Person("Maria",FEMALE),
                new Person("Aisha",FEMALE),
                new Person("Alex",MALE),
                new Person("Alice",FEMALE)
        );

        System.out.println("Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        System.out.println("Declarative approach");
        //Declarative approach

        people.stream().filter(person -> person.gender.equals(FEMALE))
                .forEach(System.out::println);

        List<Person> genders =  people.stream().filter(person -> person.gender.equals(MALE))
                .toList();

        genders.forEach(System.out::println);

        Predicate<Person> personPredicate = person -> person.gender.equals(FEMALE);


    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
