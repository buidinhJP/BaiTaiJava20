package Btvn02;

import java.util.Scanner;

public class Bai3 {
//    Bài 3: Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình
//    chữ nhật đó.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai a = ");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao chieu rong b = ");
        double b =scanner.nextDouble();

        double chuVi = (a+b) * 2;
        double dienTich = a*b;

        System.out.println("chu vi HCN = " +chuVi);
        System.out.println("Dien tich HCN = " +dienTich);


    }
}
