package org.milan;

public class GCD {

    public static int getGCD(int num1, int num2){
        if (num1 == 0 ) return  num2;

        return getGCD(num2 % num1,num1);// recursive call
    }
    public static void main(String[] args) {
        // calculate GCD using Euclidian Algorithm
        // recursive
        System.out.println(getGCD(10,20));

    }
}
