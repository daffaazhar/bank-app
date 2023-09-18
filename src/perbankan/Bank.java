package perbankan;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Nasabah> nasabah;
    private Admin admin;
    
    public Bank() {
        admin = new Admin("admin", "12345678");
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir, 
        String username, String password){
        if(nasabah == null){
            nasabah = new ArrayList();
        }
        nasabah.add(new Nasabah(namaAwal, namaAkhir, username, password));
    }
    
    public void updateNasabah(int index, String namaAwal, String namaAkhir, 
        String username, String password) {
        Nasabah data = nasabah.get(index);
        data.setNamaAwal(namaAwal);
        data.setNamaAkhir(namaAkhir);
        data.setUsername(username);
        data.setPassword(password);
        nasabah.set(index, data);
    }
    
    public Nasabah loginNasabah(String username, String password) {
        if (nasabah != null) {
            for (Nasabah nasabah : nasabah) {
                if (nasabah.getUsername().equals(username) && 
                    nasabah.getPassword().equals(password)) {
                    return nasabah;
                }
            }
        }
        return null;
    }
    
    public boolean transferAntarNasabah(String pengirimUsername, 
            String penerimaUsername, int jumlah) {
        Nasabah pengirim = null;
        Nasabah penerima = null;
        // Cari nasabah pengirim berdasarkan username
        for (Nasabah nasabah : nasabah) {
            if (nasabah.getUsername().equals(pengirimUsername)) {
                pengirim = nasabah;
                break;
            }
        }
        // Cari nasabah penerima berdasarkan username
        for (Nasabah nasabah : nasabah) {
            if (nasabah.getUsername().equals(penerimaUsername)) {
                penerima = nasabah;
                break;
            }
        }
        // Jika pengirim dan penerima ditemukan, lakukan transfer
        if (pengirim != null && penerima != null) {
            return pengirim.transferSaldo(penerima, jumlah);
        }
        return false;
    }
    
    public void deleteNasabah(int index) {
        nasabah.remove(index);
    }
    
    public int getJumlahNasabah(){
        return nasabah.size();
    }
    
    public Nasabah getNasabah(int index){
        return nasabah.get(index);
    }
    
    public List<Nasabah> getAllNasabah() {
        return nasabah;
    }
    
    public Admin getAdmin() {
        return admin;
    }
}