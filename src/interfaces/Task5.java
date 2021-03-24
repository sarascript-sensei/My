package interfaces;

import java.util.HashSet;
import java.util.Iterator;


public class Task5 {

    public static HashSet<Integer> createSet() {
        HashSet<Integer> num = new HashSet<>();
        for (int i=0;i<20;i++)num.add(i);
        return num;
    }

        public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> num) {
            Iterator<Integer> it = num.iterator();
            while (it.hasNext()) {
                if (it.next() > 10) {
                    it.remove();
                }
            }
            return num;
        }

        public static void main(String[] args) {
            System.out.println(removeAllNumbersMoreThen10(createSet())+ "\n");
        }
    }
