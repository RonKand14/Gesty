package com.example.Gesty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.Gesty.R;

import java.util.ArrayList;

public class HelpActivity extends AppCompatActivity {

    private RecyclerView helpRecView;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        helpRecView = findViewById(R.id.gestureRecView);

        ArrayList<Gestures> gestures = new ArrayList<>();
        gestures.add(new Gestures("Look Left", "Call Number inserted","https://image.shutterstock.com/image-vector/neck-rotation-exercise-turning-head-260nw-1476445787.jpg"));
        gestures.add(new Gestures("Look Right", "Call 911","https://image.shutterstock.com/image-vector/neck-rotation-exercise-turning-head-260nw-1476445787.jpg"));
        gestures.add(new Gestures("Fist Vertical", "Need bathroom","https://img.buzzfeed.com/buzzfeed-static/static/2017-01/31/12/asset/buzzfeed-prod-fastlane-01/sub-buzz-23068-1485883007-2.jpg"));

        HelpRecViewAdapter adapter = new HelpRecViewAdapter(this);
        adapter.setGestures(gestures);

        helpRecView.setAdapter(adapter);
        helpRecView.setLayoutManager(new GridLayoutManager(this,2));
        backMainActivity();
    }


    private void backMainActivity()
    {
        Button help_back_btn = (Button) findViewById(R.id.helpBackBtn);
        help_back_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}