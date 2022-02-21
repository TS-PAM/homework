package com.ts.homework.week1.task2;

import com.ts.homework.week1.task2.model3d.Cube;
import com.ts.homework.week1.task2.model3d.Geometric3DModel;
import com.ts.homework.week1.task2.model3d.PrizmRact;
import com.ts.homework.week1.task2.model3d.Sphere;

import java.util.ArrayList;
import java.util.List;

public class CalcSquareVolume {

    public static void main(String... args){
        System.out.println("\nДомашнее задание № 2 - сделать абстрактный класс «трёхмерная фигура», с методами «объём» и «площадь поверхности». Написать его реализации для шара, куба, прямоугольного параллепипеда.");
        List<Geometric3DModel> dModels = new ArrayList<>();

        System.out.println("\nРасчетные данные: ");
        dModels.add(new Cube(5));
        dModels.add(new Sphere(2.5));
        dModels.add(new PrizmRact(5,5,4));

        for(Geometric3DModel dModel : dModels) {
            System.out.println(dModel.toString());
        }
    }
}
