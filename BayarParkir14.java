import java.util.Scanner;
public class BayarParkir14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int jenis, durasi;
        int total = 0, totalTarif = 0;
       
        //Input & Perulangan
        do {
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                System.out.println("Transaksi selesai");
                break;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir dalam jam: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total = 12500;
                } else if (jenis == 1) {
                    total = durasi * 3000;
                } else if (jenis == 2) {
                    total = durasi * 2000;
                } 

                //Menampilkan biaya kendaraan
                System.out.println("Biaya parkir untuk kendaraan ini: Rp." + total);

                //Menghitung total tarif
                totalTarif += total;
                System.out.println("Total pembayaran sementara: Rp " + totalTarif);
            }
            else{
                System.out.println("Jenis yang dimasukkan tidak sesuai, ulangi!");
            }
        }while (true);
        //Output keseluruhan
        System.out.println("Total keseluruhan pembayaran parkir: Rp. " + totalTarif);
    }   
}
