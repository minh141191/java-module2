package day2;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền gửi: ");
        double tiengui = scanner.nextDouble();
        System.out.println("số tháng");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất hằng năm theo tỉ lệ phần trăm: ");
        double interestRate = scanner.nextDouble();
        double tongtienlai = 0;
        for (int i = 0; i < month; i++) {
            tongtienlai += tiengui * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng tiền lãi là: " + tongtienlai);
    }
}