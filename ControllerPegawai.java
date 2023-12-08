package datapegawai.avifproject;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPegawai {
    ArrayList<pegawaibaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerPegawai(){
        ArrayData = new ArrayList<pegawaibaru>();
    }
    public void InsertData(String nama, String nip, String nik, int umur, String alamat){
        pegawaibaru pgw = new pegawaibaru(nama, nip, nik, umur, alamat);
        ArrayData.add(pgw);
    }
    public DefaultTableModel showData(){
        String[] kolom = { "Nama", "NIP", "NIK", "Umur", "Alamat"};
        Object[][] objData = new Object[ArrayData.size()][3];
        int i = 0;
        
        for(pegawaibaru n : ArrayData){
            String[] arrData = {n.getNama(), n.getNip(), n.getNik(), String.valueOf(n.getUmur()), n.getAlamat()};
            objData[i] = arrData;
            i++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
                public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tablelist;
    }
}
