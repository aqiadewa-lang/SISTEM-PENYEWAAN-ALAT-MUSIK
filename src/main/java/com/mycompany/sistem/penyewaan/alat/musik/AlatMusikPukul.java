package com.mycompany.sistem.penyewaan.alatmusik;

public class AlatMusikPukul extends InstrumenMusik {
    private String materialBahan;

    public AlatMusikPukul(String idAlat, String merk, double hargaSewaPerHari, String materialBahan) {
        super(idAlat, merk, hargaSewaPerHari);
        this.materialBahan = materialBahan;
    }

    public String getMaterialBahan() { return materialBahan; }
    public void setMaterialBahan(String materialBahan) { this.materialBahan = materialBahan; }

    @Override
    public String getDetail() {
        return super.getDetail() + " | Jenis: Pukul | Material: " + materialBahan;
    }
}