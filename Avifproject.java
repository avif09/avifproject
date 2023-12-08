package datapegawai.avifproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avifproject {
    public static void main(String[] args) {
        List<pegawaibaru> daftarPegawai = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println("Tambah Data Pegawai Baru (Y/N): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")){
                break;
            }
            System.out.print("Nama : ");
            String nama = input.nextLine();
            
            System.out.print("NIP : ");
            String nip = input.nextLine();
            
            System.out.print("NIK : ");
            String nik = input.nextLine();
            
            System.out.print("Umur : ");
            int umur = input.nextInt();
            
            System.out.print("Alamat : ");
            String alamat = input.nextLine();
            input.nextLine();
            
            pegawaibaru pegawai = new pegawaibaru(nama, nip, nik, umur, alamat);
            daftarPegawai.add(pegawai);
        }
        System.out.println("Daftar Pegawai");
        for (pegawaibaru pegawai : daftarPegawai){
            System.out.println(pegawai);
        }
    }
}
