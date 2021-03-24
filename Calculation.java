import java.util.Scanner;
class Calculation extends My_Calculation{
    public static void main(String args[]) {
        double num1, num2, result;
        System.out.println("Введите два числа:");
        Scanner in = new Scanner(System.in);
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        result = addition(num1, num2);
        System.out.println("Сумма = " + result);
        result = Substratction(num1, num2);
        System.out.println("Разность = " + result);
        result = multiplication(num1, num2);
        System.out.println("Умножение = " + result);
    }

    public static double addition(double nbr1, double nbr2) {
        return (nbr1 + nbr2);
    }

    public static double Substratction(double nbr1, double nbr2) {
        return (nbr1 - nbr2);
    }

}