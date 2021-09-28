package com.example.Gesty;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.Gesty.R;

public class SetCameraActivity extends AppCompatActivity {

    private Button backBtn;
    private Camera mCamera;
    private FrameLayout framelayout;
    private CameraPreview mPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_camera);
        this.framelayout = (FrameLayout) findViewById(R.id.camera_preview);
        backToMain();

        // Open the Camera
        this.mCamera = Camera.open();
        this.mPreview = new CameraPreview(this,mCamera);
        this.framelayout.addView(mPreview);
    }

    private void backToMain()
    {
        Button camera_back_btn = (Button) findViewById(R.id.backCameraBtn);
        camera_back_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mCamera.release();
                finish();
            }
        });
    }
}