import java.util.Scanner;

import javax.lang.model.type.NullType;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            
            System.out.println("Idade: ");
            idade = scan.nextInt();
            break;
            
        }
        if (idade = scan.nextInt() >=18) {
            System.out.println("Acesso permitido ");
        } else {
            System.out.println("Acesso negado ");
                   

        }

           // System.out.println("Continua aqui...");

    }

}