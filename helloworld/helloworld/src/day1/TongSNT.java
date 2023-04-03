package day1;

public class TongSNT {
    public static void main(String[] args) {
        System.out.println(sumSNT());
    }
    public static int sumSNT() {
        int sum = 0;
        int count = 0;
        int snt = 2;
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i < snt; i++) {
                if (snt % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += snt;
                count++;
            }
            snt++;
        }
        return sum;
    }
}