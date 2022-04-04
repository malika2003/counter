package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContact.CounterView{
    ActivityMainBinding binding;
    int counter = 0;
    CounterPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initCliker();
        presenter = Injector.getPresenter();
        presenter.attachView(this);
    }

    private void initCliker() {
        binding.plus.setOnClickListener(v -> {
            presenter.increment();
        });
        binding.minus.setOnClickListener(v -> {
            presenter.decrement();
        });
    }

    @Override
    public void upDataCounter(int count) {
        binding.tvNull.setText(String.valueOf(count));
    }

    @Override
    public void toast() {
        Toast.makeText(this, "Это десять" , Toast.LENGTH_LONG).show();
    }

    @Override
    public void setColor() {
        binding.tvNull.setTextColor(getResources().getColor(R.color.teal_200));
    }
}