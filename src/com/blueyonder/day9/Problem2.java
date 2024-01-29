package com.blueyonder.day9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date (yyyy-mm-dd): ");
        String date1 = sc.next();
        System.out.println("Enter the second date (yyyy-mm-dd): ");
        String date2 = sc.next();

        String res = CalculateBetweenDates.calculator(date1, date2);
        System.out.println(res);
        sc.close();
    }
}

class CalculateBetweenDates{
    public static String calculator(String date1, String date2){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate startDate = LocalDate.parse(date1, formatter);
            LocalDate endDate = LocalDate.parse(date2, formatter);

            long differenceInDays = Math.abs(endDate.toEpochDay()-startDate.toEpochDay())+1;
            return differenceInDays + " " + (differenceInDays==1 ? "day" : "days");
        } catch (Exception e){
            return "Invalid Date";
        }
    }
}
