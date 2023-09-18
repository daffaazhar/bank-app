package perbankan;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private String username;
    private String password;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir, String username, String password) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.username = username;
        this.password = password;
        this.tabungan = new Tabungan(0);
    }
    
    public boolean transferSaldo(Nasabah penerima, int jumlah) {
        if (tabungan.ambilUang(jumlah)) {
            penerima.tabungan.simpanUang(jumlah);
            return true;
        }
        return false;
    }
    
    public String getNamaAwal() {
        return namaAwal;
    }
    
    public String getNamaAkhir() {
        return namaAkhir;
    }
    
    public Tabungan getTabungan() {
        return tabungan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }

    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }

    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
    }
}
