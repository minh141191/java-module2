package day10;


public class Student extends Person implements Comparable <Student> {
    private static int autoUpId = 1;
    private int id;
    private double average;

    public Student() {
    }

    public Student(String name, int age, double average) {
        super(name, age);
        this.id = autoUpId++;
        this.average = average;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = " + super.getName() +
                ", age = " + super.getAge() +
                ", average = " + average +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.average == student.average) {
            return student.getId() - this.getId();
        } else {
            return (int) (student.getAverage() - this.getAverage());
        }
    }
}