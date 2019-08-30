package com.example.app_screens;

public class Medicalrecord_List {

    private String date, year_month,time,clinic_name,disease,dr_name;



    public Medicalrecord_List(String date,String year_month,String time,String clinic_name,String disease,String dr_name) {
        this.date = date;
        this.year_month = year_month;
        this.time = time;
        this.clinic_name = clinic_name;
        this.disease = disease;
        this.dr_name = dr_name;


    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear_month() {
        return year_month;
    }

    public void setYear_month(String year_month) {
        this.year_month = year_month;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getclinic_name() {
        return clinic_name;
    }

    public void setClinic_name(String clinic_name) {
        this.clinic_name = clinic_name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

}
