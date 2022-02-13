package week2;

//1. Классы в Java должны называться с большой буквы (task2 -> Task2)
//2. Код нерабочий. Неправильно используешь длину строк "length(names[i]) < 4" --> "names[i].length()"
// строки 10 и 11 необязательны, можно использовать такую запись цикла: for (int i = 0; i < names.length; i++)
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
        }

    }
    }

    }


