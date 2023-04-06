package day2;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 4, 4 ,5 ,6};
        System.out.println("Nhập phần tử cần xóa ");
        int x = scanner.nextInt();
        int[] newArr = new int[6];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
