// Implementasi kelas turunan dari kelas member
// Kelas Member, VIP, Umum mengimplementasikan Visibility yang dimana kelasnya hanya dapat diacces oleh orangtua serta turunannya saja
public class Umum extends Member {
    public Umum(String nama) {
        super(nama, "Umum");
    }

    public int getHargaPerJam() {
        return 5000; // Harga per jam untuk member umum
    }
}
