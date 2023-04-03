package day1;

import java.util.Scanner;

public class TongS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        double n = scanner.nextDouble();
        double s = 0;
        for (int i = 0; i < n; i++) {
            s += (double) i / ((double) i +1);
        }
        System.out.println("tổng của dãy là: " + s);
    }
}
