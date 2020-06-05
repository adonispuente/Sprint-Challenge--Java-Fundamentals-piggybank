package com.lambda.sprint;

public abstract  class Money {
    public int amount;
    //constructor
    public Money(int amount){
        this.amount=amount;
    }
    public Money()
    {
        this.amount +=1;
    }

    //abstract method like in animals
    public abstract double getValue();
    public abstract String getName();

}
