package com.lambda.sprint;

public class Dollar extends Money {
//this is the method to create the actual dollar
    public Dollar(int amount)
    {
        super(amount);//grabbing from parent
    }


    //make the abstract methods
    @Override
    public String getName()
    {
        if (amount > 1)
        {
            return amount + " Dollars";
        }
        else
        {
            return amount + " Dollar";
        }
    }
    @Override
    public double getValue()
    {
        return amount * 1.00;
    }

}
