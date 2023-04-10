package day5.baicuangu;

import java.util.Scanner;

public class PartTime extends Employee {
    protected int workTime;

    public PartTime() {

    }

    public PartTime(int workTime) {
        this.workTime = workTime;
    }

    public PartTime(int id, String name, int age, int workTime) {
        super(id, name, age);
        this.workTime = workTime;
    }


    public int getWorkTime() {
        return workTime;
    }

    protected void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public double salaryPartTime() {
        return getWorkTime() * 2500;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "id = " + getId() +
                ", name = " + getName() +
                ", age = " + getAge() +
                ", workTime = " + getWorkTime() +
                "}" + "\n" ;
    }
    static Scanner scanner = new Scanner(System.in);
    public static PartTime greatPartTime() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số giờ làm");
        int workTime = Integer.parseInt(scanner.nextLine());
        return new PartTime(id, name, age, workTime);
    }

    public static void editPartTime(Employee employee) {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        employee.setName(name);
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        employee.setAge(age);
        System.out.println("Nhập số giờ làm");
        int workTime = Integer.parseInt(scanner.nextLine());
        employee.setWorkTime(workTime);
    }
}
