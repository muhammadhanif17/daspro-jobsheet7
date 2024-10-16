import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        // Deklarasi variabel
        int i, n;

        //Input
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();
        //Perulangan for
        for(i = n; i >= 1; i--){
            System.out.print(i + " ");
        }
        */

        //Soal no 2
        /* 
        int i, n, hasil =  1;

        System.out.print("Masukkan n: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            hasil *= i;
            System.out.print(i + " *");
        }

        System.out.println("\nHasil kali: " + hasil);
        */

        //Soal no 3
        /* 
        int i, n;

        System.out.print("Masukkan n: ");
        n = sc.nextInt();

        for ( i = 1; i <= n; i++) {
            System.out.print(i * i + ", ");
        }
        */

        //Soal no 4
        /* 
        int i, n;

        System.out.print("Masukkan n: ");
        n = sc.nextInt();

        for ( i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(1 + ", ");
            }else{
                System.out.print(i*i + ", ");
            }
        }
        */

        //Soal no 5
        int i, n, beda;
        int awal = 3;
        beda = 1;

        System.out.print("Masukkan n: ");
        n = sc.nextInt();

        for ( i = 1; i <= n; i++) {
            System.out.print(awal + ", ");
            awal += beda;
            beda += 2;
        
        }
    }
}
