package com.example.thepandacomplex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder> {

    ArrayList<MainModel> list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context){
        this.list =list;
        this.context =context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rentee_list,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final MainModel model = list.get(position );
        holder.roomNo.setText(model.getRoomNo()+"");
        holder.name.setText(model.getName());
        holder.electricity.setText(model.getElectricity()+"");
        holder.lastRent.setText(model.getLastRent()+"");
        holder.noOfRentee.setText(model.getNoOfRentee()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,roomNo, lastRent,electricity,noOfRentee;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            roomNo = itemView.findViewById(R.id.roomNo);
            electricity = itemView.findViewById(R.id.electricity);
            noOfRentee = itemView.findViewById(R.id.noOfRentee);
            lastRent = itemView.findViewById(R.id.lastRent);
        }

    }
}
