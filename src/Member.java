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

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }
}
