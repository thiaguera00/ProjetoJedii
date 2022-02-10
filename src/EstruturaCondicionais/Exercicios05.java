package EstruturaCondicionais;

//Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável
// é igual ao case (1, 2, 3). Os cases devem escrever quando
// o valor for igual ao seu próprio. Mostrando apenas a frase do case referente ao valor.

public class Exercicios05 {
    public static void main(String[] args) {

        int value = 3;

        switch (value){
            case 1:
            case 2:
            case 3:
                System.out.println(value);
                break;
        }
    }
}
