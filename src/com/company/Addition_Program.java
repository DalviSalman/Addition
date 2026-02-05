package com.company;
import java.util.Scanner;

public class Addition_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean show = true;

        int num,sum = 0;

        while(show)
        {
            System.out.println("Enter Number: ");
            num = sc.nextInt();

            if(num == 0)
            {
                show = false;
            }
            else
            {
                sum += num;
            }
        }

        System.out.println("Sum Is: " + sum);


    }
}
