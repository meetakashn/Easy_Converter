package com.example.easyconverter;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity {
    BottomNavigationView naviview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        naviview=findViewById(R.id.navview);
        getSupportFragmentManager().beginTransaction().replace(R.id.Container,new FLength()).commit();
        naviview.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case (R.id.Length):
                    getSupportFragmentManager().beginTransaction().replace(R.id.Container,new FLength()).commit();
                    break;
                case (R.id.weight):
                    getSupportFragmentManager().beginTransaction().replace(R.id.Container,new FWeight()).commit();
                    break;
                case (R.id.Home):
                    getSupportFragmentManager().beginTransaction().replace(R.id.Container,new FHome()).commit();
                    break;
                case (R.id.Currency):
                    getSupportFragmentManager().beginTransaction().replace(R.id.Container,new FCurrency()).commit();
                    break;
                case (R.id.temp):
                    getSupportFragmentManager().beginTransaction().replace(R.id.Container,new FTemp()).commit();
                    break;
            }
            return true;
        });
    }
}