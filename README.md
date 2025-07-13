# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi pemesanan sederhana untuk cafe, dibuat menggunakan Java. Aplikasi ini memungkinkan pelanggan memilih menu, menentukan jumlah pesanan, dan mencetak nota pembayaran. Proyek ini dibuat sebagai tugas akhir mata kuliah *Pemrograman Berbasis Objek 1*.

## Deskripsi

Program ini mengimplementasikan berbagai konsep penting dalam pemrograman berbasis objek (OOP), seperti:

1. **Class**
2. **Object**
3. **Atribut**
4. **Constructor**
5. **Mutator (Setter)**
6. **Accessor (Getter)**
7. **Encapsulation**
8. **Inheritance**
9. **Polymorphism**
10. **Seleksi**
11. **Perulangan**
12. **IO Sederhana**
13. **Array**
14. **Error Handling**

---

## Penjelasan Konsep OOP Berdasarkan Kode

### 1–2. **Class dan Object**

Program ini terdiri dari empat class utama:
- `App` (class utama / main)
- `Cafe` (untuk mengelola daftar pesanan)
- `MenuItem` (representasi item menu)
- `OrderItem` (representasi pesanan per item)

Contoh object:
```java
Cafe cafe = new Cafe();
MenuItem[] menu = {
    new MenuItem("Kopi Hitam", 10000),
    new MenuItem("Cappuccino", 15000),
    ...
};



3. **Atribut** adalah variabel yang ada dalam class.

// MenuItem.java
private String nama;
private double harga;

// Cafe.java
private ArrayList<OrderItem> pesanan = new ArrayList<>();

// OrderItem.java
private MenuItem item;
private int jumlah;


4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. 
public MenuItem(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}

public OrderItem(MenuItem item, int jumlah) {
    this.item = item;
    this.jumlah = jumlah;
}

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. 
6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut.
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}


7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. 

private String nama;
private double harga;

public String getNama() {
    return nama;
}


8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. 

public class Makanan extends MenuItem { ... }
public class Minuman extends MenuItem { ... }


9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. 

public class MenuItem {
    public String info() {
        return nama + " - Rp" + harga;
    }

    public String info(boolean denganDiskon) {
        return nama + " - Rp" + (harga * 0.9); // 10% diskon
    }
}

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi.
if (pilihan < 1 || pilihan > menu.length) {
    System.out.println("❌ Menu tidak tersedia.");
    continue;
}

if (jumlah <= 0) {
    System.out.println("❌ Jumlah harus lebih dari 0.");
    continue;
}


11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali.
do {
    ...
    System.out.print("Tambah pesanan lagi? (y/n): ");
    lanjut = scanner.next().charAt(0);
} while (lanjut == 'y' || lanjut == 'Y');


12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user.

Scanner scanner = new Scanner(System.in);
System.out.print("Pilih nomor menu: ");
int pilihan = scanner.nextInt();

System.out.println("TOTAL BAYAR: Rp" + total);


13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel.

MenuItem[] menu = {
    new MenuItem("Kopi Hitam", 10000),
    new MenuItem("Cappuccino", 15000),
    ...
};


14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime.

try {
    pilihan = scanner.nextInt();
    ...
} catch (InputMismatchException e) {
    System.out.println("❌ Masukkan angka yang valid.");
    scanner.nextLine(); // Membersihkan buffer
    continue;
}


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M.Rasyid Ridha
NPM: 2310010168
