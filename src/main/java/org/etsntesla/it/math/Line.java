package org.etsntesla.it.math;

import org.etsntesla.it.math.exceptions.MathGeometryException;

public class Line {



    private double k;
    private double n;

    public Line(double slope, double coefficient) {
        this.k = slope;
        this.n = coefficient;
    }

    public double getSlope() {
        return k;
    }

    public void setSlope(double slope) {
        this.k = slope;
    }

    public double getCoefficient() {
        return n;
    }

    public void setCoefficient(double coefficient) {
        this.n = coefficient;
    }

    @Override
    public String toString() {
        return "Line{" +
                "slope=" + k +
                ", coefficient=" + n +
                '}';
    }

    public boolean hasBelongToLine(double _x, double _y){
        return _y == k*_x+n;
    }

    public boolean hasBelongToLine(Point _point){
        return _point.getY() == k*_point.getX()+n;
    }

    public double getPerpendicularCoefficient(){
        return -1/k;
    }

    public Line getPerpendicularLine(double _x,double _y){
        return new Line(-1/k, _y-k*_x);
    }

    public Line getPerpendicularLine(Point _point){
        return new Line(-1/k, _point.getY()-k*_point.getX());
    }

    public Point getPointOfIntersection(Line _line) throws MathGeometryException {
        if(k==_line.k) throw new MathGeometryException(this,_line);
        double x = (k-_line.k)/ (_line.n-n);
        double y = k*x+n;
        return new Point(x,y);
    }

    public double getPointDistance(Point _point) throws MathGeometryException{
        Point intersection = getPerpendicularLine(_point).getPointOfIntersection(this);
        return intersection.distance(_point);
    }
}
