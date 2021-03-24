package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
    try {
        int[] nums = new int[] {1, 2, 3};
        int b = nums[6];
        System.out.println(b);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Вы вышли за пределы массива");
    }
}
}
