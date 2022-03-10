package com.ts.homework.week3.entity;

import java.util.Comparator;

public class Buyer extends User implements Comparable<Buyer>{
    public static int idcounter = 0;
    public String fio;
    public String phoneNumber;
    public Integer id;

    public Buyer(String login, String password, String fio, String phoneNumber) {
        super(login, password);
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.id = idcounter;
        idcounter++;
    }

    @Override
    public String toString() {
        return id + ";" + fio + ";" + login + ";" + phoneNumber;
    }

    @Override
    public int compareTo(Buyer o) {
        return this.fio.compareTo(o.getFio());
    }

    public String getFio() {
        return fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getId() {
        return id;
    }
}
