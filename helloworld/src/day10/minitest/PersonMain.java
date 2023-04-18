package day10.minitest;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        int subChoice;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Thêm 1 người vào danh sách");
            System.out.println("3. Tìm vị trí của 1 người trong danh sách theo tên");
            System.out.println("4. Xóa 1 người trong danh sách theo mã ID ");
            System.out.println("5. Sửa thông tin 1 người theo mã ID");
            System.out.println("6. Sắp xếp danh sách theo điểm trung bình tăng dần");
            System.out.println("7. Tính tổng điểm trung bình");
            System.out.println("0. Thoát!!!");
            System.out.println("Nhập lựa chọn!");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    personManager.displayAll();
                    break;
                case 2:
                    System.out.println("1. Thêm Person");
                    System.out.println("2. Thêm Student");
                    System.out.println("Nhập lựa chọn!");
                    subChoice = Integer.parseInt(scanner.nextLine());
                    switch (subChoice) {
                        case 1:
                            personManager.addPerson();
                            personManager.displayAll();
                            break;
                        case 2:
                            personManager.addStudent();
                            personManager.displayAll();
                            break;
                    }
                    break;
                case 3:
                    personManager.findIndexOfPersonByName();
                    break;
                case 4:
                    personManager.displayAll();
                    personManager.removePersonById();
                    personManager.displayAll();
                    break;
                case 5:
                    personManager.updatePersonById();
                    personManager.displayAll();
                    break;
                case 6:
                    personManager.displayAll();
                    personManager.sortStudentByAvg();
                    personManager.displayAll();
                    break;
                case 7:
                    personManager.sumAvg();
                    break;
                case 0:
                    System.exit(0);
                        break;
            }
        } while (true);
    }
}
