package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite o nome: ");
        nome = entrada.nextLine();

        while (nome.length() <= 3) {
           System.out.println("Nome inválido! Deve ter mais de 3 caracteres."); 
           System.out.println("Digite o nome: ");
           nome = entrada.nextLine();
        }

        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Idade Inválida!");
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();


        }

        System.out.println("Digite o salário: ");
        salario = entrada.nextDouble();

        while (salario <= 0) {
            System.out.println("Salário inválido!");
            System.out.print("Digite o salário: ");
            salario = entrada.nextDouble();

        }
        
        entrada.nextLine();

        System.out.print("Digite o sexo (f/m): ");
        sexo = entrada.nextLine();

        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo inválido!");
            System.out.println("Digite o sexo (f/m): ");
            sexo = entrada.nextLine();
        }

        System.out.print("Digite o estado civil (s/c/v/d):");
        estadoCivil = entrada.nextLine();

        while (!estadoCivil.equals("s") &&
               !estadoCivil.equals("c") &&
               !estadoCivil.equals("v") &&
               !estadoCivil.equals("d")) {

            System.out.println("Estado civil inválido!");
            System.out.println("Digite o estado civil (s/c/v/d): ");
            estadoCivil = entrada.nextLine();

               }
             
               System.out.println("Dados válidos cadastrados com sucesso! ");

               entrada.close();

    }
    
}
