package com.example.myappemptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity {

    private Button btnToCamera;
    private Button btnToTabbedActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        btnToCamera = findViewById(R.id.btnToCamera);
        btnToTabbedActivity = findViewById(R.id.btnToTabbedActivity);

        btnToCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), CameraActivity.class);
                view.getContext().startActivity(i);
            }
        });
        btnToCamera.setOnClickListener(v -> toCamera());



        btnToTabbedActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), TabbedActivity.class);
                view.getContext().startActivity(i);
            }
        });

    }
    private void toCamera() {
        Intent i = new Intent(this, CameraActivity.class);
        startActivity(i);
    }
}