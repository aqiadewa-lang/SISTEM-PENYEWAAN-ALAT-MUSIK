package com.mycompany.sistem.penyewaan.alatmusik;

public class PenguatSuara {
    private String idAmpli;
    private String merk;
    private int dayaWatt;

    public PenguatSuara(String idAmpli, String merk, int dayaWatt) {
        this.idAmpli = idAmpli;
        this.merk = merk;
        this.dayaWatt = dayaWatt;
    }

    public String getIdAmpli() { return idAmpli; }
    public void setIdAmpli(String idAmpli) { this.idAmpli = idAmpli; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public int getDayaWatt() { return dayaWatt; }
    public void setDayaWatt(int dayaWatt) { this.dayaWatt = dayaWatt; }
}