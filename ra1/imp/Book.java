package ra1.imp;

import ra1.IBook;

import java.util.Scanner;

public class Book implements IBook {
    private String bookId;
    private String bookName;
    private int importPrice;
    private int exportPrice;
    private String author;
    private String description;

    public Book() {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private static int getInputInt(Scanner scanner, String prompt){
        while (true){
            try{
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Vui long nhap vao mot so nguyen");
            }
        }
    }
    public Book editData(Scanner scanner, String id){
        System.out.println("Nhap vao ten sach");
        bookName = scanner.nextLine();
        setImportPrice(getInputInt(scanner,"Nhap vao gia nhap"));
        setExportPrice(getInputInt(scanner,"Nhap vao gia ban"));
        System.out.println("Nhap vao ten tac gia");
        author = scanner.nextLine();
        System.out.println("Nhap vao mo ta ve cuon sach");
        description = scanner.nextLine();
        return this;
    }
    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhap vao ma sach");
        bookId = scanner.nextLine();
        System.out.println("Nhap vao ten sach");
        bookName = scanner.nextLine();
        setImportPrice(getInputInt(scanner,"Nhap vao gia nhap"));
        setExportPrice(getInputInt(scanner,"Nhap vao gia ban"));
        System.out.println("Nhap vao ten tac gia");
        author = scanner.nextLine();
        System.out.println("Nhap vao mo ta ve cuon sach");
        description = scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.printf("Ma sach: %s\tTen sach: %s\tGia nhap: %d\tGia ban: %d\tTen tac gia: %s\tMo ta ve cuon sach: %s\n",bookId,bookName,importPrice,exportPrice,author,description);
//        System.out.println("Ma so sach la: " + bookId);
//        System.out.println("Ten sach la: " + bookName);
//        System.out.println("Gia nhap la: " + importPrice);
//        System.out.println("Gia ban la: " + exportPrice);
//        System.out.println("Ten tac gia la: " + author);
//        System.out.println("Mo ta ve cuon sach: " + description);
    }
}
