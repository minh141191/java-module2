package day3;

import java.util.Scanner;

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        int width = scanner.nextInt();
        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Thông tin hình chữ nhật: " + rectangle.display());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea() + " (m2)");
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter() + " (m)");
    }
}
