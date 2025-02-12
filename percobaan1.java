import java.util.Scanner;

public class percobaan1 {
    // Fungsi untuk menghitung rata-rata nilai
    public static double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }

    // Fungsi untuk menentukan status kelulusan
    public static String tentukanKelulusan(double rataRata) {
        return rataRata >= 75 ? "Lulus" : "Tidak Lulus";
    }

    // Fungsi untuk menampilkan tabel hasil
    public static void tampilkanTabel(int[][] nilaiMahasiswa, double[] rataRata, String[] status) {
        System.out.println("\n===================================================================");
        System.out.printf("| %-12s | %-20s | %-10s | %-12s |\n", "Mahasiswa", "Nilai Mata Kuliah", "Rata-rata", "Status");
        System.out.println("===================================================================");

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.printf("| %-12s | ", "Mahasiswa " + (i + 1));

            // Menampilkan nilai mata kuliah
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.printf("%-3d ", nilaiMahasiswa[i][j]);
            }

            // Tambahkan padding jika jumlah mata kuliah kurang dari 4 (agar tabel rapi)
            for (int j = nilaiMahasiswa[i].length; j < 4; j++) {
                System.out.print("    ");
            }

            System.out.printf("| %-10.2f | %-12s |\n", rataRata[i], status[i]);
        }

        System.out.println("===================================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa dan mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        // Menyimpan nilai mahasiswa
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMataKuliah];
        double[] rataRata = new double[jumlahMahasiswa];
        String[] status = new String[jumlahMahasiswa];

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            rataRata[i] = hitungRataRata(nilaiMahasiswa[i]);
            status[i] = tentukanKelulusan(rataRata[i]);
        }

        // Menampilkan hasil dalam bentuk tabel
        tampilkanTabel(nilaiMahasiswa, rataRata, status);

        scanner.close();
    }
}
