import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        
        
        do { 
            System.out.println("======= MENU ========");
            System.out.println(" 1. Biodata Saya");
            System.out.println(" 2. Hobi Saya");
            System.out.println(" 3. Status Saya");
            System.out.println(" 4. KELUAR");
            System.out.print("  Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println(" Nama : Kevin");
                    System.out.println(" Umur : 16 tahun");
                    System.out.println(" Alamat : BarBar");
                    break;
                case 2:
                    System.out.println(" Hobi : Bermain Game (EFOTBALL)");
                    break;
                case 3:
                    System.out.println(" Status : Pelajar Pancasila");
                    break;
                case 4:
                    System.out.println("Terima kasih, Karena ingin tau Tentang Saya.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
            
        } while (pilihan !=4);
        sc.close();
    }

}
