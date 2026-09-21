package com.mycompany.sistem.penyewaan.alatmusik;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemPenyewaanAlatMusik {
    public static void main(String[] args) {
        ArrayList<InstrumenMusik> daftarInstrumen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Dummy Data Awal
        daftarInstrumen.add(new AlatMusikPetik("INS-01", "Fender Stratocaster", 150000, 6));
        daftarInstrumen.add(new AlatMusikPukul("INS-02", "Pearl Drum Set", 300000, "Kayu Maple"));

        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n=== SISTEM RENTAL ALAT MUSIK ===");
            System.out.println("1. Tampilkan Daftar Instrumen");
            System.out.println("2. Tambah Instrumen Baru");
            System.out.println("3. Ubah Data Instrumen");
            System.out.println("4. Hapus Instrumen");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Input menu harus berupa angka 1-5!");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DAFTAR INSTRUMEN ---");
                    if (daftarInstrumen.isEmpty()) {
                        System.out.println("Belum ada data instrumen.");
                    } else {
                        for (InstrumenMusik alat : daftarInstrumen) {
                            System.out.println(alat.getDetail());
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- TAMBAH INSTRUMEN BARU ---");
                    System.out.print("ID Alat: ");
                    String idBaru = scanner.nextLine();
                    
                    System.out.print("Merk: ");
                    String merkBaru = scanner.nextLine();

                    double hargaBaru = 0;
                    while (true) {
                        try {
                            System.out.print("Harga Sewa/Hari: Rp ");
                            hargaBaru = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Input harga harus berupa angka!");
                        }
                    }

                    int jenisPilihan = 0;
                    while (jenisPilihan != 1 && jenisPilihan != 2) {
                        try {
                            System.out.println("Pilih Jenis Alat:");
                            System.out.println("1. Alat Musik Petik");
                            System.out.println("2. Alat Musik Pukul");
                            System.out.print("Pilihan (1/2): ");
                            jenisPilihan = Integer.parseInt(scanner.nextLine());

                            if (jenisPilihan == 1) {
                                System.out.print("Jumlah Senar: ");
                                int senar = Integer.parseInt(scanner.nextLine());
                                daftarInstrumen.add(new AlatMusikPetik(idBaru, merkBaru, hargaBaru, senar));
                            } else if (jenisPilihan == 2) {
                                System.out.print("Material Bahan: ");
                                String material = scanner.nextLine();
                                daftarInstrumen.add(new AlatMusikPukul(idBaru, merkBaru, hargaBaru, material));
                            } else {
                                System.out.println("Pilihan tidak valid, pilih 1 atau 2.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Input harus berupa angka!");
                        }
                    }

                    System.out.println("Data instrumen berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("\n--- UBAH INSTRUMEN ---");
                    System.out.print("Masukkan ID Alat yang ingin diubah: ");
                    String idEdit = scanner.nextLine();
                    boolean adaEdit = false;

                    for (InstrumenMusik alat : daftarInstrumen) {
                        if (alat.getIdAlat().equalsIgnoreCase(idEdit)) {
                            System.out.print("Merk Baru: ");
                            alat.setMerk(scanner.nextLine());

                            while (true) {
                                try {
                                    System.out.print("Harga Sewa Baru: Rp ");
                                    alat.setHargaSewaPerHari(Double.parseDouble(scanner.nextLine()));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Error: Input harga harus berupa angka!");
                                }
                            }
                            adaEdit = true;
                            System.out.println("Data instrumen berhasil diperbarui.");
                            break;
                        }
                    }

                    if (!adaEdit) {
                        System.out.println("ID Alat tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- HAPUS INSTRUMEN ---");
                    System.out.print("Masukkan ID Alat yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    boolean adaHapus = false;

                    for (int i = 0; i < daftarInstrumen.size(); i++) {
                        if (daftarInstrumen.get(i).getIdAlat().equalsIgnoreCase(idHapus)) {
                            daftarInstrumen.remove(i);
                            adaHapus = true;
                            System.out.println("Data instrumen berhasil dihapus.");
                            break;
                        }
                    }

                    if (!adaHapus) {
                        System.out.println("ID Alat tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        }
        scanner.close();
    }
}