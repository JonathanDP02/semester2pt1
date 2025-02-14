import java.util.Scanner;

public class jobsheet1tugas3 {
  static Scanner sc = new Scanner(System.in);
  static String[] Matkul;
  static int[] sks;
  static int[] semester;
  static String[] hariKuliah;
  static  int n;   

  public static void main(String[] args) {
      input();
      
      while (true){
        System.out.println("=== JADWAL PERKULIAHAN ===");
        System.out.println("1. seluruh jadwal kuliah");
        System.out.println("2. jadwal berdasarkan hari tertentu");
        System.out.println("3. jadwal berdasarkan semester tertentu");
        System.out.println("4. Cari mata kuliah");
        System.out.println("5. Keluar");

        System.out.print("Masukkan pilihan: ");
        int pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih){
          case 1:
            seluruhJadwal();
            break;
          case 2:
            berdasarkanHari();
            break;
          case 3:
            berdasarkanSemester();
            break;
          case 4:
            cariMataKuliah();
            break;
          case 5:
            System.out.println("=== TERIMA KASIH ===");
            return;
          default:
            System.out.println("=== !!!INPUT TIDAK VALID!!! ===");
        }

      }

  }

  public static void input(){
    System.out.print("Masukkan jumlah mata kuliah: ");
    n = sc.nextInt();
    sc.nextLine();

    Matkul = new String[n];
    sks = new int[n];
    semester = new int[n];
    hariKuliah = new String[n];

    for (int i = 0; i < n; i++){
      System.out.println("Mata Kuliah ke-" + (i+1));
      System.out.print("Nama Mata Kuliah: ");
      Matkul[i] = sc.nextLine();

      System.out.print("SKS: ");
      sks[i] = sc.nextInt();

      System.out.print("Semester: ");
      semester[i] = sc.nextInt();
      sc.nextLine();

      System.out.print("Hari Kuliah: ");
      hariKuliah[i] = sc.nextLine();
    }
  }

   public static void seluruhJadwal() {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s\n", Matkul[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

   public static void berdasarkanHari() {
        System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
        String hariCari = sc.nextLine();
        System.out.println("\nJadwal Kuliah pada " + hariCari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.println("Mata Kuliah: " + Matkul[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari);
        }
    }

  public static void berdasarkanSemester() {
        System.out.print("Masukkan semester yang ingin ditampilkan: ");
        int semesterCari = sc.nextInt();
        System.out.println("\nJadwal Kuliah pada Semester " + semesterCari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (semester[i] == semesterCari) {
                System.out.println("Mata Kuliah: " + Matkul[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + semesterCari);
        }
    }

  public static void cariMataKuliah() {
        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String mataKuliahCari = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (Matkul[i].equalsIgnoreCase(mataKuliahCari)) {
                System.out.println("Mata Kuliah: " + Matkul[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama " + mataKuliahCari + " tidak ditemukan.");
        }
    }

}