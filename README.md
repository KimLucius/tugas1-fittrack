# FitTrack - Sistem Manajemen Keanggotaan

FitTrack adalah aplikasi Java sederhana yang dirancang untuk mengelola data keanggotaan fitness/gym secara terstruktur dengan menerapkan prinsip Object-Oriented Programming (OOP).

## Identitas Pembuat
* **Nama**: Lukmanul Hakim Karva
* **NIM**: 250810701100011
* **Program Studi**: Informatika
* **Universitas**: Universitas Syiah Kuala

## Fitur Utama
1. **Encapsulation & Validasi Input**: 
   - Nama tidak boleh kosong atau hanya berisi spasi.
   - Nomor telepon wajib diawali angka `0` dan memiliki panjang minimal 10 digit.
   - Jenis paket dibatasi hanya `"Basic"`, `"Premium"`, atau `"VIP"`.
2. **Constructor Overloading**:
   - Constructor lengkap (nama, noTelepon, tanggalDaftar, jenisPaket).
   - Constructor fleksibel tanpa paket (otomatis diset ke `"Basic"`).
3. **Pengujian Array**:
   - Menyimpan beberapa objek `Member` di dalam array dan menampilkannya dengan perulangan `for`.

## Struktur Project
```text
tugas1-fittrack/
├── .gitignore
├── README.md
└── src/
    ├── Member.java
    └── TesFitTrack.java
