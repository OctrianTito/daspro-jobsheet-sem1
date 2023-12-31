import java.util.Scanner;

public class NestedLoop_2341720078 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        int kotaCounter = 1;
        for (double[] kota : temps) {
            System.out.print("Kota ke-" + kotaCounter + " : ");
            double total = 0;
            for (double suhu : kota) {
                System.out.print(suhu + " ");
                total += suhu;
            }
            double rataRata = total / kota.length;
            System.out.println("\nRata-rata suhu kota ke-" + kotaCounter + ": " + rataRata);
            kotaCounter++;
        }
    }
}
