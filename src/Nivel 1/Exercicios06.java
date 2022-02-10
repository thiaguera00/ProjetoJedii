//Criar um código que compara valores iguais, maiores e menores para variáveis de tipos diferentes.
// Ex: int numero1 = 20; long numero2 = 20; numero1 == numero2.
// (utilizar: int, long, double, float e short)
public class Exercicios06 {
    public static void main(String[] args) {
        int number1 = 2;
        long number2 = 20;
        double number3 = 5.15;
        float number4 = 2.14F;

        System.out.println(number1 == number2);
        System.out.println(number4 > number3);
        System.out.println(number4 < number1);

    }
}
