package com.example.thepandacomplex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.thepandacomplex.databinding.ActivityMainBinding;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.image, 56, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.image, 55, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.image, 54, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.image, 53, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.image, 52, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.image, 51, 60, 89, 56, "Madhu SK"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.renteesRecView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.renteesRecView.setLayoutManager(layoutManager);

        binding.addRentee.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, addNewRentee.class)));

    }



}