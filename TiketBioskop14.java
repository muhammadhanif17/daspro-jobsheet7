import java.util.Scanner;
public class TiketBioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int jmlTiket; 
        double hargaTiket = 50000, diskon, totalHarga = 0, totalTiket = 0, hargaPenjualan = 0;
        boolean lanjut = true;

        //Perulangan while
        while (lanjut) {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket invalid");
                continue;
            }else {
                if (jmlTiket > 4 && jmlTiket <= 10) {
                    diskon = 0.1;
                }else if (jmlTiket > 10) {
                    diskon = 0.15;
                } else {
                    diskon = 0;
                }
            }
            totalHarga = jmlTiket*hargaTiket-(jmlTiket * hargaTiket*diskon);

            System.out.println("Jumlah tiket: " + jmlTiket);
            System.out.println("Harga tiket: Rp." + totalHarga);

            totalTiket += jmlTiket;
            hargaPenjualan += totalHarga;
            System.out.print("Apakah ingin lanjut (true/false): ");
            lanjut = sc.nextBoolean();
        }
        
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total harga penjualan: Rp." + hargaPenjualan);
    }
}
