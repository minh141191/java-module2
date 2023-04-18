package day10;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. Hiển thị danh sách Student");
            System.out.println("2. Thêm 1 student vào danh sách");
            System.out.println("3. Tìm vị trí 1 student trong danh sách theo tên");
            System.out.println("4. Xóa 1 student trong danh sách theo mã ID ");
            System.out.println("5. Sửa thông tin 1 student theo mã ID");
            System.out.println("6. Sắp xếp danh sách theo điểm trung bình tăng dần");
            System.out.println("7. Sắp xếp danh sách theo điểm trung bình giảm dần");
            System.out.println("8. Tính tổng điểm trung bình");
            System.out.println("0. Kết thúc chương trình!!!");
            System.out.println("Nhập lựa chọn!");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentManager.displayAll();
                    break;
                case 2:
                    Student student = studentManager.createNewStudent();
                    studentManager.addStudent(student);
                    break;
                case 3:
                    System.out.println("Nhập tên bạn muốn tìm ");
                    String searchName = scanner.nextLine();
                    System.out.println("Vị trí của học sinh là: " + studentManager.findStudentByName(searchName));
                    break;
                case 4:
                    studentManager.displayAll();
                    System.out.println("Nhập mã Id bạn muốn xóa ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    studentManager.removeStudent(deleteId);
                    studentManager.displayAll();
                    break;
                case 5:
                    System.out.println("Nhập mã Id bạn muốn sửa ");
                    int setId = Integer.parseInt(scanner.nextLine());
                    studentManager.updateStudent(setId);
                    studentManager.displayAll();
                    break;
                case 6:
                    studentManager.sortStudentByAvg();
                    System.out.println("Danh sách theo điểm trung bình tăng dần");
                    studentManager.displayAll();
                    break;
                case 7:
                    studentManager.sortStudentByAvg2();
                    System.out.println("Danh sách theo điểm trung bình giảm dần");
                    studentManager.displayAll();
                    break;
                case 8:
                    studentManager.sumAvg();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}