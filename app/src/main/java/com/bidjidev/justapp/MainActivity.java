package com.bidjidev.justapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int jumlah = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pesan(View v){
        tampilHarga(jumlah * 3000);
    }
    public void tambah(View v){
        jumlah = jumlah + 1;
        tampilJumlah(jumlah);
    }
    public void kurang(View v){
        jumlah = jumlah - 1;
        tampilJumlah(jumlah);
    }
    private void tampilJumlah(int jumlah){
        TextView txtJumlah = (TextView)findViewById(R.id.txtJumlah);
        txtJumlah.setText("" + jumlah );
    }
    private void tampilHarga(int harga){

        TextView txtHarga = (TextView)findViewById(R.id.txtHarga);
        txtHarga.setText(harga + "");
    }
}
