package com.example.android.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when user clicks button **/
    public void sendMessage(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "";

        switch(view.getId()) {
            case R.id.button:
                text = "This button will launch my Popular Movies app!";
                break;
            case R.id.button2:
                text = "This button will launch my Stock Hawk app!";
                break;
            case R.id.button3:
                text = "This button will launch my Build It Bigger app!";
                break;
            case R.id.button4:
                text = "This button will launch my Make Your App Material app!";
                break;
            case R.id.button5:
                text = "This button will launch my Go Ubiquitous app!";
                break;
            case R.id.button6:
                text = "This button will launch my capstone app!";
                break;
        }

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
