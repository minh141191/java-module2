package day10.minitest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager implements Manager {
    private final ArrayList<Person> personArrayList;
    private final Scanner scanner;

    public PersonManager() {
        personArrayList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void displayAll() {
        if (!personArrayList.isEmpty()) {
            for (Person person : personArrayList) {
                System.out.println(person);
            }
        } else {
            System.out.println("Danh sách hiện tại đang rỗng!");
        }
    }

    @Override
    public void addPerson() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        Person person = new Person(name, age);
        personArrayList.add(person);
    }

    public void addStudent() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhâp tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập điểm trung bình: ");
        double avePoint = Double.parseDouble(scanner.nextLine());
        Student student = new Student(name, age, avePoint);
        personArrayList.add(student);
    }

    @Override
    public void findIndexOfPersonByName() {
        System.out.println("Nhập tên bạn muốn tìm ");
        String searchName = scanner.nextLine();
        List<Integer> listIndex = new ArrayList<>();
//        List<Person> list = new ArrayList<>();
//        // 1. tim kiem
//        List<Person> list2 = personArrayList.stream()
//                .filter(item -> item.getName().equalsIgnoreCase(searchName))
//                .collect(Collectors.toList());
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getName().equalsIgnoreCase(searchName)) {
                listIndex.add(i);
//                list.add(personArrayList.get(i));
            }
        }

        // logic hien thi
        if (!listIndex.isEmpty()) {
            System.out.println("Vị trí cần tìm của bạn là: " + listIndex);
        } else {
            System.out.println("Tên bạn nhập không có trong danh sách!");
        }
    }

    public int getIndexById() {
        System.out.println("Nhập mã Id bạn muốn sử dụng ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removePersonById() {
        int index = getIndexById();
        if (index != -1) {
            System.out.println("Bạn đã xóa " + personArrayList.remove(index) + " khỏi danh sách!");
        } else {
            System.out.println("Id bạn vừa nhập không có trong danh sách!");
        }
    }

    @Override
    public void updatePersonById() {
        int index = getIndexById();
        if (index != -1) {
            System.out.print("Nhập tên mới: ");
            String name = scanner.nextLine();
            personArrayList.get(index).setName(name);
            System.out.print("Nhập tuổi mới: ");
            int age = Integer.parseInt(scanner.nextLine());
            personArrayList.get(index).setAge(age);
            if (personArrayList.get(index) instanceof Student) {
                System.out.print("Nhập điểm trung bình mới: ");
                double avgPoint = Double.parseDouble(scanner.nextLine());
                ((Student) personArrayList.get(index)).setAvgPoint(avgPoint);
            }
        } else {
            System.out.println("Id bạn vừa nhập không có trong danh sách!");
        }
    }

    @Override
    public void sortStudentByAvg() {
        AvgComparator avgComparator = new AvgComparator();
        this.personArrayList.sort(avgComparator);
    }

    @Override
    public void sumAvg() {
        double sumAvgStudent = 0;
        for (Person person : personArrayList) {
            if (person instanceof Student) {
                sumAvgStudent += ((Student) person).getAvgPoint();
            }
        }
        System.out.println("Tổng điểm trung bình của học sinh là: " + sumAvgStudent);
    }
}
