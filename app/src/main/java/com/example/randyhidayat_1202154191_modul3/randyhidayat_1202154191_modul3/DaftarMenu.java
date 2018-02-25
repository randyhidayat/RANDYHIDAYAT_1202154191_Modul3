package com.example.randyhidayat_1202154191_modul3.randyhidayat_1202154191_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<MinumanItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<MinumanItem> isi(){
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("AQUA","Air Mineral Dalam Kemasan merk Aqua","Aqua adalah air mineral yang sudah ada dari lama dan terkenal sehingga menjadi favorit di banyak kalangan",R.drawable.aqua));
        data.add(new MinumanItem("AMIDIS","Air Mineral Dalam Kemasan merk Amidis","Amidis adalah Air mineral yang sangat rasis",R.drawable.amidis));
        data.add(new MinumanItem("CLEO","Air Mineral Dalam Kemasan merk Cleo","Cleo adalah salah  satu air mineral yang sama tuanya seperti Aqua",R.drawable.cleo));
        data.add(new MinumanItem("CLUB","Air Mineral Dalam Kemasan merk Club","Club Adalah salah satu air mineral yang sama tuanya juga seperti Aqua dan Cleo",R.drawable.club));
        data.add(new MinumanItem("EQUIL","Air Mineral Dalam Kemasan merk Equil","Equil adalah air mineral yang cukup banyak diminum di kalangan menengah atas dan very-very overprice",R.drawable.equil));
        data.add(new MinumanItem("EVIAN","Air Mineral Dalam Kemasan merk Evian","Evian adalah air mineral yang sangat jarang, bahkan saya aja tidak tau",R.drawable.evian));
        data.add(new MinumanItem("LE MINERALE","Air Mineral Dalam Kemasan merk Le Minerale","Le Minerale adalah air mineral yang baru keluar, rasanya kayak ada manis-manisnya",R.drawable.leminerale));
        data.add(new MinumanItem("NESTLE","Air Mineral Dalam Kemasan merk Nestle","Nestle Purelife adalah air mineral yang termasuk mahal juga",R.drawable.nestle));
        data.add(new MinumanItem("PRISTINE","Air Mineral Dalam Kemasan merk Pristine","Pristine adalah air mineral yang enak tapi overprice",R.drawable.pristine));
        data.add(new MinumanItem("VIT","Air Mineral Dalam Kemasan merk Vit","Vit adalah air mineral dalam kemasan yang termasuk murah dan lumayan enak. Baru-baru ini ada kasus orang yang menjual Vit kemasan cup seharga 2000 rupiah di Gd. B",R.drawable.vit));
        return data;
    }
}
