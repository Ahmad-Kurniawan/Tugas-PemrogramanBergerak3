package com.example.recycleview;

public class Nama {
    private String nama;
    private String nim;
    private int gambar;

    public Nama(String nama, String nim, int gambar) {
        this.nama = nama;
        this.nim = nim;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getGambar() {
        return gambar;
    }
}
