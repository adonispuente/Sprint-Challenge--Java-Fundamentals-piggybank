package com.lambda.sprint;

public class Nickel extends Money{

    public Nickel(int amount)
    {
        super(amount);//grabbing from parent
    }


    //make the abstract methods
    @Override
    public String getName()
    {
        if (amount > 1)
        {
            return amount + " Nickles";
        }
        else
        {
            return amount + " Nickle";
        }
    }
    @Override
    public double getValue()
    {
        return amount * .05;
    }
}
