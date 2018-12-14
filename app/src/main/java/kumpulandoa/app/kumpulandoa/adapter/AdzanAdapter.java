package kumpulandoa.app.kumpulandoa.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kumpulandoa.app.kumpulandoa.R;
import kumpulandoa.app.kumpulandoa.holder.AdzanHolder;
import kumpulandoa.app.kumpulandoa.model.ModelAdzan;

public class AdzanAdapter extends RecyclerView.Adapter<AdzanHolder> {

    private List<ModelAdzan> adzans = new ArrayList<>();
    public AdzanAdapter(List<ModelAdzan> adzans){
        this.adzans = adzans;
    }

    @Override
    public AdzanHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adzan, parent, false);
        final AdzanHolder adzanHolder = new AdzanHolder(itemView);

        return adzanHolder;
    }

    @Override
    public void onBindViewHolder(AdzanHolder holder, int position) {
        final ModelAdzan adzan = adzans.get(position);
        holder.namaSholat.setText(adzan.getNamaSholat());
        holder.waktuSholat.setText(adzan.getWaktuSholat());
    }

    @Override
    public int getItemCount() {
        return adzans.size();
    }
}