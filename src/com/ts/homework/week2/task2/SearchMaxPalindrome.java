package com.ts.homework.week2.task2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

public class SearchMaxPalindrome {
    public static String input = "конитопотинок" + "нонеречачеренон" + "идеммолоддоломмеди" + "чинзванмечемнавзнич" + "голодчемечдолог" + "паланоровхудидухвороналап" + "ачтояловоляотча";
    public static String substr = "";
    public static String maxpalindrome = "";
    public static Set<String> palindromes ;

    public static void main(String... args){
        System.out.println("Задача 2 (средняя) - Дана строка. Найти в ней подстроку-палиндром максимальной длины.\n");
        System.out.println("Исходные данные: ");
        System.out.println("\tСтрока: " + input);
        palindromes = new HashSet<>();
        try { //алгоритм: перебираем все подстроки и проверяем на палиндром
            for (int j = 0; j < input.length(); j++) {
                for (int i = j + 2; i <= input.length(); i++) {
                    substr = input.substring(j, i);
                    if (checkStr(substr)) {
                        if (maxpalindrome.length() < substr.length()) {
                            maxpalindrome = substr;
                        }
                        palindromes.add(input.substring(j, i) + "(" + substr.length() + ")");
                    }
                }
            }

            System.out.println("\nНайденные полиндромы: " + palindromes.size() );
            int n = 0;
            for(String p : palindromes) {
                n++;
                if(n < 10) {
                    System.out.print(p + " ");
                } else {
                    System.out.print(p + "\n");
                    n = 0;
                }
            }
            System.out.print("\n\nРешение:");
            System.out.println("\n\tМаксимальный полиндром - " + maxpalindrome + "(" + maxpalindrome.length() + ")");

        } catch (NullPointerException|StringIndexOutOfBoundsException e ) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            System.out.println("\nОшибка работы со строками: " + sw.toString());
            System.out.println("Работа программы завершена.");
        }

    }

    private static boolean checkStr(String str){
        boolean bool = true;
        int half;
        if( str.length() % 2 == 0) {
            half = str.length() / 2;
        } else {
            half = (int)Math.ceil((double)str.length() / 2);
        }

        for(int i = 0; i < half; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                bool = false;
                break;
            }
        }

        return bool;
    }
}
