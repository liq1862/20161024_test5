package com.example.user.a20161024_test5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1;
    CheckBox chk2;
    RadioGroup rg;
    ProgressBar pg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = (CheckBox) findViewById(R.id.checkBox);      //checkbox
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("MYLOG", "chk1:" + isChecked);
            }
        });
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("MYLOG", "chk2:" + isChecked);
            }
        });
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton)
                {
                    Log.d("MYLOG","Select: radioButton");
                }
                else if (checkedId == R.id.radioButton2)
                {
                    Log.d("MYLOG","Select:radioButton2 ");
                }
            }
        });

        pg = (ProgressBar) findViewById(R.id.progressBar);

    }
    public void Click1(View v)
    {
        pg.setVisibility(View.VISIBLE);
    }
}
