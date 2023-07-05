//Comments và JavaDoc là hai cách để viết chú thích trong mã nguồn Java để giải thích về chức năng, 
//cấu trúc, giải thuật, và các yếu tố khác của mã nguồn. Tuy nhiên, chúng có một số khác nhau như sau:

//1. Comments:

//- Comments là các đoạn mã giải thích được thêm vào trong mã nguồn để giúp người đọc hiểu được mã nguồn đó. 
//- Comments nằm trong một khối lệnh, và được đánh dấu bởi ký tự // hoặc /*...*/
//- Comments không thực sự được xử lý bởi trình biên dịch, mà chỉ là các đoạn văn bản giải thích được thêm vào cho người đọc.
//- Comments thường được sử dụng để giải thích cách hoạt động của một phương thức, lớp, hay biến nào đó.

/*2. JavaDoc:

- JavaDoc là một công cụ để tạo ra tài liệu cho mã nguồn Java.
- JavaDoc được viết bằng các đoạn mã được đặt trong các khối "/ **... * /", 
và có thể được sử dụng để tạo ra tài liệu API cho mã nguồn Java.
- JavaDoc cung cấp cho người đọc mã nguồn thông tin về các phương thức, lớp, biến, v.v. và cách sử dụng chúng.
- JavaDoc cũng có thể được sử dụng để tạo ra các trang tài liệu HTML cho mã nguồn Java.

//Ví dụ cho sự khác biệt giữa Comments và JavaDoc, ta sử dụng ví dụ về một lớp đơn giản như sau:
*/

/**
 * Lớp Calculator thực hiện các phép tính cơ bản.
 */

package day1_2;
public class cau12 {

    /**
     * Phương thức add tính tổng hai số nguyên.
     *
     * @param a số nguyên thứ nhất
     * @param b số nguyên thứ hai
     * @return tổng của hai số nguyên
     */
    public int add(int a, int b) {
        return a + b;
    }
    // Phương thức subtract tính hiệu hai số nguyên.
    public int subtract(int a, int b) {
        return a - b;
    }
}
/*
 * Trong ví dụ này, chúng ta sử dụng JavaDoc để tạo ra các chú thích cho lớp và
 * phương thức. Chúng ta sử dụng các thẻ JavaDoc như @param và @return để giải
 * thích các tham số đầu vào và giá trị trả về của phương thức. Chúng ta cũng sử
 * dụng các câu lệnh bổ sung để giải thích chức năng của lớp và phương thức.
 * 
 * Trong khi đó, chúng ta sử dụng Comments để giải thích chức năng của phương
 * thức subtract. Trong trường hợp này, chúng ta không sử dụng JavaDoc vì đây là
 * một phương thức đơn giản và không cần tạo tài liệu API cho nó.
 * 
 * Tóm lại, Comments và JavaDoc đều là các công cụ quan trọng để giải thích mã
 * nguồn Java. Tuy nhiên, JavaDoc cung cấp một cách tiêu chuẩn hóa và chuyên
 * nghiệp hơn để tạo ra tài liệu API cho mã nguồn Java.
 */