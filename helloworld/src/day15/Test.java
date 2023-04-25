package day15;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // unchecked runtime error;
        int[] arr = new int[3];
        arr[3] = 2;
        System.out.println(Arrays.toString(arr));
    }
}
