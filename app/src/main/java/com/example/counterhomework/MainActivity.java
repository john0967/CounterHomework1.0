package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private int count;
    TextView text1;
    TextView text2;
    Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            TextView viewById = (TextView) findViewById(R.id.textView);
            viewById.setText(savedInstanceState.getString("count"));

        }
        text1=(TextView)findViewById(R.id.textView);
       // text2=(TextView)findViewById(R.id.textView2);
        mybutton=(Button) findViewById(R.id.button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=Integer.parseInt(text1.getText().toString());
                count=count+1;
                text1.setText(Integer.toString(count));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView viewById = (TextView) findViewById(R.id.textView);
        outState.putString("count", (String) viewById.getText());
    }
}