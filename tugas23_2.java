import java.util.Scanner;

public class tugas23_2 {

    // Fungsi untuk menampilkan menu
    public static void menu() {
        System.out.println("Pilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Keluar");
    }

    // Fungsi untuk menghitung volume kubus
    public static double hitungVolume(double rusuk) {
        return Math.pow(rusuk, 3);
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaan(double rusuk) {
        return 6 * Math.pow(rusuk, 2);
    }

    // Fungsi untuk menghitung keliling kubus
    public static double hitungKeliling(double rusuk) {
        return 12 * rusuk;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            menu();
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Masukkan panjang rusuk kubus: ");
                double rusuk = sc.nextDouble();

                switch (choice) {
                    case 1:
                        double volume = hitungVolume(rusuk);
                        System.out.println("Volume kubus: " + volume);
                        break;
                    case 2:
                        double luasPermukaan = hitungLuasPermukaan(rusuk);
                        System.out.println("Luas permukaan kubus: " + luasPermukaan);
                        break;
                    case 3:
                        double keliling = hitungKeliling(rusuk);
                        System.out.println("Keliling kubus: " + keliling);
                        break;
                }
            } else if (choice != 4) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (choice != 4);

        System.out.println("Terima kasih! Program selesai.");
        sc.close();
    }
}