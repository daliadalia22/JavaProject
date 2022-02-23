package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //
         byte num = 2;

            // с 9 по 29 строки не хватает одного таба перед началом строки
            System.out.println("variable = " + num);
            int i = 238888;
            System.out.println("variable = " + i);
            long l = 787868;
            System.out.println("variable = " + l);
            float num_2 = 324.234f;
            System.out.println("variable = " + num_2);
            double num_3 = 787.2f;
            System.out.println("variable = " + num_3);
            short num_4 = 23;
            System.out.println("variable = " + num_4);
            char sym = 'A';
            System.out.println("variable = " + sym);
            boolean is_happy = false;
            String str = "Hello World";

            System.out.println("variable = " + is_happy);

            int num_5 = 1, num_9 = 89, sum, min, mult, dev;
            sum = num_5 + num_9;
            System.out.println(sum);

            min = num_9 - num_5;
            System.out.println(min);
            mult = num_9 * num_5;
            System.out.println(mult);
            dev = num_9 / num_5;
            System.out.println(dev);

            int x = 1;
            System.out.println(x++); // => 6
            System.out.println(x);
            int y = 2;
            System.out.println(y--); // => 6
            System.out.println(y);

            long l1 = 1, l2 = 8, suml, minl, multl, devl;
            suml = l1 + l2;
            System.out.println(suml);

            minl = l1 - l2;
            System.out.println(minl);
            multl = l1 * l2;
            System.out.println(multl);
            devl = l1 / l2;
            System.out.println(devl);

            long xl = 1;
            System.out.println(xl++); // => 6
            System.out.println(xl);
            long yl = 2;
            System.out.println(yl--); // => 6
            System.out.println(yl);

            // зачем здесь "{" ? Это лишнее
            {
                int i3 = 17;
                double d = 17.3;

                System.out.println("i mod 10 = " + i3 % 10);
                System.out.println("d mod 10 = " + d % 10);

                float numf1 = 1.5f, numf2 = 8.9f, sumf, minf, multf, devf;
                sumf = numf1 + numf2;
                System.out.println(sumf);

                minf = numf1 - numf2;
                System.out.println(minf);
                multf = numf1 * numf2;
                System.out.println(multf);
                devf = numf1 / numf2;
                System.out.println(devf);

                float xf = 1.4f;
                System.out.println(xf++); // => 6
                System.out.println(xf);
                float yf = 2.2f;
                System.out.println(yf--); // => 6
                System.out.println(yf);

                double numfd = 1.5f, numfd2 = 8.9f, sumfd, minfd, multfd, devfd;
                sumfd = numfd + numfd2;
                System.out.println(sumfd);

                minfd = numfd - numfd2;
                System.out.println(minf);
                multfd = numfd * numfd2;
                System.out.println(multfd);
                devfd = numfd / numfd2;
                System.out.println(devfd);

                double xfd = 1.5f;
                System.out.println(xfd++); // => 6
                System.out.println(xfd);
                double yfd = 2.5f;
                System.out.println(yfd--); // => 6
                System.out.println(yfd);


            }
        }

        // в целом все хорошо
    }
