package com.company;

import java.util.Scanner;

public class Week3second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String rootString = sc.nextLine();
        System.out.println("Введите число");
        int encryprion = sc.nextInt();

        char [] mas = rootString.toCharArray();
        int len = mas.length;
        char [] newtext = new char[len];

        for (int i =0; i < len; i++) {
            newtext[i] = (char) (mas[i] + encryprion);
        }
        String encryptedString = new String(newtext);
        System.out.println(encryptedString);
    }
}
