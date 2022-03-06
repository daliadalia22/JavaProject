package com.company.week4;

// код здесь вообще не отформатирован, очень сложно его читать, все закрывающиеся фигурные скобки должны быть с новой строки
// я сделал тут форматирование, старайся так делать везде

// все методы и переменная town у тебя статические, это не имеет тут смысла, перечитай что такое static и когда его нужно применять

public abstract class CoffeeShop {
    public static String town;
    static void latte() {
        waiting();
        Biscuits.sellBiscuits();
        //непонятно зачем тут открывать { если эта строка уже в методе находится
        {
            System.out.println("Thanks for order in" + " " + town + " "+ ", take your latte please");
        }
    }
    
    static void espresso(){
        waiting();
        System.out.println("Thanks for order in" + " "+ town + " " + ", take your espresso please");
        Biscuits.sellBiscuits();
    }
    
     static void cappuchino() {
         waiting();
         System.out.println("Thanks for order in" + " "+ town + " " + ", take your cappuchino please");
         Biscuits.sellBiscuits();
     }
    
     static void coffee_with_milk() {
         waiting();
         System.out.println("Thanks for order in " + " "+ town + " " + ", take your coffee with milk please");
         Biscuits.sellBiscuits();
     }
    
    static void waiting() {
        System.out.println("Wait a few seconds");
    }
}


