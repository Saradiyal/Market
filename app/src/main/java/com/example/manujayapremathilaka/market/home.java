package com.example.manujayapremathilaka.market;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;

import com.spark.submitbutton.SubmitButton;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SubmitButton sb = (SubmitButton) findViewById(R.id.button6);
        sb.setOnClickListener(new View.OnClickListener() {
            public static final String TAG = "onclick";

            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Submit");
            }
        });
    }
    public void Admindashlog(View view){
        Intent dash = new Intent(home.this, dashboard.class);
        startActivity(dash);
    }

    
    }

