package com.example.app_screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class Clinics_Adapter extends RecyclerView.Adapter<Clinics_Adapter.MyViewHolder> {

    private List<Clinics_List> clinics_lists ;
    private Context context;

    public Clinics_Adapter(List<Clinics_List> clinics_lists, Context mContext) {
        this.clinics_lists = clinics_lists;
        this.context = mContext;
    }






    public void filterList(List<Clinics_List> filterdNames) {
        this.clinics_lists = filterdNames;
        notifyDataSetChanged();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public CircularImageView ofc_logo;
        public TextView clinic_name;
        public TextView clinic_religion;
        public TextView image_rating;
        public TextView location_name;

        public MyViewHolder(View view) {
            super(view);
            clinic_name = (TextView) view.findViewById(R.id.clinic_name);
            ofc_logo = (CircularImageView) view.findViewById(R.id.ofc_logo);
            clinic_religion = (TextView) view.findViewById(R.id.clinic_religion);
            image_rating = (TextView) view.findViewById(R.id.image_rating);
            location_name = (TextView) view.findViewById(R.id.location_name);
        }
    }


    @Override
    public Clinics_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.clinics_listitems_main, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(Clinics_Adapter.MyViewHolder holder, int position) {
        Clinics_List event = clinics_lists.get(position);
        holder.clinic_name.setText(event.getClinic_name());
        holder.ofc_logo.setImageResource(event.getOfc_logo());
        holder.clinic_religion.setText(event.getClinic_religion());
        holder.image_rating.setText(event.getImage_rating());
        holder.location_name.setText(event.getLocation_name());

    }

    @Override
    public int getItemCount() {
        return clinics_lists.size();
    }


}
