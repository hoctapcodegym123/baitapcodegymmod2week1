import java.util.Scanner;

public class Inhinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice!=0) {
            System.out.println("=====Menu=====");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác");
            System.out.println("3. Vẽ hình tam giác ngược");
            System.out.println("0. Exit");
            System.out.println("Bấm để lựa chọn");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Vẽ hình chữ nhật");
                    inhinhchunhat();
                    break;
                case 2:
                    System.out.println("Vẽ hình tam giác");
                    intamgiac();
                    break;
                case 3:
                    System.out.println("Vẽ hình tam giác ngược");
                    intamgiacnguoc();
                    break;
            }



        }
    }
    static void inhinhchunhat () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void intamgiac () {
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void intamgiacnguoc(){
        for (int i=7;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
