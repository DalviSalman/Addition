package com.company;
import java.util.Scanner;

public class Subtract_Program {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        float sub = 0;

        System.out.println("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        num2 = sc.nextInt();

        sub = num1 - num2;

        System.out.println("Subtraction Is: " + sub);

    }
}
