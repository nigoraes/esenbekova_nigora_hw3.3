package com.example.esenbekova_nigora_hw33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsHolder extends RecyclerView.ViewHolder {

    private TextView tv_cars;

    public CarsHolder(@NonNull View itemView) {
        super(itemView);
        tv_cars = itemView.findViewById(androidx.core.R.id.text);
    }
    public  void  bind(String name){
        tv_cars.setText(name);

    }
}
