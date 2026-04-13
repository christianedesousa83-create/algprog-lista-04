package LISTA4JAVA;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        double populacaoA = 80000;
        double populacaoB = 200000;

        int anos = 0;

        while (populacaoA < populacaoB) {

            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.015);

            anos++;

        }
        System.out.println("Anos necessários: " + anos);
        System.out.println("População final de A: " + (int) populacaoA);
        System.out.println("Popilação final de B: " + (int) populacaoB);

        

    }
    
}
