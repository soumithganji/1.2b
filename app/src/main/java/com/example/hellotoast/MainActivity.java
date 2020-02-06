package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_ch,btn1;
    RelativeLayout bck;
    private int mCount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btn_ch=(Button)findViewById(R.id.zero);
        btn1=(Button)findViewById(R.id.button_count);

    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("ResourceAsColor")
    public void countUp(View view) {
        mCount++;
        //if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            if(mCount%2==0){
                btn1.setBackgroundColor(Color.GREEN);
            }
            else{
                btn1.setBackgroundColor(Color.BLUE);
            }
            if(mCount!=0){
                btn_ch.setBackgroundColor(Color.BLACK);
            }
                }

    @SuppressLint("ResourceAsColor")
    public void zero(View view) {
        mCount=0;
        mShowCount.setText(Integer.toString(0));
        btn_ch.setBackgroundColor(Color.GRAY);


    }
}
