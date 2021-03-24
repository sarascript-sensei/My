package interfaces;

import java.util.ArrayList;
import java.util.List;

class task3 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        intEx();
        floatEx();
        StringEx();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void intEx() {
        try {
            int num=Integer.parseInt ("XYZ") ;
            System.out.println(num);
            throw new NumberFormatException("Но ведь это же блин СТРОКА!!!!!!!!!!!!!!!!!!");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
    }


    private static void StringEx() {
        try{
            String str="beginnersbook";
            System.out.println(str.length());;
            throw new StringIndexOutOfBoundsException("Неверный формат!");
        }catch (Exception e) {
            exceptions.add(e);

    }
    }

    private static void floatEx() {
        try {
            float i = 1 / 0;
            throw new NumberFormatException("Нельзя делить на ноль!");

        } catch (Exception e) {
            exceptions.add(e);
    }
    }

}
