package com.stackroute.practiceexercise1;

import java.util.Scanner;
import java.lang.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNum = scanner.nextLong();
        if (isPalindrome(inputNum)) {
            if ( (isSumOfEvenNum(inputNum) > 25) ) {
                System.out.println(inputNum +" is palindrome and greater than 25");
            }
            else {
                System.out.println(inputNum + "is palindrome and smaller than 25");
            }
        }
        else System.out.println("Not a palindrome");
    }

    private static boolean isPalindrome(long number){
        String str = "";
        String stringNum = String.valueOf(number);
        boolean boo = false;
        for (int i = stringNum.length() -1; i >=0; i--){
            str = str.concat( String.valueOf(stringNum.charAt(i)) );
        }
        if (str.equals(stringNum)) boo = true;
        return boo;
    }

    private static int isSumOfEvenNum(long number){
        int sumOfEvenNum = 0;
        long localNumber = number;
        while (localNumber > 0){
            if ( (localNumber % 10) % 2 == 0 ){
                sumOfEvenNum += localNumber % 10;
            }
            localNumber = localNumber / 10;
        }
        return sumOfEvenNum;
    }
}
