package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class classPenghubung extends RecyclerView.Adapter<classPenghubung.NamaViewHolder>{
    private Context context;
    private List<Nama> NamaList;
    private ItemClickListener itemClickListener;
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public classPenghubung(Context context, List<Nama> NamaList, ItemClickListener itemClickListener) {
        this.context = context;
        this.NamaList = NamaList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public NamaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_result, parent, false);
        return new NamaViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull NamaViewHolder holder, int position) {
        Nama Nama = NamaList.get(position);
        holder.namaTextView.setText(Nama.getNama());
        holder.nimTextView.setText(Nama.getNim());
        holder.imageView.setImageResource(Nama.getGambar());
    }

    @Override
    public int getItemCount() {
        return NamaList.size();
    }

    public class NamaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView namaTextView, nimTextView;
        ImageView imageView;
        ItemClickListener itemClickListener;

        public NamaViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            namaTextView = itemView.findViewById(R.id.name);
            nimTextView = itemView.findViewById(R.id.nim);
            imageView = itemView.findViewById(R.id.imageview);
            this.itemClickListener = itemClickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onItemClick(v, getAdapterPosition());
        }
    }
}
