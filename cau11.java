/*Trong Java, khi truyền một tham số vào trong một phương thức, 
giá trị của tham số có thể được truyền bằng cách tham chiếu đến 
địa chỉ bộ nhớ của đối tượng (pass by reference) hoặc bằng cách truyền giá trị của đối tượng (pass by value).

Để phân biệt giữa hai khái niệm này, chúng ta có thể xem xét ví dụ sau:*/


package day1_2;

public class cau11 {
    public static void main(String[] args) {
        int x = 10;
        int[] arr = {1, 2, 3};
        System.out.println("Before calling method: x = " + x + ", arr[0] = " + arr[0]);
        changeValues(x, arr);
        System.out.println("After calling method: x = " + x + ", arr[0] = " + arr[0]);
    }

    public static void changeValues(int x, int[] arr) {
        x = 20;
        arr[0] = 4;
        System.out.println("Inside method: x = " + x + ", arr[0] = " + arr[0]);
    }
}
/*Trong ví dụ này, chúng ta khởi tạo một biến nguyên x và một mảng arr,
 và in ra giá trị của chúng trước khi gọi phương thức changeValues. 
 Sau đó, chúng ta gọi phương thức này và in ra giá trị của x và phần tử đầu tiên của mảng arr sau khi phương thức được gọi.


Khi chạy chương trình, chúng ta sẽ thấy kết quả như sau:


Before calling method: x = 10, arr[0] = 1
Inside method: x = 20, arr[0] = 4
After calling method: x = 10, arr[0] = 4
Chúng ta có thể thấy rằng giá trị của biến x không bị thay đổi sau khi phương thức được gọi, 
trong khi phần tử đầu tiên của mảng arr đã được thay đổi. Điều này xảy ra vì biến x được truyền bằng cách truyền giá trị, 
trong khi mảng arr được truyền bằng cách tham chiếu đến địa chỉ bộ nhớ của mảng. 
Khi giá trị của biến x được thay đổi bên trong phương thức, nó không ảnh hưởng đến giá trị của biến x bên ngoài phương thức. 
Tuy nhiên, khi phần tử đầu tiên của mảng arr được thay đổi bên trong phương thức, 
nó cũng thay đổi giá trị của phần tử đầu tiên của mảng arr bên ngoài phương thức, 
do đó chúng ta thấy giá trị của mảng arr đã thay đổi sau khi phương thức được gọi.*/