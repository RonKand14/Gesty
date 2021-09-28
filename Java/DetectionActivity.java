package com.example.Gesty;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.example.Gesty.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;


public class DetectionActivity extends AppCompatActivity
{
    ArrayList<byte[]> frames = new ArrayList<byte[]>();
    private int image_count;
    private boolean mode;
    final Handler handler = new Handler();
    private Camera mCamera;
    private CameraPreview mCameraPreview;
    private Camera.PictureCallback mPicture;
    private CountDownTimer cTimer = null;
    private Python py;
    private PyObject py_object;
    private String numberP1;
    private String numberP2;
    private final String fist= "[0]";
    private final String headL= "[1]";
    private final String headR= "[2]";
    private MediaPlayer mpPtr;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detection);
        mCamera = getCameraInstance();
        mCameraPreview = new CameraPreview(this, mCamera);
        // cancel sound on taking picture
        mCamera.enableShutterSound(false);
        RelativeLayout preview = (RelativeLayout) findViewById(R.id.cameraPreview);
        preview.addView(mCameraPreview);
        Button detectBtn = (Button) findViewById(R.id.DetectBtn);
        Button stopBtn = (Button) findViewById(R.id.stopDetectionBtn);
        Uri noti = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alarm1);
        mpPtr=mp;
        backToMain();
        // Get Numbers
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        //TODO: enter default number as police or MADA
        numberP1 = preferences.getString("Number1", "");
        numberP2 = preferences.getString("Number2", "");
        // Init vars
        this.image_count = 0;
        // Init Callback for pictures
        this.mPicture = new Camera.PictureCallback() {
            @Override
            public void onPictureTaken(byte[] data, Camera mCamera) {
                // Create Byte Array
                Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
                Bitmap resized = Bitmap.createScaledBitmap(bitmap, 64, 64, true);
                ByteArrayOutputStream blob = new ByteArrayOutputStream();
                resized.compress(Bitmap.CompressFormat.PNG, 0 /* Ignored for PNGs */, blob);
                byte[] bitmapdata = blob.toByteArray();
                frames.add(bitmapdata);
                image_count += 1;
                if (image_count == 40) {
                    cancelTimer();
                    startNetwork();
                    frames.clear();
                    image_count = 0;
                    startTimer();
                }
            }
        };
        detectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelTimer();
                mCamera.stopPreview();
                if (mpPtr.isPlaying()){mpPtr.stop();}
            }
        });
    }

    public void setImage_count(int image_count) {
        this.image_count = image_count;
    }

    //start timer function
    void startTimer() {
        cTimer = new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                mCamera.startPreview();
                mCamera.takePicture(null, null, mPicture);
            }
            public void onFinish() {
                backToMain();   // TODO: add different functionality
            }
        };
        cTimer.start();
    }

    //cancel timer
    void cancelTimer() {
        if(cTimer!=null)
            cTimer.cancel();
    }

    protected Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open();
        } catch (Exception e){
        }
        return c;
    }

    private void startNetwork() {
        // Activate python script
        if (!Python.isStarted())
            Python.start(new AndroidPlatform(this));
        this.py = Python.getInstance();
        this.py_object = py.getModule("main");
        // Get prediction
        PyObject result = this.py_object.callAttr("predict_video", frames.get(0), frames.get(1),
                frames.get(2), frames.get(3), frames.get(4), frames.get(5),frames.get(6),
                frames.get(7),frames.get(8),frames.get(9),frames.get(10),frames.get(11), frames.get(12),
                frames.get(13), frames.get(14),frames.get(15),frames.get(16), frames.get(17),frames.get(18),
                frames.get(19), frames.get(20), frames.get(21), frames.get(22), frames.get(23), frames.get(24),
                frames.get(25),frames.get(26), frames.get(27),frames.get(28),frames.get(29),frames.get(30),
                frames.get(31), frames.get(32), frames.get(33), frames.get(34),frames.get(35),frames.get(36),
                frames.get(37),frames.get(38),frames.get(39));
        String result_string = result.toString();

        // TODO: Activate Operation based on the prediction + configure min value
        // head left - number1
        if(result_string.equals(headL))
        {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" +numberP1));
            startActivity(intent);
        }
        // Fist - Sound - bathroom
        // TODO: doesnt work - fix
        else if(result_string.equals(fist))
        {
            mpPtr.start();
        }
        // head right - number2
        else if(result_string.equals(headR))
        {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" +numberP2));
            startActivity(intent);
        }
        // None of the above
        // TODO: add here
        else{

        }
    }

    private void backToMain() {
        Button backDetectBtn = (Button) findViewById(R.id.backDetectionBtn);
        backDetectBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mpPtr.isPlaying()){mpPtr.stop();}
                cancelTimer();
                mCamera.stopPreview();
                mCamera.release();
                finish();
            }
        });
    }

    public int getImage_count() { return image_count; }

}