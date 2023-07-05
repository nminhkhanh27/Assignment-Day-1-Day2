/*2.	Viết chương trình tính :
S=1+1/2+1/3+....+1/n
Số n được nhập từ bàn phím
*/

package day1_2;
import java.util.Scanner;

public class cau2 {

	 public static void main(String[] args) {
         
	        float sum = 0;
	        int n;
	        Scanner sc;
	        do {
	            System.out.println("Nhập n = ");
	            sc = new Scanner(System.in);
	            n = sc.nextInt();
	        }while(n <= 0);
	         
	        for(int i = 1; i <= n; i++) {
	            sum += 1.0/i;
	        }
	         
	        System.out.println("Tổng = " + sum);
	        sc.close();

	}

}
