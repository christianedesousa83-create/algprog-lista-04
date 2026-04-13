package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = entrada.nextDouble();

        while (nota < 0 || nota > 10) {

            System.out.println("Valor inválido! Tente novamente.");

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = entrada.nextDouble();
            
        }

        System.out.println("Nota válida: " + nota);

        entrada.close();

    }

    
}
