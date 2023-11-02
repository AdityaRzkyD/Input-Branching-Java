import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        String NPM, Nama, Keterangan;
        double NilaiHadir, NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;
        char Grade;

        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan NPM : ");
        NPM = Input.nextLine();
        System.out.println("Masukkan Nama Mahasiswa :");
        Nama = Input.nextLine();
        System.out.println("Masukkan Nilai Kehadiran : ");
        NilaiHadir = Input.nextDouble();
        System.out.println("Masukkan Nilai Tugas : ");
        NilaiTugas = Input.nextDouble();
        System.out.println("Masukkan Nilai UTS : ");
        NilaiUTS = Input.nextDouble();
        System.out.println("Masukkan Nilai UAS : ");
        NilaiUAS = Input.nextDouble();
        System.out.println();

        NilaiAkhir = (0.1 * NilaiHadir) + (0.2 * NilaiTugas) + (0.3 * NilaiUTS) + (0.4 * NilaiUAS);

        System.out.println("NPM Mahasiswa       : "+NPM);
        System.out.println("Nama Mahasiswa      : "+Nama);
        System.out.println("Nilai Rata - Rata   : "+NilaiAkhir);

        if(NilaiAkhir > 75 && NilaiAkhir <= 100){
            Grade = 'A';
            Keterangan = "ISTIMEWA";
            System.out.println("Grade               : "+Grade);
            System.out.println("Keterangan          : "+Keterangan);
        }
        else if (NilaiAkhir > 65 && NilaiAkhir <= 75) {
            Grade = 'B';
            Keterangan = "BAIK";
            System.out.println("Grade               : "+Grade);
            System.out.println("Keterangan          : "+Keterangan);
        }
        else if (NilaiAkhir > 55 && NilaiAkhir <= 65) {
            Grade = 'C';
            Keterangan = "CUKUP";
            System.out.println("Grade               : "+Grade);
            System.out.println("Keterangan          : "+Keterangan);
        }
        else if (NilaiAkhir > 45 && NilaiAkhir <= 55){
            Grade = 'D';
            Keterangan = "KURANG";
            System.out.println("Grade               : "+Grade);
            System.out.println("Keterangan          : "+Keterangan);
        }
        else if (NilaiAkhir >= 0 && NilaiAkhir <= 45){
            Grade = 'E';
            Keterangan = "KURANG SEKALI";
            System.out.println("Grade               : "+Grade);
            System.out.println("Keterangan          : "+Keterangan);
        }
        else{
            System.out.println("Nilai Akhir Tidak Terdefinisi");
        }
    }
}
