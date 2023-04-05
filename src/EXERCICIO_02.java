import java.util.Scanner;

public class EXERCICIO_02 {

    public static void main(String[] args) {
        // Criar um programa que leia 4 notas de um aluno
        // calcule a sua média e indique na tela se ele está
        // sprovado, em prova final ou reprovado
        // APR -> 7 ou mais; PF -> ENTRE 6 e 6.9;
        // REP -> MENOR QUE 6
        Scanner leia = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;
        System.out.println("Informe a primeira nota:");
        nota1 = leia.nextFloat();
        System.out.println("Informe a segunda nota:");
        nota2 = leia.nextFloat();
        System.out.println("Informe a terceira nota:");
        nota3 = leia.nextFloat();
        System.out.println("Informe a quarta nota:");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média do aluno: " + media);
        if (media >= 7) {
            System.out.println("Você está aprovado!");
        } else if (media >= 6 && media <= 6.9) {
            System.out.println("Você está em prova final!");
        } else if (media < 6) {
            System.out.println("Você está reprovado!");
        }

    }
}