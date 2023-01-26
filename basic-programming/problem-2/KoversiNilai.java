import java.util.Scanner;

public class KoversiNilai {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nilai siswa: ");
        int nilai = s.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Siswa mendapatkan predikat A");
        } else if (nilai >= 65 && nilai < 80) {
            System.out.println("Siswa mendapatkan predikat B+");
        } else if (nilai >= 50 && nilai < 65) {
            System.out.println("Siswa mendapatkan predikat B");
        } else if (nilai >= 35 && nilai < 50) {
            System.out.println("Siswa mendapatkan predikat C");
        } else if (nilai >= 0 && nilai < 35) {
            System.out.println("Siswa mendapatkan predikat D");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
