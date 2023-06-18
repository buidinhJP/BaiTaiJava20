package BTVN.Btvn09.Main;

import BTVN.Btvn09.entity.Teacher;
import statics.TeacherLevel;

import java.util.Scanner;

public class Main {
    private static Teacher[] teachers = new Teacher[100];

    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        System.out.println("===============================PHẦN MỀM QUẢN LÝ TRẢ LƯƠNG CHO GIẢNG VIÊN============================");
        System.out.println("1.Thêm mới giảng viên.");
        System.out.println("2. In danh sách giảng viên.");
        System.out.println("3. Thêm mới môn học.");
        System.out.println("4. In danh sách môn học.");
        System.out.println("5. Lập bảng kê khai giảng dạy.");
        System.out.println("6. In bảng kê khai giảng dạy.");
        System.out.println("7. Sắp xếp kê khai giảng dạy.");
        System.out.println("8. Tính lương giảng viên.");
        System.out.println("9. Thoát.");
        System.out.println("Chọn :");

        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                System.out.println("Bạn muốn thêm mới bao nhiêu giảng viên: ");
                int teacherNumber = new Scanner(System.in).nextInt();
                for (int i = 0; i < teacherNumber; i++) {
                    System.out.println("Nhập thông tin cho giảng viên thứ " + (i + 1));
                    Teacher teacher = new Teacher();
                    System.out.println(" Nhập tên giảng viên: ");
                    teacher.setName(new Scanner(System.in).nextLine());
                    System.out.println("Nhập địa chỉ giảng viên: ");
                    teacher.setAddress(new Scanner(System.in).nextLine());
                    System.out.println("Nhập số điện thoại của giảng viên: ");
                    teacher.setPhone(new Scanner(System.in).nextLine());
                    System.out.println("Nhập trình độ: ");
                    System.out.println("1.GS-TS");
                    System.out.println("2.PGS-TS");
                    System.out.println("3.Giảng viên chính");
                    System.out.println("4.Thạc sỹ");
                    System.out.println("Chọn đi: ");
                    int levelChoice = new Scanner(System.in).nextInt();
                    switch (levelChoice) {
                        case 1:
                            teacher.setLevel(TeacherLevel.GS_TS);
                            break;
                        case 2:
                            teacher.setLevel(TeacherLevel.PGS_TS);
                            break;
                        case 3:
                            teacher.setLevel(TeacherLevel.GIANG_VIEN_CHINH);
                            break;
                        case 4:
                            teacher.setLevel(TeacherLevel.THAC_SY);
                            break;
                    }
                    for (int j = 0; j < teachers.length; j++)
                        if (teachers[i] == null) {
                            teachers[i] = teacher;
                            break;

                        }
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                return;
        }
    }
}

//    private static Teacher [] teacher = new Teacher[100];
//
//    int choice = new Scanner(System.in).nextInt();
//    switch(choice) {
//        case 1 :
//
//            break;
//        case 3 :
//            break;
//        case 4 :
//            break;
//        case 5 :
//            break;
//        case 6 :
//            break;
//        case 7 :
//            break;
//        case 8 :
//            break;
//        case 9 :
//            break;
//
//
//
//            }
//
//    }

