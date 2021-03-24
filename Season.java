import java.util.Scanner;

public class Season {
    public static void main (String [] args) {
        System.out.println("Введите месяц:");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Это зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Это весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Это лето");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Это осень");
        }

        }
    }
