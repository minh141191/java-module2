package day3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOf2Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cho mảng");
        int size = scanner.nextInt();
        // Tạo mảng 2 chiều
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập giá trị của phần tử " + i + " " + j + " vào mảng");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
    }
}
