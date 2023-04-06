package day4.baitapcuaNgu;

import java.util.Scanner;

public class CheckStudent {
    public static void main(String[] args) {
//        Student student1 = new Student("Hieu", 25, 10, 10, 10);
//        Student student2 = new Student("Dung", 25, 9, 10, 10);
//        Student student3 = new Student("Lam", 25, 10, 9, 10);
//        Student[] studentArr = {student1, student2, student3};

        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        Student[] studentArr = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh ");
            studentArr[i] = Student.creatStudent();
        }

        double maxAverage = studentArr[0].getAverage();
        int index = 0;

        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getAverage() > maxAverage) {
                index = i;
            }
        }
        System.out.println("Học sinh có điểm TBCcao nhất là: " + studentArr[index].toString()
        + "\n Có điểm TBC là: " + studentArr[index].getAverage());
    }
}
