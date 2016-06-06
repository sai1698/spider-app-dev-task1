package com.example.sainaveen.spidertask1appdev;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    TextView txtCount;
    Button btnCount;
    Button btnreset;
    int count = 0;

    String saved;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnreset = (Button)findViewById(R.id.button2);
        btnreset.setOnClickListener(new OnClickListener()
        {
            public void onClick(View arg0) {
                count=0;
                txtCount.setText(String.valueOf(count) );

            }
        });


        txtCount = (TextView)findViewById(R.id.textView1);
        txtCount.setText(String.valueOf(count));
        btnCount = (Button)findViewById(R.id.button1);



        btnCount.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0)
            {
                count++;
                txtCount.setText(Integer.toString(count));

            }
        });
    }
    // saving the state
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt(saved,count);
    }

    // restoring the saved state
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        count =savedInstanceState.getInt(saved);
        txtCount.setText(Integer.toString(count) );
    }

}