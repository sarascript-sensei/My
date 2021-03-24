package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
public class task1 {
    public static ArrayList removeDuplicates(ArrayList<String> list)
    {
        ArrayList newList = new ArrayList();

        for (String element : list) {

            if (!newList.contains(element)) {

                newList.add((String) element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<String>
                list = new ArrayList<>(
                Arrays
                        .asList("Sara", "Amira", "Zhanyl", "Ais","Venera", "Zhanyl", "Karina", "Sara"));

        System.out.println("Лист до удаления дубликатов: "
                + list);
        ArrayList<String>
                newList = removeDuplicates(list);


        System.out.println("Лист после удаления дубликатов: "
                + newList);
    }

}