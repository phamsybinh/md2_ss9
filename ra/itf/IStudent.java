package ra.itf;
/*
Trong ứng dụng tạo interface IStudent trong package ra.itf bao gồm
1.	Hằng số MARK_PASS = 5
2.	Các phương thức trừu tượng:
•	inputData: Nhập dữ liệu cho sinh viên
•	displayData: Hiển thị dữ liệu sinh viên
Tạo lớp Student trong package ra.entity kế thừa IStudent có các thành phần sau:
1.	Có các trường:
•	StudentId: String – Mã sinh viên
•	StudentName: String – Tên sinh viên
•	Age: int – Tuổi sinh viên
•	DiemToan: float – điểm toán
•	DiemLy: float – điểm lý
•	DiemHoa: float – điểm hóa
•	DiemTB: float – điểm trung bình
•	Status: Boolean – Trạng thái sinh viên
2.	Có 2 constructor: constructor mặc định và constructor khởi tạo tất cả thông tin sinh viên
3.	Các phương thức get/set
4.	Triển khai các phương thức inputData và displayData
5.	Viết phương thức tính điểm trung bình của sinh viên
6.	Viết Phương thức xét điểm qua cho sinh viên. Sinh viên có điểm trung bình lớn hơn MARK_PASS thì pass ngược lại là fail
Tạo lớp main có tên là ManagementStudent trong package ra.run thực hiện các chức năng theo menu sau:
********************************MENU***************************
1.	Nhập thông tin n sinh viên
2.	Tính điểm trung bình sinh viên
3.	Xét điểm qua cho sinh viên
4.	Hiển thị thông tin sinh viên
5.	Thoát

 */

import java.util.Scanner;

public interface IStudent {
    public static final int MARK_PASS = 5;
    void inputData();

    void inputData(int index);

    void inputData(int index, Scanner scanner);

    void displayData();
}
