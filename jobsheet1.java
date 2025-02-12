import java.util.Scanner;

public class jobsheet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== NILAI AKHIR =====");
        System.out.println("=======================");
        System.out.print("Masukkan nilai Tugas\t: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai Kuis\t: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS\t: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS\t: ");
        int uas = sc.nextInt();
        System.out.println("=======================");
        System.out.println("=======================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100){
            System.out.println("====NILAI TIDAK VALID!!!====");
        }else{
            double nilaiAkhir = (int) ((0.2*tugas) + (0.2*kuis) + (0.3*uts) + (0.2*uas));
            String nilaiHuruf;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) nilaiHuruf = "A";
            else if (nilaiAkhir > 73 && nilaiAkhir <= 80) nilaiHuruf = "B+";
            else if (nilaiAkhir > 65 && nilaiAkhir <= 73) nilaiHuruf = "B";
            else if (nilaiAkhir > 60 && nilaiAkhir <= 65) nilaiHuruf = "C+";
            else if (nilaiAkhir > 50 && nilaiAkhir <= 60) nilaiHuruf = "C";
            else if (nilaiAkhir > 39 && nilaiAkhir <= 50) nilaiHuruf = "D";
            else nilaiHuruf = "E";

            String status = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) ? "SELAMAT ANDA LULUS" : "TIDAK LULUS ULANGI TAHUN DEPAN";

            
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("=======================");
            System.out.println(status);

        }
    }
    
}
