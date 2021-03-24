import java.util.Scanner;
//Практика 2(задание 2)
public class DiapozonProstixChisel {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                System.out.println("Введите начало диапозона");
                int start = input.nextInt();
                System.out.println("Введите конец диапозона");
                int end = input.nextInt();

            for (int i = start; i < end; i++) {
                if (isSimpleNumber(i)) {
                    System.out.println(i);
                }
            }

        }

        public static boolean isSimpleNumber(int value) {
            if ((value % 2 == 0) ||
                    (value % 3 == 0) ||
                    (value % 5 == 0) ||
                    (value % 7 == 0)) {
                return false;
            }

            return true;
        }
    }
