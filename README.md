# Katalon Petstore Web Automation

## Deskripsi Project
Project ini berisi otomasi pengujian UI (User Interface) untuk aplikasi web JPetStore (https://petstore.octoperf.com/). Pengujian dilakukan menggunakan Katalon Studio untuk memastikan fungsionalitas utama berjalan dengan baik, seperti proses login, pencarian produk, dan checkout barang menggunakan metode Data-Driven Testing (DDT).

## Cara Menjalankan
1. Clone repository ini ke komputer lokal Anda:
   `git clone https://github.com/<username-anda>/katalon-petstore-web.git`
2. Buka aplikasi Katalon Studio.
3. Klik **File > Open Project** dan pilih folder hasil clone tersebut.
4. Buka menu **Test Suites** di panel *Tests Explorer*.
5. Buka `Suite_Petstore`.
6. Klik tombol **Run** pada menu bar atas untuk menjalankan seluruh skenario pengujian.

## Test Suite
Project ini memiliki Test Suite utama bernama **Suite_Petstore** yang mencakup eksekusi Test Case berikut:
1. `TC01_Login_Positive` - Memverifikasi user dapat login dengan kredensial valid.
2. `TC02_Login_Negative` - Memverifikasi sistem menolak login dengan kredensial tidak valid.
3. `TC03_Account_Information_Positive` - Memverifikasi user dapat melihat dan mengedit informasi akun.
4. `TC04_Search_Product` - Memverifikasi fungsionalitas pencarian produk (misal: "angelfish").
5. `TC05_Add_To_Cart_DDT` - Memverifikasi proses menambahkan produk ke keranjang hingga checkout (Billing & Payment) menggunakan Data-Driven Testing dari file Excel.

## Test Coverage
Cakupan pengujian (Test Coverage) pada automasi ini meliputi fungsionalitas inti dari aplikasi web JPetStore:
*   **Authentication:** Login (Positive & Negative).
*   **User Profile:** Account Information management.
*   **Search & Navigation:** Pencarian produk spesifik dan navigasi kategori.
*   **Transaction/Checkout:** End-to-end flow pembelian produk, pengisian form billing menggunakan Data-Driven Testing (DDT), dan verifikasi *Order Confirmation*.

---
*Catatan: Tidak ada data kredensial rahasia, password, atau API key asli yang diunggah secara hardcode ke dalam repository ini demi keamanan.*
