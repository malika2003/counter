package com.example.counter;

public class CounterModel {
    private boolean Ten = false;
    private boolean fifteen = false;
    int counter = 0;
    public void increment(){
        counter ++;
        switch (counter){
            case 10:
                Ten = true;
                fifteen = false;
                break;
            case 15:
                fifteen = true;
                Ten = false;
                break;
            default:
                Ten = false;
                fifteen= false;
                break;
        }
    }
    public void decrement() {
        counter--;
        switch (counter) {
            case 10:
                Ten = true;
                fifteen = false;
                break;
            case 15:
                fifteen = true;
                Ten = false;
                break;
            default:
                Ten = false;
                fifteen = false;
                break;
        }
    }


    public int getCounter() {
        return counter;
    }
    public  boolean IsTen(){
        return Ten;
    }
    public  boolean IsFifteen(){
        return fifteen;
    }
}
