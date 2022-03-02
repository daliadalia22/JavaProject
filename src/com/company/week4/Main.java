package com.company.week4;
import java.util.Scanner;

import static com.company.week4.BaghdadCoffeeShop.latte;

public class Main {
    public static void main(String[] args) {
        System.out.println("Из какого Вы города? Baghdad - 1, NewYork - 2, Moscow -3" );
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        {System.out.println("Выберите один из видов кофе : 1 - латте, 2 - эспрессо, 3 - каппучино, 4 - кофе с молоком");
        }
        int coffee = sc.nextInt();
        if (city == 1)  {
         BaghdadCoffeeShop BaghdadCoffee = new BaghdadCoffeeShop();
                if (coffee == 1)   {
                    BaghdadCoffeeShop.waiting();
                    BaghdadCoffeeShop.latte();  }
              else if (coffee == 2){
                BaghdadCoffeeShop.waiting();
                BaghdadCoffeeShop.espresso(); }
              else if (coffee == 3){
                BaghdadCoffeeShop.waiting();
                BaghdadCoffeeShop.cappuchino();
            }
              else if (coffee == 4){
                BaghdadCoffeeShop.waiting();
                BaghdadCoffeeShop.coffee_with_milk();
            }
              else {System.out.println("Ошибка");}
        } else if (city == 2) {
            System.out.println("NewYork");
            {NewYorkCoffeeShop NewYorkCoffee = new NewYorkCoffeeShop();
                if (coffee == 1)   {
                    NewYorkCoffeeShop.waiting();
                    NewYorkCoffeeShop.latte();  }
                else if (coffee == 2){
                    NewYorkCoffeeShop.waiting();
                    NewYorkCoffeeShop.espresso(); }
                else if (coffee == 3){
                    NewYorkCoffeeShop.waiting();
                    NewYorkCoffeeShop.cappuchino();
                }
                else if (coffee == 4){
                    NewYorkCoffeeShop.waiting();
                    NewYorkCoffeeShop.coffee_with_milk();
                }
                else {System.out.println("Ошибка");

                }}}
        else if (city == 3) {
            MoscowCoffeeShop MoscowCoffee = new MoscowCoffeeShop();
            if (coffee == 1)   {
                MoscowCoffeeShop.waiting();
                MoscowCoffeeShop.latte();  }
            else if (coffee == 2){
               MoscowCoffeeShop.waiting();
                MoscowCoffeeShop.espresso(); }
            else if (coffee == 3){
                MoscowCoffeeShop.waiting();
                MoscowCoffeeShop.cappuchino();
            }
            else if (coffee == 4){
                MoscowCoffeeShop.waiting();
                MoscowCoffeeShop.coffee_with_milk();
            }
            else {System.out.println("Ошибка");
            }
                                            }}}


