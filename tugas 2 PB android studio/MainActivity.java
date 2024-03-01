package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText val1,val2;

    TextView result;

    Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.tvHasil);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 + value2;
                result.setText(String.valueOf(hasil));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 - value2;
                result.setText(String.valueOf(hasil));

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 / value2;
                result.setText(String.valueOf(hasil));

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 * value2;
                result.setText(String.valueOf(hasil));

            }
        });
    }
}
