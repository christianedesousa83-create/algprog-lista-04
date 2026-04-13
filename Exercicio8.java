package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();

            soma = soma + numero;
        }

        media = soma / 5.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        entrada.close();
        
    }
    
}
