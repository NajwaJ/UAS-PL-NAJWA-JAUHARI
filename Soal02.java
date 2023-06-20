import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = scanner.nextLine();

        boolean panjang5 = cekPanjangTeks(teks);

        String status = panjang5 ? "Panjang teks adalah 5 karakter." : "Panjang teks tidak 5 karakter.";
        System.out.println(status);
    }

    public static boolean cekPanjangTeks(String teks) {
        return (teks.length() == 5);
    }
}
