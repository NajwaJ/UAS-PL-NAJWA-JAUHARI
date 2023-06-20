public class Soal09 {
    public static void main(String[] args) {
        int[] angka = {10, 25, 8, 30, 15, 12, 20, 5, 18};
        int indeks = cariIndeksTerbesarKelipatan5(angka);

        switch (indeks) {
            case -1:
                System.out.println("Tidak ditemukan angka terbesar kelipatan 5.");
                break;
            default:
                System.out.println("Angka terbesar kelipatan 5 ditemukan pada indeks: " + indeks);
        }
    }

    public static int cariIndeksTerbesarKelipatan5(int[] arr) {
        int indeksTerbesar = -1;
        int terbesar = Integer.MIN_VALUE;
        int i = 0;

        while (i < arr.length) {
            int kelipatan = (arr[i] % 5 == 0) ? arr[i] : 0;
            int perbedaan = kelipatan - terbesar;
            int updateIndeks = (perbedaan >> 31) & 1;

            indeksTerbesar = (1 - updateIndeks) * indeksTerbesar + updateIndeks * i;
            terbesar = (1 - updateIndeks) * terbesar + updateIndeks * kelipatan;

            i++;
        }

        return indeksTerbesar;
    }
}
