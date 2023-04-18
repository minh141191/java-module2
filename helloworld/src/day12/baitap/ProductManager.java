package day12.baitap;

import day5.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products;
    Scanner scanner;

    public ProductManager() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void addProduct() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập hãng: ");
        String brand = scanner.nextLine();
        Product product = new Product(name, price, brand);
        products.add(product);
    }

    public void displayProduct() {
        if (products.isEmpty()) {
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("Danh sách rỗng!");
        }
    }

    public void editProduct() {
        int index = getIndexById();
        if (index != -1) {
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            products.get(index).setName(name);

        }
    }

    public int getIndexById() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
