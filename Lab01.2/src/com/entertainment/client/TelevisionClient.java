package com.entertainment.client;

import com.entertainment.Television;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {

    public static void main(String[] args) {
        // shows behavior of == versus equals()
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        Television tvC = new Television("Samsung", 32);
        Television tvD = new Television("LG", 12);

        System.out.println("tv! == tvB: "      + (tvA == tvB));    // this is false
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB)); // this is true
        System.out.println();

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tvA);
        tvs.add(tvB); // should be rejected as a duplicate
        tvs.add(tvC);
        tvs.add(tvD);

        System.out.println("The size of the set is : " + tvs.size());
        for (Television tv : tvs) {
            System.out.println(tv);
        }
    }
}