import java.util.Scanner;
//Таблица умножения рассчитана на  умножение всех чисел до 10
//Практика 2(задание 1)
public class TableOfUmnojenia {
    public static void main (String [] args) {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i<=10; i++) {
            System.out.println(+num+"*"+i+" = "+(i*num));
        }
        }
    }
