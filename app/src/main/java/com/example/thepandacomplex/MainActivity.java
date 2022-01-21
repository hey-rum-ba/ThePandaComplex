package com.example.thepandacomplex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.thepandacomplex.databinding.ActivityMainBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private DatabaseReference mDatabase;
    private ArrayList<FirebaseHelper>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mDatabase = FirebaseDatabase.getInstance().getReference("Rentee List");
        list = new ArrayList<>();

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    FirebaseHelper upload = postSnapshot.getValue(FirebaseHelper.class);
                    list.add(upload);
                }
                MainAdapter adapter = new MainAdapter( list , MainActivity.this);
                binding.renteesRecView.setAdapter(adapter);
                LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                binding.renteesRecView.setLayoutManager(layoutManager);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        binding.addRentee.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, AddNewRentee.class)));
        public interface OnListItemClick {
            void onClick(View view, int position);
        }
        OnListItemClick onListItemClick = new OnListItemClick() {
            @Override
            public void onClick(View view, int position) {
                // you will get click here
                // do your code here
            }
        };
        youradaptor.setClickListener(onListItemClick);
        public void setClickListener(OnListItemClick context) {
            this.onListItemClick = context;
        }
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onListItemClick.onClick(view, getAdapterPosition()); // passing click to interface
            }
        });
    }

}