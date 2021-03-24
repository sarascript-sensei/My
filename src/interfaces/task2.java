package interfaces;

import java.util.HashMap;
import java.util.Map;


public class task2 {
    public static void main(String[] args){
       HashMap<String, String> col = new HashMap<>();
       col.put("арбуз", "ягода");
       col.put("банан", "трава");
       col.put("вишня", "ягода");
       col.put("груша", "фрукт");
       col.put("дыня", "овощ");
       col.put("ежевика", "куст");
       col.put("женьшень", "корень");
       col.put("земляника", "ягода");
       col.put("ирис", "цветок");
       col.put("картофель", "клубень");
       for (Map.Entry<String,String> item: col.entrySet() ){
            System.out.printf(item.getKey()+ "-" + item.getValue()+ "\n");
        }
        }
    }