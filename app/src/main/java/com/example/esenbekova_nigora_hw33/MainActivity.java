package com.example.esenbekova_nigora_hw33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.esenbekova_nigora_hw33.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private ArrayList<String> carsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        CarsAdapter adapter = new CarsAdapter(carsList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carsList.add("Mers");
        carsList.add("Matiz");
        carsList.add("Honda");
        carsList.add("BMW");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");
        carsList.add("Tayota");


    }

}
