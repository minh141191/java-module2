package day5.minitest;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm ");
        int n = scanner.nextInt();
        Product[] productArr = new Product[n];

        // Duyệt và dữ liệu sản phẩm ==>
        for (int i = 0; i < n; i++) {
            productArr[i] = Product.CreatProduct();
        }
        System.out.println("Danh sách sản phẩm: " + Arrays.toString(productArr));

        // Tìm sản phẩm theo tên ==>
        System.out.println("Nhập tên sản phẩm cần tìm ");
        String searchName = scanner.next();
        boolean check = false;
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getName().equalsIgnoreCase(searchName)) {
                check = true;
                System.out.println("Sản phẩm tìm thấy: " + productArr[i]);
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tên sản phẩm!!");
        }
        // Tính tổng giá các sản phẩm ==>
        double sumPrice = 0;
        for (int i = 0; i < productArr.length; i++) {
            sumPrice += productArr[i].getPrice();
        }
        System.out.println("Tổng giá các sản phầm là: " + sumPrice + " " + Product.getUsd());


        // Sủa sản phẩm theo mã ID ==>
        System.out.println("Nhập mã ID của sản phẩm muốn sửa ");
        int editId = scanner.nextInt();
        for (int i = 0; i < productArr.length; i++) {
            if (editId == productArr[i].getId()) {
                Product.EditProduct(productArr[i]);
            }
        }
        System.out.println("Danh sách sản phẩm sau khi sửa: " + Arrays.toString(productArr));


        // Xóa sản phẩm theo mã ID ==>
        System.out.println("Nhập mã ID của sản phẩm muốn xóa");
        int deleteId = scanner.nextInt();
        Product[] newProductArr = new Product[productArr.length-1];
        int j = 0;
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getId() != deleteId) {
                newProductArr[j] = productArr[i];
                j++;
            }
        }
        System.out.println("Danh sách sản phẩm sau khi xóa: " + Arrays.toString(newProductArr));
    }
}



