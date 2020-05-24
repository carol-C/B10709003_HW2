package com.example.b10709003_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button bt_OK = findViewById(R.id.bt_OK);
        final EditText ET_NAME = findViewById(R.id.ET_NAME);
        final EditText ET_AMOUNT = findViewById(R.id.ET_NAME);

        bt_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =ET_NAME.getText().toString();
                String num = ET_AMOUNT.getText().toString();
                Intent intent = new Intent(add.this, MainActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("num", num);

            }
        });

        Button bt_CANCAL = findViewById(R.id.bt_CANCEL);
        bt_CANCAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET_NAME.getText().clear();
                ET_AMOUNT.getText().clear();
            }
        });

    }
}

