package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int maior = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + "º némero: ");
            numero = entrada.nextInt();

            if (i == 1) {
                maior = numero;
            } else if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        entrada.close();
    }
    
}
