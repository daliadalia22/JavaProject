package com.company;

import java.util.Scanner;

public class Week2first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if ((mark >=1) && (mark <=25))  {
                System.out.println("Плохо");
            }
        else if ((mark >= 26) && (mark <= 50)) {
                System.out.println("Ниже среднего");
            }
        else if ((mark >= 51) && (mark <= 75)) {
                System.out.println("Выше среднего");
            }
        else if ((mark >= 75) && (mark <= 100)) {
                System.out.println("Отлично");

        }
    }

}