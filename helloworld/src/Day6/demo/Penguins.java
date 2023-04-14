package Day6.demo;

public class Penguins extends Winged implements CanFly{

    @Override
    public void canFly() {
        System.out.println("Không bay được!");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
