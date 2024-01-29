package com.blueyonder.day8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ShowDate extends Thread {
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreadingDate {
    public static void main(String[] args) {
        ShowDate showDate = new ShowDate();
        showDate.start();
    }
}
