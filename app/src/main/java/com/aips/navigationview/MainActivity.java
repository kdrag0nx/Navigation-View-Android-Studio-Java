package com.aips.navigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.home_menu:
                        Toast.makeText(MainActivity.this, "You clicked Home icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.dashboard:
                        Toast.makeText(MainActivity.this, "You clicked  Dashboard icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.share:
                        Toast.makeText(MainActivity.this, "Your clicked Share icon", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }

            }
        });

    }
}