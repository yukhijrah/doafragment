package kumpulandoa.app.kumpulandoa.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import kumpulandoa.app.kumpulandoa.R;

public class AdzanHolder extends RecyclerView.ViewHolder {
    public TextView namaSholat;
    public TextView waktuSholat;

    public AdzanHolder(View itemView){
        super(itemView);
        namaSholat = (TextView) itemView.findViewById(R.id.txt_namaSholat);
        waktuSholat= (TextView) itemView.findViewById(R.id.txt_waktuSholat);

    }
}
