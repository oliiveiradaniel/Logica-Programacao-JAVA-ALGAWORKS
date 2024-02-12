package Exercicio01;

public class Produto {

    public String nome;

    public Integer quantidadeEstoque;

    Boolean quantidadeMinima() {

        if (quantidadeEstoque < 10) {
            System.out.println("Atualmente, temos no estoque " + quantidadeEstoque + " " + nome + "(s). É necessario a reposição do estoque!");
            return false;
        } else {
            System.out.println("Atualmente, temos no estoque " + quantidadeEstoque + " " + nome + "(s). Não é necessario a reposição do estoque.");
            return true;
        }
    }
}
