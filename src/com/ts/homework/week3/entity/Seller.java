package com.ts.homework.week3.entity;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Seller extends User implements ISeller {
    public Seller(String login, String password) {
        super(login, password);
    }

    public void viewActiveBuyers(ArrayList<Buyer> buyers)  {
        BufferedWriter writer = null;

        System.out.println("  2.1 Сортировка покупателей");
        Collections.sort(buyers);

        System.out.println("  2.2 Сохранение в файл");
        try {
            writer = new BufferedWriter(new FileWriter("act_buyers.csv"));

            for (User buyer : buyers) {
                writer.write(buyer.toString() + '\n');
            }
            writer.close();
        } catch(IOException e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            System.out.println("Ошибка сохраниения данных в файл: " + sw.toString());
        }finally {
            try {
                writer.close();
            } catch (IOException e){
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                System.out.println("Ошибка закрытия потока при записи файла: " + sw.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Seller{" +
                "login='" + login + '\'' +
                '}';
    }
}
