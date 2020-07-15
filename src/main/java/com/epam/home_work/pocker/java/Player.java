package com.epam.home_work.pocker.java;

public class Player extends Participant
{

    public Player(String name, int amount)
    {
        super(name, amount);
    }

    @Override
    protected int getProbabilityBet()
    {
        return 2;
    }
}
