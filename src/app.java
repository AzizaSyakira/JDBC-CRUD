import java.util.*;
import java.util.Scanner;

public class app {
     public static void main(String[] args) {
         
          Scanner scanner = new Scanner(System.in);
          update.updateEmployeeCredentials(scanner);
          System.out.println("");
  
          
          Scanner scanNEW = new Scanner(System.in);
          create.insertEmployeeData(scanNEW);
          System.out.println("");
  
          
          delete.deleteEmployeeById();
          System.out.println("");
  
    
        try {
          
            loginAkun login = new loginAkun();

            penjualan supermarket = new penjualan();
            supermarket.kasir = login.kasir;

            Scanner hihi = new Scanner(System.in);

            System.out.print("Nama Pelanggan : ");
            String namaPelanggan = hihi.nextLine();
            System.out.print("No. HP         : ");
            String noHp = hihi.nextLine();
            System.out.print("Alamat         : ");
            String alamatPelanggan = hihi.nextLine();

            supermarket.aA(namaPelanggan, noHp, alamatPelanggan);

            System.out.print("Kode Barang    : ");
            String kodeBarang = hihi.nextLine();
            System.out.print("Jumlah Beli    : ");
            int jumlahBeli = hihi.nextInt();
            supermarket.bB(kodeBarang, jumlahBeli);
            System.out.println(" ");

            supermarket.aAA();
            supermarket.bBB();

            hihi.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
