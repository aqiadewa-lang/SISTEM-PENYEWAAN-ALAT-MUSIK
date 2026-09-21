package com.mycompany.sistem.penyewaan.alatmusik;

public class InstrumenMusik {
    private String idAlat;
    private String merk;
    private double hargaSewaPerHari;

    public InstrumenMusik(String idAlat, String merk, double hargaSewaPerHari) {
        this.idAlat = idAlat;
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public String getIdAlat() { return idAlat; }
    public void setIdAlat(String idAlat) { this.idAlat = idAlat; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public double getHargaSewaPerHari() { return hargaSewaPerHari; }
    public void setHargaSewaPerHari(double hargaSewaPerHari) { this.hargaSewaPerHari = hargaSewaPerHari; }

    public String getDetail() {
        return "[" + idAlat + "] " + merk + " - Rp" + hargaSewaPerHari + "/hari";
    }
}