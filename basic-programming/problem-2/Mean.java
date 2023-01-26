import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        int input;
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan berapa banyak data: ");
        input = s.nextInt();

        if (input > 0){
            System.out.println("\nMasukkan isi data berupa angka:");
            int[] data =  new int[input];
            for (int i = 0; i < input; i++)
            {
                System.out.print("- Isi Data ke-" +(i + 1)+ " = ");
                data[i] = s.nextInt();
            }

            System.out.println("\nHasil Perhitungan:");
            System.out.println("- Mean = "+mean(data));

        } else{
            System.err.println("Silahkan masukkan banyak data lebih dari 0");
        }
    }

    static double mean(int[] data){
        int tambah = 0;
        for (int dataTambah : data){
            tambah += dataTambah;
        }

        return tambah / (double) data.length;
    }
}

