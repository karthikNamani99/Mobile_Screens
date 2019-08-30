package com.example.app_screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Medical_Record extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    String[] country = { "city","India", "USA", "China", "Japan", "Other"};
    private RecyclerView recyclerView;
    private Medical_Record_Adapter mAdapter;
    private List<Medicalrecord_List> medicalrecord_lists = new ArrayList<>();
    EditText editTextSearch;
    TextView back_btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical_record_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        back_btn=(TextView)findViewById(R.id.back_btn);

        back_btn.setOnClickListener(this);
        mAdapter = new Medical_Record_Adapter(medicalrecord_lists, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        editTextSearch = (EditText) findViewById(R.id.editTextSearch);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,country);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener1(getApplicationContext(), recyclerView, new RecyclerTouchListener1.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent mIntent;
                switch (position) {
                    case 0: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Clinic_History.class);
                        startActivity(mIntent);
                        break;
                    case 1: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Clinic_History.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Clinic_History.class);
                        startActivity(mIntent);
                        break;
                    case 3: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Clinic_History.class);
                        startActivity(mIntent);
                        break;
                    case 4: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Clinic_History.class);
                        startActivity(mIntent);
                        break;
                    case 5: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Clinic_History.class);
                        startActivity(mIntent);
                        break;

                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        prepareClincsData();


    }

    private void prepareClincsData() {
        Medicalrecord_List record_list = new Medicalrecord_List("01", "Mar 2019", "08:24am", "Yessin Clinic","Check Chest pain","Dr.Niguyen");
        medicalrecord_lists.add(record_list);

        record_list = new Medicalrecord_List("02", "Mar 2019", "08:24am", "Yessin Clinic","Check Chest pain","Dr.Niguyen");
        medicalrecord_lists.add(record_list);

        record_list = new Medicalrecord_List("08", "Mar 2019", "08:24am", "Yessin Clinic","Check Chest pain","Dr.Niguyen");
        medicalrecord_lists.add(record_list);

        record_list = new Medicalrecord_List("09", "Mar 2019", "08:24am", "Yessin Clinic","Check Chest pain","Dr.Niguyen");
        medicalrecord_lists.add(record_list);

        record_list = new Medicalrecord_List("12 ", "Mar 2019", "08:24am", "Yessin Clinic","Check Chest pain","Dr.Niguyen");
        medicalrecord_lists.add(record_list);

        record_list = new Medicalrecord_List("19", "Mar 2019", "08:24am", "Yessin Clinic","Check Chest pain","Dr.Niguyen");
        medicalrecord_lists.add(record_list);

        mAdapter.notifyDataSetChanged();

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.back_btn:

                Intent cancel_intent=new Intent(getApplicationContext(),MainActivity.class);
                cancel_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(cancel_intent);
                break;

        }
    }
}
