package com.example.counter;

public class CounterContact {
    interface CounterView{
        void upDataCounter(int count);
        void toast();
        void setColor();
    }

    interface CounterPresent{
        void increment();
        void decrement();
        void checkIsTen();
        void checkIsFifteen();
        void attachView(CounterView view);
    }
}
