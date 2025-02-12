import java.util.Scanner;

public class jobsheet1ke4 {

    static final int hargaAglonema = 75000;
    static final int hargaKeladi = 50000;
    static final int hargaAlocasia = 60000;
    static final int hargaMawar = 10000;

    static int stock [][] = new int[4][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input(sc);
        System.out.println();
        tampilan();
        System.out.println();
        total();
        System.out.println();
        mati(sc);
    }

    public static void input(Scanner sc){
        System.out.println("---------------------------------------");
        System.out.println("Masukkan stok bunga untuk setiap cabang");
        System.out.println("---------------------------------------");

        for (int i = 0; i < stock.length; i++){
            System.out.println("RoyalGarden " + (i + 1) + " : ");
            System.out.print("Aglonema\t: ");
            stock[i][0] = sc.nextInt();
            System.out.print("Keladi\t\t: ");
            stock[i][1] = sc.nextInt();
            System.out.print("Alocasia\t: ");
            stock[i][2] = sc.nextInt();
            System.out.print("Mawar\t\t: ");
            stock[i][3] = sc.nextInt();
            System.out.println();
        }
    }

    public static void tampilan(){
        System.out.println("\n--------------------------------------------------------");
        System.out.println("| Cabang      | Aglonema   | Keladi | Alocasia | Mawar  |");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("| %-11s | %-10d | %-6d | %-7d | %-5d |\n", 
                "RoyalGarden " + (i + 1), stock[i][0], stock[i][1], stock[i][2], stock[i][3]);
        }
        System.out.println("--------------------------------------------------------");
        
    }

    public static void total(){
        System.out.println("--- Pendapatan jika semua terjual ---");

        for(int i = 0; i < stock.length; i++){
            int total = (stock[i][0]*hargaAglonema) +
                        (stock[i][1]*hargaKeladi) +
                        (stock[i][2]*hargaAlocasia) +
                        (stock[i][3]*hargaMawar);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + total);
        }
    }

    public static void mati(Scanner sc){
        System.out.println("----------------------------------------");
        System.out.println("Masukkan jumlah bunga mati setiap cabang");
        System.out.println("----------------------------------------");

        String nama [] = new String[4];
        nama[0] = "Aglonema";
        nama[1] = "Keladi  ";
        nama[2] = "Alocasia";
        nama[3] = "Mawar   "; 

        for (int i = 0; i < stock.length; i++) {
            System.out.println();
            System.out.println("RoyalGarden " + (i + 1) + " : ");
            
            for (int j = 0; j < 4; j++) {
                System.out.print(nama[j] + "\t: ");
                int bungaMati = sc.nextInt();
                stock[i][j] = (stock[i][j] - bungaMati);
            }
        }

        System.out.println();
        System.out.println("Update: ");
        tampilan();

    }


}
