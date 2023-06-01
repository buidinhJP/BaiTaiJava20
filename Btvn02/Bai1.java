package Btvn02;

import java.util.Scanner;

public class Bai1 {
//    Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a
//    khác 0.
    public static void main(String[] args) {
        System.out.println("giai phuong trinh ax + b = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("NHap gia tri cua a: ");
        double a =scanner.nextDouble();

        System.out.println("Nhap gia tri cua b: ");
        double b = scanner.nextDouble();

        if (a == 0){
            if (b==0){
                System.out.println("pt co vo so nghiem.");
            } else {
                System.out.println("pt vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("pt co nghiem duy nhat x = " + x);
        }
    }
}
