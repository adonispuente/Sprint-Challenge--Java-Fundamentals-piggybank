package com.lambda.sprint;

public class Quarter extends Money{

    public Quarter(int amount)
    {
        super(amount);//grabbing from parent
    }


    //make the abstract methods
    @Override
    public String getName()
    {
        if (amount > 1)
        {
            return amount + " Quarters";
        }
        else
        {
            return amount + " Quarter";
        }
    }
    @Override
    public double getValue()
    {
        return amount * .25;
    }
}
