package Btvn03;

import java.util.Scanner;

public class Btvn03 {
    public static void main(String[] args) {
        Bai2();
    }

    public static void Bai1() {
//        Bài 1: Viết chương trình lấy 1 số nguyên bất kỳ trong khoảng từ 0 đến 1000 và tính tổng các chữ số của nó?
////        VD: Tổng các chữ số của số 1000 = 1;
        int SoNguyeNN = (int) (Math.random() * 1001);
        System.out.println("So nguyen ngau nhien la: " + SoNguyeNN);

        int sum = 0;

        while (SoNguyeNN > 0) {
            int t = SoNguyeNN % 10;
            sum += t;
            SoNguyeNN /= 10;
        }
        System.out.println("Tổng các chữ số của số nguyên là: " + sum);
    }

    public static void Bai2() {
//        @input: 1 year = 365 * 1 day = 24 hour = 1440 minute = 86400 second
//        Viết chương trình Java chuyển đầu vào thành số giờ và số năm:
//        a. Đầu vào là số giờ
//        b. Đầu vào là số phút.
//                c. Đầu vào là số giây.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giờ: ");
        int hours = scanner.nextInt();
        System.out.print("Nhập số phút: ");
        int minutes = scanner.nextInt();
        System.out.print("Nhập số giây: ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        int days = totalSeconds / 86400;
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println("Kết quả: " + remainingDays + " ngày, " + years + " năm.");

    }
}

