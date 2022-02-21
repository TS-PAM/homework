package com.ts.homework.week1.task2.model3d;

public class Sphere extends Geometric3DModel {
    private double radius;
    private final String name = "Сфера";

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        return 4 * Math.PI * Math.pow(this.radius,3) / 3 ;
    }

    @Override
    public double calcSquare() {
        return 4 * Math.PI * Math.pow(this.radius,2) ;
    }

    @Override
    public String toString() {
        return  this.getName() + ": радиуc = " + this.getRadius() + ", площадь = " + this.calcSquare() + ", объем = " + this.calcVolume() ;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
