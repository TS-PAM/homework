package com.ts.homework.week3;

import com.sun.istack.internal.NotNull;
import com.ts.homework.week3.entity.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class StoreProcess {
    private static BufferedReader reader = null;
    public static void main(String... args){
        ArrayList<Buyer> buyers = new ArrayList<>();
        ISeller seller = new Seller("admin", "password");

        System.out.println("1.Создаем набор покупателей из файла");
        try {
            reader = new BufferedReader(new FileReader("buyers.csv"));
            String line;
            while((line = reader.readLine()) != null) {
                try {
                    String[] buyer = line.split(";");
                    buyers.add(new Buyer(buyer[1], buyer[2], buyer[0], buyer[3]));

                } catch(ArrayIndexOutOfBoundsException | NullPointerException e){
                    StringWriter sw = new StringWriter();
                    e.printStackTrace(new PrintWriter(sw));
                    System.out.println("Ошибка разбора строки:\n    <" + line + "> \n" + sw.toString());
                }
            }

            System.out.println("2.Вывод активных пользователей в файл");
            seller.viewActiveBuyers(buyers);

        } catch (IOException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            System.out.println("Ошибка чтения файла: " + sw.toString());
        } finally {
            try {
                reader.close();
                reader = null;
            } catch (IOException e){
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                System.out.println("Ошибка закрытия потока при чтении файла: " + sw.toString());
            }
        }
    }
}
