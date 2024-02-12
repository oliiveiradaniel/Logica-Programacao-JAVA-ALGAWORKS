package metodoinstancia;

public class MetodoInstancia {
    public static void main(String[] args) {

        //pode criar varios "clientes" usando a mesma classe
        Cliente cliente1 = new Cliente();
        cliente1.primeiroNome = "Daniel";
        cliente1.ultimoNome = "Oliveira";
        cliente1.telefone = "219000000";
        cliente1.email = "daniel.oliveira@algaworks.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Caroline";
        cliente2.ultimoNome = "Sodre";
        cliente2.telefone = "219000000";


        System.out.println("O nome completo é: " + cliente1.obterNomeCompleto() + ", e o DDD é: " + cliente1.obterDDD());
        System.out.println("O nome completo é: " + cliente2.obterNomeCompleto() + ", e o DDD é: " + cliente2.obterDDD());
    }
}
