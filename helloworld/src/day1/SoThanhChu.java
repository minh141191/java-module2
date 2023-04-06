package day1;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int num = scanner.nextInt();
        String words = "";
        if (num < 0 || num > 1000) {
            System.out.println("Nhập sai!");
            return;
        }
        if (num < 100) {
            words = convertNumToStr(num);
        } else {
            int hundreds = num / 100;
            int reMain1 = num % 100;
            switch (hundreds) {
                case 1:
                    words = "One hundreds";
                    break;
                case 2:
                    words = "Two hundreds";
                    break;
                case 3:
                    words = "Three hundreds";
                    break;
                case 4:
                    words = "Four hundreds";
                    break;
                case 5:
                    words = "Five hundreds";
                    break;
                case 6:
                    words = "Six hundreds";
                    break;
                case 7:
                    words = "Seven hundreds";
                    break;
                case 8:
                    words = "Eight hundreds";
                    break;
                case 9:
                    words = "Nice hundreds";
                    break;
            }
            words += " " + convertNumToStr(reMain1);
        }
        System.out.println(words);
    }

    public static String convertNumToStr(int num) {
        String words = "";
        if (num < 10) {
            words = numToString(num);
        } else if (num < 20) {
            words = numToString1(num);
        } else if (num < 100) {
            int tens = num / 10;
            int remainder = num % 10;
            switch (tens) {
                case 2:
                    words = "Twenty";
                    break;
                case 3:
                    words = "Thirty ";
                    break;
                case 4:
                    words = "Forty ";
                    break;
                case 5:
                    words = "Fifty ";
                    break;
                case 6:
                    words = "Sixty";
                    break;
                case 7:
                    words = "Seventy";
                    break;
                case 8:
                    words = "Eighty";
                    break;
                case 9:
                    words = "Ninety";
                    break;
            }

            if (remainder > 0) {
                words += " " + numToString(remainder);
            }
        }
        return words;
    }
    public static String numToString(int num) {
        String words = "";
        switch (num) {
            case 0:
                words = "Zero";
                break;
            case 1:
                words = "One";
                break;
            case 2:
                words = "Two";
                break;
            case 3:
                words = "Three";
                break;
            case 4:
                words = "Four";
                break;
            case 5:
                words = "Five";
                break;
            case 6:
                words = "Six";
                break;
            case 7:
                words = "Seven";
                break;
            case 8:
                words = "Eight";
                break;
            case 9:
                words = "Nice";
                break;
        }
        return words;
    }
    public static String numToString1(int num) {
        String words = "";
        switch (num) {
            case 10:
                words = "Ten";
                break;
            case 11:
                words = "Eleven";
                break;
            case 12:
                words = "Twelve";
                break;
            case 13:
                words = "Thrdteen";
                break;
            case 14:
                words = "Fourteen";
                break;
            case 15:
                words = "Fifteen";
                break;
            case 16:
                words = "Sixteen";
                break;
            case 17:
                words = "Seventeen";
                break;
            case 18:
                words = "Eightteen";
                break;
            case 19:
                words = "Nineteen";
                break;
    }
    return words;
}
}