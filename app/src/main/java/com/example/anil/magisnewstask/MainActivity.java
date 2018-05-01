package com.example.anil.magisnewstask;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(getResources().getString(R.string.text_left));
        }

        loadFragment(new NewsFragment());

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.action_haber_listesi:
                        if(getSupportActionBar() != null){
                            getSupportActionBar().setTitle(getResources().getString(R.string.text_left));
                        }
                        fragment = new NewsFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.action_hakkinda:
                        if(getSupportActionBar() != null){
                            getSupportActionBar().setTitle(getResources().getString(R.string.text_right));
                        }
                        fragment = new AboutFragment();
                        loadFragment(fragment);
                        break;
                }
                return false;
            }
        });


    }
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
