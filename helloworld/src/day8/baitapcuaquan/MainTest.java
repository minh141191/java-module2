package day8.baitapcuaquan;

import java.util.Scanner;

public class MainTest {
    static Scanner scanner = new Scanner(System.in);


    public static void displayProduct(Product[] products) {
        for (Product product: products) {
            System.out.println(product);
        }
    }

    public static Brand getBrand() {
        Brand apple = new Brand(1, "Apple");
        Brand samsung = new Brand(2, "SamSung");
        Brand nokia = new Brand(3, "Nokia");
        Brand[] brands = {apple, samsung, nokia};

        int choice;
        Brand brand = new Brand();
        for (int i = 0; i < brands.length; i++) {
            System.out.println(brands[i].getId() + "." + brands[i].getName());
        }
        System.out.println("Chọn Brand");
        choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < brands.length; i++) {
            if (brands[i].getId() == choice) {
                brand = brands[i];
            }
        }
        return brand;
    }

    public static Product createProdutc() {
        System.out.println("Nhập tên sản phẩm ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Miêu tả sẩn phẩm ");
        String description = scanner.nextLine();
        Brand brand = getBrand();

        return new Product(name, price, description, brand);
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        for (int i = 0; i < products.length; i++) {
            products[i] = createProdutc();
        }
        displayProduct(products);
    }
}