package com.example.app_screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Clinic_History extends AppCompatActivity implements View.OnClickListener {

    TextView cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clinic_history);

        cancel=(TextView)findViewById(R.id.cancel);

        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.cancel:

                Intent cancel_intent=new Intent(getApplicationContext(),Medical_Record.class);
                cancel_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(cancel_intent);
                break;
        }
    }
}
