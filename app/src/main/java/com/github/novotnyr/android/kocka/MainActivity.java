package com.github.novotnyr.android.kocka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRollButtonClick(View view) {
    }

    private int getRandomRoll() {
        Random random = new Random();
        return random.nextInt(6) + 1; // (0--5) + 1 = 1--6
    }

}
