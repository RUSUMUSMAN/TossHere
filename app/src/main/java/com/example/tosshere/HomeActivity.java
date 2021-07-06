package com.example.tosshere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Thread.sleep;

public class HomeActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        tv1 = findViewById(R.id.tosstext);

    }

    public void makeToss(View view) {
        final Random myrandom = new Random();
        int num = myrandom.nextInt(2);
        if(num==0){
            tv1.setText("Heads !");
            Toast.makeText(getApplicationContext(),"Heads...!",Toast.LENGTH_SHORT).show();
        }
        else{
            tv1.setText("Tails !");
            Toast.makeText(getApplicationContext(),"Tails...!",Toast.LENGTH_SHORT).show();
        }



    }
}