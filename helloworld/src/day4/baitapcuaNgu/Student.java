package day4.baitapcuaNgu;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    int maths;
    int physical;
    int chemistry;
    public Student() {

    }

    public Student(String name, int age, int maths, int physical, int chemistry) {
        this.name = name;
        this.age = age;
        this.maths = maths;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public double getAverage() {
        return ((double) maths + physical + chemistry) / 3;
    }

    public static Student creatStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm môn maths: ");
        int maths = scanner.nextInt();
        System.out.println("Nhập điểm môn physical: ");
        int physical = scanner.nextInt();
        System.out.println("Nhập điểm môn chemistry: ");
        int chemistry = scanner.nextInt();
        scanner.nextLine();
        return new Student(name, age, maths, physical, chemistry);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maths=" + maths +
                ", physical=" + physical +
                ", chemistry=" + chemistry +
                '}';
    }
}
