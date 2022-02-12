package week2;

public class task4 {package week2;
    public class task2
    {
        public static void main(String[]  args) {
            String[]  names = {"John","Bob", "Mary","Peter", "Sara"};
            int length;
            length = names.length;
            for (int i = 0; i < length; i++) {

                if (length(names[i]) < 4)             {
                    System.out.println("Ваше имя короче четырех букв");
                }
                else if
                (length(names[i]) > 4)
                {
                    System.out.println("Ваше имя длиннее четырех букв");
                } else if

                (length(names[i]) == 4) {
                    System.out.println("Ваше имя состоит из 4 букв");
                    else if (length(names[i]) < 2)
                        continue;
                    else if (length(names[i]) > 10)
                        break;
                }

            }
        }

    }
}
