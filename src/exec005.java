import java.util.Scanner;

public class exec005 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double carro = 1000.00,desc=10.00;
        System.out.printf("o preço do carro e de R$%.2f\ndigite o porcentagem a ser descontado:",carro);
        desc = sc.nextDouble();

       carro = carro - carro * (desc/100);
        System.out.printf("o novo preco do carro e de R$%.2f",carro);
    }
}
