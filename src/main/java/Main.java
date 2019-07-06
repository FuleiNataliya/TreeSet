package main.java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>(new MyComparator());

        ts.addAll(Arrays.asList(5, 6, 8, 15, 62, 48, 1, 3, 9, 30, 7));
        System.out.println(ts);

    }
}
