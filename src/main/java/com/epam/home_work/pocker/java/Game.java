package com.epam.home_work.pocker.java;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Optional;

public class Game
{
    public static void main(String[] args)
    {
        startGame();
    }

    private static void startGame(){
        Pair<List<Optional<Bet>>, List<Optional<Bet>>> pair = BetService.makeBets();
        Optional<Bet> winner = WinnerService.getWinner(pair.getLeft(), pair.getRight());
        winner.ifPresentOrElse(w-> System.out.println(w.getPlayerName()), ()-> System.out.println("Победитель не выявлен!"));
    }
}
