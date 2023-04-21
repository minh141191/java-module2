package day15.baicuangu;

import java.util.Scanner;

public class Algorithm {
    static Scanner scanner = new Scanner(System.in);
    public void ptBac1() throws NumberFormatException {
        try {
            System.out.println("Nhập a");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập b");
            double b = Double.parseDouble(scanner.nextLine());
            double x;
            if (a != 0) {
                x = -b / a;
                System.out.println("Phương trình có nghiệm là: " + x);
            } else if (b != 0){
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có vô số nghiệm");
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void ptBac2() throws NumberFormatException {
        try {
            System.out.println("nhập a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập b");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập c");
            double c = Double.parseDouble(scanner.nextLine());
            double delta = Math.pow(b, 2) - (4 * a * c);
            double x;
            double x1;
            double x2;
            if (a != 0) {
                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else {
                    if (delta == 0) {
                        x = -b / 2 * a;
                        System.out.println("Phương trình có nghiệm kép là: " + x);
                    } else {
                        x1 = (-b - Math.sqrt(delta)) / (2 * a);
                        x2 = (-b + Math.sqrt(delta)) / (2 * a);
                        System.out.println("Phương trình có 2 nghiệm:\n x1 = " + x1 + ",\n x2 = " + x2);
                    }
                }
            } else {
                System.out.println("Bạn nhập sai, mời nhập lại giá trị cho a (a phải khác 0) !");
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
