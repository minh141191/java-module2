package Day6.demo;

public class Sparrow extends Winged implements Fly{
    public Sparrow() {
}
    @Override
    public void fly() {
        System.out.println("Đang bay...");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
