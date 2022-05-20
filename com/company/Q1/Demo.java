package com.company.Q1;

import javax.xml.stream.events.Comment;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sales:");
        double sales=in.nextDouble();
        if (sales<0){
            System.out.println("Invalid input");
        }
        else {
            Comission c1=new Comission(sales);
            double ans=c1.getComission();
            System.out.println("Comission: "+ans);
        }
    }
}
