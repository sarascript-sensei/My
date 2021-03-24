import java.util.Scanner;

class Dog {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int sum = 0;
        int umnoj = 1;
        while (num1 != 0) {
            //Суммирование цифр числа
            sum += (num1 % 10);
            umnoj *= (num1 % 10);
            num1 /= 10;

        }
        System.out.println("Сумма =" + sum);
        System.out.println("Умножение =" + umnoj);
    }
}