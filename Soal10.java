import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soal10 {
    public static void main(String[] args) {
        int[] angka = {10, 7, 15, 3, 20, 11, 25, 8};

        List<Integer> kelipatan5 = cariKelipatan5(angka);

        if (kelipatan5.isEmpty()) {
            System.out.println("Tidak ada angka kelipatan 5 dalam array.");
            return;
        }

        System.out.println("Angka-angka kelipatan 5 (terurut):");
        for (int num : kelipatan5) {
            System.out.println(num);
        }
    }

    public static List<Integer> cariKelipatan5(int[] arr) {
        List<Integer> kelipatan5 = new ArrayList<>();

        for (int num : arr) {
            int isKelipatan5 = (num % 5 == 0) ? 1 : 0;
            kelipatan5.add(num * isKelipatan5);
        }

        Collections.sort(kelipatan5);

        return kelipatan5;
    }
}
