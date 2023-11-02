package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class DuckRacer {
    // instance 'properties' variables
    private final int id;
    private String name;
    private final Collection<Reward> rewards = new ArrayList<>();

    // constructor
    public DuckRacer(int id, String name) { // 2 argument constructor
        this.id = id;
        setName(name);
    }

    // business 'action' methods
    // executes inside a DuckRacer object
    public void win(Reward reward) { // what does 'win' get --> reward, 'win' takes 'Reward reward'
        rewards.add(reward); // what the method does
    }

    // accessor 'getter/setter' methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // derived property
    public int getWins() {
        return rewards.size();
    }

    /*
     * NOTE: instead of returning a direct reference to the collection,
     * we return a 'read-only' view.
     */
    public Collection<Reward> getRewards() {
        return Collections.unmodifiableCollection(rewards); // takes the Collection 'Reward', returns a read-through wrapper
        // return List.copyOf(rewards);
    }

    @Override
    public String toString() {
        return String.format("%s: id=%s, name=%s, wins=%s rewards=%s",
                getClass().getSimpleName(), getId(), getName(), getWins(), getRewards());
    }
}