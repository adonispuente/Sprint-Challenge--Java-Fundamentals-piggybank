package com.lambda.sprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.text.DecimalFormat;


@SpringBootApplication
public class SprintApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintApplication.class, args);
        System.out.println("Lambda Java Sprint");

        DecimalFormat df = new DecimalFormat("$###,###.00");
        ArrayList<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        //We can only get the value of one thing, so create a new variable and make a for loop to
        //make that one variable, total, equal too all the money combined
        //get value is an abstract method but I defined it in every money type, so a for m: Piggybank
        //will hopefully get the value of everything, add them together, and make total equal that



        //How to use decimal format???
        //total works but shows 7.3, not 7.30
        // format needs an arguement, the argument is gonna have to be total, slide df on total
        double total = 0;
        for(Money m: piggyBank){
            total +=m.getValue();
        }
        System.out.println("Total is " + df.format(total));

        //get the money to show individually
        //probly a for loop
        //attempt 2
        for(Money m : piggyBank)
        {
            System.out.println(m.getName() + ": " + df.format(m.getValue()));
        }

    }

}
