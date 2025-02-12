import java.util.Scanner;
public class pemilihan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;


        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.println("==============================");

        
        System.out.print("Masukkan nilai tugas = ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai Kuis = ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS = ");
        nilaiUts = sc.nextInt();
        System.out.print("Masukkan nilai UAS = ");
        nilaiUas = sc.nextInt();
        System.out.println("===========================");
        System.out.println("===========================");



        if (nilaiTugas<0 || nilaiTugas>100 || nilaiKuis<0 || nilaiKuis> 100 || nilaiUts<0 || nilaiUts >100|| nilaiUas < 0|| nilaiUas >100) {
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println("nilai yang anda masukkan tidak valid");
            System.out.println("====================================");
            System.out.println("====================================");
        } else {
            int nilaiAkhir = (nilaiTugas * 20/100) + (nilaiKuis * 20/100) + (nilaiUts * 30/100) + (nilaiUas * 30/100);
            System.out.println("Nilai Akhir = " + nilaiAkhir); 
            if (nilaiAkhir>80 && nilaiAkhir<=100) {
                System.out.println("Nilai Huruf = A");
                System.out.println("=================================");
                System.out.println("=================================");
            } else if (nilaiAkhir>73 && nilaiAkhir<=80) {
                System.out.println("Nilai Huruf = B+");
                System.out.println("=================================");
                System.out.println("=================================");
            } else if (nilaiAkhir>65 && nilaiAkhir<=73) {
                System.out.println("Nilai Huruf = B");
                System.out.println("=================================");
                System.out.println("=================================");
            } else if (nilaiAkhir>60 && nilaiAkhir<=65) {
                System.out.println("Nilai Huruf = C+");
                System.out.println("=================================");
                System.out.println("=================================");
            } else if (nilaiAkhir>50 && nilaiAkhir<=60) {
                System.out.println("Nilai Huruf = C");
                System.out.println("=================================");
                System.out.println("=================================");
            } else if (nilaiAkhir>39 && nilaiAkhir<=50) {
                System.out.println("Nilai Huruf = D");
                System.out.println("=================================");
                System.out.println("=================================");
            } else {
                System.out.println("Nilai Huruf = E");
                System.out.println("=================================");
                System.out.println("=================================");
            }
    
            if (nilaiAkhir<=50) {
                System.out.println("       Maaf anda tidak lulus");
                System.out.println("=================================");
                System.out.println("=================================");
            } else {
                System.out.println("        Selamat anda lulus");
                System.out.println("=================================");
                System.out.println("=================================");
            }  
        }

        

    
    }
}