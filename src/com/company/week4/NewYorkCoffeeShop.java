package com.company.week4;

public class NewYorkCoffeeShop {
    protected static void latte() {
        waiting();
        {
            System.out.println("Thanks for order in NewYork, take your latte please");
        }
    }

    public static void espresso() {
        waiting();
        System.out.println("Thanks for order in NewYork, take your espresso please");
    }

    public static void cappuchino() {
        System.out.println("Thanks for order in NewYork, take your cappuchino please");
    }

    public static void coffee_with_milk() {
        System.out.println("Thanks for order in NewYork, take your coffee with milk please");
    }

    public static void waiting() {
        System.out.println("Wait a few seconds");
    }
}

