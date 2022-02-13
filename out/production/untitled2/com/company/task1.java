package week2;

//1. В данной ситуации код рабочий, но если убрать цикл и сделать переменную n >= 101
//то в консоль выведется "Отлично", это неправильно, так как 101 уже вне нашей системы оценок
//я бы лучше заменил последнее условие n != 100 на n <= 100.
//2. Твои классы лежат в папке "out/production...", а должны быть в "src/..." 
// папка out прдназначена для скомпилированных файлов (.class, а не .java)
// и мы в нее сами ничего не должны помещать
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
