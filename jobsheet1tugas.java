import java.util.Scanner;

public class jobsheet1tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[][] kota = {
            {"B", "A", "N", "T", "E", "N", " ", " ", " ", " ", " ", " "},
            {"J", "A", "K", "A", "R", "T", "A", " ", " ", " ", " ", " "},
            {"B", "A", "N", "D", "U", "N", "G", " ", " ", " ", " ", " "},
            {"C", "I", "R", "E", "B", "O", "N", " ", " ", " ", " ", " "},
            {"B", "O", "G", "O", "R", " ", " ", " ", " ", " ", " ", " "},
            {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N", " ", " "},
            {"S", "E", "M", "A", "R", "A", "N", "G", " ", " ", " ", " "},
            {"S", "U", "R", "A", "B", "A", "Y", "A", " ", " ", " ", " "},
            {"M", "A", "L", "A", "N", "G", " ", " ", " ", " ", " ", " "},
            {"T", "E", "G", "A", "L", " ", " ", " ", " ", " ", " ", " "},
        };

        System.out.print("Masukkan kode plat nomor (A, B, D, E, F, G, H, K, L, N, T): ");
        String inputKode = sc.nextLine();

        Boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i].equals(inputKode)) {
                System.out.print("Kode plat " + inputKode + " adalah untuk kota: ");
                for (String c : kota[i]) {
                    if (!c.equals(" ")) {
                        System.out.print(c);
                    }
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }


    }
}
