package Btvn03;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BaiThucHanh04 {
    public static void main(String[] args) {
        Bai1();
    }
//    Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
//    Nhập các phần tử mảng
//    In mảng ra màn hình
//    Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
//    VD: [1,4,7,6,2,3] -> [1,5,7,7,3,3]

    public static void Bai1() {
        int[] arr = {1, 4, 7, 6, 2, 3};
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        System.out.println("Mảng sau khi thay đổi:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}