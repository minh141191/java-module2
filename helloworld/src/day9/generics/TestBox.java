package day9.generics;

public class TestBox {
    public static void main(String[] args) {
        Box b1 = new Box<Integer>(10);
        System.out.println("giá trị: " + b1.getValue());
    }
}
