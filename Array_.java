import java.util.Scanner;
//Практика 3(задание 3)
public class Array_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        double average = 0;
        if (array.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
            System.out.println("Среднестастическое:"+ average);
        }
        for (int i = 0; i < average; i++)
                System.out.print("Из\n" +
                        "полученного массива элементы превышающие среднее\n" +
                        "арифметическое всего массива.:"+ i);
            }
        }

