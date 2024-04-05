import java.util.ArrayList;

public class Admin {

    private ArrayList<Member> daftarMember;

    public Admin() {
        daftarMember = new ArrayList<>();
    }

    public void tambahMember(Member member) {
        daftarMember.add(member);
        System.out.println("Member " + member.getNama() + " berhasil ditambahkan.");
    }

    public void hapusMember(String nama) {
        Member member = null;
        for (Member m : daftarMember) {
            if (m.getNama().equals(nama)) {
                member = m;
                break;
            }
        }

        if (member != null) {
            daftarMember.remove(member);
            System.out.println("Member " + member.getNama() + " berhasil dihapus.");
        } else {
            System.out.println("Member dengan nama " + nama + " tidak ditemukan.");
        }
    }

    public void tampilkanDaftarMember() {
        System.out.println("Daftar Member:");
        for (Member member : daftarMember) {
            System.out.println("Nama: " + member.getNama());
            System.out.println("Role: " + member.getRole());
            System.out.println("Harga per jam: " + member.getHargaPerJam());
            System.out.println("-----------------------");
        }
    }

}
