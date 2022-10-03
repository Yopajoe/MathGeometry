package org.etsntesla.it;

import org.etsntesla.it.math.Point;


public class Main {
    public static void main(String[] args) {

        Point A = new Point(3.0d,4.0d);
        Point B = new Point(3.0d,6.0d);

        //test1
        double res = A.radius();
        System.out.println("Ocekivana vrednost je 5.0, a dobijena je: "+ res);

        //test2
        res = A.distance(B);
        System.out.println("Ocekivana vrednost je 2.0, a dobijena je: "+ res);

        //test3
        res = A.distance(3.0,6.0);
        System.out.println("Ocekivana vrednost je 2.0, a dobijena je: "+ res);
    }
}