import java.util.Scanner;

public class denejki {
    private static double summa;
    public static void main (String [] args) {
        System.out.println("Добро пожаловать в банк 'Sara's Money'. Введите сумму вашего вклада:");
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        // Если сумма меньше 100
        if (money < 100) {
            summa = money + (money*0.07);
            System.out.println("Результат = " + summa);
        }
        // Если сумма где-то между 100 и 200
        else if (money > 100 && money < 200) {
            summa = money + (money*0.1);
            System.out.println("Результат = " + summa);
        }
        // Если сумма превышает 200
        else if(money > 200) {
            summa = money + (money*0.15);
            System.out.println("Результат = " + summa);
        }
    }
}
