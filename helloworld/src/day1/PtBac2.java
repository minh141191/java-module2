package day1;

import java.util.Scanner;

public class PtBac2 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        System.out.println("nhập c");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1;
        double x2;
        if (a != 0) {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                if (delta == 0) {
                    x1 = x2 = -b / 2 * a;
                    System.out.println("Phương trình có nghiệm kép là: " + x1);
                } else {
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
                }
            }
        }
        else {
            System.out.println("Hãy nhập giá trị của a khác 0!");
        }
    }
}
