/*3.	Viết chương trình tính  :
S = 1+1/3!+1/5!+…..+1/(2n-1)!
Số n được nhập từ bàn phím
*/

package day1_2;
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class cau3 {
 
    public static void main(String[] args) {
        int n;
        float sum = 0, temp = 1;
        Scanner scanner = new Scanner(System.in);
         
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        // n còn nhỏ hơn 1 thì còn nhập lại
        do {
            System.out.println("Mời bạn nhập vào số n: ");
            n = scanner.nextInt();
        } while (n < 1);
         
        /*
         * tính giá trị của biểu thức
         * i còn nhỏ hơn hoặc bằng n thì còn thực hiện thân vòng lặp
         */
        for (int i = 1; i <= n; i++) {
            temp *= i;  // tính giai thừa
            sum += (float) 1/temp;
        }
         
        System.out.println("Tổng = " + decimalFormat.format(sum));
    }
 
}