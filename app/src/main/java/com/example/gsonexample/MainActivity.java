package com.example.gsonexample;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputTextView = findViewById(R.id.outputTextView);

    }

    public void convertJsonToObject(View view) {
        String json = "{\"name\":\"Alice\",\"age\":20}";
        Gson gson = new Gson();
        Student student = gson.fromJson(json, Student.class);
        outputTextView.setText("Name: " + student.getName() + "\nAge: " + student.getAge());
    }

    // Convert Java object to JSON
    public void convertObjectToJson(View view) {
        Student student = new Student("Bob", 22);
        Gson gson = new Gson();
        String json = gson.toJson(student);
        outputTextView.setText(json);
    }
}