package day1;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD ");
        int  USD = scanner.nextInt();
        int VND = USD * 23000;
        System.out.println(USD + " USD = " + VND + " VND");
    }
}
