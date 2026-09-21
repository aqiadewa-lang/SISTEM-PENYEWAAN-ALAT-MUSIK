# Nama   : Muhammad Aqia Yudha Yulian Putra
<br>
# NIM    : 2509116105
<br>
# Kelas  : C Sistem Informasi
<br>
# Matkul : PBO
<br> 

# SISTEM PENYEWAAN ALAT MUSIK

# 1. Penjelasan Alur Program
Ketika program dijalankan, sistem akan menampilkan Menu Utama yang terdiri dari Tampilkan Daftar Instrumen, Tambah Instrumen Baru, Ubah Data Instrumen, Hapus Instrumen, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka (1-5) sesuai dengan pilihan yang tersedia. Setelah memilih, sistem akan mengeksekusi instruksi sesuai menu tersebut.

## A. Menu Tampilkan Daftar Instrumen
Sistem menampilkan seluruh data instrumen musik yang telah tersimpan di dalam ArrayList. Data yang ditampilkan meliputi ID Alat, Merk, Harga Sewa/Hari, Jenis Alat (Petik/Pukul), serta atribut khusus seperti Jumlah Senar (untuk alat petik) atau Material Bahan (untuk alat pukul).

## B. Menu Tambah Instrumen Baru
Pengguna diminta untuk memasukkan ID Alat, Merk, dan Harga Sewa/Hari. Setelah itu, sistem akan meminta pengguna memilih jenis alat musik:

### 1. Alat Musik Petik: Pengguna akan diminta memasukkan Jumlah Senar.

### 2. Alat Musik Pukul: Pengguna akan diminta memasukkan Material Bahan.
Data tersebut kemudian dibuat menjadi objek sesuai jenisnya dan disimpan ke dalam ArrayList.

## C. Menu Ubah Data Instrumen
Pengguna diminta memasukkan ID Alat dari instrumen yang ingin diubah. Jika ID tersebut ditemukan di dalam sistem, pengguna dapat memasukkan Merk Baru dan Harga Sewa Baru. Data instrumen di dalam ArrayList akan otomatis diperbarui.

## D. Menu Hapus Instrumen
Pengguna memasukkan ID Alat dari instrumen yang ingin dihapus. Jika ID ditemukan, sistem akan menghapus data instrumen tersebut dari ArrayList dan menampilkan pesan konfirmasi keberhasilan.

## E. Keluar
Jika pengguna memilih menu 5. Keluar, sistem akan menghentikan perulangan dan keluar dari program.

# 2. Deskripsi Singkat Program
## Sistem Penyewaan Alat Musik merupakan program berbasis Java yang berguna untuk mengelola data instrumen musik yang disewakan, baik berupa alat musik petik maupun alat musik pukul. Program ini dijalankan melalui console dan menggunakan ArrayList untuk menyimpan data selama program berjalan.

## Program ini memiliki lima menu utama yang merupakan implementasi langsung dari fitur CRUD (Create, Read, Update, Delete), yaitu:

## 1. Tampilkan Daftar Instrumen , digunakan untuk melihat seluruh data alat musik yang tersedia (Read).
<img width="663" height="217" alt="image" src="https://github.com/user-attachments/assets/bda0b8f1-93ff-4ab7-9528-ab8a94914359" />


## 2. Tambah Instrumen Baru, digunakan untuk menambahkan data instrumen musik baru ke dalam sistem penyewaan (Create).
<img width="353" height="351" alt="image" src="https://github.com/user-attachments/assets/f58e12e9-273c-4443-ab57-1cb062065815" />


## 3. Ubah Data Instrumen, digunakan untuk memperbarui informasi seperti merk dan harga sewa dari alat musik yang sudah terdaftar (Update).
<img width="723" height="502" alt="image" src="https://github.com/user-attachments/assets/dc2153e5-63ed-4def-8821-4aa424ee3f33" />


## 4. Hapus Instrumen, digunakan untuk menghapus data instrumen dari sistem (Delete).
<img width="658" height="437" alt="image" src="https://github.com/user-attachments/assets/7cb3c1de-5d38-45ab-acb3-f3fbbf73cbfc" />


## 5. Keluar, digunakan untuk mengakhiri program.
<img width="625" height="266" alt="image" src="https://github.com/user-attachments/assets/18fc5eb0-f6ea-4989-bc26-9daf877d3351" />
