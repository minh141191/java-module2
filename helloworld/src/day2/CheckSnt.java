package day2;

import java.util.Scanner;

public class CheckSnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "không phải là snt");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " Là số nguyên tố");
            else
                System.out.println(number + " Không phải là số nguyên tố");
        }
    }
}
