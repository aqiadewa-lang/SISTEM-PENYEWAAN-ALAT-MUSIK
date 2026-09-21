package com.mycompany.sistem.penyewaan.alatmusik;

public class PeralatanSoundSystem {
    private String idSound;
    private String jenisAlat;
    private double hargaSewa;

    public PeralatanSoundSystem(String idSound, String jenisAlat, double hargaSewa) {
        this.idSound = idSound;
        this.jenisAlat = jenisAlat;
        this.hargaSewa = hargaSewa;
    }

    public String getIdSound() { return idSound; }
    public void setIdSound(String idSound) { this.idSound = idSound; }

    public String getJenisAlat() { return jenisAlat; }
    public void setJenisAlat(String jenisAlat) { this.jenisAlat = jenisAlat; }

    public double getHargaSewa() { return hargaSewa; }
    public void setHargaSewa(double hargaSewa) { this.hargaSewa = hargaSewa; }
}