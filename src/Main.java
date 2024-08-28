import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int media=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("digite um numero para calculo de uma media: ");
            media = media + sc.nextInt();
        }
        System.out.printf("a media dos numeros e %d", media/5);
    }
}