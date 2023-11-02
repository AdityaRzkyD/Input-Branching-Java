import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        double Kg, m, imt;
        String Kriteria;

        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan Berat Badan : ");
        Kg = Input.nextDouble();
        System.out.println("Masukkan Tinggi Badan : ");
        m = Input.nextDouble();

        imt = Kg / m * m;

        System.out.println("Berat Badan             : "+Kg+" Kg");
        System.out.println("Tinggi Badan            : "+m+" M");
        System.out.println("Indeks Massa Tubuh      : "+imt);

        if(imt >= 40){
            Kriteria = "Sangat Gemuk";
            System.out.println("Kriteria                : "+Kriteria);
        }
        else if(imt >= 30 && imt <= 39.9){
            Kriteria = "Gemuk";
            System.out.println("Kriteria                : "+Kriteria);
        }
        else if(imt >= 25 && imt <= 29.9){
            Kriteria = "Berat Badan Lebih";
            System.out.println("Kriteria                : "+Kriteria);
        }
        else if(imt >= 18.5 && imt <= 24.9){
            Kriteria = "Berat Badan Ideal";
            System.out.println("Kriteria                : "+Kriteria);
        }
        else{
            Kriteria = "Berat Badan Kurang";
            System.out.println("Kriteria                : "+Kriteria);
        }
    }
}
