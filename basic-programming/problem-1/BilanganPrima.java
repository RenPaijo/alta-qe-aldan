import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = s.nextInt();

        System.out.println(Prima(angka));


    }

    static int Prima(int angka){
        int faktor = 0;

        for(int x = 1; x <= angka; x++){
            if (angka % x == 0) {
                faktor++;
            }
        }
        if (faktor > 2) {
            System.out.println("Bilangan "+angka+" bukan bilangan prima");
        } else {
            System.out.println("Bilangan "+angka+" merupakan bilangan prima");
        }

        return angka;
    }
}
