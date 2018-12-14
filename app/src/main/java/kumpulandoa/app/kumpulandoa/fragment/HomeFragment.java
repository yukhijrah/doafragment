package kumpulandoa.app.kumpulandoa.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kumpulandoa.app.kumpulandoa.R;
import kumpulandoa.app.kumpulandoa.adapter.AdzanAdapter;
import kumpulandoa.app.kumpulandoa.model.ModelAdzan;

public class HomeFragment extends Fragment {

    private List<ModelAdzan> adzans = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.lst_adzan);

        adzanCollection();

        AdzanAdapter adapter = new AdzanAdapter(adzans);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void adzanCollection(){
        adzans.add(new ModelAdzan("Shubuh","04:05"));
        adzans.add(new ModelAdzan("Dzuhur","11:39"));
        adzans.add(new ModelAdzan("Ashar","15:01"));
        adzans.add(new ModelAdzan("Maghrib","17:51"));
        adzans.add(new ModelAdzan("Isya","19:04"));
    }
}
