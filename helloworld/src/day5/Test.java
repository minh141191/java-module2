package day5;

public class Test {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c1 = new Child();
//        Child c2 = new Parent();
        Parent p3 = (Parent) c1;
        Child c3 = (Child) p2;
        Child c4 = (Child) p1;

        c1.m2();
//        p3.m2();
        p3.m1();
        p2.m1();
        //p2.m2();
        c3.m2();

    }
}
