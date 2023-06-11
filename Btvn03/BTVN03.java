package BTVN.Btvn03;

import java.util.Scanner;

public class BTVN03 {
    public static void main(String[] args) {Bai4();}
    public static void Bai1() {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//                if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                }else {
//                    System.out.println("Buzz");
//                }
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }
    }
    public static void Bai2() {
//        Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
//        Chuỗi đã cho là: test string
//        ký tự xuất hiện nhiều nhất trong chuỗi là: t
        String str = "test string";
        char KyTuNN = TimKyTuTrongChuoi(str);
        System.out.println("Ký tự xuất hiện nhiều nhất trong chuỗi là: " + KyTuNN);
    }

    public static char TimKyTuTrongChuoi(String str) {
        int[] DemKyTu = new int[256]; // Mảng đếm số lần xuất hiện của mỗi ký tự

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            DemKyTu[c]++;
        }

        char KyTuNN = ' ';
        int maxCount = 0;
        for (int i = 0; i < DemKyTu.length; i++) {
            if (DemKyTu[i] > maxCount) {
                maxCount = DemKyTu[i];
                KyTuNN = (char) i;
            }
        }

        return KyTuNN;
    }
    public static void Bai3() {
//        Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n*m. Ví dụ với n=5, m=4:
//
//*  *  *  *  *
//*  *  *  *  *
//*  *  *  *  *
//*  *  *  *  *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void Bai4() {
//        Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=
//    Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=5, m=4:
//
//            *  *  *  *  *
//            *           *
//            *           *
//            *  *  *  *  *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao hang = ");
        int n = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhap vao cot = ");
        int m = scanner2.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j--) {
//                if (i == 0 || i == n-1 || j == 0 || j == m-1) {
                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
            }
            System.out.println();
        }
    }
    public static void Bai5() {
//        Viết một chương trình Java để đảo ngược một số nguyên dương nhập từ bàn phím bằng cách sử dụng vòng lặp while và do-while và break và continue. Chương trình sẽ yêu cầu người dùng nhập một số nguyên dương, sau đó đảo ngược và in ra số đã đảo ngược.
//        Ví dụ: Nhập vào số 123456 --> Kết quả nhận được là số: 654321
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong:");
        int SoND = scanner.nextInt();

        // Sử dụng vòng lặp while
//        int SoDaoNguoc = 0;
//        int SoDu;
//        while (SoND > 0) {
//            SoDu = SoND % 10;
//            SoDaoNguoc = SoDaoNguoc * 10 + SoDu;
//            SoND /= 10;
//        }
//        System.out.println("So da dao nguoc: " + SoDaoNguoc);

        // Sử dụng vòng lặp do-while
        int SoDaoNguoc = 0;
        int  SoDu;

        do {
            SoDu = SoND % 10;
            SoDaoNguoc = SoDaoNguoc * 10 + SoDu;
            SoND /= 10;
        } while (SoND > 0);
        System.out.println("So da dao nguoc: " + SoDaoNguoc);
    }
    public static void Bai6() {
        String str = "test string";
        char mostFrequentChar = ' ';
        int [] charCount = new int[256];
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) i;
            }
        }
        System.out.println(mostFrequentChar);

    }

}
