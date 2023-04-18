package day11.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String inputString = scanner.nextLine();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(String.valueOf(inputString.charAt(i)));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("Đây là chuỗi đối xứng!");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng!");
        }
    }
}
