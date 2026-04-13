package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String repetir = "s";

        while (repetir.equals("s")) {

            double populacaoA, populacaoB;
            double taxaA, taxaB;

            System.out.println("Digite a população de A: ");
            populacaoA = entrada.nextDouble();

            while (populacaoA <= 0) {
                System.out.println("Valor inválido!");
                System.out.print("Digite a população de A: ");
                populacaoA = entrada.nextDouble();   

            }

            System.out.print("Digite a população de B: ");
            populacaoB = entrada.nextDouble();

            while (populacaoB <= 0) {
                System.out.println("Valor inválido!");
                System.out.print("Digite a população de B: ");
                populacaoB = entrada.nextDouble();


            }

            System.out.println("Digite a taxa de crescimento de A (%): ");
            taxaA = entrada.nextDouble();

            while (taxaA <= 0) {
                System.out.println("Taxa inválida!");
                System.out.println("Digite a taxa de A: ");
                taxaA = entrada.nextDouble();

            }

            System.out.println("Digite a taxa de crescimento de B (%):");
            taxaB = entrada.nextDouble();

            while (taxaB <= 0) {
                System.out.println("Taxa inválida!");
                System.out.println("Digite a taxa de B: ");
                taxaB = entrada.nextDouble();
            }

            int anos = 0;

            while (populacaoA < populacaoB) {

                populacaoA = populacaoA + (populacaoA * taxaA / 100);
                populacaoB = populacaoB + (populacaoB * taxaB / 100);

                anos++;

            }

            System.out.println("Anos necessários: " + anos);
            System.out.println("População final de A: " + (int) populacaoA);
            System.out.println("População final de B: " + (int) populacaoB);

            entrada.nextLine(); 
            System.out.print("Deseja repetir? (s/n): ");
            repetir = entrada.nextLine();

            }

            entrada.close();

        }
    }
    
