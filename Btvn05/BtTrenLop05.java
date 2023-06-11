package BTVN.Btvn05;

import java.util.Scanner;

public class BtTrenLop05 {
    public static void main(String[] args) {
        Bai5();
    }

    public static void Bai1() {
//        Viết chương trình in ra màn hình tam giác vuông có hình dạng sau đây:
//        1
//        12
//        123
//        1234
//        12345
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void Bai2() {
//        Bài 2:
//        Viết chương trình cũng là in ra tam giác vuông nhưng các số trên 1 hàng đc lặp lại:
//        1
//        22
//        333
//        4444
//        55555

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void Bai3() {
//        Bài 3:
//        Viết chương trình cũng là in ra tam giác vuông nhưng các số đơn vị của từng phần tử tăng dần lên 1 giống như sau:
//        1
//        2 3
//        4 5 6
//        7 8 9 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
    public static void Bai4() {
//        Bài 4:
//        Viết chương trình In ra tam giác Floyd’s như sau:
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void Bai5() {
//    Viết chương trình In ra Tam giác pascal như sau:
//            1
//            1 1
//            1 2 1
//            1 3 3 1
//            1 4 6 4 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int k = 1;

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
                for ( int j = 0; j <= i; j++) {
                    System.out.print(k + " ");
                    k = k * (i - j) / (j + 1);
                }
                System.out.println();
            }
//        int n = 5;
//        for (int i =0; i < n; i++)
//        {
//            int s = 1;
//            for (int j = 0; j < n - i - 1; j++){
//                System.out.println(" ");
//            }
//            for (int j = 0; j < i; j++){
//                System.out.println(" "+s);
//                s = s * (i - j )/ (j + 1);
//            }
//            System.out.println();
//        }
//
    }

}
