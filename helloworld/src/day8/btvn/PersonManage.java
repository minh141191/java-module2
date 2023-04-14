package day8.btvn;

import java.util.Scanner;

public class PersonManage {
    static Scanner scanner = new Scanner(System.in);


    public static void displayPerson(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }


    public static Address getAddress() {
        Address[] addresses = new Address[3];
        addresses[0] = new Address(1,"Hà Nội");
        addresses[1] = new Address(2,"Đà Nẵng");
        addresses[2] = new Address(3,"Hồ Chí Minh");

        int choice;
        Address address = new Address();
        for (int i = 0; i <addresses.length ; i++) {
            System.out.println(addresses[i].getId() + "." + addresses[i].getName());
        }
        System.out.println("Chọn Địa chỉ");
        choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < addresses.length; i++) {
            if (addresses[i].getId() == choice) {
                address = addresses[i];
            }
        }
        return address;
    }

    public static Person createPerson() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        Address address = getAddress();

        return new Person(name, age, address);
    }

    public static void editPerson(Person[] people) {
        System.out.println("Nhập Id muốn sửa");
        int editId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < people.length; i++) {
            if (people[i].getId() == editId) {

            }
        }
    }
}
