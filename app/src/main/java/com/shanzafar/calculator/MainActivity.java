package com.shanzafar.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button add, sub, mul, div;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        tv = findViewById(R.id.tv);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int f, s, a;
            }
        });

    }
}