package com.epam.java_vs_scala_lambda;

import java.util.Comparator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List.of(2,1,5,2).sort((o1, o2) -> o1-o2);
    }
}
