package EstruturaCondicionais;

//Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável
// é igual ao case (a, b, c e default).
// O código deve executar apenas o default com a mensagem: “O valor não é compatível”.

public class Exercicios06 {
    public static void main(String[] args) {
        String value = "d";

        switch (value){
            case "a":
            case "b":
            case "c":
                System.out.println("é para imprimir nada");
                break;
            default:
                System.out.println("O valor não é compativel");
                break;
        }
    }

}
