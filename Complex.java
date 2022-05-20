import java.util.Scanner;

public class Complex {
    double real, imag;
    void setData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of the complex number: ");
        real=in.nextDouble();
        imag=in.nextDouble();
    }

    void display(){
        System.out.println("Complex number: "+real+"+i"+imag);
    }

    public Complex add(Complex c1, Complex c2){
        Complex num1=new Complex();
//        num1.real= num1.+;
    }

}
