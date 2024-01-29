package com.blueyonder.day9;

public class JDBDemo {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a==0){
            System.out.println("a is zero");
        }
        else if(a==1){
            System.out.println("a is one");
        }
        int b = 5;
        System.out.println("Increment b: " + (b++));
    }
}
