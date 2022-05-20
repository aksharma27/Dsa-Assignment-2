package Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Exam[] s1=new Exam[5];
        for(int i=0; i<5; i++){
            System.out.println("Enter marks for"+(i+1)+"th Studtent: ");
            s1.input_Student();
        }
    }


}
