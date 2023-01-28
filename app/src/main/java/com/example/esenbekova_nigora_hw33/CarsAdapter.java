package com.example.esenbekova_nigora_hw33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CarsAdapter extends RecyclerView.Adapter<CarsHolder> {
    private ArrayList<String> carList;

    public CarsAdapter(ArrayList<String> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_cars, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsHolder holder, int position) {
        holder.bind(carList.get(position));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
