package com.example.Gesty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Gesty.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openActivityContact();
        openActivityHelp();
        openActivitySetup();
        openActivitySetCamera();
        openActivityDetect();
    }

    private void openActivitySetCamera()
    {
        Button activity_camera_btn = (Button) findViewById(R.id.cameraBtn);
        activity_camera_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, cameraActivity.class));
            }
        });
    }

    private void openActivityDetect()
    {
        Button activity_about_btn = (Button) findViewById(R.id.detectBtnMain);
        activity_about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetectionActivity.class));
            }
        });
    }

    private void openActivitySetup()
    {
        Button activity_detect_btn = (Button) findViewById(R.id.setupBtn);
        activity_detect_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SetupActivity.class));
            }
        });
    }

    private void openActivityHelp()
    {
        Button activity_help_btn = (Button) findViewById(R.id.helpBtn);
        activity_help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HelpActivity.class));
            }
        });
    }

    private void openActivityContact()
    {
        Button activity_contact_btn = (Button) findViewById(R.id.contactBtn);
        activity_contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityContact.class));
            }
        });
    }
}