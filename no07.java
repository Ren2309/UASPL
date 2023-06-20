package UASPL;

import java.util.*;

public class no07 {
    public static List<Integer> searchIndices(String[] array) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 5) {
                indices.add(i);
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah teks: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("teks ke-" + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        List<Integer> indices = searchIndices(array);

        System.out.println(indices.isEmpty() ? "Tidak ada teks dengan panjang 5 karakter dalam array." :
                "Teks dengan panjang 5 karakter ditemukan pada indeks: " + indices);
    }
}

