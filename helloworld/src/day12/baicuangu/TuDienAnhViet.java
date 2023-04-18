package day12.baicuangu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TuDienAnhViet {
    public static  Map<String, String> dictionary = new LinkedHashMap<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm từ điển");
            System.out.println("2. Tra từ điển");
            System.out.println("3. Sửa từ điển");
            System.out.println("0. Thoát!");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập tiếng anh");
                    String tiengAnh = scanner.nextLine();
                    System.out.println("Nhập tiếng việt");
                    String tiengViet = scanner.nextLine();
                    dictionary.put(tiengAnh, tiengViet);
                    System.out.println("Đã thêm thành công");
                    break;
                case 2:
                    System.out.println("Nhập từ bạn muốn tra(tiếng anh)");
                    String tiengAnh1 = scanner.nextLine();
                    if (dictionary.containsKey(tiengAnh1)) {
                        System.out.println("Từ này có nghĩa là: " + dictionary.get(tiengAnh1));
                    } else {
                        System.out.println("Từ bạn nhập không có trong từ điển");
                    }
                    break;
                case 3:
                    System.out.println("Nhập từ bạn muốn sửa(tiếng anh)");
                    String tiengAnh2 = scanner.nextLine();
                    if (dictionary.containsKey(tiengAnh2)) {
                        System.out.println("Nhập tiếng việt mới");
                        String tiengViet1 = scanner.nextLine();
                        dictionary.replace(tiengAnh2, tiengViet1);
                        System.out.println("Bạn đã sửa thành công!");
                    } else {
                        System.out.println("Từ bạn nhập không có trong từ điẻn");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
