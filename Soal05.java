import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println("Masukkan 10 angka:");

        inputAngka(angka, scanner);

        System.out.print("Masukkan angka target: ");
        int target = scanner.nextInt();

        int[] indeks = cariIndeksAngka(angka, target);

        if (indeks.length > 0) {
            System.out.println("Angka " + target + " ditemukan pada indeks:");
            for (int i : indeks) {
                System.out.println(i);
            }
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
    }

    public static void inputAngka(int[] angka, Scanner scanner) {
        int i = 0;
        while (i < 10) {
            angka[i] = scanner.nextInt();
            i++;
        }
    }

    public static int[] cariIndeksAngka(int[] arr, int target) {
        List<Integer> indeksList = new ArrayList<>();

        int indeks = 0;
        while (indeks < arr.length) {
            boolean isEqual = arr[indeks] == target;
            indeksList.add(indeks * (isEqual ? 1 : 0));
            indeks++;
        }

        return indeksList.stream().mapToInt(Integer::intValue).toArray();
    }
}
