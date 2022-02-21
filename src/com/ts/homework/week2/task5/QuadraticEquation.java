package com.ts.homework.week2.task5;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double discriminant;

    public QuadraticEquation(double a, double b, double c) throws QuadraticEquationException {
        if(a == 0) throw new QuadraticEquationException(12034);
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant =  this.b * this.b - 4 * this.a * this.c;
    }

    public String calcRoots() {
        String solution = "";
        if (this.discriminant < 0) {
            solution = "D < 0, корней нет";
        } else if (this.discriminant == 0) {
            solution = "D = 0, есть один корень: x = " + ( -this.b / ( 2 * this.a ));
        } else {
            solution = "D > 0, есть два корня: x1 = " + ((- this.b - Math.sqrt( this.discriminant )) / ( 2 * this.a ) + ", x2 = " + ((-this.b - Math.sqrt( this.discriminant )) / ( 2 * this.a )));
        }
        return  solution;
    }

    public double getA() { return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

}
