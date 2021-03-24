import java.util.Scanner;

class ChetNechet {
    public static void main(String[] args) {
        System.out.println("Число плс:");
        Scanner chislo = new Scanner(System.in);
        int num = chislo.nextInt();
        if (num%2 == 0) {
            System.out.println("Ваше число четное");
        }
        else {
            System.out.println("Ваше число нечетное");
        }

    }
}
