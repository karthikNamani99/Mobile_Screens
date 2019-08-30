package com.example.app_screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class Medical_Record_Adapter extends RecyclerView.Adapter<Medical_Record_Adapter.MyViewHolder> {

private List<Medicalrecord_List> medicalrecord_lists ;
private Context context;

public Medical_Record_Adapter(List<Medicalrecord_List> medicalrecord_lists, Context mContext) {
        this.medicalrecord_lists = medicalrecord_lists;
        this.context = mContext;
        }


public void filterList(List<Medicalrecord_List> filterdNames) {
        this.medicalrecord_lists = filterdNames;
        notifyDataSetChanged();
        }


public class MyViewHolder extends RecyclerView.ViewHolder {
    public CircularImageView file_create,file_delete;

    public TextView date,year_month,time,clinic_name,disease,dr_name;


    public MyViewHolder(View view) {
        super(view);
        date = (TextView) view.findViewById(R.id.date);
        year_month = (TextView) view.findViewById(R.id.year_month);
        time = (TextView) view.findViewById(R.id.time);
        clinic_name = (TextView) view.findViewById(R.id.clinic_name);
        disease = (TextView) view.findViewById(R.id.disease);
        dr_name = (TextView) view.findViewById(R.id.dr_name);

    }
}


    @Override
    public Medical_Record_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.medicalrecord_listitems_main, parent, false);

        Medical_Record_Adapter.MyViewHolder myViewHolder = new Medical_Record_Adapter.MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(Medical_Record_Adapter.MyViewHolder holder, int position) {
        Medicalrecord_List event = medicalrecord_lists.get(position);
        holder.date.setText(event.getDate());
        holder.year_month.setText(event.getYear_month());
        holder.time.setText(event.getTime());
        holder.clinic_name.setText(event.getclinic_name());
        holder.disease.setText(event.getDisease());
        holder.dr_name.setText(event.getDr_name());

    }

    @Override
    public int getItemCount() {
        return medicalrecord_lists.size();
    }


}
