import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah teks: ");
        int jumlahTeks = scanner.nextInt();

        String[] arrayTeks = new String[jumlahTeks];

        System.out.println("Masukkan teks:");
        int i = 0;
        while (i < jumlahTeks) {
            arrayTeks[i] = scanner.next();
            i++;
        }

        System.out.print("Masukkan panjang minimum: ");
        int panjangMin = scanner.nextInt();

        System.out.print("Masukkan panjang maksimum: ");
        int panjangMax = scanner.nextInt();

        List<Integer> indeksPencarian = cariTeksRange(arrayTeks, panjangMin, panjangMax);

        if (!indeksPencarian.isEmpty()) {
            System.out.println("Teks dengan panjang antara " + panjangMin + " dan " + panjangMax + " ditemukan pada indeks:");
            int j = 0;
            while (j < indeksPencarian.size()) {
                System.out.println(indeksPencarian.get(j));
                j++;
            }
        } else {
            System.out.println("Tidak ada teks dengan panjang antara " + panjangMin + " dan " + panjangMax + ".");
        }
    }

    public static List<Integer> cariTeksRange(String[] arr, int panjangMin, int panjangMax) {
        List<Integer> indeksPencarian = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            String teks = arr[i];
            int panjangTeks = teks.length();

            int selisihMin = panjangTeks - panjangMin;
            int selisihMax = panjangMax - panjangTeks;

            int maskMin = selisihMin >> 31;
            int maskMax = selisihMax >> 31;

            if ((maskMin & maskMax) == 0) {
                indeksPencarian.add(i);
            }

            i++;
        }

        return indeksPencarian;
    }
}
