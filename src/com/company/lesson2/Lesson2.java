package com.company.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 10;
//
//        int sum = x + y;
//        System.out.println(sum);
//
//        boolean numberEven = isNumberEven(24);
//        System.out.println(numberEven);
//        boolean numberNotEven = isNumberEven(243);
//        System.out.println(numberNotEven);
//
//        int x1 = 8;
//        int x2 = 7;
//
//        System.out.println(x1 + x2);
//        System.out.println(x1 - x2);
//        System.out.println(x1 * x2);
//        System.out.println(x1 / x2);
//        System.out.println(x1 % x2);

        int x = 2;
        int y = 5;
//        System.out.println(x > y);
//        System.out.println(x < y);
//        System.out.println(x <= y);
//        System.out.println(x >= y);
//        System.out.println(x != y);
//        System.out.println(x == y);
//        System.out.println(x = y);

//        System.out.println(x += 1);
//        System.out.println(x *= 1);
//        System.out.println(x -= 1);
//        System.out.println(x /= 1);
//        System.out.println(x %= 1);

        System.out.println(++x);
    }

    static boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
