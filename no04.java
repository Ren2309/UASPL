package UASPL;
//nomor 04
import java.util.*;

public class no04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = 0;

        System.out.println("");//masukkan 10 teks
        for (int i = 0; i < 10; i++) {
            String teks = scanner.nextLine();
            if (teks.length() == 5) {
                angka++;
            }
        }

        System.out.println("Banyak teks dengan panjang 5 karakter ada  " + angka);
    }
}

