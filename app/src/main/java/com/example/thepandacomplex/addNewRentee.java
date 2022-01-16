package com.example.thepandacomplex;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thepandacomplex.databinding.AddNewRenteeBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addNewRentee extends AppCompatActivity {
    AddNewRenteeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AddNewRenteeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DatabaseReference instance = FirebaseDatabase.getInstance().getReference("Rentee List");


    }
}
