import java.util.Scanner;

public class PotonganHarga {
       public static void main(String[] args) {
        double Potongan;
        double harga;

        Scanner PotonganHarga = new Scanner(System.in);
        System.out.println("Masukkan Harga Total Pembelian : ");
        double Total = PotonganHarga.nextDouble();
        System.out.println("Total Pembelian Rp = "+Total);
        if (Total < 50000){
            Potongan = 0.05*Total;
            harga = Total - Potongan;
            System.out.println("Besarnya Potongan Rp = "+Potongan);
            System.out.println("Jumlah Yang Harus DIbayar Rp = "+harga);
        }
        else if(Total >= 50000){
            Potongan = 0.2*Total;
            harga = Total - Potongan;
            System.out.println("Besarnya Potongan Rp = "+Potongan);
            System.out.println("Jumlah Yang Harus DIbayar Rp = "+harga);
        }
       } 
}
