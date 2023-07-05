package day1_2;

import java.util.Scanner;

public class cau9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng m: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột n: ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];

        // Nhập ma trận A
        System.out.println("Nhập ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }

        // Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận
        int product = 1;
        for (int j = 0; j < n; j++) {
            if (a[0][j] % 3 == 0) {
                product *= a[0][j];
            }
        }
        System.out.println("Tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận là: " + product);

        // Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            int max = a[i][0];
            for (int j = 1; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            x[i] = max;
        }
        System.out.println("Mảng X là:");
        for (int i = 0; i < m; i++) {
            System.out.print(x[i] + " ");
        }
    }
}