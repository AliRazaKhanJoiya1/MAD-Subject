package com.example.fa16_bse_100_assi_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button addRec = findViewById(R.id.button3);
        Button serRec = findViewById(R.id.button4);

        addRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment newFragment = new Fragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout, newFragment);
                ft.commit();
                Intent myIntent = new Intent(MainActivity.this, Add.class);
                startActivity(myIntent);

            }
        });

        serRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment newFragment = new Fragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout, newFragment);
                ft.commit();
                Intent myIntent = new Intent(MainActivity.this, Search.class);
                startActivity(myIntent);
            }
        });
    }
}
