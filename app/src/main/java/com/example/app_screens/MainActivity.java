package com.example.app_screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country = { "city","India", "USA", "China", "Japan", "Other"};
    private RecyclerView recyclerView;
    private Clinics_Adapter mAdapter;
    private List<Clinics_List> clinics_lists = new ArrayList<>();
    EditText editTextSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new Clinics_Adapter(clinics_lists, this);
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
                        mIntent = new Intent(getApplicationContext(), Medical_Record.class);
                        startActivity(mIntent);
                        break;
                    case 1: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Medical_Record.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Medical_Record.class);
                        startActivity(mIntent);
                        break;
                    case 3: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Medical_Record.class);
                        startActivity(mIntent);
                        break;
                    case 4: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Medical_Record.class);
                        startActivity(mIntent);
                        break;
                    case 5: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), Medical_Record.class);
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
        Clinics_List clinc = new Clinics_List("Yersin Clinic ", "", " VR Sunshine Apartment, Flat no:101, Patrika Nagar, Street No: 3, Madhapur, Hyderabad", "International Clinic", R.drawable.icon);
        clinics_lists.add(clinc);

        clinc = new Clinics_List("FV Saigon Clinic ", "", " VR Sunshine Apartment, Flat no:101, Patrika Nagar, Street No: 3, Madhapur, Hyderabad", "International Clinic", R.drawable.icon);
        clinics_lists.add(clinc);

        clinc = new Clinics_List("Yersin Clinic", "", " VR Sunshine Apartment, Flat no:101, Patrika Nagar, Street No: 3, Madhapur, Hyderabad", "International Clinic", R.drawable.icon);
        clinics_lists.add(clinc);

        clinc = new Clinics_List("FV Saigon Clinic", "", " VR Sunshine Apartment, Flat no:101, Patrika Nagar, Street No: 3, Madhapur, Hyderabad", "International Clinic", R.drawable.icon);
        clinics_lists.add(clinc);

        clinc = new Clinics_List("Yersin Clinic", "", " VR Sunshine Apartment, Flat no:101, Patrika Nagar, Street No: 3, Madhapur, Hyderabad", "International Clinic", R.drawable.icon);
        clinics_lists.add(clinc);

        clinc = new Clinics_List("FV Saigon Clinic", "", " VR Sunshine Apartment, Flat no:101, Patrika Nagar, Street No: 3, Madhapur, Hyderabad", "International Clinic", R.drawable.icon);
        clinics_lists.add(clinc);

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
}

