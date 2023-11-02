package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {

    public static void main(String[] args) {
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        Television tvC = new Television("Sony", 52);
        Television tvD = new Television("Sony", 12);

        System.out.println("tv! == tvB: "      + (tvA == tvB));    // tvA and tvB point to the same object - always false
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB)); // this is true
        System.out.println();

        Set<Television> tvs = new TreeSet<>(); // TreeSet<>() doesn't allow duplicates - size will be '3' because tvA and tvB are the same - natural order
        tvs.add(tvA);                          // LinkedHashSet<>() output is the same as the ordered input
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);

        System.out.println("The size of the set is : " + tvs.size());
        for (Television tv : tvs) {
            System.out.println(tv);
        }
    }
}

/*comparable objects are consistent with equals when:
 * -- if obj1.equals(obj2), then obj1.compareTo(obj2) must be 'zero'
 */