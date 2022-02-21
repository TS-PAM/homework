package com.ts.homework.week1.task1;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SolutionEquation {
    public static double a, b, c, discriminant;
    public static void main(String... args) throws IOException {
        while(true) {
            System.out.println("\nРешение квадратного уравнения с действительными коэффициентами: ax^2 + bx + c = 0");
            System.out.println("Введите коэффициенты a, b, c: \n");
            a = enterKoef("a");
            b = enterKoef("b");
            c = enterKoef("c");

            System.out.println("Решение: \n");

            if (a == 0) {
                System.out.println("Ошибка: a = 0, уравнение не является квадратным.");
                System.out.println("Расчет завершен.");
            } else {
                //расчет дискримананта
                discriminant = b * b - 4 * a * c;
                System.out.println("Дискриминант D: " + discriminant);

                //Расчет корней
                if (discriminant < 0) {
                    System.out.println("D < 0, корней нет");
                } else if (discriminant == 0) {
                    System.out.println("D = 0, есть один корень");
                    System.out.println("x = " + (-b/(2*a)) );
                } else {
                    System.out.println("D > 0, есть два корня");
                    System.out.println("x1 = " + ((-b+Math.sqrt(discriminant))/(2*a)) + ", x2 = " + ((-b-Math.sqrt(discriminant))/(2*a)) );
                }
                System.out.println("Расчет завершен.");

                System.out.print("\nПродолжить? y/n: ");
                try {
                    char ch = (char) System.in.read();
                    if (ch == 'n') break;
                } catch (IOException e) {
                    StringWriter sw = new StringWriter();
                    e.printStackTrace(new PrintWriter(sw));
                    System.out.println("Ошибка при вводе с клавиатуры: " + sw.toString());
                }
                for (int i = 0; i < 50; ++i) System.out.println();
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
