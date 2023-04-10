package day5.baicuangu;


public class EmployerMain {
    public static void main(String[] args) {
        FullTime f = new FullTime(1, "Hieu", 25, 3);
        PartTime p = new PartTime(3, "Dung", 24, 4);
        Employee[] employeeArr = new Employee[2];

        // Upcasting ==>
        employeeArr[0] = (Employee) f;
        employeeArr[1] = (Employee) p;


        for (int i = 0; i < 2; i++) {
            if (employeeArr[i] instanceof FullTime) {
                // // Down casting ==>
                FullTime f1 = (FullTime) employeeArr[i];
                System.out.println(f1.getYearsOfExperience() * 2000000);
            }
            else {
                PartTime p1 = (PartTime) employeeArr[i];
                System.out.println(p1.getWorkTime() * 25000);
            }
        }
    }
}
