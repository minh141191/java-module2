package day16.baicuangu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOAccount {
    public static void writeFile(Account account) {
        File f = new File("src/day16/baicuangu/account.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f, true))) {
            if (!f.exists()) {
                throw new IOException();
            }

            bufferedWriter.write(account.toString() + "\n");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Account> readFile() {
        List<Account> accountList = new ArrayList<>();
        File file = new File("src/day16/baicuangu/account.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(", ");
                Account account = new Account();
                account.setId(Integer.parseInt(strings[0]));
                account.setUsername(strings[1]);
                account.setPassword(strings[2]);
                account.setFullName(strings[3]);
                account.setPhoneNumber(Integer.parseInt(strings[4]));
                account.setAddress(strings[5]);
                accountList.add(account);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return accountList;
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input UserName");
        String username = scanner.nextLine();
        System.out.println("Input PassWord");
        String password = scanner.nextLine();
        List<Account> accountList = readFile();
        if (username.equals("") || password.equals("")) {
            System.out.println("No input!");
        } else {
            boolean isOK = false;
            for (Account account : accountList) {
                if (account.getUsername().equalsIgnoreCase(username)
                        && account.getPassword().equals(password)) {
                    isOK = true;
                    System.out.println(account);
                    break;
                }
            }
            if (!isOK) {
                System.out.println("Login failed!");
            } else {
                System.out.println("Logged in successfully!");
            }
        }
    }

    public static void registe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input UserName");
        String username = scanner.nextLine();
        System.out.println("Input PassWord");
        String password = scanner.nextLine();
        System.out.println("Input FullName");
        String fullName = scanner.nextLine();
        System.out.println("Input PhoneNumber ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Address");
        String address = scanner.nextLine();
        Account account = new Account(id, username, password, fullName, phoneNumber, address);
        writeFile(account);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Đăng nhập: ");
            System.out.println("2. Đăng ký: ");
            System.out.println("0. Thoát chương trình!");
            System.out.println("Nhập lựa chọn.");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Lỗi chọn MENU: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    registe();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
