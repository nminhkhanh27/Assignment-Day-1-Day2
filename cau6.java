//6.	Viết chương trình nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị phân.

package day1_2;
import java.util.Scanner;

public class cau6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int[] binaryNum = new int[32];  // tạo mảng để lưu trữ kết quả
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;  // lưu phần dư vào mảng
            n = n / 2;
            i++;
        }
        System.out.print("Số nhị phân tương ứng là: ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);  // hiển thị kết quả
    }
}