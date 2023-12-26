
import java.text.SimpleDateFormat;
import java.util.Date;

public class pelanggan implements IniSupermarket {
    public String namaPelanggan;
    public String noHp;
    public String alamat;

    public void aA(String namaPelanggan, String noHp, String alamat) {
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.alamat = alamat;
    }
    @Override
    public void aAA() {
        System.out.println("        IniSupermarket ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
        Date date = new Date();
        System.out.println("Tanggal : " + dateFormat.format(date));
        System.out.println("Waktu   : " + timeFormat.format(date));
        System.out.println("========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("----------------------------------------");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("No. HP         : " + noHp);
        System.out.println("Alamat         : " + alamat);
        System.out.println("++++++++++++++++++++++++");
    }
}
