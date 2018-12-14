package kumpulandoa.app.kumpulandoa.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kumpulandoa.app.kumpulandoa.R;

public class ProfileFragment extends Fragment {

    public TextView namaLengkap;
    public TextView ttl;
    public TextView nim;
    public TextView prodi;
    public TextView kampus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        namaLengkap = (TextView) view.findViewById(R.id.txt_namaLengkap);
        ttl = (TextView) view.findViewById(R.id.txt_ttl);
        nim = (TextView) view.findViewById(R.id.txt_nim);
        prodi = (TextView) view.findViewById(R.id.txt_prodi);
        kampus = (TextView) view.findViewById(R.id.txt_kampus);


        namaLengkap.setText(R.string.namalengkap);
        ttl.setText(R.string.ttl);
        nim.setText(R.string.nim);
        prodi.setText(R.string.prodi);
        kampus.setText(R.string.kampus);


    }
}