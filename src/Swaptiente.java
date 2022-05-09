import java.util.Scanner;

public class Swaptiente {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD");
        usd= scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VNĐ"+ quydoi);
    }
}
