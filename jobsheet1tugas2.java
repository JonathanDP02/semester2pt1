
import java.util.Scanner;


public class jobsheet1tugas2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
          System.out.println("===== Perhitungan Kubus =====");
          System.out.println("1. Volume Kubus");
          System.out.println("2. Luas Permukaan Kubus");
          System.out.println("3. Keliling Kubus");
          System.out.println("4. Keluar");

          System.out.print("Masukkan PIlihan: ");
          int pilih = sc.nextInt();

          if (pilih == 4){
            System.out.println("Terima Kasih");
            break;
          }

          System.out.print("Masukkan Sisi Kubus: ");
          double sisi = sc.nextDouble();

          switch (pilih){
            case 1:
              System.out.println("Volume Kubus: " + volume(sisi));
              break;
            case 2:
              System.out.println("Luas Permukaan Kubus: " + luas(sisi));
              break;
            case 3:
              System.out.println("Keliling Kubus: " + Keliling(sisi));
              break;
            default:
              System.out.println("Input Tidak Valid, Mohon Ulangi Lagi");
          }
        }
    }

    public static double volume(double sisi){
      return sisi*sisi*sisi;
    }

    public static double luas(double sisi){
      return 6*(sisi*sisi);
    }

    public static double Keliling(double sisi){
      return 12*sisi;
    }
} 