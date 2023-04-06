package day3;

import java.util.Scanner;

public class QuadraticEquation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị a");
        double a = scanner.nextDouble();
        System.out.println("nhập giá trị b");
        double b = scanner.nextDouble();
        System.out.println("nhập giá trị c");
        double c = scanner.nextDouble();
        scanner.close();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if (a != 0) {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép là: " + quadraticEquation.getRoot1());
            } else {
                System.out.println("Phương trình có 2 nghiệm là: x1 = " + quadraticEquation.getRoot1()
                        + ", x2 = " + quadraticEquation.getRoot2());
            }
        } else {
            System.out.println("Bạn nhập sai!");
        }
    }
}
