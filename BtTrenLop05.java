package BTVN.Btvn05;

import java.util.Scanner;

public class BtTrenLop05 {
    public static void main(String[] args) {
        Bai1();
    }

    public static void Bai1() {
//        Viết chương trình in ra màn hình tam giác vuông có hình dạng sau đây:
//        1
//        12
//        123
//        1234
//        12345
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= j; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
