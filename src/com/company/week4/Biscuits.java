package com.company.week4;

import java.util.Scanner;

public interface Biscuits {
    public static void sellBiscuits() {
        System.out.println("Do you want to buy some biscuits? Yes - 1 , No - 2" );
        Scanner sc = new Scanner(System.in);
        int biscuit = sc.nextInt();
        if (biscuit == 1)
        {System.out.println ("Your biscuit is ready");}
        else if (biscuit == 2);
        {System.out.println ("Thank you");}
    }
}
