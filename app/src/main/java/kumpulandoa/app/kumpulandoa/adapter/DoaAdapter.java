package kumpulandoa.app.kumpulandoa.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kumpulandoa.app.kumpulandoa.DetailActivity;
import kumpulandoa.app.kumpulandoa.R;
import kumpulandoa.app.kumpulandoa.holder.DoaHolder;
import kumpulandoa.app.kumpulandoa.model.ModelDoa;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<ModelDoa> doas;

    public DoaAdapter(List<ModelDoa> doas){
        this.doas = doas;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, parent, false);
        final DoaHolder doaHolder1 = new DoaHolder(itemView);
        doaHolder1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = doaHolder1.getAdapterPosition();
                Intent intent = new Intent(doaHolder1.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", doas.get(position));

                doaHolder1.itemView.getContext().startActivity(intent);
            }
        });

        //return doaHolder1;
        return doaHolder1;

    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        final ModelDoa doa = doas.get(position);
        holder.namaDoa.setText(doa.getNamaDoa());
        holder.artiDoa.setText(doa.getArtiDoa());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}