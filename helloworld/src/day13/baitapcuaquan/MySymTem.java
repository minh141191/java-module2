package day13.baitapcuaquan;

import java.util.Scanner;

public class MySymTem {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        ClassroomManage classroomManage = new ClassroomManage();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Thêm 1 Student vào dánh sách");
            System.out.println("2. Sửa 1 Student theo Id");
            System.out.println("3. Xóa 1 Student theo Id");
            System.out.println("4. Lấy 1 Student theo Id và hiển thị");
            System.out.println("5. Hiển thị tất cả Student");
            System.out.println("6. Hiển thị Student theo Classroom");
            System.out.println("7. Hiển thị Student theo điểm trung bình ");
            System.out.println("8. Hiển thị Student có điểm trung bình cao nhất");
            System.out.println("9. Hiển thị Student có điểm trung bình thấp nhất");
            System.out.println("10. Hiển thị Student theo giới tính");
            System.out.println("11. Thêm 1 Classroom mới");
            System.out.println("12. Sửa thông tin Classroom theo Id");
            System.out.println("13. Xóa Classroom theo Id");
            System.out.println("14. Lấy ra 1 Classroom theo Id");
            System.out.println("15. Hiển thị tất cả Classroom");
            System.out.println("0. Exit!");
            System.out.println("Your Choice!");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentManage.createStudent();
                    break;
                case 2:
                    studentManage.editStudent();
                    break;
                case 3:
                    studentManage.deleteStudent();
                    break;
                case 4:
                    studentManage.getStudent();
                    break;
                case 5:
                    studentManage.displayAll();
                    break;
                case 6:
                    studentManage.displayStudentByClassroom();
                    break;
                case 7:
                    studentManage.displayStudentByAvgPoint();
                    break;
                case 8:
                    studentManage.displayByMaxAvgPoint();
                    break;
                case 9:
                    studentManage.displayByMinAvgPoint();
                    break;
                case 10:
                    break;
                case 11:
                    classroomManage.addClassroom();
                    break;
                case 12:
                    classroomManage.editClassroomById();
                    break;
                case 13:
                    classroomManage.deleteClassroomById();
                    break;
                case 14:
                    classroomManage.getClassroomById();
                    break;
                case 15:
                    classroomManage.displayAllClassroom();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
