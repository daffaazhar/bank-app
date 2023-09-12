package perbankan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
   
    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        if(saldo < jumlah)
            return false;
        saldo -= jumlah;
        return true;
    }
}