import javax.swing.JOptionPane;

public class Perkalian {

    public static void main(String[] args) {

        int nilai1, nilai2, nilai3, hasilKali, hasilBagi;

        nilai1 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan Nilai 1:"));

        nilai2 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan Nilai 2:"));

        nilai3 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan Nilai 3:"));

        hasilKali = nilai1 * nilai2;

        hasilBagi = nilai3 / nilai2;

        JOptionPane.showMessageDialog(null,
            "Nilai 1 : " + nilai1 +
            "\nNilai 2 : " + nilai2 +
            "\nNilai 3 : " + nilai3 +
            "\nHasil Perkalian : " + hasilKali +
            "\nHasil Pembagian : " + hasilBagi);
    }
}