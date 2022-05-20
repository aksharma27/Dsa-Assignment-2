package Students;

import java.util.Scanner;

class Student {
    int roll;
    String name, course;
    void input_Student(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter student's name, roll and course: ");
        name=in.nextLine();
        roll=in.nextInt();
        course=in.nextLine();

    }
    void display_Student(){
        System.out.println("Name: "+name+"\t Roll: "+roll+" \tCourse: "+course);
    }
}

class Exam extends Student{
float mark1, mark2, mark3;
void input_Marks(){
Scanner in = new Scanner(System.in);
    System.out.println("Enter marks for 3 subject: ");
    mark1=in.nextFloat();
    mark2=in.nextFloat();
    mark3=in.nextFloat();
}

void display_Result(){
    System.out.println("Marks are: "+ (mark3+mark2+mark1));
 }
}
