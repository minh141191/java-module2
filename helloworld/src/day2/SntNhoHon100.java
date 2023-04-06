package day2;

import java.util.Scanner;

public class SntNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n ");
        int n = scanner.nextInt();
        System.out.println("Những số nguyên tố nhỏ hơn " + n + " là: ");
        int i = 2;
        while (i < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;// Nếu n < 2 thì không phải là số nguyên t
        }
        // check so nguyen to khi n >= 2
        int snt = (int) Math.sqrt(n);
        for (int i = 2; i <= snt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}