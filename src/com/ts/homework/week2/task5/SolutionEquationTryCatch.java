package com.ts.homework.week2.task5;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SolutionEquationTryCatch {
    public static double a, b, c, discriminant;
    public static void main(String... args){
        while(true) {
            System.out.println("\nРешение квадратного уравнения с действительными коэффициентами: ax^2 + bx + c = 0. Оформить решение квадратного уравнения в виде класса. Сбрасывать исключение java.lang.IllegalArgumentException, если a = 0. Сброс делать в конструкторе и в сеттере (если он есть). Обеспечить перехват исключения в вызываемом коде. ");
            System.out.println("Введите коэффициенты a, b, c: \n");
            a = enterKoef("a");
            b = enterKoef("b");
            c = enterKoef("c");

            System.out.println("Решение: \n");
            try {
                QuadraticEquation equation = new QuadraticEquation(a, b, c);
                //Расчет корней
                System.out.println(equation.calcRoots());
            } catch(QuadraticEquationException e) {
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                System.out.println("Ошибка ввода параметров: " + sw.toString());
            }

            System.out.println("\nРасчет завершен.");

            System.out.print("\nПродолжить? y/n: ");
            try {
                char ch = (char) System.in.read();
                if (ch == 'n') break;
            } catch (IOException e) {
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                System.out.println("Ошибка при вводе с клавиатуры: " + sw.toString());
            }
        }
    }

    public static double enterKoef(String name){
        double k = 0;
        while(true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите " + name + ": ");
                k = in.nextDouble();
                System.out.printf("Коэффициент " + name + ": %.6f \n\n", k);
                break;
            } catch (InputMismatchException ime) {
                StringWriter sw = new StringWriter();
                ime.printStackTrace(new PrintWriter(sw));
                System.out.println("Ошибка ввода данных: " + sw.toString());
            }
        };
        return k;
    }
}
