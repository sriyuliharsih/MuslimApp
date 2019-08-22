package koding.web.muslimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView produkhalal, jadwalsholat, doaharian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produkhalal = (TextView) findViewById(R.id.produkHalal);
        jadwalsholat = (TextView) findViewById(R.id.jadwalSholat);
        doaharian = (TextView) findViewById(R.id.doaHarian);

        produkhalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainHalal.class);
                startActivity(intent);
            }
        });

        jadwalsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainSholat.class);
                startActivity(intent);
            }
        });

        doaharian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainDoa.class);
                startActivity(intent);
            }
        });


    }
}