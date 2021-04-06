package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import android.os.Bundle;

public class ActivityLihatData extends AppCompatActivity  {
    TextView tvnama,tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKotak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah");
                tvnomor.setText("082378557815");
                break;
            case "Ilham":
                tvnama.setText("Ilham");
                tvnomor.setText("082378557815");
                break;
            case "Eris":
                tvnama.setText("Eris");
                tvnomor.setText("082378557815");
                break;
            case "Fikri":
                tvnama.setText("Fikri");
                tvnomor.setText("082378557815");
                break;
            case "Maul":
                tvnama.setText("Maul");
                tvnomor.setText("082378557815");
                break;
            case "Intan":
                tvnama.setText("Intan");
                tvnomor.setText("082378557815");
                break;
            case "Vina":
                tvnama.setText("Vina");
                tvnomor.setText("082378557815");
                break;
            case "Gita":
                tvnama.setText("Gita");
                tvnomor.setText("082378557815");
                break;
            case "Vian":
                tvnama.setText("Vian");
                tvnomor.setText("082378557815");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi");
                tvnomor.setText("082378557815");
                break;
        }
    }
}