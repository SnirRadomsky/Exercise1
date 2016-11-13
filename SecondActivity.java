package com.example.rachel.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent("FIRST_ACTIVITY");
        startActivity(intent);
        setContentView(R.layout.activity_second);
    }

    public void btnToFirst(View view) {
        Intent intent = new Intent("FIRST_ACTIVITY");
        startActivity(intent);
    }

    public void btnToThird(View view) {
        Intent intent = new Intent("THIRD_ACTIVITY");
        startActivity(intent);
    }


}
