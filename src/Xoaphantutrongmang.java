import java.util.Scanner;

public class Xoaphantutrongmang {
    public static void main(String[] args) {
        int x, i, j;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            x = scanner.nextInt();
        } while (x <= 0);

        int A[] = new int[x];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < x; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (j = i = 0; i < x; i++) {
            if (A[i] != k) {
                A[j] = A[i];
                j++;
            }
        }

        x = j;  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < x; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
