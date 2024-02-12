public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira : " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel verdadeira : " + variavelFalsa);

        System.out.println("---------------------------------------");

        int idade = 20;

        Boolean podeTirarCarteira = idade >= 18;

        //System.out.println("Pode tirar carteira? " + podeTirarCarteira);

        if(podeTirarCarteira) {
            System.out.println("Sim! Ele pode tirar carteira.");
        } else {
            System.out.println("Não! Ainda não tem a idade minima.");
        }
    }
}
