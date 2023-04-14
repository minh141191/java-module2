package day9.baitapcuanam;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookManager extends Phone {
    private Contact[] contacts;
    private Scanner scanner;

    public PhoneBookManager() {
        Contact contacts1 = new Contact("Lam", "012345678");
        Contact contacts2 = new Contact("Dung", "012213214");
        Contact[] newContacts = {contacts1, contacts2};
        contacts = newContacts;
        scanner = new Scanner(System.in);
    }

    public void displaytPhone() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void insertPhone() {
        Contact newContact = getContact();
//        Contact[] arrContact = Arrays.copyOf(contacts, contacts.length + 1);
        Contact[] arrContact = new Contact[contacts.length +1];
        System.arraycopy(contacts, 0, arrContact, 0, contacts.length);
        arrContact[contacts.length] = newContact;
        contacts = arrContact;
    }

    @Override
    public void removePhone() {
        System.out.println("Nhập tên bạn muốn xóa ");
        String searchName = scanner.nextLine();
        Contact[] newContact = new Contact[contacts.length - 1];
        int j = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (!contacts[i].getName().equalsIgnoreCase(searchName)) {
                newContact[j] = contacts[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newContact));
    }

    @Override
    public void updatePhone() {

    }

    public Contact getContact() {
        System.out.println("Nhập tên ");
        String name = scanner.nextLine();
        System.out.println("Nhập sđt");
        String phoneNumber = scanner.nextLine();
        return new Contact(name, phoneNumber);
    }
}
