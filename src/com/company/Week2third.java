package com.company;

public class Week2third {
    public static void main(String[] args) {
        String[] names = {"John", "Bob", "Mary", "Peter", "Sara"};
        int length = names.length;
        System.out.println("For");
        int i = 0;
        System.out.println("While");
        while (i < length) {
            if (names[i].length() > 10) {
                break;}
            if (names[i].length() < 2) {
                continue;}
            if (names[i].length() < 4) {
                System.out.println(names[i] + ",ваше имя короче 4 букв");
        }
        }
    }}