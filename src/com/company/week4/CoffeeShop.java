package com.company.week4;
public abstract class CoffeeShop {
    public static String town;
       static void latte() {
        waiting();
        Biscuits.sellBiscuits();
        {System.out.println("Thanks for order in" + " " + town + " "+ ", take your latte please");
        }}
 static void espresso(){
        waiting();

        System.out.println("Thanks for order in" + " "+ town + " " + ", take your espresso please");
     Biscuits.sellBiscuits();
    }
     static void cappuchino() {
           waiting();

    System.out.println("Thanks for order in" + " "+ town + " " + ", take your cappuchino please");
    Biscuits.sellBiscuits();}
     static void coffee_with_milk() {
             waiting();
    System.out.println("Thanks for order in " + " "+ town + " " + ", take your coffee with milk please");
    Biscuits.sellBiscuits();}
    static void waiting() {
        System.out.println("Wait a few seconds");}
}


