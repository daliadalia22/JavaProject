package com.company.week22;
import java.util.Scanner;
public class Main1 {
    public static void main1(String[] args) {
        System.out.println("Из какого Вы города? Baghdad - 1, NewYork - 2, Moscow -3" );
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        if (city == 1) {
            System.out.println("Baghdad");
            {Week4BaghdadCoffeShop shop1 = new Week4BaghdadCoffeShop();
                int Baghdad = 0;
                shop1.city = Baghdad;
                {System.out.println("Your coffee is ready - Baghdad team");
                }

            }
        } else if (city == 2) {
            System.out.println("NewYork");
            {Week4NewYorkCoffeShop shop1 = new Week4NewYorkCoffeShop();
                int NewYork = 0;
                shop1.city = NewYork;
                {System.out.println("Your coffee is ready - New York team");
                }

            }
        } else if (city == 3) {
            {Week4NewYorkCoffeShop shop1 = new Week4NewYorkCoffeShop();
                int Moscow= 0;
                shop1.city = Moscow;
                {System.out.println("Your coffee is ready - Moscow team");
                }


            }}}}
