package com.example.goozhikhong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Entry extends AppCompatActivity {

    EditText editText;
    public static final String EXTRA_MESSAGE =
            "com.example.android.goozhikhong.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        editText = findViewById(R.id.editText);
    }

    public void toMain(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        if(message.length() != 0) {
            startActivity(intent);
        }
    }
}
