package ra.run;

import ra.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
//        Student student = new Student();
        do {
            System.out.println("==========MENU==========\n" +
                    "1.\tNhập thông tin n sinh viên \n" +
                    "2.\tTính điểm trung bình sinh viên \n" +
                    "3.\tXét điểm qua cho sinh viên \n" +
                    "4.\tHiển thị thông tin sinh viên \n" +
                    "5.\tChinh sua thông tin sinh viên \n" +
                    "6.\tXoa sinh viên \n" +
                    "7.\tThoát ");
            System.out.println("Chon 1-5 de thuc hien cac phuong thuc");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    System.out.println("Nhap thong tin sinh vien");
                    System.out.println("Ban muon nhap bao nhieu sinh vien");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.inputData(i + 1, scanner);
                        students.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Diem trung binh cua sinh vien");
                    for (Student student : students) {
                        System.out.println("Ten sinh vien " + student.getStudentName());
                        student.diemTB();
                        System.out.println("Diem trung binh cua sinh vien " + student.getDiemTB());
                    }
                    break;
                case 3:
                    System.out.println("Xet diem do/truot cua sinh vien");
                    for (Student student : students) {
                        if (student.checkDiemTB()) {
                            System.out.println("Sinh vien " + student.getStudentName() + " qua mon");
                        } else {
                            System.out.println("Sinh vien " + student.getStudentName() + " truot mon");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thong tin cua toan bo sinh vien");
                    for (Student student : students) {
                        student.diemTB();
                        student.displayData();
                    }
                    break;
                case 5:
                    System.out.println("Sua thong tin sinh vien");
                    System.out.println("Nhap vao ma sinh vien muon sua");
                    String id = scanner.nextLine();
                    Student student = getStudentById(students, id);
                    if (student != null) {
                        student.displayData();
                        System.out.println("Ban co chac chan muon thay doi thong tin sinh vien? (c/k)");
                        String choice = scanner.nextLine().toLowerCase();
                        if (choice.equalsIgnoreCase("c")) {
                            student.editData(scanner);
                            System.out.println("Da thay doi thong tin sinh vien co ma sinh vien " + id);
                        } else {
                            System.out.println("Huy bo sua thong tin sinh vien");
                        }
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ID " + id);
                    }
                    break;
                case 6:
                    System.out.println("Xoa thong tin sinh vien");
                    System.out.println("Nhap vao ma sinh vien muon sua");
                    String idForDelete = scanner.nextLine();
                    Student student1 = getStudentById(students, idForDelete);
                    if (student1 != null) {
                        student1.displayData();
                        System.out.println("Ban co chac chan muon xoa sinh vien? (c/k)");
                        String choice = scanner.nextLine().toLowerCase();
                        if (choice.equalsIgnoreCase("c")) {
                            students.remove(student1);
                            System.out.println("Da xoa sinh vien co ma sinh vien " + idForDelete);
                        } else {
                            System.out.println("Huy bo xoa thong tin sinh vien");
                        }
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ID " + idForDelete);
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban nhap sai cu phap vui long nhap lai");
                    break;
            }
        } while (true);
    }

    private static Student getStudentById(List<Student> students, String id) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }
}
