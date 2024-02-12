package encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
//        Cliente cliente = new Cliente();
//
//        cliente.nome = "Daniel Oliveira";
//        cliente.telefone = "2199123456";
//
//        System.out.println("Nome cliente: " + cliente.nome);

        Cliente cliente = new Cliente();

        cliente.setNome("Daniel Oliveira"); //colocando valor na variavel "nome"
        cliente.setTelefone("2199123456");

        System.out.println("Nome cliente: " + cliente.getNome()); //pegando o valor que está na variavel "nome"

        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: " + cliente.getUltimoNome());



    }
}
