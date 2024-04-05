import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin operatorWarnet = new Admin();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Member");
            System.out.println("2. Hapus Member");
            System.out.println("3. Tampilkan Daftar Member");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama member: ");
                    String namaMember = scanner.nextLine();
                    System.out.print("Pilih role member (Umum/VIP): ");
                    String roleMember = scanner.nextLine();

                    Member member;
                    if (roleMember.equalsIgnoreCase("Umum")) {
                        member = new Umum(namaMember);
                    } else if (roleMember.equalsIgnoreCase("VIP")) {
                        member = new Vip(namaMember);
                    } else {
                        System.out.println("Role yang dimasukkan tidak valid.");
                        continue;
                    }

                    operatorWarnet.tambahMember(member);
                    break;

                case 2:
                    System.out.print("Masukkan nama member yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    operatorWarnet.hapusMember(namaHapus);
                    break;

                case 3:
                    operatorWarnet.tampilkanDaftarMember();
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu yang dimasukkan tidak valid.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}