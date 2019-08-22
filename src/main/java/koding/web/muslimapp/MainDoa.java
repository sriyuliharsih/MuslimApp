package koding.web.muslimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainDoa extends AppCompatActivity {

    private Button doahati, doatawadhu, doanabiyusuf, doatidur, doabanguntdur, doamakan, doaselpasmkn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);
        doahati = (Button) findViewById(R.id.btn_doa_menenangkan_hati);
        doahati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaMenenangkanHati.class);
                startActivity(intent);
            }
        });

        doatawadhu = (Button) findViewById(R.id.btn_doa_tawadhu);
        doatawadhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaTawadhu.class);
                startActivity(intent);
            }
        });

        doanabiyusuf = (Button) findViewById(R.id.btn_doa_keturunan);
        doanabiyusuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaNabiYusuf.class);
                startActivity(intent);
            }
        });

        doatidur = (Button)findViewById(R.id.btn_doa_tidur);
        doatidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaSebelumTidur.class);
                startActivity(intent);
            }
        });

        doabanguntdur = (Button) findViewById(R.id.btn_doa_bangun_tidur);
        doabanguntdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaBangunTidur.class);
                startActivity(intent);
            }
        });

        doamakan = (Button) findViewById(R.id.btn_doa_makan);
        doamakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaMauMakan.class);
                startActivity(intent);
            }
        });

        doaselpasmkn = (Button) findViewById(R.id.btn_doa_selepas_makan);
        doaselpasmkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDoa.this, DoaSelepasMakan.class);
                startActivity(intent);
            }
        });
    }


}
