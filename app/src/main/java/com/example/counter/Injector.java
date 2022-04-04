package com.example.counter;

public class Injector {
    public static CounterPresenter getPresenter(){
        return new CounterPresenter();
    }
}
