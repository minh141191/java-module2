package day4;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {

        // 1. Khoi tao mang so nguyen voi 100.000 phan tu random
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt();
        }

        // 2. Thuc thi sort tang dan cho mang tren
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thời gian cần thực thi logic sort2 là: " + stopWatch.getElapsedTime());
    }
    // 2. Thuc thi sort tang dan cho mang tren
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
