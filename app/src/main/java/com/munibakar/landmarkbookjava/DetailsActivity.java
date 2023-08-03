package com.munibakar.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.munibakar.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        //Casting
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.Name.setText(selectedLandmark.name);
        binding.country.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}