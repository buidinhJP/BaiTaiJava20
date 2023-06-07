package Btvn02;

import java.util.Scanner;

public class Bai5 {
//    Bài 5:
//    a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và
//    cuối cùng của ký tự đó trong chuỗi vừa nhập.
//    b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
//    bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =
//            “123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”
    public static void main(String[] args) {Bai5b();}

    public static void Bai5a() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();

        System.out.print("Nhập vào một ký tự: ");
        char kyTu = scanner.next().charAt(0);

        System.out.println("Chuỗi đã nhập: " + str);
        System.out.println("Ký tự đã nhập: " + kyTu);

        int viTriDauTien = str.indexOf(kyTu);
        int viTriCuoiCung = str.lastIndexOf(kyTu);

        System.out.println("Vị trí xuất hiện đầu tiên của ký tự: " + viTriDauTien);
        System.out.println("Vị trí xuất hiện cuối cùng của ký tự: " + viTriCuoiCung);

    }

    public static void Bai5b() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi gốc: ");
        String s = scanner.nextLine();

        System.out.print("Nhập chuỗi cần tìm: ");
        String s1 = scanner.nextLine();

        System.out.print("Nhập chuỗi thay thế: ");
        String s2 = scanner.nextLine();

        String sThayThe = s.replace(s1, s2);

        System.out.println("Kết quả sau khi thay thế: " + sThayThe);

    }

    }
