package day13.baitapcuaquan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManage {
    List<Classroom> classrooms;
    Scanner scanner;

    public ClassroomManage() {
        classrooms = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addClassroom() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên lớp");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(id, name);
        classrooms.add(classroom);
    }

    public int getIndexOfClassroomById() {
        System.out.println("Nhập id bạn muốn sử dụng");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < classrooms.size(); i++) {
            if (classrooms.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void editClassroomById() {
        int index = getIndexOfClassroomById();
        if (index != -1) {
            System.out.println("Nhập lớp mới");
            String name = scanner.nextLine();
            classrooms.get(index).setName(name);
        } else {
            System.out.println("Bạn nhập sai ID");
        }
    }

    public void deleteClassroomById() {
        int index = getIndexOfClassroomById();
        if (index != -1) {
            classrooms.remove(index);
        }
    }

    public void getClassroomById() {
        List<Classroom> classrooms1 = new ArrayList<>();
        int index = getIndexOfClassroomById();
        if (index != -1) {
            for (Classroom classroom : classrooms) {
                System.out.println(classrooms1.add(classroom));
            }
        } else {
            System.out.println("Id bạn nhập không đúng!");
        }
        System.out.println(classrooms1);
    }

    public void displayAllClassroom() {
        if (!classrooms.isEmpty()) {
            for (Classroom classroom : classrooms) {
                System.out.println(classroom);
            }
        } else {
            System.out.println("Danh sách rỗng!");
        }
    }

}
