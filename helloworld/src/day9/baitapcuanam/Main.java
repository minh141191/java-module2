package day9.baitapcuanam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBookManager phoneBookManager = new PhoneBookManager();
//        phoneBookManager.displaytPhone();

        do {
            System.out.println("MENU");
            System.out.println("1. insertPhone ");
            System.out.println("2. removePhone");
            System.out.println("3. updatePhone");
            System.out.println("4. displayPhone ");
            System.out.println("5. searchPhone");
            System.out.println("6. sort");
            System.out.println("0. exit");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    phoneBookManager.insertPhone();
                    break;
                case 2:
                    phoneBookManager.removePhone();
                    break;
                case 4:
                    phoneBookManager.displaytPhone();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);
    }
}