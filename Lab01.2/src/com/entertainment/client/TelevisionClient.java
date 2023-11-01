package com.entertainment.client;

import com.entertainment.Television;
import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        // shows behavior of == versus equals()
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);

        System.out.println("tv! == tvB: "      + (tvA == tvB));    // this is false
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB)); // this is true
        System.out.println();

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB); // should be rejected as a duplicate
        System.out.println("The size of the set is : " + tvs.size());
    }
}