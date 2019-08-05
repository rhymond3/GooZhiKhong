package com.example.goozhikhong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button toSPM , toOLevel, toUEC;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toSPM = findViewById(R.id.btnSPM);
        toOLevel = findViewById(R.id.btnOLevel);
        toUEC = findViewById(R.id.btnUEC);

    }

    public void toSPMLevel(View view) {
        Intent intent = new Intent(this,SPM.class);
        startActivity(intent);
    }

    public void toOLevel(View view) {
        Intent intent = new Intent(this,OLevel.class);
        startActivity(intent);
    }

    public void toUECLevel(View view) {
        Intent intent = new Intent(this,UEC.class);
        startActivity(intent);
    }
}
