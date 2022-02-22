package com.ts.homework.week2.task4;

public class Student implements Comparable<Student>{
    private String name;
    private int group;

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Ученик " + this.getGroup() + " класса " + this.getName();
    }

    @Override
    public int compareTo(Student o) {
         int result = this.getGroup() - o.getGroup();

         if(result == 0){
             result = this.name.compareTo(o.getName());
         }
         return result;
    }
}
