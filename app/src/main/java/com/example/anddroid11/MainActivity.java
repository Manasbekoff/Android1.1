package com.example.anddroid11;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;
    private ImageView imageView;
//    private FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//fadingTextView = findViewById(R.id.fading_text_view);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        textView = findViewById(R.id.welcomeText);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editName);
        editText = findViewById(R.id.editPass);
        button = findViewById(R.id.signIn);
        imageView = findViewById(R.id.icon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(editText.getText().toString())){
                    Toast.makeText(MainActivity.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}