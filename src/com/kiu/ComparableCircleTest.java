package com.kiu;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[5];
        circles[0] = new ComparableCircle(4.7);
        circles[1] = new ComparableCircle(2.3);
        circles[2] = new ComparableCircle("cyan", true, 7.8);
        circles[3] = new ComparableCircle(1.5);
        circles[4] = new ComparableCircle("red", false, 9.3);


        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
