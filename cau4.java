/*4.	Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
(Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
*/

package day1_2;

import java.util.Scanner;

public class cau4 {
 
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào 1 số nguyên dương: ");
        number = scanner.nextInt();
         
        while (number <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            number = scanner.nextInt();
        }
         
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
         
        System.out.println("Tổng các chữ số = " + sum);
    }
}
