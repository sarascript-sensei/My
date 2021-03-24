import java.util.Scanner;
public class Stepen {
    public static void main (String [] args) {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 0; i<num; i++) {
            for (int j=0; j<num;j++) {
                System.out.println(+num+"*"+i+" = "+(i*j));
            }

        }
    }
}

