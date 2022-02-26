package com.company;
public class Week2forth {
    public static void main(String[] args) {
    String[] names = {"John", "Bob", "Mary", "Peter", "Sara"};
    int length = names.length;
        System.out.println("Do-while");
        int i = 0;
        do {
        if(names[i].length() < 2) {
            continue;
                    }
        if(names[i].length() > 10) {
            break;
        }
            if (names[i].length() < 4) {
                System.out.println(names[i] + ",ваше имя короче 4 букв");
            } else if (names[i].length() > 4) {
                System.out.println(names[i] + ",ваше имя длиннее 4 букв");
            } else {
         System.out.println(names[i] + ",ваше имя состоит из 4 букв");
        }

        } while (i < length);
    }}