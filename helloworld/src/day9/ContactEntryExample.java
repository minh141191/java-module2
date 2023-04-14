package day9;

public class ContactEntryExample {
    public static void main(String[] args) {
        ContactEntry entry = new ContactEntry("vanminh", 123445);
        String name = entry.getKay();
        Integer id = entry.getValue();
        System.out.println("name = " + name + "\n id = " + id);
    }
}
