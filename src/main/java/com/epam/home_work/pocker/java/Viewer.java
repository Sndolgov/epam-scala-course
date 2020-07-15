package com.epam.home_work.pocker.java;

public class Viewer extends Participant
{
    public Viewer(String name, int amount)
    {
        super(name, amount);
    }

    @Override
    protected int getProbabilityBet()
    {
        return 1;
    }
}
