
public class penjualan extends pelanggan {
    public String kodeBarang;
    public String namaBarang;
    public Integer hargaBarang;
    public Integer jumlahBeli;
    public Integer totalBayar;
    public String kasir;

    public void bB(String kodeBarang, int jumlahBeli) {
        this.kodeBarang = kodeBarang;
        this.jumlahBeli = jumlahBeli;
        hubungkanDataBarang(kodeBarang);
        this.totalBayar = hargaBarang * jumlahBeli;
    }

    public void hubungkanDataBarang(String kodeBarang) {

        if (kodeBarang.equals("001")) {
            this.namaBarang = "Buku";
            this.hargaBarang = 4000;
        } else if (kodeBarang.equals("002")) {
            this.namaBarang = "Pensil";
            this.hargaBarang = 2000;
        } else if (kodeBarang.equals("003")) {
            this.namaBarang = "Pena";
            this.hargaBarang = 3000;
        }else {
            throw new IllegalArgumentException("Kode barang tidak valid.");
        }
    }

    public void bBB() {
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------");
        System.out.println("Kode Barang     : " + kodeBarang);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Barang    : " + hargaBarang);
        System.out.println("Jumlah Beli     : " + jumlahBeli);
        System.out.println("TOTAL BAYAR     : " + totalBayar);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir           : " + kasir);
    }
}