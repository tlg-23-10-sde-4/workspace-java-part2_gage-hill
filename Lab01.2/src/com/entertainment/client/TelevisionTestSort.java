package com.entertainment.client;

import com.entertainment.Television;
import com.entertainment.TelevisionChannelComparator;

import java.util.Arrays;
import java.util.List;

public class TelevisionTestSort {

    public static void main(String[] args) {
        // dataset for testing
        List<Television> tvList = createTelevisionList();

        System.out.println("Sorted by brand (natural order)");
        tvList.sort(null);
        dump(tvList);
        System.out.println();

        System.out.println("Sorted by channel");
        tvList.sort(new TelevisionChannelComparator());
        dump(tvList);
        System.out.println();

        for (Television tv : tvList) {
            System.out.println(tv);
        }
        System.out.println();
    }

    private static void dump(List<Television> tvList) {

        for (Television tv : tvList) {
            System.out.println(tv);
        }
        System.out.println();
    }


    // dataset for testing
    private static List<Television> createTelevisionList() {
        Television tv1 = new Television("Zenith", 30);
        tv1.changeChannel(44);

        Television tv2 = new Television("Hitachi", 10);
        tv2.changeChannel(9);

        Television tv3 = new Television("Sony", 50);
        tv3.changeChannel(13);

        Television tv4 = new Television("RCA", 25);

        Television tv5 = new Television("Hitachi", 5);

        Television tv6 = new Television("Sony", 40);

        return Arrays.asList(tv1, tv2, tv3, tv4, tv5, tv6);
    }
}