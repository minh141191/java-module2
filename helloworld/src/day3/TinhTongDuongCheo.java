package day3;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {2, 8, 3}
        };
        int totalLeftRight = 0;
        int totalRightLeft = 0;
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            totalLeftRight += arr[i][i];
            totalRightLeft += arr[i][j];
        }
        System.out.println("Tổng đường chéo chính là: " + totalLeftRight);
        System.out.println("Tổng đường chéo phụ là: " + totalRightLeft);
    }
}
