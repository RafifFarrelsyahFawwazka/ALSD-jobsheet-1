import java.util.Scanner;
public class tugas23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] kota = {
                {"B", "A", "N", "T", "E", "N"},
                {"J", "A", "K", "A", "R", "T", "A"},
                {"B", "A", "N", "D", "U", "N", "G"},
                {"C", "I", "R", "E", "B", "O", "N"},
                {"B", "O", "G", "O", "R"},
                {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
                {"S", "E", "M", "A", "R", "A", "N", "G"},
                {"S", "U", "R", "A", "B", "A", "Y", "A"},
                {"M", "A", "L", "A", "N", "G"},
                {"T", "E", "G", "A", "L"}
        };


        System.out.print("Masukkan kode plat mobil: ");
        char inputKode = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                index = i;
                break;
            }
        }


        if (index != -1) {
            System.out.println("Nama kota dari kode plat " +inputKode+ " adalah : " + String.join("", kota[index]));
        } else {
            System.out.println("Kode plat mobil tidak ditemukan.");
        }
    }
}

        