package kumpulandoa.app.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import kumpulandoa.app.kumpulandoa.model.ModelDoa;

/**
 * Created by Umair on 11/11/2018.
 */


public class DetailActivity extends AppCompatActivity {
    TextView namaDoa, arabDoa, latinDoa, artiDoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namaDoa = (TextView)findViewById(R.id.namaDoa);
        arabDoa = (TextView)findViewById(R.id.arabDoa);
        latinDoa = (TextView)findViewById(R.id.latinDoa);
        artiDoa = (TextView)findViewById(R.id.artiDoa);

        ModelDoa doa = (ModelDoa) getIntent().getSerializableExtra("id_doa");

        namaDoa.setText(doa.getNamaDoa());
        arabDoa.setText(doa.getArabDoa());
        latinDoa.setText(doa.getLatinDoa());
        artiDoa.setText(doa.getArtiDoa());
    }
}