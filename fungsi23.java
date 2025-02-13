public class fungsi23 {
    private static final int[][] stockBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    private static final int[] hargaBunga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        // pendapatan setiap cabang jika semua bunga habis terjual
        tampilkanPendapatan();

        // stock bunga pada setiap cabang
        tampilkanStock();

        // mengurangi stock bunga mati
        int[] penguranganStock = {-1, -2, 0, -5};
        kurangiStock(penguranganStock);

        // stock setelah pengurangan
        tampilkanStock();
    }

    // pendapatan setiap cabang jika semua bunga habis terjual
    public static void tampilkanPendapatan() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    // jumlah stock bunga pada cabang RoyalGarden
    public static void tampilkanStock() {
        String[] jenisBunga = {"Agionema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.println("Stock RoyalGarden " + (i + 1) + ":");
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.println(jenisBunga[j] + ": " + stockBunga[i][j]);
            }
            System.out.println();
        }
    }

    // mengurangi stock karena bunga mati
    public static void kurangiStock(int[] pengurangan) {
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += pengurangan[j];
            }
        }
    }
}