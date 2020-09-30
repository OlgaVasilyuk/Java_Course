package com.company.lesson2;

public class Lesson2_Homework {
    /*
     * 1. Create two int variables and two double variables
     * 2. Create variables that represent sum, subtraction, division, multiplication and print them
     * 3. Increment and decrement variables from 2 point.
     * 4. What is difference between i++ and ++i.
     * 5. Create 2 int variables and print the result of mod on 2 (остаток от деления на 2).
     * 6. Use several short operators like +=, -= and print the result
     * 7. Calculate please and print: 2x + y;   (3x + 2) / (4 - 8y);  3*3*x*123/5y;
     * 8. What is the main difference between '=' and '=='
     * 9. Create some boolean variables with calculation of it result f.e. boolean a = x % 2 == 0 && x % 3 == 0 || ...
     * */
    public static void main(String[] args) {
        //1
        int a = 10;
        int b = 15;

        double c = 2.5;
        double d = 12.4;

        //2
        System.out.println("The subtraction of two int variables is " + (b - a));
        System.out.println("The sum of two int variables is " + (a + b));
        System.out.println("The multiplication of two double variables is " + (c * d));
        System.out.println("The division of two double variables is " + (d / c));
        System.out.println(b % a);

        //3
        //System.out.println(a++);
        //System.out.println(++a);
        //System.out.println(c--);
        //System.out.println(--c);

        //5
        double x = 2;
//        System.out.println(x % 2);
        double y = 3;
//        System.out.println(y % 2);

        //6
        //System.out.println(x += 1);
        // System.out.println(y -= 1);

        //7
        System.out.println(2 * x + y);
        System.out.println((3 * x + 2) / (4 - 8 * y));
        System.out.println(3 * 3 * x * 123 / 5 * y);
        System.out.println(5 / -10);

        //9
        int v = 12;
        boolean variable = v % 2 == 0 && v % 3 == 0;
        System.out.println(variable);

    }
}
