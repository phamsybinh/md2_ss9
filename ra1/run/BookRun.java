package ra1.run;

import ra1.imp.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookRun {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> sortBook =new ArrayList<>();
        sortBook = (ArrayList<Book>) books.clone();
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        do {
            System.out.println("*MENU**\n" +
                    "1.Nhập thông tin sách\n" +
                    "2.Hiển thị thông tin sách\n" +
                    "3.Cập nhật thông tin sách theo mã sách\n" +
                    "4.Xóa sách theo mã sách\n" +
                    "5.Sắp xếp sách theo giá bán tăng dần\n" +
                    "6.Thống kê sách theo khoảng giá (a-b nhập từ bàn phím)\n" +
                    "7.Tìm kiếm sách theo tên tác giả\n" +
                    "8.Thoát");
            System.out.println("Nhap tu 1-8 de chon phuong thuc ");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n){
                case 1:
                    System.out.println("Nhap thong tin sach");
                    System.out.println("Ban muon nhap vao bao nhieu cuon sach");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        Book book1 = new Book();
                        book1.inputData(scanner);
                        books.add(book1);
                    }
                    break;
                case 2:
                    System.out.println("Hien thi thong tin sach");
                    for (Book book1: books){
                        book1.displayData();
                    }
                    break;
                case 3:
                    System.out.println("Cap nhat thong tin sach theo ma sach");
                    System.out.println("Nhap ma sach ma ban muon thay doi");
                    String id = scanner.nextLine();
                    Book book1 = getBookById(books,id);
                    if (book1!=null){
                        book1.displayData();
                        System.out.println("Ban co thuc su muon thay doi thong tin khong? (c/k)");
                        String choice = scanner.nextLine();
                        if (choice.equalsIgnoreCase("c")){
                            book1.editData(scanner,id);
//                            books.add(book1);
                            System.out.println("Ban da thay doi thong tin sach co ma so "+id);
                        } else {
                            System.out.println("Huy thay doi thong tin");
                        }
                    }else {
                        System.out.println("Khong ton tai cuon sach co ma so "+id);
                    }
                    break;
                case 4:
                    System.out.println("Xoa sach theo ma");
                    System.out.println("Nhap ma sach ma ban muon thay doi");
                    String idForDelete = scanner.nextLine();
                    Book book2 = getBookById(books,idForDelete);
                    if (book2!=null){
                        book2.displayData();
                        System.out.println("Ban co thuc su muon xoa thong tin khong? (c/k)");
                        String choice = scanner.nextLine();
                        if (choice.equalsIgnoreCase("c")){
                            books.remove(book2);
                            System.out.println("Ban da xoa sach co ma so "+idForDelete);
                        } else {
                            System.out.println("Huy xoa");
                        }
                    }else {
                        System.out.println("Khong ton tai cuon sach co ma so "+idForDelete);
                    }
                    break;
                case 5:
                    System.out.println("Sap xep sach theo gia ban tang dan");
//                    sắp xếp nổi bọt
                    for (int i = 0; i < books.size()-1; i++) {
                        for (int j = 0; j < books.size() - i -1; j++) {
                            if (books.get(j).getExportPrice() > books.get(j+1).getExportPrice()){
                               Book temp = books.get(j);
                                books.set(j,books.get(j+1));
                                books.set(j+1,temp);
                            }
                        }
                    }
                    for (Book sortedBook : books){
                        sortedBook.displayData();
                    }
                    break;
                case 6:
                    System.out.println("Thong ke sach theo khoang gia");
                    System.out.println("Nhap vao gia duoi");
                    int min = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap vao gia tren");
                    int max = Integer.parseInt(scanner.nextLine());
                    for (Book book3 : books){
                        if (book3.getExportPrice()>=min && book3.getExportPrice()<= max){
                            book3.displayData();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Tim kiem sach theo ten tac gia");
                    System.out.println("Nhap vao ten tac gia");
                    String authorName = scanner.nextLine().toLowerCase();
                    getBookByAuthor(books,authorName);

                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban nhap sai dinh dang vui long nhap lai");
                    break;
            }
        } while (true);
    }
    public static Book getBookById(List<Book> books, String id){
        for (Book book : books){
            if (book.getBookId().equalsIgnoreCase(id)){
                return book;
            }
        }
        return null;
    }
    public static void getBookByAuthor(List<Book> books, String author){
        for (Book book: books){
            if (book.getAuthor().toLowerCase().contains(author)){
                System.out.println(book.getBookName());
            }
        }
            }
}
