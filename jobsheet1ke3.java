import java.util.Scanner;

public class jobsheet1ke3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        String[] mataKuliah = new String[jumlahMK];
        int[] nilaiAngka = new int[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];
        double[] bobotSKS = new double[jumlahMK];

        double totalBobotNilai = 0;
        double totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.print("Masukkan nama mata kuliah: ");
            mataKuliah[i] = scanner.nextLine();
            
            System.out.print("Masukkan nilai untuk " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextInt();
            
            System.out.print("Masukkan bobot SKS untuk " + mataKuliah[i] + ": ");
            bobotSKS[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer

            // Konversi Nilai
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else if (nilaiAngka[i] >= 0 && nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            } else {
                System.out.println("Nilai tidak valid untuk mata kuliah " + mataKuliah[i]);
                nilaiHuruf[i] = "N/A";
                nilaiSetara[i] = 0.0;
            }

            totalBobotNilai += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];  // Menambahkan SKS ke totalSKS
        }

        System.out.println();
        System.out.println("==== PROGRAM MENGHITUNG IP SEMESTER ====");

        for (int i = 0; i < jumlahMK; i++){
            System.out.println("Nilai untuk mata kuliah " + mataKuliah[i] + ": " + nilaiAngka[i] + "\t");
        }

        // Menampilkan hasil
        System.out.println("\n====================================================================================");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot SKS");
        System.out.println("======================================================================================");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-10d %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("======================================================================================");

        // Perhitungan IP Semester sesuai rumus baru
        double ipSemester = totalBobotNilai / totalSKS;
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}
