import javax.swing.*;
import java.util.Scanner;

public class exec002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o numero do raio: \n");
        double raio = sc.nextDouble();

        raio = Math.PI * raio * raio;
        String mostrar = "a area do circulo e " + String.format("%.2f",raio);

        JOptionPane.showMessageDialog(null,
                mostrar);

    }
}
