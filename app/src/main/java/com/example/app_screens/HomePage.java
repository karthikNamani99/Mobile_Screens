package com.example.app_screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    LinearLayout next_page,next_page1,next_page2,next_page3,next_page4,next_page5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_main);


        next_page=(LinearLayout)findViewById(R.id.next_page);
        next_page1=(LinearLayout)findViewById(R.id.next_page1);
        next_page2=(LinearLayout)findViewById(R.id.next_page2);
        next_page3=(LinearLayout)findViewById(R.id.next_page3);
        next_page4=(LinearLayout)findViewById(R.id.next_page4);
        next_page5=(LinearLayout)findViewById(R.id.next_page5);

        next_page.setOnClickListener(this);
        next_page1.setOnClickListener(this);
        next_page2.setOnClickListener(this);
        next_page3.setOnClickListener(this);
        next_page4.setOnClickListener(this);
        next_page5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case  R.id.next_page:

                Intent next_page_intent=new Intent(getApplicationContext(),Screen_Activity.class);
                next_page_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(next_page_intent);

            break;
            case  R.id.next_page1:

                Intent next_page_intent1=new Intent(getApplicationContext(),Screen_Activity.class);
                next_page_intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(next_page_intent1);

                break;
            case  R.id.next_page2:

                Intent next_page_intent2=new Intent(getApplicationContext(),Screen_Activity.class);
                next_page_intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(next_page_intent2);

                break;
            case  R.id.next_page3:

                Intent next_page_intent3=new Intent(getApplicationContext(),MainActivity.class);
                next_page_intent3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(next_page_intent3);

                break;
            case  R.id.next_page4:

                Intent next_page_intent4=new Intent(getApplicationContext(),MainActivity.class);
                next_page_intent4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(next_page_intent4);

                break;
            case  R.id.next_page5:

                Intent next_page_intent5=new Intent(getApplicationContext(),MainActivity.class);
                next_page_intent5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(next_page_intent5);

                break;
        }
    }
}
