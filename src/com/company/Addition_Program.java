package com.company;
import java.util.Scanner;

public class Addition_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2,sum = 0;

        System.out.println("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("Sum Is: " + sum);

    }
}
