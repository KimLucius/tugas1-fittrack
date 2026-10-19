public class Member {

    public static final int MIN_PANJANG_NO_TELP = 10;
    public static final String DEFAULT_JENIS_PAKET = "Basic";
    public static final String DEFAULT_NAMA = "Tanpa Nama";
    public static final String DEFAULT_NO_TELEPON = "0000000000";
    public static final String DEFAULT_TANGGAL_DAFTAR = "01-01-2026";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, DEFAULT_JENIS_PAKET);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Gagal mengubah nama: Nama tidak boleh kosong atau hanya berisi spasi.");
            if (this.nama == null) {
                this.nama = DEFAULT_NAMA;
            }
        } else {
            this.nama = nama.trim();
        }
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || !noTelepon.startsWith("0") || noTelepon.length() < MIN_PANJANG_NO_TELP) {
            System.out.println("Gagal mengubah nomor telepon: Nomor telepon harus diawali angka 0 dan minimal " 
                    + MIN_PANJANG_NO_TELP + " digit.");
            if (this.noTelepon == null) {
                this.noTelepon = DEFAULT_NO_TELEPON;
            }
        } else {
            this.noTelepon = noTelepon;
        }
    }

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            System.out.println("Gagal mengubah tanggal daftar: Tanggal daftar tidak boleh kosong.");
            if (this.tanggalDaftar == null) {
                this.tanggalDaftar = DEFAULT_TANGGAL_DAFTAR;
            }
        } else {
            this.tanggalDaftar = tanggalDaftar;
        }
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket != null && (jenisPaket.equals("Basic") || jenisPaket.equals("Premium") || jenisPaket.equals("VIP"))) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("Gagal mengubah jenis paket: Jenis paket harus berupa 'Basic', 'Premium', atau 'VIP'.");
            if (this.jenisPaket == null) {
                this.jenisPaket = DEFAULT_JENIS_PAKET;
            }
        }
    }

    @Override
    public String toString() {
        return "Member FitTrack [" +
                "Nama: " + nama +
                " | No. Telp: " + noTelepon +
                " | Tgl Daftar: " + tanggalDaftar +
                " | Paket: " + jenisPaket +
                ']';
    }
}
