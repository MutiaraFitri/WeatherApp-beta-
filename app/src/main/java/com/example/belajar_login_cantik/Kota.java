package com.example.belajar_login_cantik;

public class Kota {

    private String nama;
    private String suhu;
    private String background;

    public Kota(String nama, String suhu, String background) {
        this.nama = nama;
        this.suhu = suhu;
        this.background = background;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSuhu() {
        return suhu;
    }

    public void setSuhu(String npm) {
        this.suhu = suhu;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}