// Contoh penerapan kelas abstrak
// Kelas Member, VIP, Umum mengimplementasikan Visibility yang dimana kelasnya hanya dapat diacces oleh orangtua serta turunannya saja
public abstract class Member {
    private String nama;
    private String role;

    public Member(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

    public String getNama() {
        return nama;
    }

    public String getRole() {
        return role;
    }

    public abstract int getHargaPerJam(); //Penggunakan metode abstrak
}
