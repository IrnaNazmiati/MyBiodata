package com.example.irna.mybiodata;

import java.util.List;

public class  Biodata {
    private String nama;
    private List<Alamat> alamat;
    private List<String> hobi;
    private List<String> pekerjaan;
    private String foto;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Alamat> getAlamat() {
        return alamat;
    }

    public void setAlamat(List<Alamat> alamat) {
        this.alamat = alamat;
    }

    public List<String> getHobi() {
        return hobi;
    }

    public void setHobi(List<String> hobi) {
        this.hobi = hobi;
    }

    public List<String> getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(List<String> pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
