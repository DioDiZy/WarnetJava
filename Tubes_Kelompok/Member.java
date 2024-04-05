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

    public abstract int getHargaPerJam();
}