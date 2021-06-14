package com.example.stringformatting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtFormatting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFormatting = findViewById(R.id.txtFormatting);
        String strFormatting = getString(R.string.string_to_format, "IT wala", 2021);
        txtFormatting.setText(strFormatting);
    }
}