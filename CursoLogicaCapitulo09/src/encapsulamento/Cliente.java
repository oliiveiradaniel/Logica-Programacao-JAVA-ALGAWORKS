package encapsulamento;

public class Cliente {

//    String nome;

    String primeiroNome;

    String ultimoNome;

    String telefone;

    //get e set personalizado para o "primeiroNome" e "ultimoNome"
    String getNome() {
        return primeiroNome + " " + ultimoNome;
    }

    void setNome(String nome) {
        String[] nomeCompleto = nome.split(" "); //guardando a variavel "primeiroNome" e "ultimoNome" dentro do array "nomeCompleto" e separando por um espaço
        primeiroNome = nomeCompleto[0];
        ultimoNome = nomeCompleto[1];
    }

    //getters e setters (normalmente feitos automaticamente pela IDE se não tiver personalização)
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
