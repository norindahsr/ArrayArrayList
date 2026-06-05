package bagian3.perpustakaan; // Diubah menjadi huruf kecil semua

public class Buku {

    private String judul;
    private String penulis;
    private boolean dipinjam;

    // Constructor
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public String info() {
        String status;
        if (dipinjam) {
            status = "Dipinjam";
        } else {
            status = "Tersedia";
        }
        return judul + " oleh " + penulis + " [" + status + "]";
    }
}