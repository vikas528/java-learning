package com.blueyonder.day9.testingProject;

public class Calculator implements Device{

    public int add(int x, int y){
        return x+y;
    }
    public boolean scientificMode(boolean mode){
        return mode;
    }
    @Override
    public void showDevice() {

    }
    public Calculator getDetails(){
        System.out.println("CASIO");
        return new Calculator();
    }
    public int findFact(int x){
        if(x==0) return 1;
        return x*findFact(x-1);
    }
}
