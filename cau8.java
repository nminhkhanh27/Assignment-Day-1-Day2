/*8.	Viết chương trình thực hiện các công việc như sau :
a.	Nhập một mảng a gồm n phần tử kiểu nguyên int
b.	Tính tổng số dương lẻ của mảng a
c.	Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng.
d.	Sắp sếp mảng a theo thứ tự tăng dần.
e.	Chèn một số p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần.
*/

package day1_2;
import java.util.Scanner;
import java.util.Arrays;

public class cau8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng a gồm n phần tử kiểu nguyên int
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        // Tính tổng số dương lẻ của mảng a
        int sumOddPositive = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] % 2 != 0) {
                sumOddPositive += a[i];
            }
        }
        System.out.println("Tổng số dương lẻ của mảng là: " + sumOddPositive);

        // Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không
        System.out.print("Nhập phần tử k cần tìm: ");
        int k = scanner.nextInt();
        boolean isFound = false;
        System.out.print("Vị trí của k trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                System.out.print(i + " ");
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Không tìm thấy k trong mảng.");
        } else {
            System.out.println();
        }

        // Sắp xếp mảng a theo thứ tự tăng dần
        Arrays.sort(a);
        System.out.println("Mảng sau khi sắp xếp là:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Chèn một số p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần
        System.out.print("Nhập số p cần chèn: ");
        int p = scanner.nextInt();
        int[] b = new int[n + 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < p) {
                b[index] = a[i];
                index++;
            } else {
                break;
            }
        }
        b[index] = p;
        index++;
        for (int i = index; i < n + 1; i++) {
            b[i] = a[i - 1];
        }
        System.out.println("Mảng sau khi chèn p là:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}