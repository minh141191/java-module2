package day2;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
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
