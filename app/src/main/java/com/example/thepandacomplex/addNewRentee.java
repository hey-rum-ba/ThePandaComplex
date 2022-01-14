package com.example.thepandacomplex;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thepandacomplex.databinding.AddNewRenteeBinding;

public class addNewRentee extends AppCompatActivity {
    AddNewRenteeBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AddNewRenteeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
