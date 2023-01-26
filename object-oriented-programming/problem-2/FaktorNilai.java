import java.util.Scanner;

public class FaktorNilai {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bil = s.nextInt();

        System.out.print("Faktor dari bilangan "+bil+": ");

        for (int x = 1; x <= bil; x++){
            if (bil % x == 0) {
                System.out.print(x+", ");
            }
        }
    }
}
