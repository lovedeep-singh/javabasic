package com.busyqa.coursework.wk1_answer;

public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 5;  // Set the value of "number" here!

        // Using nested-if
        if (number == 1) {
            System.out.println("ONE" );
        } else if (number==2) {
         System.out.println("TWO");
        } else if (number==9) {
         System.out.println("NINE");
         
        } else {
         System.out.println("OTHER");
        }

        // Using switch-case
        switch(number) {
            case 1: System.out.println("ONE"); break;  // Don't forget "break"
            case 2: System.out.println( "TWO"); break;
            case 9: System.out.println("NINE"); break;
         
            default: System.out.println( "OTHER");
        }
    }
}
