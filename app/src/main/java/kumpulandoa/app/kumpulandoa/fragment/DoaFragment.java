package kumpulandoa.app.kumpulandoa.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

import kumpulandoa.app.kumpulandoa.R;
import kumpulandoa.app.kumpulandoa.adapter.DoaAdapter;
import kumpulandoa.app.kumpulandoa.model.ModelDoa;

public class DoaFragment extends Fragment{

    private List<ModelDoa> doas = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doa, container, false);

    }

    //    TODO(parameter view untuk casting)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.lst_doa);

        DoaCollection();

        DoaAdapter adapter = new DoaAdapter(doas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    public void DoaCollection(){
        doas.add(new ModelDoa("Doa Sebelum Makan", "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar","Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka"));
        doas.add(new ModelDoa("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru","Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan"));
        doas.add(new ModelDoa("Doa Ketika Mendapat Mimpi Baik","اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati","Segala puji bagi Allah yang telah memberi hajatku"));
        doas.add(new ModelDoa("Doa Sesudah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ","Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin","Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam"));
        doas.add(new ModelDoa("Doa Sesudah Minum","اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَا","Alhamdu lillaahil ladzi ja'alahuu 'adzbam furootam birohmatihii wa lamyaj'alhu milhan ujaajam bidzunuubinaa","Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami"));

        doas.add(new ModelDoa("Sebelum Tidur","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ" ,"Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati","Bismikallohumma ahya wa amuutu" ));
        doas.add(new ModelDoa("Doa Ketika Mimpi Buruk","اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ","Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami","Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk"));
        doas.add(new ModelDoa("Doa Masuk Kamar Mandi Atau Toilet","اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ","Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi","Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan setan perempuan"));
        doas.add(new ModelDoa("Doa Keluar Kamar Mandi Atau Toilet","غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ","Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaanii","Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan."));
        doas.add(new ModelDoa("Doa Ketika Bercermin","اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ","Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii","Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"));

    }
}
