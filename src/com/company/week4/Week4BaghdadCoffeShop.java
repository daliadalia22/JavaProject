package com.company.week4;

//Приписка Week4 к названию класса - лишняя
public class Week4BaghdadCoffeShop {
    //тут комментарии которые относятся ко всем классам-кофейням
    //эта переменная нигде не используется, можно ее убрать
    public int city3;
    //названия методов должны быть в camel case: makecoffebaghdad -> makeCoffeBaghdad
    //также немного излишне указывать в данном случае в названии метода слово Baghdad, т.к. мы и так находимся в классе Baghdad
    // и если назвать метод просто makeCoffee то будет понятно что это именно про Baghdad идет речь
    void makecoffebaghdad (String str) {
        System.out.println("Your Coffee is ready - Baghdad team");
    }
}
