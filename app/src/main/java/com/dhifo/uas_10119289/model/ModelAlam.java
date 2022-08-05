package com.dhifo.uas_10119289.model;

import java.io.Serializable;
public class ModelAlam implements Serializable {
    String desc, alamat, nama, kota, jam, image;
    Long id;
    double latitude, longitude;

    public ModelAlam(){}

    public ModelAlam(Long idWisata, String Nama, String Desc, String Alamat, String KotaAlam, String JamOperasional, String Gambar) {
        this.nama = Nama;
        this.desc = Desc;
        this.alamat = Alamat;
        this.jam = JamOperasional;
        this.id = idWisata;
        this.kota = KotaAlam;
        this.image = Gambar;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setId(Long id) { this.id = id; }

    public void setDesc(String desc) { this.desc = desc; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public void setImage(String image) { this.image = image; }

    public Long getId() { return id; }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() { return alamat; }

    public String getDesc() { return desc; }

    public String getImage() { return image; }

    public String getKota() {
        return kota;
    }

    public String getJam() {
        return jam;
    }

}
