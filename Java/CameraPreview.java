package com.example.Gesty;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.util.List;

import static android.content.ContentValues.TAG;

public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback
{
    private SurfaceHolder mHolder;
    private Camera mCamera;


    public CameraPreview(Context context, Camera camera)
    {
        super(context);
        mCamera = camera;
        // Install a SurfaceHolder.Callback so we get notified when the underlying surface is created and destroyed.
        mHolder = getHolder();
        mHolder.addCallback(this);
        this.mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder)
    {
        Camera.Parameters param =   mCamera.getParameters();

        // Change orientation
        List<Camera.Size> sizes = param.getSupportedPictureSizes();
        Camera.Size mSize = null;
        for(Camera.Size size : sizes)
        {
            mSize = size;
        }


        if(this.getResources().getConfiguration().orientation != Configuration.ORIENTATION_PORTRAIT)
        {
            param.set("orientation", "landscape");
            mCamera.setDisplayOrientation(90);
            param.setRotation(90);
        }
        else
        {
            param.set("orientation", "portrait");
            mCamera.setDisplayOrientation(90);
            param.setRotation(90);
        }

        param.setPictureSize(mSize.width, mSize.height);

        mCamera.setParameters(param);
        try {
            mCamera.setPreviewDisplay(holder);
            mCamera.startPreview();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    //TODO: Change preview size here later
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height)
    {

    }

    @Override
    // TODO: destroy camera in activity!
    public void surfaceDestroyed(@NonNull SurfaceHolder holder)
    {

    }
}
