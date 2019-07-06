package main.java;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {

        if (a % 2 == 0) {
            if (b % 2 == 0) {
                return a - b;
            }
            return -1;
        } else if (b % 2 == 0) {
            return 1;
        }
        return a - b;
    }
}


