package example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
         
    System.out.print("enter principal");
    Scanner scanner = new Scanner(System.in);
    double principal = scanner.nextDouble();

System.out.print("enter time period");
int time=scanner.nextInt();
System.out.print("enter rate of interest");
float rate = scanner.nextFloat();
float annual = rate/12/100;
float interest = annual;
double Mortrage=(rate*interest/interest-1)*principal;
System.out.print("Mortrage" + Mortrage);
Math.pow(time, time);
}
}