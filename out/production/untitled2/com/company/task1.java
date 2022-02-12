package week2;

public class task1 {
    public static void main(String[] args) {
        int n;
        for (n = 1; n <= 100; n++) {
            if (n <= 25) {
                System.out.println("Плохо");
            } else if (n <= 50) {
                System.out.println("Ниже среднего");
            } else if (n <= 75) {
                System.out.println("Выше среднего");
            } else if (n != 100) {
                System.out.println("Отлично");
            } else  {
                System.out.println("Ошибка");
            }
        }
    }

}