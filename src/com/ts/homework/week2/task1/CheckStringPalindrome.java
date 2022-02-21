package com.ts.homework.week2.task1;

import java.util.Set;

public class CheckStringPalindrome {
    public static String[] input = {"89","88","789","787", "конитопотинок", "нонеречачеренон1", "идеммолоддоломмеди", "чинзванмеч3мнавзнич", "голодчемечдолог", "пала7норовхудидухвороналап", "ачтояловоляотча"};
    public static String substr = "";

    public static void main (String... args){
        System.out.println("Задача 1 (простая) - Дана строка. Проверить, является ли она палиндромом.\n");
        System.out.println("Исходные данные:");
        for(String str : input) {
            System.out.print(str + " " );
        }
        System.out.println("\n\nПроверка: ");

        for(String s : input) {
           if( checkStr(s)) {
               System.out.println("\tСтрока <" + s + ">(" + s.length() + ") палиндром");
           } else {
               System.out.println("\tСтрока <" + s + ">(" + s.length() + ") не палиндром");
           }
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
