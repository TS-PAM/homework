package com.ts.homework.week2.task3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

public class SearchMaxPalindromeOx2 {
    public static String input = "конитопотинок" + "нонеречачеренон" + "идеммолоддоломмеди" + "чинзванмечемнавзнич" + "голодчемечдолог" + "паланоровхудидухвороналап" + "ачтояловоляотча";
    public static String substr = "";
    public static String maxpalindrome = "";
    public static Set<String> palindromes ;

    public static void main(String... args){
        System.out.println("Задача 2* (сложная) - Дана строка. Найти в ней подстроку-палиндром максимальной длины за время O(n^2).");
        System.out.println("\nИсходные данные: ");
        System.out.println("\tСтрока: " + input);
        palindromes = new HashSet<>();

        try { //алгоритм: берем центр полиндрома и сравниваем элементы справа и слева, в каждой итерации ищем нечетные и четные полиндромы
            for (int i = 0; i < input.length(); i++) {
                //поиск нечетного полиндрома
                int left = i - 1, right = i + 1;
                substr += input.charAt(i);
                while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                    substr = input.charAt(left) + substr + input.charAt(right);
                    palindromes.add(substr + "(" + substr.length() + ")");
                    if(maxpalindrome.length() < substr.length()) {
                        maxpalindrome = substr;
                    }
                    left--; right++;
                }
                substr = "";

                // поиск четного полиндрома
                left = i; right = i + 1;
                while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                    substr = input.charAt(left) + substr + input.charAt(right);
                    palindromes.add(substr + "(" + substr.length() + ")");
                    if(maxpalindrome.length() < substr.length()) {
                        maxpalindrome = substr;
                    }
                    left--; right++;
                }
                substr = "";
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

        } catch(NullPointerException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            System.out.println("\nОшибка работы со строками: " + sw);
            System.out.println("Работа программы завершена.");
        }
    }
}