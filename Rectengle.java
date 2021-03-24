import java.util.Scanner;

public class Rectengle {
    public Rectengle(double width, double height) {

    }

    public static void main(String[] args) {
    }

    static class rectengle {
        double width;
        double height;
        

        public double get() {
            return width * height;
        }

        public double set() {
            return 2 * width + 2 * height;
        }

        @Override
        public String toString() {
            return "Периметр:" + get() + ",Площадь:" + set();
        }

        public static void main(String[] args) {
            double width = 200;
            double height = 200;
            Rectengle rectangle = new Rectengle(width, height);
            System.out.println(rectangle);
        }
    }
}