// Implementasi kelas turunan dari kelas member
public class Umum extends Member {
    public Umum(String nama) {
        super(nama, "Umum");
    }

    public int getHargaPerJam() {
        return 5000; // Harga per jam untuk member umum
    }
}
