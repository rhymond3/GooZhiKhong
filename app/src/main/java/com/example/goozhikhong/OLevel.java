package com.example.goozhikhong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class OLevel extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spm);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
    }


    public void btnSubmit(View view) {
        String message = getIntent().getStringExtra(Entry.EXTRA_MESSAGE);
        if(checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()){
            Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.successMessage), Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.unsuccessMessage), Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
