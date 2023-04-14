package day5.minitest;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
//    public static final String USD = "USD";
    private static final AtomicInteger autoId = new  AtomicInteger(1);
    private int id;
    private String name;
    private double price;
    private String type;
    private static String usd = "USD";

    public Product() {

    }

    public Product(String name, double price, String type) {
        this.id = autoId.getAndIncrement();
        this.name = name;
        this.price = price;
        this.type = type;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getUsd() {
        return usd;
    }

    public static void setUsd(String usd) {
        Product.usd = usd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + " " + usd +
                ", type='" + type + '\'' +
                '}';
    }

    static Scanner scanner = new Scanner(System.in);

    // Tạo sản phẩm ==>
    public static Product CreatProduct() {
//        System.out.println("ID của sản phẩm: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Giá sản phẩm: ");
        double price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Loại sản phẩm: ");
        String type = scanner.nextLine();
        return new Product(name, price, type);
    }

    // Sửa sản phẩm ==>
    public static void EditProduct(Product product) {
        System.out.println("Nhập tên mới cho sản phẩm: ");
        String name = scanner.nextLine();
        product.setName(name);
        System.out.println("Nhập giá mới cho sản phẩm: ");
        double price = scanner.nextInt();
        product.setPrice(price);
        scanner.nextLine();
        System.out.println("Nhập loại mới của sản phẩm: ");
        String type = scanner.nextLine();
        product.setType(type);
    }
}
