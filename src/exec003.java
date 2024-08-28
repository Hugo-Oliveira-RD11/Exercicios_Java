import javax.swing.*;
import java.util.Scanner;

public class exec003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasTrabalhadas, salarioHora;

        System.out.printf("digite as horas trabalhadas nesse mes:\n");
        horasTrabalhadas = sc.nextDouble();
        System.out.printf("digite o seu salario hora:\n");
        salarioHora = sc.nextDouble();

        String msg = "o seu salario nesse mes e de R$" +  String.format("%.2f",horasTrabalhadas * salarioHora);

        JOptionPane.showMessageDialog(null, msg);
    }
}
