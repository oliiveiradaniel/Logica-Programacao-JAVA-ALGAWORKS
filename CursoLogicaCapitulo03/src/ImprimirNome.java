import java.util.Scanner;

public class ImprimirNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Informe o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);

    }
}
