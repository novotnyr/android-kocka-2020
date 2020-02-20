package com.github.novotnyr.android.kocka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.rollButton);
    }

    public void onRollButtonClick(View view) {
    }

    private int getRandomRoll() {
        Random random = new Random();
        return random.nextInt(6) + 1; // (0--5) + 1 = 1--6
    }
}
