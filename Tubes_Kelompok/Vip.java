// Implementasi turunan/ inheritance dari kelas member
// Kelas Member, VIP, Umum mengimplementasikan Visibility yang dimana kelasnya hanya dapat diacces oleh orangtua serta turunannya saja
class Vip extends Member {
    public Vip(String nama) {
        super(nama, "VIP");
    }

    public int getHargaPerJam() {
        return 10000; // Harga per jam untuk member VIP
    }
}
