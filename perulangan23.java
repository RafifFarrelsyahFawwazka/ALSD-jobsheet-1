import java.util.Scanner;
public class perulangan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Masukkan N (2 digit terakhir NIM anda) = ");
        n = sc.nextInt();
        if (n<=10) {
            n+=10;
        }
        

        for (int i = 0;i<=n;i++) {

            if (i % 2 != 0){
                System.out.print(" * ");
            } else if  ( i==6 || i == 10) {
                continue;
            } else {
                System.out.print(i);
            }
            
        }


    }
}