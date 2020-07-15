package com.epam.home_work.pocker.java;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;
import java.util.Random;

@Data
@AllArgsConstructor
public abstract class Participant
{
    private String name;
    private int amount;
    private static Random random = new Random();

    protected abstract int getProbabilityBet();

    public Optional<Bet> makeBet()
    {
        if (random.nextInt(10) <= getProbabilityBet())
            return Optional.of(new Bet(name, random.nextInt(amount)));
        else return Optional.empty();
    }
}
