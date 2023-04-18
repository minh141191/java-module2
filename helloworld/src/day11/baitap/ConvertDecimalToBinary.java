package day11.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackSurplus = new Stack<>();
        System.out.println("Mời bạn nhập 1 số nguyên bất kì");
        int n = scanner.nextInt();
        while (n > 0) {
            int surplus = n % 2;
            stackSurplus.push(surplus);
            n = n / 2;
        }
        int size = stackSurplus.size();
        System.out.print("Số nhị phân là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(stackSurplus.pop());
        }
    }
}
