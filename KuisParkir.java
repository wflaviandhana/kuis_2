
import java.util.Scanner;

public class KuisParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int gagal = 0;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();
        while (jam != 0) {
            //saya membuat tidak valid itu jika mines 
            if (jam < 0) {
                gagal++;
                System.out.println("Lama parkir tidak valid!");
                System.out.println("Percobaan gagal: " + gagal);
                if (gagal == 5) {
                    System.out.println("Gagal 5 kali. Program dihentikan!");
                    break;
                }

            } 
        else {
            int biaya = 5000;

                if (jam > 1) {
                    biaya += (jam - 1) * 3000;
                }

                total += biaya;
                jumlahKendaraan++;

                System.out.println("Biaya parkir: Rp " + biaya);
         }

            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
        }
        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        sc.close();
}
}
