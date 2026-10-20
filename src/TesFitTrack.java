public class TesFitTrack {

    public static void main(String[] args) {
        System.out.println("=== 1. PEMBUATAN OBJEK MEMBER DENGAN ARRAY ===");
        
        Member[] daftarMember = new Member[4];

        daftarMember[0] = new Member("Ahmad Hanif", "081234567890", "10-01-2026", "Premium");
        daftarMember[1] = new Member("Siti Rahma", "085678901234", "12-01-2026", "VIP");
        
        System.out.print("[Uji Validasi Constructor 1] ");
        daftarMember[2] = new Member("Budi Santoso", "089876543210", "15-01-2026");

        System.out.print("[Uji Validasi Constructor 2] ");
        daftarMember[3] = new Member("Rian Pratama", "12345", "18-01-2026", "Gold");

        System.out.println("\n=== 2. UJI SETTER DENGAN DATA TIDAK VALID ===");
        System.out.println("Ubah nomor telepon 'Ahmad Hanif' menjadi '999' (invalid)...");
        System.out.print("[Pesan Penolakan]: ");
        daftarMember[0].setNoTelepon("999");
        
        System.out.println("Nomor telepon 'Ahmad Hanif' saat ini (harus tetap nilai lama): " 
                + daftarMember[0].getNoTelepon());

        System.out.println("\n=== 3. CETAK SELURUH DATA MEMBER (PERULANGAN FOR) ===");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i]);
        }
    }
}
