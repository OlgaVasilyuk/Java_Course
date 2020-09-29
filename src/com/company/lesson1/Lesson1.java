package com.company.lesson1;

public class Lesson1 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world!");
        System.out.println(123);

        // Integer variables: 1, 2, 3 ......23943093...
        byte byteVariable = 1;
        short shortVariable = 1;
        int integerVariable = 1;
        long longVariable = 1;

        // Float numbers: 1.00, 1.23, 1.43, ...
        float floatVariable = 1f;
        double doubleVariable = 1.0;

        //Strings
        char charVariable = 'c';
        String stringVariable = "string variable";

        //Boolean
        boolean booleanVariable = true;

        int x, y, z = 5;
        System.out.println(stringVariable);

        int maximAge = 21;
        System.out.println(maximAge);

        maximAge = 18;
        System.out.println(maximAge);

        maximAge = 5;
        System.out.println(maximAge);

        String crushName = "Maxim";
        String myName = "Olya";
        String loves = "loves";
        String space = " ";
        String crushLovesMe = crushName + " " + loves + " " + myName;

        System.out.println(crushLovesMe);

        String olyaLovesCrush = myName + space + loves + space + crushName;
        System.out.println(olyaLovesCrush);

        String and = "and";
        String aboutLove = olyaLovesCrush + space + and + space + crushLovesMe;
        System.out.println(aboutLove);

        String aboutYear = "Количество дней в году равно ";
        int daysInYear = 365;
        System.out.println(aboutYear + daysInYear);

    }
}
