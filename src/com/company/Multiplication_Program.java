package com.company;
import java.util.Scanner;

public class Multiplication_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2,mul = 0;

        System.out.println("Enter Number For 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number For 2: ");
        num2 = sc.nextInt();

        mul = num1 * num2;

        System.out.println("Multiplication Of Two Number Is: " + mul);

    }
}
