package interfaces;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите ваш возраст");
            Scanner a = new Scanner(System.in);
            int age = a.nextInt();
            if (age < 18) {
                throw new ArithmeticException("Доступ запрещен.");
            }
            else {
                System.out.println("Доступ разрешен");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
