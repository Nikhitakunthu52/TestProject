package com.company;

import java.util.Scanner;

public class Device {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first and second number:");
        int num1, num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("selection: 1 for Addition, 2 for subtraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        Calc calc = new Calc();
        switch (choose) {
            case 1:
                System.out.println(calc.add (num1, num2));
                break;
            case 2:
                System.out.println(calc.sub (num1, num2));
                break;
            case 3:
                System.out.println(calc.multi (num1, num2));
                break;
            case 4:
                System.out.println(calc.div (num1, num2));
                break;
            default:
                System.out.println("Illegal Operation");


        }
    }
}
