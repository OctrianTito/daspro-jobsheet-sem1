import java.util.Scanner;
public class Pemilihan2Percobaan322 {

    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak;

        System.out.print("Masukkan Kategori (Pekerja/Pebisnis) : ");
        kategori = sc22.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan :");
        penghasilan = sc22.nextInt();
        
        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);

        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);

        } else {
            System.out.print("Masukan Kategori Salah");
        }
    }
}