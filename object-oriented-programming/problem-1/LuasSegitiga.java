import java.util.Scanner;

public class LuasSegitiga{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int a = s.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        int t = s.nextInt();

        double L = 0.5 * a * t;
        System.out.println("Luas segitiga adalah = "+L);
    }
}