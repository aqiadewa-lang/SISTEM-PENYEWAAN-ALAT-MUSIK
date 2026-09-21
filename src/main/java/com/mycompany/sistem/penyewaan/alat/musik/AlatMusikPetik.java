package com.mycompany.sistem.penyewaan.alatmusik;

public class AlatMusikPetik extends InstrumenMusik {
    private int jumlahSenar;

    public AlatMusikPetik(String idAlat, String merk, double hargaSewaPerHari, int jumlahSenar) {
        super(idAlat, merk, hargaSewaPerHari);
        this.jumlahSenar = jumlahSenar;
    }

    public int getJumlahSenar() { return jumlahSenar; }
    public void setJumlahSenar(int jumlahSenar) { this.jumlahSenar = jumlahSenar; }

    @Override
    public String getDetail() {
        return super.getDetail() + " | Jenis: Petik | Senar: " + jumlahSenar;
    }
}