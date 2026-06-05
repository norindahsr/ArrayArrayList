package bagian3.perpustakaan; // Diubah menjadi huruf kecil semua

import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> koleksi = new ArrayList<>();

    // Menambah buku
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // Menampilkan koleksi
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Meminjam buku
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam");
                }
                return;
            }
        }
        System.out.println("Buku tidak ditemukan");
    }

    // Menghitung buku tersedia
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}