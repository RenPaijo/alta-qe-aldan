import java.util.Scanner;

public class DrawXYZ {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan barisnya: ");
        int ba = s.nextInt();
        System.out.print("Masukkan kolomnya: ");
        int kol = s.nextInt();

        Draw(ba, kol);
    }
    
    static void Draw(int ba, int kol){

        int[][] grid = new int [ba][kol];

        for(int i = 0; i <= grid.length; i++){
            for(int col = 0; col < grid[i].length; col++){
                if (col == 2) {
                    System.out.print(" X ");
                } else if ((col + 1) % 2 == 0) {
                    System.out.print(" Z ");
                } else {
                    System.out.print(" Y ");
                }
            }

            System.out.println();
        }
    }
}
