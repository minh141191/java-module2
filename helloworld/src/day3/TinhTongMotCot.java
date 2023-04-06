package day3;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập giá trị của phần tử " + i + " " + j + " vào mảng");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("nhập cột cần cộng từ 0 đến độ dài của mảng");
        int colSum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colSum];
            }
        System.out.println(sum);
    }
}
