package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Exp1 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 10 / 0 ;

        } catch (Exception e) {
            exceptions.add(e);
        }


        try {
            String string = "Hello world";
            int i = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }


        try {
            int[] nums = new int[] {1, 2, 3};
            int b = nums[-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String str = "Hello World";
            char a = str.charAt(-1);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            String[] dateStr = new String[-5];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[3];
            try {
                int ar = a[9];
            } catch (IndexOutOfBoundsException e9) {
                exceptions.add(e9);
            }
            finally {
                System.out.println("No problem");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
