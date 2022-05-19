package ru.example.first_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Лабораторная работа 12 Задача: передать между активностями произвольный текст(почитать про EditText)
 * Фролова СИ
 */
public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText.setText("Текст введен");
        context = this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra("key",text);
                startActivity(intent);
            }
        });
    }
}