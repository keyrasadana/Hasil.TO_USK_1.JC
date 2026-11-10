import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DiskonBarang {

    public static void main(String[] args) {

        NumberFormat format = NumberFormat.getInstance(Locale.forLanguageTag("id-ID"));

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Harga Barang : Rp. ");
            double harga = input.nextDouble();

            System.out.print("Diskon (%) : ");
            int diskon = input.nextInt();

            double jumlahDiskon = harga * diskon / 100;
            double totalHarga = harga - jumlahDiskon;

            System.out.println("\n== RINCIAN PEMBAYARAN ==");
            System.out.println("Harga Barang : Rp. " + format.format(harga));
            System.out.println("Diskon : " + diskon + " %");
            System.out.println("Diskon (Rp.) : Rp. " + format.format(jumlahDiskon));
            System.out.println("Total Harga : Rp. " + format.format(totalHarga));
        }
    }
}