package org.etsntesla.it.math;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double radius(){
        return sqrt( x*x + y*y );
    }

    public double distance(Point _point){
        return sqrt( pow(this.x-_point.x,2) + pow(this.y-_point.y,2));
    }

    public double distance(double _x, double _y){
        return sqrt( pow(x-_x,2) + pow(y-_y,2));

    }
}
