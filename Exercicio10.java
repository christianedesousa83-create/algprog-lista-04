package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        int menor, maior;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;

        }

        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        entrada.close();
        
    }
    
}
