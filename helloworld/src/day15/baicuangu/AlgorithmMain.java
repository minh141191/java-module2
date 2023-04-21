package day15.baicuangu;

import java.util.Scanner;

public class AlgorithmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();
        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Giải toán phương trình bậc 1 - 1 ẩn: ax + b = 0.");
            System.out.println("2. Giải toán phương trình bậc 2 - 1 ẩn: ax2 + bx + c = 0.");
            System.out.println("0. Thoát chương trình!");
            System.out.println("Nhập lựa chọn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Lỗi chọn MENU: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 1:
                    algorithm.ptBac1();
                    break;
                case 2:
                    algorithm.ptBac2();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
