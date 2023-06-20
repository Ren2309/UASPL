package UASPL;
//nomor 01
import java.util.*;

public class no01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" "); //masukkan angka
        int angka = scanner.nextInt();

        String kelipatan = (angka % 5 == 0) ? "adalah kelipatan 5" : "bukan kelipatan 5";
        System.out.println(angka + " " + kelipatan);
    }
}
