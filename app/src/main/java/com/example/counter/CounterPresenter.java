package com.example.counter;

public class CounterPresenter implements  CounterContact.CounterPresent{
    CounterContact.CounterView counterView;
    CounterModel counterModel = new CounterModel()


            ;

    @Override
    public void increment() {
        checkIsTen();
        checkIsFifteen();
        counterModel.increment();
        counterView.upDataCounter(counterModel.getCounter());
    }

    @Override
    public void decrement() {
        checkIsTen();
        checkIsFifteen();
        counterModel.decrement();
        counterView.upDataCounter(counterModel.getCounter());
    }

    @Override
    public void checkIsTen() {
        if (counterModel.IsTen()){
            counterView.toast();
        }
    }

    @Override
    public void checkIsFifteen() {
            if (counterModel.IsFifteen()){
                counterView.setColor();
        }
    }


    @Override
    public void attachView(CounterContact.CounterView view) {
    this.counterView = view;
    }
}
