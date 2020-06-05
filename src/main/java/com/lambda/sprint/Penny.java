package com.lambda.sprint;

public class Penny extends Money{
    public Penny(int amount)
    {
        super(amount);//grabbing from parent
    }


    //make the abstract methods
    @Override
    public String getName()
    {
        if (amount > 1)
        {
            return amount + " Pennies";
        }
        else
        {
            return amount + " Penny";
        }
    }
    @Override
    public double getValue()
    {
        return amount * .01;
    }
}
