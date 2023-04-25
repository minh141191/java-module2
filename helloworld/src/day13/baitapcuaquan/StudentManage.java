package day13.baitapcuaquan;

import java.util.*;

public class StudentManage implements Manage<Student> {
    public static List<Student> students;
    Map<Integer, String> gender;
    static Scanner scanner;
    ClassroomManage classroomManage=new ClassroomManage();

    public StudentManage() {
        students = new ArrayList<>();
        gender = new TreeMap<>();
        scanner = new Scanner(System.in);
    }

    public String getGender() {
        gender.put(1, "Nam");
        gender.put(2, "Nữ");
        gender.put(3, "Other");
        for (Map.Entry<Integer, String> gender1 : gender.entrySet()) {
            System.out.println(gender1.getKey() + ". " + gender1.getValue());
        }

        System.out.println("Chọn giới tính");
        int choice = Integer.parseInt(scanner.nextLine());
            if (gender.containsKey(choice)) {
                return gender.get(choice);
            }
        return "";
    }

    public static Classroom getClassroom() {
        Classroom classroom1 = new Classroom(1, "C01");
        Classroom classroom2 = new Classroom(2, "C02");
        Classroom classroom3 = new Classroom(3, "C03");
        Classroom[] classrooms = {classroom1, classroom2, classroom3};
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.getId() + ". " + classroom.getName());
        }

        Classroom classroom = new Classroom();
        int choice;
        System.out.println("Chọn lớp");
        choice = Integer.parseInt(scanner.nextLine());
        for (Classroom value : classrooms) {
            if (value.getId() == choice) {
                return value;
            }
        }
        return classroom;
    }

    public int getIndexOfStudentById() {
        System.out.println("Nhập mã ID bạn muốn sử dụng");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Student createStudent() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        String gender = getGender();
        System.out.println("Nhập điểm trung bình");
        double avgPoint = Double.parseDouble(scanner.nextLine());
        Classroom classroom = getClassroom();
        Student student = new Student(name, age, gender, avgPoint, classroom);
        students.add(student);
        return student;
    }

    @Override
    public Student editStudent() {
        int index = getIndexOfStudentById();
        if (index != -1) {
            System.out.println("Nhập tên mới");
            String name = scanner.nextLine();
            students.get(index).setName(name);
            System.out.println("Nhập tuổi mới");
            int age = Integer.parseInt(scanner.nextLine());
            students.get(index).setAge(age);
            String gender = getGender();
            students.get(index).setGender(gender);
            System.out.println("Nhập điểm trung bình mới");
            double avgPoint = Double.parseDouble(scanner.nextLine());
            students.get(index).setAvgPoint(avgPoint);
            Classroom classroom = getClassroom();
            students.get(index).setClassroom(classroom);
            return new Student(name, age, gender, avgPoint, classroom);
        }
        return null;
    }

    @Override
    public Student deleteStudent() {
        int index = getIndexOfStudentById();
        if (index != -1) {
            for (Student student : students) {
                students.remove(index);
                return student;
            }
        }
        return null;
    }

    @Override
    public Student getStudent() {
        int index = getIndexOfStudentById();
        if (index != -1) {
            for (Student student : students) {
                System.out.println(student);
                return student;
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        if (!students.isEmpty()) {
            for (Student student : students) {
            System.out.println(student);
            }
        } else {
            System.out.println("Danh sách đang rỗng!");
        }
    }

    public void displayStudentByClassroom() {
        classroomManage.displayAllClassroom();
        System.out.println("Nhập Class");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students) {
            if (student.getClassroom().getId() == id) {
                System.out.println(student);
            }
        }
    }

    public void displayStudentByAvgPoint() {
        for (Student student : students) {
            if (student.getAvgPoint() > 8) {
                System.out.println("Xếp loại giỏi: " + student);
            } else if (student.getAvgPoint() > 6) {
                System.out.println("Xếp loại khá: " + student);
            } else if (student.getAvgPoint() > 4.5) {
                System.out.println("Xếp loại trung bình: " + student);
            } else {
                System.out.println("Xếp loại kém: " + student);      }
        }
    }

    public void displayByMaxAvgPoint() {
        int maxIndex = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAvgPoint() > students.get(maxIndex).getAvgPoint()) {
                maxIndex = i;
            }
        }
        System.out.println(students.get(maxIndex));
    }

    public void displayByMinAvgPoint() {
        int minIndex = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAvgPoint() < students.get(minIndex).getAvgPoint()) {
                minIndex = i;
            }
        }
        System.out.println(students.get(minIndex));
    }
}
