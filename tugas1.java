import java.util.Scanner;

public class tugas1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah Mahasiswa\t:");
        int jmlMhs = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah\t:");
        int jmlMatkul = sc.nextInt();

        int [][] nilaiMhs = new int[jmlMhs][jmlMatkul];
        int[] rataRata = new int[jmlMhs];
        String[] lulus = new String[jmlMhs];

        for (int i = 0; i < jmlMhs; i++){
            System.out.println("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            for (int j = 0; j < jmlMatkul; j++){
                System.out.println("Nilai Mata Kuliah ke-" + (j + 1) + " : ");
                nilaiMhs[i][j] = sc.nextInt();
            }
        }

        rataRata = hitungRata(nilaiMhs);
        lulus = lulusTidak(rataRata);
        
        System.out.println("\nTABEL:");
        System.out.println("======================================");
        System.out.printf("| %-12s | %-10s | %-12s |\n", "Mahasiswa", "Rata-rata", "Keterangan");
        System.out.println("======================================");

        for (int i = 0; i < jmlMhs; i++) {
            System.out.printf("| %-12s | %-10d | %-12s |\n", "Mahasiswa " + (i + 1), rataRata[i], lulus[i]);
        }

        System.out.println("======================================");

    }


    //fungsi untuk mencari rata-rata
    public static int[] hitungRata(int[][] nilaiMatkul){
        int rataNilai [] = new int[nilaiMatkul.length];

        for (int i = 0; i < nilaiMatkul.length; i++){
            int nilai = 0;
            for (int j = 0; j < nilaiMatkul[i].length; j++){
                nilai += nilaiMatkul[i][j];
            }
            rataNilai[i] = nilai / nilaiMatkul[i].length;
        }
        return rataNilai;
    }

    //fungsi untuk mendeteksi lulus / tidaknya
    public static String[] lulusTidak(int rataNilai[]){
        String[] status = new String[rataNilai.length];

        for(int i = 0; i < status.length; i++){
            status[i] = (rataNilai[i] >= 75) ? "Lulus" : "Tidak Lulus";
        }
        return status;
    }

    
}
