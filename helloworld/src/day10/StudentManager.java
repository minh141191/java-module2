package day10;
import java.util.*;

public class StudentManager implements Manage {

    private final ArrayList<Student> students;
    Scanner scanner;
    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayAll() {
        if (!students.isEmpty()) {
            for (Student student :students) {
                System.out.println(student);
            }
        }   else {
            System.out.println("Danh sách hiện tại đang rỗng!");
        }
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        displayAll();
    }

    @Override
    public int findStudentByName(String name) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(name)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public void removeStudent(int id) {
        boolean isExist = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                isExist = true;
                students.remove(i);
                break;
            }
        }
        if (!isExist) {
            System.out.println("Id bạn nhập không đúng!!");
        }
    }

    @Override
    public void updateStudent(int id) {
        boolean isExist = false;
        for (Student student : students) {
            if (student.getId() == id) {
                isExist = true;
                System.out.println("Nhập tên ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập điểm trung bình");
                double average = Double.parseDouble(scanner.nextLine());
                student.setName(name);
                student.setAge(age);
                student.setAverage(average);
                break;
            }
        }
        if (!isExist) {
            System.out.println("Id bạn nhập không đúng!");
        }
    }

    @Override
    public void sortStudentByAvg() {
        AverageComparator ageComparator = new AverageComparator();
        Collections.sort(this.students, ageComparator);
    }

    @Override
    public void sortStudentByAvg2() {
        Collections.sort(students);
    }

    @Override
    public void sumAvg() {
        double sumAvg = 0;
        for (Student student : students) {
            sumAvg += student.getAverage();
        }
        System.out.println("Tổng điểm trung bình cộng là: " + sumAvg);
    }

    public Student createNewStudent() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm trung bình");
        double average = Double.parseDouble(scanner.nextLine());

        return new Student(name, age, average);
    }

    public int getIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
