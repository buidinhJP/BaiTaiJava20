package BTVN.Btvn04;
import java.util.Scanner;

public class Btvn04 {
    public static void main(String[] args) {
        Bai5();
    }

    public static void Bai1() {
//        Viết chương trình Java để tính giá trị trung bình của một mảng các số nguyên trừ giá trị lớn nhất và nhỏ nhất

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        printArray(arr);

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        sum -= max + min;

        double average = (double) sum / (n - 2);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Gia tri TB: " + average);

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Bai2() {
//        Viết chương trình Java để tìm các phần tử trong mảng 1 xuất hiện tại mảng thứ 2 (giá trị chuỗi) in các phần tử đó ra
//        String[] array1 = {“Python”, “JAVA”, “PHP”, “C#”, “C++”, “SQL”};
//        String[] array2 = {“MySQL”, “SQL”, “SQLite”, “Oracle”, “PostgreSQL”, “DB2”, “JAVA”};
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        for (String element : array1) {
            if (containsElement(array2, element)) {
                System.out.println(element);
            }
        }
    }

    private static boolean containsElement(String[] array, String element) {
        for (String str : array) {
            if (str.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void Bai3() {
//        Chèn thêm vào (không phải là thay thế) 1 phần tử có value = 5 vào vị trí trí thứ 3 của mảng sau
//                my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int insertValue = 5;
        int insertIndex = 3;

        if (insertIndex >= 0 && insertIndex <= my_array.length) {
            int newArray[] = new int[my_array.length + 1];

            for (int i = 0; i < my_array.length; i++) {
                if (i < insertIndex) {
                    newArray[i] = my_array[i];
                } else {
                    newArray[i + 1] = my_array[i];
                }

            }
            newArray[insertIndex] = insertValue;
            my_array = newArray;
        }
        for (int element : my_array) {
            System.out.print(element + " ");
        }

    }

    public static void Bai4() {
//        Viết chương trình Java để tính giá trị trung bình của các phần tử mảng.
//                numbers = new int[]{20, 30, 25, 35, -16, 60, -100}
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Gia tri TB: " + Math.round(average * 100.0) / 100.0);
    }

    public static void Bai5() {
//            Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n*m. Ví dụ với n=5, m=4:
//
//    *  *  *  *  *
//    *  *  *  *  *
//    *  *  *  *  *
//    *  *  *  *  *
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhap so nguyen m = ");
        int m = scanner1.nextInt();

        char[][] rectangle = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rectangle[i][j] = '*';
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
