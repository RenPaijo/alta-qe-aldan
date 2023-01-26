import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = s.nextLine();

        System.out.println(Ulang(kata));
    }

    static String Ulang(String kata){

        String balik = "";
        int panjang = kata.length();
        for (int z = panjang - 1; z >= 0; z--){
            balik = balik + kata.charAt(z);
        }
        if (kata.equals(balik)) {
            System.out.println("Kata "+kata+" merupakan kata palindrome");
        } else {
            System.out.println("Kata "+kata+" tidak merupakan kata palindrome");
        }

        return kata;
    }
}
