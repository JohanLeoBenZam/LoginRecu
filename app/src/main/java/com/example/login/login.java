package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView fondo = findViewById(R.id.taco);
        MaterialButton login = findViewById(R.id.login);

        Glide.with(this)
                .load("https://www.fromvalerieskitchen.com/wordpress/wp-content/uploads/2021/04/Easy-Ground-Beef-Tacos-edit-40.jpg")
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(fondo);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, mainscreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}