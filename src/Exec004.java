import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class Exec004 {
    public static void main(String[] args) {
    int ano,mes,dia,idade=0;
    String nome;
    Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

    System.out.printf("digite o seu nome:\n");
    nome = input.nextLine();

    System.out.printf("digite a data do seu nascimento: [ dd/mm/AA ] \n");
    dia = input.nextInt();
    mes = input.nextInt();
    ano = input.nextInt();

    if (dia >31 || mes > 12 || ano > cal.get(Calendar.YEAR)) {
        JOptionPane.showMessageDialog(null,"O Ano digitado estar errado");
        return;
    }

    if(cal.get(Calendar.MONTH)<mes){
        if (cal.get(Calendar.DAY_OF_MONTH)<dia){
            idade = cal.get(Calendar.YEAR) - ano -1;
        }
    }else{
        idade = cal.get(Calendar.YEAR) - ano ;
    }

    String msg= String.format("Voce se chama " + nome + " e possui " + idade + " anos de idade");
    JOptionPane.showMessageDialog(null,msg);
    }
}
