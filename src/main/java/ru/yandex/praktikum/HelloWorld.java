package ru.yandex.praktikum;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("start");
        String[] n = new String[3];
        n[0] = "0";
        n[1] = "1";
        n[2] = "2";
        n = new String[10];
        System.out.println("printed" + n[0]);
    }
}
