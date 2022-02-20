package calc;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            double a, b;
            
            System.out.println("Digite o primeiro valor: ");
            a = scan.nextInt();

            System.out.println("Digite o segundo valor: ");
            b = scan.nextInt();
            
            double soma = soma(a,b);
            double subtracao = subtracao(a,b);
            double divisao = divisao(a,b);
            double multiplicacao = multiplicacao(a,b);

            System.out.println(soma);
            System.out.println(subtracao);
            System.out.println(divisao);
            System.out.println(multiplicacao);
        }

    }
            public static double soma(Double a, Double b){
                return a + b;
    }
            public static double subtracao(Double a, Double b){
                return a - b;
            }
            public static double divisao(Double a, Double b){
                return a / b;
            }
            public static double multiplicacao(Double a, Double b){
                return a * b;
            }
}