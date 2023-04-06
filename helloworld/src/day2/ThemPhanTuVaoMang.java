package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,3,4,4,5};
        int[] newArr = new int[6];
        System.out.println("nhập giá trị cần chèn");
        int x = scanner.nextInt();
        System.out.println("nhập vị trí cần chèn");
        int index = scanner.nextInt();
        if (index <= -1 || index > arr.length-1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i <= arr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = x;
                } else {
                    newArr[i] = arr[i - 1];
                }
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}