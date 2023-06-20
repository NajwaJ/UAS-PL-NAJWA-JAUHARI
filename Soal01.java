import java.util.Scanner;
public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan beberapa angka: ");
        nilai = scanner.nextInt();

        while (nilai % 5 != 0) {
            nilai = scanner.nextInt();
            System.out.println("Angka bukan kelipatan 5.");
            System.out.print("Masukkan angka lain: ");
        }

        System.out.println("Angka " + nilai + " adalah kelipatan 5.");
    }
}
