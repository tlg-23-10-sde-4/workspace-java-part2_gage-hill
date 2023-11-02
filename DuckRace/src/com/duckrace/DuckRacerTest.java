package com.duckrace;

import java.util.Collection;
import java.util.List;

class DuckRacerTest {
    // entry point
    public static void main(String[] args) { // 'public' can be accessed from outside the class, 'void' does not return a value
        DuckRacer racer = new DuckRacer(14, "Scott");
        System.out.println(racer); // toString() called

        // make it 'win' a few times
        racer.win(Reward.PRIZES);
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.PRIZES);
        racer.win(Reward.PRIZES);
        System.out.println(racer); // toString() called

        // Collections.unmodifiableCollection(rewards)
        // to show the read only view to the underlying collection
        Collection<Reward> rewards = racer.getRewards();
        System.out.println(racer); // called to show 4

        // we can 'cheat' here, and get more rewards without actually 'winning'
        //racer.add(Reward.PRIZES);
        //racer.add(Reward.DEBIT_CARD);

        // 2 more honest wins
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.DEBIT_CARD);

        System.out.println(rewards); // called to show 4
    }
}