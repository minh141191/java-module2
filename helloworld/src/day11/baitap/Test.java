package day11.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
//            stack.push(Integer.valueOf(string.charAt(i) + ""));
            stack.push(string.charAt(i) + "");
        }
        System.out.println("Đảo ngược chuỗi: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
