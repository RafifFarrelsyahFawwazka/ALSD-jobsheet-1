import java.util.Scanner;
public class tugas23_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();  // Mengonsumsi newline
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String nama = sc.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    public static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] sks,
     int[] semester, String[] hariKuliah) {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println("Mata Kuliah: " + namaMataKuliah[i] + "| SKS: " + sks[i] +
             "| Semester: " + semester[i] + "| Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMataKuliah, int[] sks,
     int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i] + "| SKS: " + sks[i] +
                 "| Semester: " + semester[i] + "| Hari: " + hariKuliah[i]);
            }
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMataKuliah, int[] sks,
     int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah pada semester " + sem + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (semester[i] == sem) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i] + "| SKS: " + sks[i] +
                 "| Semester: " + semester[i] + "| Hari: " + hariKuliah[i]);
            }
        }
    }

    public static void cariMataKuliah(String[] namaMataKuliah, int[] sks,
     int[] semester, String[] hariKuliah, String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i] + "| SKS: " + sks[i] +
                 "| Semester: " + semester[i] + "| Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama " + nama + " tidak ditemukan.");
        }
    }
}