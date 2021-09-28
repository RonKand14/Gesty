package com.example.Gesty;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Gesty.R;

public class ActivityContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        backMainActivity();
    }

    private void backMainActivity()
    {
        Button back_btn = (Button) findViewById(R.id.backBtn);
        back_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

