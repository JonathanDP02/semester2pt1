import java.util.Scanner;

public class jobsheet1ke2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("Masukkan NIM Anda: ");
         long nim = input.nextLong(); 
 
         int n = (int) (nim % 100); 

         if (n < 10) {
             n += 10;
         }
 
         System.out.print("Output: ");
         for (int i = 1; i <= n; i++) {
             if (i == 6 || i == 10) {
                 continue;
             }
             if (i % 2 == 0) {
                 System.out.print(i + " "); 
             } else {
                 System.out.print("* "); 
             }
         }
 
         System.out.println();
  
    }
}
