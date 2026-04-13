package LISTA4JAVA;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Digite o nome de usuário: ");
        usuario = entrada.nextLine();

        System.out.println("Digite a senha: ");
        senha = entrada.nextLine();

        while (senha.equals(usuario)) {

            System.out.println("Erro! A senha não pode ser igual ao usuário.");

            System.out.println("Digite o nome do usuário: ");
            usuario = entrada.nextLine();

            System.out.println("Digite a senha: ");
            senha = entrada.nextLine();
        } 
        System.out.println("Cadastro realizado com sucesso!");

        entrada.close();

    }
    
}
