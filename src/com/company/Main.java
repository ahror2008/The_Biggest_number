package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner ss = new Scanner(in);
        System.out.print(" a soni kriting  ");
        int a = ss.nextInt();
        System.out.print("  b soni kriting  ");
        int b = ss.nextInt();
        System.out.print("  c soni kriting  ");
        int c = ss.nextInt();

        if (a > b) {
            System.out.println(a);
        }else if (b>a){
            // a katta b dan
            System.out.println(b);
            System.out.println(c);
        } else { // c katta a dan
            // if (b > c)
                System.out.println(c);
        }
    }
}