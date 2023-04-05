package day2;


import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];
        // Step 2.1 Nhập dữ liệu cho mảng 1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Phần tử " + i + " của mảng 1: ");
            arr1[i] = scanner.nextInt();
        }

        // Step 2.2 Nhập dữ liệu cho mảng 2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Phần tử " + i + " của mảng 2: ");
            arr2[i] = scanner.nextInt();
        }

        // Step 3
        int[] arr3 = new int[arr1.length + arr2.length];
        // Step 4
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        // Step 5
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
