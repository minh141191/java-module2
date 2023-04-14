package day8.btvn;

import java.util.Scanner;

import static day8.btvn.PersonManage.createPerson;
import static day8.btvn.PersonManage.displayPerson;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng Person bạn muốn thêm ");
        int size = Integer.parseInt(scanner.nextLine());
        Person[] people = new Person[size];
        for (int i = 0; i < people.length; i++) {
            people[i] = createPerson();
        }
        displayPerson(people);
    }
}

