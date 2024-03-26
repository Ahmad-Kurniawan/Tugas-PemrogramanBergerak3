package com.example.recycleview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recycleview.R;

public class Tampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nama_tampilan);

        ImageView imageView = findViewById(R.id.imageview);
        TextView nameTextView = findViewById(R.id.name);
        TextView nimTextView = findViewById(R.id.nim);

        int imageResource = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String nim = getIntent().getStringExtra("nim");

        imageView.setImageResource(imageResource);
        nameTextView.setText(name);
        nimTextView.setText(nim);
    }
}

