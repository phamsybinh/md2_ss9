package ra.entity;

import ra.itf.IStudent;

import java.util.List;
import java.util.Scanner;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    private boolean status;

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Student(String studentId, String studentName, int age, float diemToan, float diemLy, float diemHoa, float diemTB, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTB = diemTB;
        this.status = status;
    }
    public void diemTB(){
        diemTB = (diemToan+diemLy+diemHoa)/3;
    }
    public boolean checkDiemTB(){
        return diemTB>= Student.MARK_PASS;
    }

    @Override
    public void inputData() {

    }

    @Override
    public void inputData(int index) {

    }

    public void addData(List<Student> students){
        Student student = new Student();
        student.inputData();
        students.add(student);
    }
    public Student editData(Scanner scanner){
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien");
        studentName = scanner.nextLine();
        System.out.println("Nhap vao tuoi sinh vien");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao diem Toan");
        diemToan = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao diem Ly");
        diemLy = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao diem Hoa");
        diemHoa = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap trang thai sinh vien\n Dang hoc:1\n Da nghi hoc:2");
        int choice = Integer.parseInt(scanner.nextLine());
        status=(choice == 1);
        return this;
    }

    @Override
    public void inputData(int index, Scanner scanner) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Sinh vien thu "+index);
        System.out.println("Nhap vao ma sinh vien");
        studentId = scanner.nextLine();
        System.out.println("Nhap vao ten sinh vien");
        studentName = scanner.nextLine();
        System.out.println("Nhap vao tuoi sinh vien");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao diem Toan");
        diemToan = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao diem Ly");
        diemLy = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao diem Hoa");
        diemHoa = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap trang thai sinh vien\n Dang hoc:1\n Da nghi hoc:2");
        int choice = Integer.parseInt(scanner.nextLine());
        status=(choice == 1);
    }

    @Override
    public void displayData() {
        System.out.println("Ma sinh vien "+studentId);
        System.out.println("Ten sinh vien "+studentName);
        System.out.println("Tuoi sinh vien "+age);
        System.out.println("Diem Toan "+diemToan);
        System.out.println("Diem Ly "+diemLy);
        System.out.println("Diem Hoa "+diemHoa);
        System.out.println("Diem TB "+diemTB);
        System.out.println("Trang thai sinh vien "+(status? "dang hoc":"da nghi hoc"));
    }
}
