package com.ts.homework.week1.task2.model3d;

public class PrizmRact extends Geometric3DModel {
    private double side1;
    private double side2;
    private double side3;
    private final String name = "Призма прямоугольная";

    public PrizmRact(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calcVolume() {
        return this.side1 * this.side2 * this.side3;
    }

    @Override
    public double calcSquare() {
        return (this.side1 * this.side2 + this.side2 * this.side3 + this.side3 * this.side1) * 2;
    }

    @Override
    public String toString() {
        return this.getName() + ": стороны = (" + this.getSide1() +", " + this.getSide2() + ", " + this.getSide3() + "), площадь = " + this.calcSquare() + ", объем = " + this.calcVolume() ;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getName() {
        return name;
    }
}
