package com.example.rachel.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void btnToFirst(View view) {
        Intent intent = new Intent("FIRST_ACTIVITY");
        startActivity(intent);
    }

    public void btnToSecond(View view) {
        Intent intent = new Intent("SECOND_ACTIVITY");
        startActivity(intent);
    }


}
