package com.ts.homework.week2.task5;

public class QuadraticEquationException extends Exception {
    private int code;

    public QuadraticEquationException(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        String error = "";
        switch(this.code) {
            case 12034: error = "параметр a = 0, уравнение не является квадратным.";
                break;
            default: error = "неизвестный код ошибки!";
        }
        return error;
    }
}
