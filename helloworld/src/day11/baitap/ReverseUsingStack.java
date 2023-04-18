package day11.baitap;

import java.util.*;

public class ReverseUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrStack = new int[size];
        System.out.println("Nhập phần tử của mảng");
        for (int i = 0; i < size; i++) {
            arrStack[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(arrStack[i]);
        }
//        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrStack[i] = stack.pop();
//            listNum.add(arrStack[i]);
        }
//        System.out.println(listNum);
        System.out.println("Mảng sau sau khi đảo ngược: " +Arrays.toString(arrStack));
    }
}
