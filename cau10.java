package day1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class cau10 {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        List<Student> students = readStudentData(csvFile);

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static List<Student> readStudentData(String csvFile) {
        String line = "";
        String csvSplitBy = ",";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(csvSplitBy);

                String stdNo = studentData[0];
                String stdName = studentData[1];
                String stdPhone = studentData[2];
                String stdEmail = studentData[3];
                double gradePoint = Double.parseDouble(studentData[4]);

                if (isValidPhone(stdPhone) && isValidEmail(stdEmail)) {
                    Student student = new Student(stdNo, stdName, stdPhone, stdEmail, gradePoint);
                    students.add(student);
                }else {
                    FileWriter writer = new FileWriter("error.txt", true);
                    writer.write("có lỗi sai định dạng: " + line + "\n");
                    writer.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

    public static boolean isValidPhone(String phone) {
        // Kiểm tra định dạng số điện thoại (VD: 0123456789)
        return phone.matches("\\d{10}");
    }

    public static boolean isValidEmail(String email) {
        // Kiểm tra định dạng email (VD: abc@xyz.com)
        return email.matches("\\w+@\\w+\\.\\w+");
    }
}

class Student {
    private String stdNo;
    private String stdName;
    private String stdPhone;
    private String stdEmail;
    private double gradePoint;

    public Student(String stdNo, String stdName, String stdPhone, String stdEmail, double gradePoint) {
        this.stdNo = stdNo;
        this.stdName = stdName;
        this.stdPhone = stdPhone;
        this.stdEmail = stdEmail;
        this.gradePoint = gradePoint;
    }

    public String getStdNo() {
        return stdNo;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdPhone() {
        return stdPhone;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdNo='" + stdNo + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdPhone='" + stdPhone + '\'' +
                ", stdEmail='" + stdEmail + '\'' +
                ", gradePoint=" + gradePoint +
                '}';
    }
}


