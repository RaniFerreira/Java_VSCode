package secao4;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

    System.out.println("digite o nome do aluno");
    String nome = scan.nextLine();

    System.out.println("Digite a primeira nota:");
    double nota1 = scan.nextDouble();

    System.out.println("Digite a segunda nota:");
    double nota2 = scan.nextDouble();

    System.out.println("Digite a terceira nota:");
    double nota3 = scan.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("O nome do aluno(a) é: " + nome);
    System.out.println("Sua média foi: " + media);

    scan.close();

    if(media >= 7.0){
        System.out.println("Aprovado(a)");
    }
    else{
        System.out.println("Reprovado(a)");
    }


    }
    
}
