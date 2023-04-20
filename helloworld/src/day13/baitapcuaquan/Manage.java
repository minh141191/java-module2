package day13.baitapcuaquan;

public interface Manage<E> {
    E createStudent();
    E editStudent();
    E deleteStudent();
    E getStudent();
    void displayAll();

}
