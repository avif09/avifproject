package datapegawai.avifproject;

public class pegawaibaru{
    private final String nama;
    private final String nip;
    private final String nik;
    private final int umur;
    private final String alamat;
    
    public pegawaibaru(String nama, String nip, String nik, int umur, String alamat){
        this.nama = nama;
        this.nip = nip;
        this.nik = nik;
        this.umur = umur;
        this.alamat = alamat;  
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }
    
    public String getNik(){
        return nik;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    @Override 
    public String toString(){
        return "Nama : " + nama + ", NIP : " + nip + ", NIK : " + nik + ", Umur : " + umur + ", Alamat : " + alamat;
    }
}
