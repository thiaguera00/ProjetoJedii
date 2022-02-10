package Nivel2;
//Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor
// qualquer, sendo atendida na segunda condição, não executando a terceira e nem um ELSE
public class Exercicios04 {
    public static void main(String[] args) {
        int value = 22;

        if (value == 0){
            System.out.println("verdadeiro");
        }
        else if (value == 22){
            System.out.println("verdadeiro");
        }
        else if(value == 12){
            System.out.println("verdadeiro");
        }else {
            System.out.println("falso");
        }
    }
}
