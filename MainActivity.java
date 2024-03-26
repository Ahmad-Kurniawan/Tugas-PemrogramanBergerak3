package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private classPenghubung classPenghubung;
    private List<Nama> NamaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        NamaList = new ArrayList<>();
        NamaList.add(new Nama("Nama: Abmi Sukma Edri","Nim: 1205012o0341",R.drawable.abmi));
        NamaList.add(new Nama("Nama: Ahmad Kurniawan","Nim: 12250111514",R.drawable.ahmad));
        NamaList.add(new Nama("Nama: Aufa Hajati","Nim: 12250120338",R.drawable.aufa));
        NamaList.add(new Nama("Nama: Daffa Finanda","Nim: 12250111603",R.drawable.finanda));
        NamaList.add(new Nama("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979",R.drawable.ikhwan));
        NamaList.add(new Nama("Nama: Diki Afdol","Nim: 112250110383",R.drawable.z));
        NamaList.add(new Nama("Nama: Dwi Jelita Adhliyah","Nim: 12250120331",R.drawable.jelita));
        NamaList.add(new Nama("Nama: Dwi Mahdini","Nim: 12250111298",R.drawable.dwi));
        NamaList.add(new Nama("Nama: Fajri","Nim: 1225011082",R.drawable.fajri));
        NamaList.add(new Nama("Nama: Farras Lathief","Nim: 12250111328",R.drawable.farras));
        NamaList.add(new Nama("Nama: Gilang Ramadhan Indra","Nim: 12250111323",R.drawable.gilang));
        NamaList.add(new Nama("Nama: Hafidz Alhadid Rahman","Nim: 12250111794",R.drawable.z));
        NamaList.add(new Nama("Nama: Haritsah Naufaldy","Nim: 12250110361",R.drawable.aldy));
        NamaList.add(new Nama("Nama: M. Nabil Dawami","Nim: 12250111527",R.drawable.nabil));
        NamaList.add(new Nama("Nama: M. Zaki Erbay Syas","Nim: 12250111134",R.drawable.zaki));
        NamaList.add(new Nama("Nama: Muhammad Aditya Rinaldi","Nim: 12250111048",R.drawable.adit));
        NamaList.add(new Nama("Nama: Muhammad Dhimas Hadid","Nim: 12250111231",R.drawable.dhimas));
        NamaList.add(new Nama("Nama: Muhammad Rafly Wirayudha","Nim: 12250111489",R.drawable.rafly));
        NamaList.add(new Nama("Nama: Nurika Dwi Wahyuni","Nim: 12250120360",R.drawable.nurika));
        NamaList.add(new Nama("Nama: Ogya Secio Noegroho.s","Nim: 12250111346",R.drawable.ogi));
        NamaList.add(new Nama("Nama: Rahma Laksita","Nim:12250124357",R.drawable.rahma));
        NamaList.add(new Nama("Nama: Nama: Raka Sabri","Nim: 12250110342",R.drawable.z));
        NamaList.add(new Nama("Nama: Surya Hidayatullah Firdaus","Nim: 12250111759",R.drawable.surya));

        classPenghubung = new classPenghubung(this, NamaList, this::onItemClick);
        recyclerView.setAdapter(classPenghubung);
    }
    public void onItemClick(View view, int position) {
        Nama Nama = NamaList.get(position);

        Intent intent = new Intent(MainActivity.this, Tampilan.class);
        intent.putExtra("image", Nama.getGambar());
        intent.putExtra("name", Nama.getNama());
        intent.putExtra("nim", Nama.getNim());
        startActivity(intent);
    }
}

