package day15.giaitoanphuongtrinh;

import java.util.Scanner;

public class Algorithm {
    static Scanner scanner = new Scanner(System.in);
    public void ptBac1() throws NumberFormatException {
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
    }

    public void ptBac2() throws NumberFormatException {
        System.out.println("nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập c");
        double c = Double.parseDouble(scanner.nextLine());
        double delta = Math.pow(b, 2) - 4 * a * c;
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
        }
        else {
            System.out.println("Hãy nhập giá trị của a khác 0!");
        }
    }

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        int choice = 0;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Giải toán phương trình bậc 1 - 1 ẩn: ax + b = 0.");
            System.out.println("2. Giải toán phương trình bậc 2 - 1 ẩn: ax2 + bx + c = 0.");
            System.out.println("0. Thoát chương trình!");
            System.out.println("Nhập lựa chọn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi chọn MENU: " + e.getMessage());
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        algorithm.ptBac1();
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        algorithm.ptBac2();
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
