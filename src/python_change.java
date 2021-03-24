import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.function.Function;

public class python_change {
    private static int[] range(int start, int stop, int step) {
        int[] result = new int[(stop - start) % step == 0 ? (stop - start) / step : (stop - start) / step + 1];
        int count = 0;
        Function<Integer, Boolean> condition = step > 0 ? (x) -> x < stop : (x) -> x > stop;
        for (int i = start; condition.apply(i); i += step) {
            result[count] = i;
            count++;
        }
        return result;
    }

    private static void BlaseSortirung(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }
    public static void with_Choise(int[] my_array ) {
        for (int i = 0; i < my_array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = my_array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = my_array[j];
                }
            }
            my_array[pos] = my_array[i];
            my_array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    private static void display() {
        System.out.println("Calculating Method execution time:");
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int size = scaner.nextInt();
        int array[] = new int[size];


            // create an object of the Main class
            python_change obj = new python_change();

            // get the start time
            long start = System.nanoTime();

            // call the method
            obj.display();

            // get the end time
            long end = System.nanoTime();

            // execution time
            long execution = end - start;
            System.out.println("Execution time: " + execution + " nanoseconds");
        }
    }
