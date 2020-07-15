package com.epam.home_work.pocker.java;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BetService
{
    private static List<Player> players = List.of(new Player("Player1", 100), new Player("Player2", 150));
    private static List<Viewer> viewers = List.of(new Viewer("Viewer1", 100), new Viewer("Viewer2", 150), new Viewer("Viewer3", 150));

    public static Pair<List<Optional<Bet>>, List<Optional<Bet>>> makeBets(){
        List<Optional<Bet>> playerBets = new ArrayList<>();
        List<Optional<Bet>> viewerBets = new ArrayList<>();

        players.forEach(p-> playerBets.add(p.makeBet()));
        viewers.forEach(v->viewerBets.add(v.makeBet()));

        System.out.println("Ставки сделаны!");
        System.out.println("Ставки игроков: " + playerBets);
        System.out.println("Ставки зрителей: " + viewerBets);
        return Pair.of(playerBets, viewerBets);
    }
}
