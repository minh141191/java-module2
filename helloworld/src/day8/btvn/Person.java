package day8.btvn;

public class Person {
    private static int idUpPerson = 1;
    private int id;
    private String name;
    private int age;
    private Address address;

    public Person() {
        this.id = idUpPerson++;
    }

    public Person(String name, int age, Address address) {
        this.id = idUpPerson++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static int getIdUp() {
        return idUpPerson;
    }

    public static void setIdUp(int idUp) {
        Person.idUpPerson = idUp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id = " + id +
                ", name = " + name + '\'' +
                ", age = " + age +
                ", address = " + address.getName() +
                '}';
    }
}
