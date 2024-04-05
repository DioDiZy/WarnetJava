// Implementasi turunan/ inheritance dari kelas member
class Vip extends Member {
    public Vip(String nama) {
        super(nama, "VIP");
    }

    public int getHargaPerJam() {
        return 10000; // Harga per jam untuk member VIP
    }
}
