package day1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class cau10 {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line = "";
        String csvSplitBy = ",";

       myFunciton(csvFile,line,csvSplitBy);
    }
    public static void myFunciton(String file,String line,String splitBy){

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int i = 0;
            while ((line = br.readLine()) != null) {
                i +=1;
                String[] student = line.split(splitBy);
                String stdNo = student[0];
                String stdName = student[1];
                String stdPhone = student[2];
                String stdEmail = student[3];
                String gradePoint = student[4];
                System.out.println("StdNo: " + stdNo + " | StdName: " + stdName + " | StdPhone: " + stdPhone + " | StdEmail: " + stdEmail + " | GradePoint: " + gradePoint);
                if(!checkPhone(stdPhone)){
                    witeError("Line"+i+" : co loi sai dinh dang stdPhone");

                }
                if (!checkEmail(stdEmail)){
                    witeError("Line"+i+" : co loi sai dinh dang stdEmail");

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean checkPhone(String phone){
        return Pattern.matches("^[0-9]{10}$",phone);
    }
    public static boolean checkEmail(String email){
        return Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$",email);
    }
    public static void witeError(String error){
        try (FileWriter errorFile = new FileWriter("error.csv",true)){
            errorFile.write(error+"\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
