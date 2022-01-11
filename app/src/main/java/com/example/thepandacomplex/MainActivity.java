package com.example.thepandacomplex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
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
        mDatabase = FirebaseDatabase.getInstance().getReference();
        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(0, 56, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 55, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 54, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 53, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 52, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 51, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 50, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 59, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 58, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 57, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 84, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 59, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(0, 89, 60, 89, 56, "Madhu SK"));
        MainAdapter adapter = new MainAdapter(list, this);
        binding.renteesRecView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.renteesRecView.setLayoutManager(layoutManager);
        ChildEventListener childEventListener = new ChildEventListener() {
            private DataSnapshot snapshot;
            @Nullable
            private String previousChildName;

            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

                this.snapshot = snapshot;
                this.previousChildName = previousChildName;
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }


        };
    }


}