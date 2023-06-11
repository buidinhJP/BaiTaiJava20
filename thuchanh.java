package BTVN;

public class thuchanh {
    public static void main(String[] args) {
////        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
////        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
////        for (String name1 : array1) {
////            for (String name2 : array2) {
////                if (name1.equals(name2)) {
////                    System.out.println(name1);
////                    break;
////                }
////            }
////        }
////        Chèn thêm vào (không phải là thay thế) 1 phần tử có value = 5 vào vị trí trí thứ 3 của mảng sau
//////                my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}. Giải bài theo trình tự mã giả
//        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        int[] my_newArray = new int[my_array.length+1];
//        for (int i = 0; i < 3; i++) {
//            my_array[i] = my_newArray[i];
//        }

        for (int i = 0; i < 6; i++) {
            int n = 5;

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            int s = 1;

            for (int j = 0; j < i; j++) {
                System.out.print(" " +s);

                s = s * (i - j) / (j + 1);
            }
            System.out.println();
        }
//            for (int a = 1; a <= 6; a++) {
//
//                for (int b = 12; b >= 6; b--) {
//                    System.out.print("*");
//                }
//
//                for (int c = 1; c <= a; c++) {
//                    System.out.print("0");
//                }
//                System.out.println();
//            }


        }
    }
