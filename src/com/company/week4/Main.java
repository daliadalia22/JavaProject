package com.company.week4;
import java.util.Scanner;
// в целом сделан только 1 пункт задачи.
//так как мы делаем полноценное приложение, то этот класс лучше назвать как-то осознанно, типа CoffeeShop
public class Main {
    public static void main(String[] args) {
        System.out.println("Из какого Вы города? Baghdad - 1, NewYork - 2, Moscow -3" );
        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        if (city == 1) {
            System.out.println("Baghdad");
            //непонятно зачем помещать код ниже в отдельные фигурные скобки {}, это лишнее
            {Week4BaghdadCoffeShop shop1 = new Week4BaghdadCoffeShop();
                 
                 //переменные должны называться с маленькой буквы
                 int Baghdad = 0;
                shop1.city3 = Baghdad;
                //здесь тоже непонятно зачем помещать код ниже в отдельные фигурные скобки {}, это лишнее
                //это относится и к остальныму коду, тот что ниже
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
