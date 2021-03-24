import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//Практика 2(задание 3)

public class MinMaxAverageArray {
    public static void main(String[] args) {
        int n, sum = 0;
        float average;

        Scanner s = new Scanner(System.in);
        System.out.print("Напишите количество элементов в массиве:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Напишите все эллементы");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Сумма:" + sum);
        average = (float) sum / n;
        System.out.println("Ср. арифметическое:" + average);


    }
}

