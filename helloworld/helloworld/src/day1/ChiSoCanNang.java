package day1;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("chều cao (m) ");
        double height = scanner.nextDouble();
        System.out.println("cân nặng (kg)");
        double weight = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s %s", "BMI", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
