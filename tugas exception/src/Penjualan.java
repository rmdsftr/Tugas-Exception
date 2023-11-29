import java.util.Scanner;

public class Penjualan implements Transaksi{

    public String faktur;
    public String namaPelanggan;
    public String noHp;
    public String namaBarang;
    public int hargaBarang;
    public int jumlahBeli;
    public int totalBayar;
    
    public Penjualan(){
        inputFaktur();
        inputPelanggan();
        inputBarang();
        hitungTotalBayar();
    }

    @Override
    public void inputFaktur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nomor faktur : ");
        faktur = scanner.nextLine();
    }

    @Override
    public void inputPelanggan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama pelanggan : ");
        namaPelanggan = scanner.nextLine();
        System.out.println("Masukkan nomor HP : ");
        noHp = scanner.nextLine();
    }

    @Override
    public void inputBarang(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama barang : ");
        namaBarang = scanner.nextLine();
        System.out.println("Masukkan harga barang : ");
        hargaBarang = scanner.nextInt();

        try{
            System.out.println("Masukkan jumlah beli : ");
            jumlahBeli = scanner.nextInt();

            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0");
            } else if (jumlahBeli > 100){
                throw new IllegalArgumentException("Jumlah beli melebihi stok barang");
            }
        } catch (Exception e){
            System.err.println("Error : " + e.getMessage());
        }
    }

    @Override
    public void hitungTotalBayar(){
        totalBayar = jumlahBeli*hargaBarang;
    }

    public void tampilkanTransaksi(){
        System.out.println("                     Detail Transaksi                 ");
        System.out.println("=========================================================");
        System.out.println("Nomor faktur\t : " + faktur);
        System.out.println("Nama Pelanggan\t : " + namaPelanggan);
        System.out.println("Nomor HP\t : " + noHp);
        System.out.println("=========================================================");
        System.out.println("Nama barang\t : " + namaBarang);
        System.out.println("Jumlah beli\t : " + jumlahBeli);
        System.out.println("Harga Barang\t : " + hargaBarang);
        System.out.println("=========================================================");
        System.out.println("Total bayar\t : " + totalBayar);
    }


    
}
