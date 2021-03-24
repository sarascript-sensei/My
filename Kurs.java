import java.util.Scanner;

class Kurs {
    public static final String USD = "USD";
    public static final String EURO = "EURO";
    public static final String RUB = "RUB";
    public static void main(String[] args) {
        System.out.println("Введите сумму для обмена в сомах:");
        Scanner input = new Scanner(System.in);
        double vSomah = input.nextInt();
        double Result;
        System.out.println("На что меняем?Впишите: USD или EURO или RUB");
        System.out.println("USD: 78.93");
        System.out.println("EURO:92.82");
        System.out.println("RUB: 1.004");
        Scanner input1 = new Scanner(System.in);
        String compiled  = input1.next();
        if (compiled.equals(Kurs.USD)) {
            Result = vSomah * 78.93;
            System.out.println(Result + " долларов");
        }
        else if (compiled.equals(Kurs.EURO)) {
            Result = vSomah * 92.82;
            System.out.println(Result + " евро");
        }
        else if (compiled.equals(Kurs.RUB)) {
            Result = vSomah * 1.004;
            System.out.println(Result + " рублей");
        }
        }
    }
