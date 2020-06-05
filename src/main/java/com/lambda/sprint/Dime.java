package com.lambda.sprint;

public class Dime extends Money {
    public Dime(int amount)
    {
        super(amount);//grabbing from parent
    }


    //make the abstract methods
    @Override
    public String getName()
    {
        if (amount > 1)
        {
            return amount + " Dimes";
        }
        else
        {
            return amount + " Dime";
        }
    }
    @Override
    public double getValue()
    {
        return amount * .10;
    }
}
