package day15;

import java.util.Scanner;

public class CheckTriangle {
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ");
        } else {
            System.out.println("Tam giác hợp lệ!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckTriangle check = new CheckTriangle();

        try {
            System.out.println("Nhập cạnh a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh c");
            int c = Integer.parseInt(scanner.nextLine());
            try {
                check.checkTriangle(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
