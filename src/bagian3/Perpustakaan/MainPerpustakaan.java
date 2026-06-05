package bagian3.perpustakaan; // Tetap huruf kecil, sekarang sudah match dengan yang lain

public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata"));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya"));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi"));

        perpus.tampilkanKoleksi();

        System.out.println();
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // Tes pinjam buku yang sama lagi

        System.out.println();
        perpus.tampilkanKoleksi();

        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}