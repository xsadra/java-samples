package controller;

import sample.BankAccount;
import sample.Person;

public class BuilderPattern {

    public static void run() {
        builderPatternUsingNew ();

        builderPattern();

    }

    private static void builderPattern() {
        Person person = Person.newPerson()
                .name("foo")
                .lastName("bar")
                .age(99)
                .create();

        System.out.println(person);
    }

    private static void builderPatternUsingNew (){
        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account);
    }


}
