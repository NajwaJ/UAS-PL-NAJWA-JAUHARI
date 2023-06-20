import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] teks = new String[10];

        System.out.println("Masukkan 10 teks:");
        inputTeks(teks, scanner);

        int jumlahTeksPanjang = hitungTeksPanjang(teks);
        System.out.println("Jumlah teks dengan panjang 5 karakter: " + jumlahTeksPanjang);
    }

    public static void inputTeks(String[] teks, Scanner scanner) {
        int i = 0;
        while (i < 10) {
            teks[i] = scanner.nextLine();
            i++;
        }
    }

    public static int hitungTeksPanjang(String[] teks) {
        int jumlahTeksPanjang = 0;
        int i = 0;
        while (i < teks.length) {
            jumlahTeksPanjang += (teks[i].length() == 5) ? 1 : 0;
            i++;
        }
        return jumlahTeksPanjang;
    }
}
