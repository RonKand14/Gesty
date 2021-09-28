package com.example.Gesty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.Gesty.R;

public class CaptureCameraImage extends Activity
{
    public static int cameraID = 0;
    public static boolean isBlack = true;
    public static ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_camera_image);
        image = (ImageView) findViewById(R.id.imgView);
        backMainActivity();
    }

    private void backMainActivity()
    {
        Button about_back_btn = (Button) findViewById(R.id.AboutBackBtn);
        about_back_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void onFrontClick(View v)
    {
        RadioButton rdbBlack = (RadioButton) findViewById(R.id.rdb_black);
        if(rdbBlack.isChecked()){
            isBlack = true;
        }else{
            isBlack = false;
        }
        cameraID = 1;
        Intent i = new Intent(CaptureCameraImage.this, DetectionActivity.class);
        startActivityForResult(i, 999);
    }

    public void onBackClick(View v)
    {
        RadioButton rdbBlack = (RadioButton) findViewById(R.id.rdb_black);
        if(rdbBlack.isChecked()){
            isBlack = true;
        }else{
            isBlack = false;
        }
        cameraID = 0;
        Intent i = new Intent(CaptureCameraImage.this, DetectionActivity.class);
        startActivityForResult(i, 999);
    }
}
