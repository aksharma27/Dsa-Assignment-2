package com.company.Q1;

public class Comission {
    double sales, comission;
    Comission(double sales){
        this.sales=sales;
    }
    double getComission(){
        if (sales<500){
            comission=0.02*sales;
        }
        else if(sales>500 && sales<5000){
            comission=sales*0.05;
        }
        else{
            comission=sales*0.08;
        }
        return comission;
    }
}
