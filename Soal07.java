import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah teks: ");
        int jumlahTeks = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter newline

        String[] teks = new String[jumlahTeks];
        menerimaInputTeks(scanner, teks, 0);

        int[] indeks = cariIndeksTeksPanjang5(teks, 0, new ArrayList<>());

        if (indeks.length > 0) {
            System.out.println("Teks dengan panjang 5 karakter ditemukan pada indeks:");
            for (int i : indeks) {
                System.out.println(i);
            }
        } else {
            System.out.println("Tidak ditemukan teks dengan panjang 5 karakter.");
        }

        scanner.close();
    }

    public static void menerimaInputTeks(Scanner scanner, String[] teks, int index) {
        if (index < teks.length) {
            System.out.print("Masukkan teks ke-" + (index + 1) + ": ");
            teks[index] = scanner.nextLine();
            menerimaInputTeks(scanner, teks, index + 1);
        }
    }

    public static int[] cariIndeksTeksPanjang5(String[] arr, int index, List<Integer> indeksList) {
        if (index < arr.length) {
            if (arr[index].length() == 5) {
                indeksList.add(index);
            }
            cariIndeksTeksPanjang5(arr, index + 1, indeksList);
        }

        int[] indeksArray = new int[indeksList.size()];
        for (int i = 0; i < indeksList.size(); i++) {
            indeksArray[i] = indeksList.get(i);
        }

        return indeksArray;
    }
}
