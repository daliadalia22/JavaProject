package com.company.week4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
    System.out.print ("Из какого Вы города?");
        Scanner str = new Scanner (System.in);
        String symbols;
        symbols = str.next();
         String[] city  = {"NewYor", "Baghdad", "Moscow"};
        int num = Integer.parseInt(str.nextLine());
        int i = 0;
        for (i = 0; i < 2; i++) {
       System.out.println("Ваш город" + city[i]);}


             Week4NewYorkCoffeShop shop1 = new Week4NewYorkCoffeShop();
             int NewYork = 0;
             shop1.city = NewYork;
             System.out.println("NewYork");


             Week4MoscowCoffeShop shop2 = new Week4MoscowCoffeShop();
             int Moscow = 0;
             shop2.city2 = Moscow;
             System.out.println("Moscow");

             Week4BaghdadCoffeShop shop3 = new Week4BaghdadCoffeShop();
             int Baghdad = 0;
             shop3.city3 = Baghdad;
             System.out.println("Baghdad");


         }}
