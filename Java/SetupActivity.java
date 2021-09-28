package com.example.Gesty;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.Gesty.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;


public class SetupActivity extends AppCompatActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        Button num1Btn = (Button) findViewById(R.id.num1Btn);
        Button num2Btn = (Button) findViewById(R.id.num2Btn);
        backToMain();
        num1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit1BtnClick();
            }
        });
        num2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit2BtnClick();
            }
        });
    }

    private void backToMain()
    {
        Button about_back_btn = (Button) findViewById(R.id.backSettingBtn);
        about_back_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    // TODO: fix
    public void setNumber1(Context context, String number1)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Number1",number1);
        editor.apply();
    }

    // TODO: fix
    public void setNumber2(Context context, String number2)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Number2",number2);
        editor.apply();
    }

    public void onSubmit1BtnClick()
    {
        TextView txtNum1 = findViewById(R.id.num1dis);
        EditText edtNum1 = findViewById(R.id.number1);
        String num1 = edtNum1.getText().toString();
        if(num1.length() != 10)
        {
            txtNum1.setText("Invalid Phone Number!");
        }
        else
        {
            txtNum1.setText("Number: " + num1);
            setNumber1(this, num1);
        }
    }

    public void onSubmit2BtnClick()
    {
        TextView txtNum2 = findViewById(R.id.num2dis);
        EditText edtNum2 = findViewById(R.id.number2);
        String num2 = edtNum2.getText().toString();
        if(edtNum2.length() != 10)
        {
            txtNum2.setText("Invalid Phone Number!");
        }
        else
        {
            txtNum2.setText("Number: " + num2);
            setNumber2(this, num2);
        }

    }
}