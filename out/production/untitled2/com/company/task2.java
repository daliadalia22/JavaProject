package week2;


public class task2 {
    public static void main(String[]  args) {
        String[]  names = {"John","Bob", "Mary","Peter", "Sara"};
        int length = names.length;
        for (int i = 0; i < names.length ; i++)
        if(length(names(i)) < 4)
        {System.out.println("Ваше имя короче четырех букв");
        }
        else if(length(names[i]) > 4)
        {System.out.println("Ваше имя длиннее четырех букв");
        }
        else if(length(names[i]) == 4)
        { System.out.println("Ваше имя состоит из 4 букв");
        }

    }}

