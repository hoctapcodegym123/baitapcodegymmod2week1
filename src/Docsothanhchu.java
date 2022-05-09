import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        System.out.println("Nhập số cần đọc không quá 999");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num / 100;            // Lấy hằng trăm VD:123:1000 =1,234 lấy 1
        int b = (num - a * 100) / 10; // Lấy hàng chục VD:(123 - 1 * 100)/10 = 2,3 lấy 2
        int c =(num - a*100 -b*10);   // Lấy hàng đơn vị VD:(123 -1 * 100 - 2 * 10) = 3 lấy 3
        String num1 = "";
        if (a > 0){
            switch (a){
                case 1:
                    num1 += "Một trăm ";
                    break;
                case 2:
                    num1 += "Hai trăm ";
                    break;
                case 3:
                    num1 += "Ba trăm ";
                    break;
                case 4:
                    num1 += "Bốn trăm ";
                    break;
                case 5:
                    num1 += "Năm trăm ";
                    break;
                case 6:
                    num1 += "Sáu trăm ";
                    break;
                case 7:
                    num1 += "Bảy trăm ";
                    break;
                case 8:
                    num1 += "Tám trăm ";
                    break;
                case 9:
                    num1 += "Chín trăm ";
                    break;

            }
        }
        if (b > 0){
            switch (b){
                case 1:
                    num1 += "mười ";
                    break;
                case 2:
                    num1 += "hai mươi ";
                    break;
                case 3:
                    num1 += "ba mươi ";
                    break;
                case 4:
                    num1 += "bốn mươi ";
                    break;
                case 5:
                    num1 += "năm mươi ";
                    break;
                case 6:
                    num1 += "sáu mươi ";
                    break;
                case 7:
                    num1 += "bảy mươi ";
                    break;
                case 8:
                    num1 += "tám mươi ";
                    break;
                case 9:
                    num1 += "chín mươi ";
                    break;
            }
        } else {
          num1 +="linh";
        }
        if (c > 0) {
            switch (c){
                case 1:
                    num1 += "một";
                    break;
                case 2:
                    num1 += "hai";
                    break;
                case 3:
                    num1 += "ba";
                    break;
                case 4:
                    num1 += "bốn";
                    break;
                case 5:
                    num1 += "năm";
                    break;
                case 6:
                    num1 += "sáu";
                    break;
                case 7:
                    num1 += "bảy";
                    break;
                case 8:
                    num1 += "tám";
                    break;
                case 9:
                    num1 += "chín";
                    break;
            }
        }
        System.out.println(num1);
    }
}
