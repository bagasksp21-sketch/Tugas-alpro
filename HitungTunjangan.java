import java.util.Scanner;

public class HitungTunjangan {

    public static double inputGaji(Scanner input) {
        System.out.print("Masukkan gaji kotor: ");
        return input.nextDouble();
    }

    public static int inputJumlahAnak(Scanner input) {
        System.out.print("Masukkan jumlah anak: ");
        return input.nextInt();
    }

    public static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        double tunjangan;
        if (jumlahAnak < 3) {
            tunjangan = 0.2 * gajiKotor;
        } else {
            tunjangan = 0.3 * gajiKotor;
        }
        return tunjangan;
    }

    public static void tampilkanHasil(double tunjangan) {
        System.out.println("Besar tunjangan yang diterima adalah: Rp " + tunjangan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiKotor = inputGaji(input);
        int jumlahAnak = inputJumlahAnak(input);
        double tunjangan = hitungTunjangan(gajiKotor, jumlahAnak);

        tampilkanHasil(tunjangan);

        input.close();
    }
}