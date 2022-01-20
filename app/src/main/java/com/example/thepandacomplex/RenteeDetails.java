package com.example.thepandacomplex;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thepandacomplex.databinding.RenteeDetailsBinding;

public class RenteeDetails extends AppCompatActivity {
    RenteeDetailsBinding binding;

    @Override
    public void setContentView(View view) {
        super.setContentView(binding.getRoot());
    }
}
