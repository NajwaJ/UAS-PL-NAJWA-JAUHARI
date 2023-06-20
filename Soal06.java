import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah teks: ");
        int jumlahTeks = scanner.nextInt();

        String[] arrayTeks = new String[jumlahTeks];

        System.out.println("Masukkan teks:");
        for (int i = 0; i < jumlahTeks; i++) {
            arrayTeks[i] = scanner.next();
        }

        System.out.print("Masukkan teks yang ingin dicari: ");
        String teksDicari = scanner.next();

        List<Integer> indeksPencarian = cariTeks(arrayTeks, teksDicari);

        if (!indeksPencarian.isEmpty()) {
            System.out.println("Teks '" + teksDicari + "' ditemukan pada indeks:");
            for (int indeks : indeksPencarian) {
                System.out.println(indeks);
            }
        } else {
            System.out.println("Teks '" + teksDicari + "' tidak ditemukan dalam array.");
        }
    }

    public static List<Integer> cariTeks(String[] arr, String teks) {
        List<Integer> indeksPencarian = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(teks)) {
                indeksPencarian.add(i);
            }
        }

        return indeksPencarian;
    }
}
