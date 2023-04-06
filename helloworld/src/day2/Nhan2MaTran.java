package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Nhan2MaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int n = scanner.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] arrAll = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Nhập vào phần tử " + i + " " + j + " của mảng thứ 1");
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("Nhập vào phần tử " + i + " " + j + " của mảng thứ 2");
                arr2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arrAll.length; i++) {
            for (int j = 0; j < arrAll[i].length; j++) {
                arrAll[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        for (int i = 0; i < arrAll.length; i++)
            System.out.println(Arrays.toString(arrAll[i]));
    }
}
