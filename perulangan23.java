import java.util.Scanner;

public class perulangan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIM Anda: ");
        String nim = sc.nextLine();
        
        int n;
        if (nim.length() >= 2) {
            n = Integer.parseInt(nim.substring(nim.length() - 2));
        } else {
            System.out.println("NIM tidak valid!");
            return;
        }
        
        if (n <= 10) {
            n += 10;
        }
        
        System.out.println("n : " + n);
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(" * ");
            } else if (i == 6 || i == 10) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
