package perbankan;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Nasabah> nasabah;
    private int jumlahNasabah;
    
    public void tambahNasabah(String namaAwal, String namaAkhir){
        if(nasabah == null){
            nasabah = new ArrayList();
        }
        nasabah.add(new Nasabah(namaAwal, namaAkhir));
        jumlahNasabah++;
    }
    
    public void updateNasabah(int index, String namaAwal, String namaAkhir) {
        Nasabah data = nasabah.get(index);
        data.setNamaAwal(namaAwal);
        data.setNamaAkhir(namaAkhir);
        nasabah.set(index, data);
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
}