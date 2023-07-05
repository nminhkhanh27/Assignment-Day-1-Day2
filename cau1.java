/*1.	Viết chương trình in ra các dấu * theo cấu trúc như sau (cho n là chiều cao của tháp tam giác, cần in ra n dòng):
Ví dụ : n = 6
*/

package day1_2;
import java.util.Scanner;

public class cau1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int n;
		    System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
		    n = sc.nextInt();
		    for (int i = 1; i <= n; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
	}

}
