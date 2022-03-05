package com.company.week4;
import java.util.Scanner;

public class Main {
    public static String Baghdad;
    public static void main(String[] args) {
        System.out.println("Из какого Вы города? Baghdad - 1, NewYork - 2, Moscow -3" );
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        {System.out.println("Выберите один из видов кофе : 1 - латте, 2 - эспрессо, 3 - каппучино, 4 - кофе с молоком");
        }
        int coffee = sc.nextInt();
        if (city == 1)  {
         BaghdadCoffeeShop BaghdadCoffee = new BaghdadCoffeeShop();
             CoffeeShop.town = "Baghdad";
             if (coffee == 1)   {
                    CoffeeShop.waiting();
                    CoffeeShop.latte();  }
              else if (coffee == 2){
                CoffeeShop.waiting();
                CoffeeShop.espresso(); }
              else if (coffee == 3){
                CoffeeShop.waiting();
                CoffeeShop.cappuchino();
            }
              else if (coffee == 4){
                CoffeeShop.waiting();
                CoffeeShop.coffee_with_milk();
            }
              else {System.out.println("Ошибка");}
        } else if  (city == 2) {
            NewYorkCoffeeShop NewYorkCoffee = new NewYorkCoffeeShop();
            CoffeeShop.town = "New York";
                if (coffee == 1)   {
                    CoffeeShop.waiting();
                    CoffeeShop.latte();  }
                else if (coffee == 2){
                    CoffeeShop.waiting();
                    CoffeeShop.espresso(); }
                else if (coffee == 3){
                    CoffeeShop.waiting();
                    CoffeeShop.cappuchino();
                }
                else if (coffee == 4){
                   CoffeeShop.waiting();
                   CoffeeShop.coffee_with_milk();
                }
                else {System.out.println("Ошибка");

                }}
        else if (city == 3) {
        MoscowCoffeeShop MoscowCoffee = new MoscowCoffeeShop();
        CoffeeShop.town = "Moscow";
            if (coffee == 1)   {
                CoffeeShop.waiting();
               CoffeeShop.latte();  }
            else if (coffee == 2){
               CoffeeShop.waiting();
                CoffeeShop.espresso(); }
            else if (coffee == 3){
                CoffeeShop.waiting();
                CoffeeShop.cappuchino();
            }
            else if (coffee == 4){
                CoffeeShop.waiting();
                CoffeeShop.coffee_with_milk();
            }
            else {System.out.println("Ошибка");
            }
                                            }}}


