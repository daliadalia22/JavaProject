package com.company;

public class Main {

    public static void main(String[] args) {
	byte num = 2;
    System.out.println ("variable = "+ num);
    int i = 238888;
    System.out.println ("variable = "+ i);
    long l = 787868;
    System.out.println ("variable = "+ l);
    float num_2 = 324.234f;
    System.out.println ("variable = "+ num_2);
    double num_3 = 787.2f;
    System.out.println ("variable = "+ num_3);
    short num_4 = 23;
    System.out.println ("variable = "+ num_4);
    char sym = 'A';
    System.out.println ("variable = "+ sym);
    boolean is_happy = false;
    String str = "Hello World";

    System.out.println ("variable = "+ is_happy);

    int num_5 = 1, num_9 = 89, sum, min, mult, dev;
    sum = num_5 + num_9;
    System.out.println (sum);

        min = num_9 - num_5;
        System.out.println (min);
        mult = num_9 * num_5;
        System.out.println (mult);
        dev = num_9 / num_5;
        System.out.println (dev);

        int x = 1;
        System.out.println(x++); // => 6
        System.out.println(x);
        int y = 2;
        System.out.println(y--); // => 6
        System.out.println(y);

        long l1 = 1, l2 = 8, suml, minl, multl, devl;
        suml = l1 + l2;
        System.out.println (suml);

        minl = l1 - l2;
        System.out.println (minl);
        multl = l1 * l2;
        System.out.println (multl);
        devl = l1 / l2;
        System.out.println (devl);

        long xl = 1;
        System.out.println(xl++); // => 6
        System.out.println(xl);
        int yl = 2;
        System.out.println(yl--); // => 6
        System.out.println(yl);
    }
}
