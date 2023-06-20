import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println("Masukkan 10 angka:");

        masukkanAngka(angka, scanner);

        int jumlahKelipatan5 = hitungKelipatan5(angka);

        System.out.println("Banyak angka kelipatan 5: " + jumlahKelipatan5);
    }

    public static void masukkanAngka(int[] angka, Scanner scanner) {
        int i = 0;
        while (i < 10) {
            angka[i] = scanner.nextInt();
            i++;
        }
    }

    public static int hitungKelipatan5(int[] angka) {
        int jumlahKelipatan5 = 0;
        int i = 0;
        while (i < angka.length) {
            boolean kelipatan5 = angka[i] % 5 == 0;
            jumlahKelipatan5 += kelipatan5 ? 1 : 0;
            i++;
        }
        return jumlahKelipatan5;
    }
}
