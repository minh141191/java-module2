package day5.baicuangu;

import java.util.Arrays;
import java.util.Scanner;

public class EmployerMain1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FullTime f = new FullTime(123, "Dung", 26, 3);
        FullTime f1 = new FullTime(13, "Tuan", 26, 2);
        PartTime p = new PartTime(1, "Thai", 26, 5);
        PartTime p1 = new PartTime(12, "Lam", 26, 5);
        Employee[] employees = {f, f1, p, p1};
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Hiện thị nv FullTime ");
            System.out.println("2. Hiện thị nv PartTime ");
            System.out.println("3. Thêm nv FullTime mới ");
            System.out.println("4. Thêm nv PartTime mới ");
            System.out.println("5. Sửa 1 nv theo ID");
            System.out.println("6. Xóa 1 nv ");
            System.out.println("Nhập lựa chọn của bạn ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i] instanceof FullTime) {
                            System.out.println(employees[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i] instanceof PartTime) {
                            System.out.println(employees[i]);
                        }
                    }
                case 3:
                    Employee[] newArrEmployee = new Employee[employees.length + 1];
                    for (int i = 0; i < employees.length; i++) {
                        newArrEmployee[i] = employees[i];
                    }
                    newArrEmployee[newArrEmployee.length - 1] = FullTime.greatFullTime();
                    System.out.println(Arrays.toString(newArrEmployee));
                    break;
                case 4:
                    Employee[] newArrEmployee1 = new Employee[employees.length + 1];
                    for (int i = 0; i < employees.length; i++) {
                        newArrEmployee1[i] = employees[i];
                    }
                    newArrEmployee1[newArrEmployee1.length - 1] = PartTime.greatPartTime();
                    System.out.println(Arrays.toString(newArrEmployee1));
                    break;
                case 5:
                    System.out.println("Nhập mã Id của nhân viên muốn sửa");
                    int editId = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i].getId() == editId) {
                            if (employees[i] instanceof FullTime) {
                                FullTime.editFullTime(employees[i]);
                            }else {
                                PartTime.editPartTime(employees[i]);
                            }
                        }
                    }
                    System.out.println(Arrays.toString(employees));
                    break;

                case 6:
                    System.out.println("Nhập tên cần xóa");
                    String deleteName = scanner.nextLine();
                    Employee[] newEmployee = new Employee[employees.length-1];
                    int j = 0;
                    for (int i = 0; i < employees.length; i++) {
                        if (!employees[i].getName().equalsIgnoreCase(deleteName)) {
                            newEmployee[j] = employees[i];
                            j++;
                        }
                    }
                    System.out.println(Arrays.toString(newEmployee));
                    break;
                default:
                    System.out.println("Không có lựa chọn trên!");
            }

        } while (choice != 0);
    }
}
