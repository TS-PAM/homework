package com.ts.homework.week1.task2.model3d;

public class Cube extends Geometric3DModel {
    private double side;
    private final String name = "Куб";

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calcVolume() {
        return Math.pow(this.side, 3);
    }

    @Override
    public double calcSquare() {
        return 6 * Math.pow(this.side, 2);
    }

    @Override
    public String toString() {
        return this.getName() + ": сторона = " + this.getSide() + ", площадь = " + this.calcSquare() + ", объем = " + this.calcVolume() ;
    }

    public double getSide() {
        return side;
    }

    public String getName() {
        return name;
    }
}
