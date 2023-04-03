package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner

        System.out.println("Nhập width");
        width = scanner.nextFloat();

        System.out.println("Nhập height");
        height = scanner.nextFloat();
        float area = width * height;

        System.out.println("Diện tích hình chữ nhật là : " + area);
    }
}
