/*7.	Nhập vào một String S,  thực hiện công việc sau:
a.	In ra màn hình String đảo ngược của S
b.	Đổi toàn bộ kí tự của S sang chữ Hoa
c.	Đổi toàn bộ kí tự của S sang chữ thường
d.	Đưa ra bảng tần số xuất hiện của các kí tự trong S
e.	Trích ra chuỗi con của từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
*/

package day1_2;
import java.util.Scanner;

public class cau7 {
    public static void main(String[] args) {
    	String chuoi;
    	Scanner scanner = new Scanner(System.in);

    	 System.out.println("Nhập vào chuỗi bất kỳ: ");
    	    chuoi = scanner.nextLine();
    	 
        StringBuilder str = new StringBuilder(chuoi);
        
        System.out.println("Chuỗi sau khi đảo ngược: ");

        System.out.println(str.reverse().toString());
        
        System.out.println("Chuỗi sau khi in hoa: ");
        //sử dụng phương thức toUpperCase() để in hoa các ký tự trong chuỗi
        System.out.println(chuoi.toUpperCase());
        
        System.out.println("Chuỗi sau khi chữ thường: ");
        System.out.println(chuoi.toLowerCase());
        
        // Đưa ra bảng tần số xuất hiện của các kí tự trong S
        int[] freq = new int[256];
        for (int i = 0; i < chuoi.length(); i++) {
            freq[chuoi.charAt(i)]++;
        }
        System.out.println("Bảng tần số xuất hiện của các kí tự trong S là:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }

        // Trích ra chuỗi con của từ kí tự thứ n đến thứ m của S
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập m: ");
        int m = scanner.nextInt();
        String substring = chuoi.substring(n, m+1);
        System.out.println("Chuỗi con của S từ kí tự thứ " + n + " đến kí tự thứ " + m + " là: " + substring);
    }
}