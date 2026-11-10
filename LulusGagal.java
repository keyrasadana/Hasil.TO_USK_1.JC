import javax.swing.JOptionPane;

public class LulusGagal {

    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(
            JOptionPane.showInputDialog("Nilai 1")
        );

        int nilai2 = Integer.parseInt(
            JOptionPane.showInputDialog("Nilai 2")
        );

        int nilai3 = Integer.parseInt(
            JOptionPane.showInputDialog("Nilai 3")
        );

        int rata = (nilai1 + nilai2 + nilai3) / 3;

        if (rata >= 60) {
            JOptionPane.showMessageDialog(null,
                "Nilai 1 : " + nilai1 +
                "\nNilai 2 : " + nilai2 +
                "\nNilai 3 : " + nilai3 +
                "\nRata-rata : " + String.format("%.2f", (double) rata) +
                "\nHasil : LULUS"
            );
        } else {
            JOptionPane.showMessageDialog(null,
                "Nilai 1 : " + nilai1 +
                "\nNilai 2 : " + nilai2 +
                "\nNilai 3 : " + nilai3 +
                "\nRata-rata : " + rata +
                "\nHasil : GAGAL"
            );
        }
    }
}