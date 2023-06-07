package Btvn02;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn
//        phím, a khác 0.
        System.out.println("Giai phuong trinh ax2 + bx +c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri cua a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap gia tri cua b:");
        double b = scanner.nextDouble();
        System.out.println("Nhap gia tri cua c:");
        double c = scanner.nextDouble();

        double delta = b*b-4*a*c;

        if (delta < 0){
            System.out.println("Pt vo nghiem.");
        } else if(delta == 0){
            double x = -b/ (2*a);
            System.out.println("Pt co nghiem kep: x= " +x);
        }else{
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b +Math.sqrt(delta)) / (2*a);
            System.out.println("Pt co 2 nghiem phan biet:");
            System.out.println("x1 = " +Math.round(x1*100.0)/100.0);
            System.out.println("x2 = " +Math.round(x2*100.0)/100.0);
        }
    }
}
