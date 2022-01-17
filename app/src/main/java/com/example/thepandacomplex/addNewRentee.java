package com.example.thepandacomplex;

import static android.util.Log.*;
import static androidx.constraintlayout.widget.ConstraintLayoutStates.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thepandacomplex.databinding.AddNewRenteeBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.nio.file.ClosedFileSystemException;

public class addNewRentee extends AppCompatActivity {
    AddNewRenteeBinding binding;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AddNewRenteeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Rentee List");

        binding.submit.setOnClickListener(view -> {
            String name = binding.renteeNameInNewRentee.getText().toString();
            int lastDate = binding.lastRentInNewRentee.getDayOfMonth();
            int noOfRentee =  Integer.parseInt(binding.noOfRenteesInNewRentee.getText().toString()) ;
            int electricity =  Integer.parseInt(binding.meterReading2InNewRentee.getText().toString()) -
                    Integer.parseInt(binding.meterReading1InNewRentee.getText().toString());
            d(TAG, "name :"+ name);
            addDataToFireBase(name,lastDate,noOfRentee,electricity);
            startActivity(new Intent(addNewRentee.this, MainActivity.class));
        });

    }
    private void addDataToFireBase(String name, int lastDate, int noOfRentee, int electricity){
        d(TAG, "name is here too");
        d(TAG, "name here is :"+name);
        d(TAG, "name here is1 :"+lastDate);
        d(TAG, "name here is2 :"+noOfRentee);
        d(TAG, "name here is3 :"+electricity);

        FirebaseHelper helper= new FirebaseHelper(name,lastDate,noOfRentee,electricity);
        String uploadID = databaseReference.push().getKey();
        databaseReference.child(uploadID).setValue(helper).addOnSuccessListener(v->
                Toast.makeText(addNewRentee.this, "Data added success", Toast.LENGTH_SHORT).show());

    }
}

