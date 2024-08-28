import javax.swing.*;
import java.util.Scanner;

public class exec006 {
    public static void main(String[] args){
        double salarioAntigo=0.0;
        Scanner input = new Scanner(System.in);
        System.out.printf("digite seu salario:\n");
        salarioAntigo = input.nextDouble();

        String show = String.format("seu novo salario e de R$" + salarioAntigo + "\nseu novo salario e de R$" + salarioAntigo * (1+15/100) + "\nE um aumento de 15%%");

        JOptionPane.showMessageDialog(null,show);

    }
}
