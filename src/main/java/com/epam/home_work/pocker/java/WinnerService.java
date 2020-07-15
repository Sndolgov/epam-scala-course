package com.epam.home_work.pocker.java;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class WinnerService
{
    public static Optional<Bet> getWinner(List<Optional<Bet>> playerBets, List<Optional<Bet>> viewerBets)
    {
        return playerBets.stream()
                .flatMap(Optional::stream)
                .max(Comparator.comparingInt(Bet::getBetSize))
                .or(() -> viewerBets.stream()
                        .flatMap(Optional::stream)
                        .max(Comparator.comparingInt(Bet::getBetSize)));
    }
}
