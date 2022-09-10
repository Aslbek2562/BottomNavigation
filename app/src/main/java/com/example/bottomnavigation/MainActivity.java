package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnavigator);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case
                            R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new BlankFragment());
                        break;
                    case
                            R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new BlankFragment());
                        break;
                    case
                            R.id.add:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new BlankFragment());
                        break;
                    case
                            R.id.like:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new BlankFragment());
                        break;
                    case
                            R.id.profil:
                        getSupportFragmentManager().beginTransaction().replace(R.id.linerlayout1,new BlankFragment());
                        break;
                }
                return true;
            }
        });

    }
}