package Btvn02;

import java.time.LocalDate;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ngay: ");
        int ngay = scanner.nextInt();
        System.out.println("Nhap vao thang: ");
        int thang = scanner.nextInt();
        System.out.println("Nhap vao nam: ");
        int namSinh = scanner.nextInt();

        LocalDate ngaySinh = LocalDate.of(namSinh, thang, ngay);
        System.out.println("Ngay thang nam sinh : " +ngaySinh);

        int namHientai = LocalDate.now().getYear();
        int tuoi = namHientai - namSinh;
        System.out.println("Tuoi cua nguoi do la: " + tuoi + " tuoi");

    }
}
