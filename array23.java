import java.util.Scanner;

public class array23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        double[] sks = {3.0, 3.0, 3.0, 4.0, 2.0, 4.0, 2.0, 3.0};
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        double totalBobotNilai = 0;
        double totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk Mata Kuliah " + mataKuliah[i] +" = ");
            nilaiAngka[i] = scanner.nextDouble();
        }
        
        System.out.println("\n====================================================================================");
        System.out.printf("%-40s %-15s %-15s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("====================================================================================");
        
        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf;
            
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf = "E";
                bobotNilai[i] = 0.0;
            }
            
            totalBobotNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
            
            System.out.printf("%-40s %-15.2f %-15s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai[i]);
        }
        
        double ip = totalBobotNilai / totalSKS;
        System.out.println("====================================================================================");
        System.out.printf("IP Semester : %.2f\n", ip);
        
        scanner.close();
    }
}