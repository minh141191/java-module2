package day5.baicuangu;

import java.util.Scanner;

public class FullTime  extends Employee {
    private int yearsOfExperience;

    public FullTime() {

    }

    public FullTime(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public FullTime(int id, String name, int age, int yearsOfExperience) {
        super(id, name, age);
        this.yearsOfExperience = yearsOfExperience;

    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

//    public double salaryFullTime() {
//        return getYearsOfExperience() * 2000000;
//    }

    @Override
    public String toString() {
        return "FullTime{" +
                "id = " + getId() +
                ", name = " + getName() +
                ", age = " + getAge() +
                ", yearsExp = " + getYearsOfExperience() +
                "}" + "\n";
    }
    static Scanner scanner = new Scanner(System.in);
    public static FullTime greatFullTime() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số năm kinh nghiệm");
        int yearsExp = Integer.parseInt(scanner.nextLine());
        return new FullTime(id, name, age, yearsExp);
    }

    public static void editFullTime(Employee employees) {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        employees.setName(name);
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        employees.setAge(age);
        System.out.println("Nhập số giờ làm");
        int workTime = Integer.parseInt(scanner.nextLine());
        employees.setYearsOfExperience(workTime);
    }
}
