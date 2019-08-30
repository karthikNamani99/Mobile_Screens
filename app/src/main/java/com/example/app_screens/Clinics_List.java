package com.example.app_screens;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Clinics_List {
    private String clinic_name, image_rating,clinic_religion,location_name;
    private int ofc_logo;



    public Clinics_List(String clinic_name,String image_rating,String location_name,String clinic_religion, int ofc_logo) {
        this.clinic_name = clinic_name;
        this.image_rating = image_rating;
        this.location_name = location_name;
        this.clinic_religion = clinic_religion;
        this.ofc_logo = ofc_logo;

    }

    public String getClinic_name() {
        return clinic_name;
    }

    public void setClinic_name(String clinic_name) {
        this.clinic_name = clinic_name;
    }

    public int getOfc_logo() {
        return ofc_logo;
    }

    public void setOfc_logo(int ofc_logo) {
        this.ofc_logo = ofc_logo;
    }


    public String getClinic_religion() {
        return clinic_religion;
    }

    public void setClinic_religion(String clinic_religion) {
        this.clinic_religion = clinic_religion;
    }
    public String getImage_rating() {
        return image_rating;
    }

    public void setImage_rating(String image_rating) {
        this.image_rating = image_rating;
    }



    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

}
