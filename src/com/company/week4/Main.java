package com.company.week4;
import java.util.Scanner;

// все твои классы-кофейни не наследуются от абстрактного класса, мы для этого его и создавали, чтобы у всех кофеен выделить общего родителя


public class Main {
    //эта переменная нигде не используется
    public static String Baghdad;
    
    public static void main(String[] args) {
        System.out.println("Из какого Вы города? Baghdad - 1, NewYork - 2, Moscow -3" );
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        //зачем строку ниже помещать в отдельный блок скобок { } 
        {System.out.println("Выберите один из видов кофе : 1 - латте, 2 - эспрессо, 3 - каппучино, 4 - кофе с молоком");
        }
        int coffee = sc.nextInt();
        if (city == 1)  {
            // названия переменных должны быть с маленькой буквы
            
           // в данном случае из-за того что ты не наследуешься от абстрактного класса, выбор города и выбор напитка относятся к разным по сути объектам
            // ты создаешь объект одного класса, а вызываешь метод по приготовлению у объекта другого класса
            // здесь теряется смысл вообще того зачем мы создавали абстрактный класс, на созвоне станет понятнее тебе
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
            
            // каждая закрывающаяся фигурная скобка должна быть на новой строке
                                            }}}


