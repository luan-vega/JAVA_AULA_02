import java.util.Scanner;

public class EXERCICIO_03 {

    // Criar um programa que leia a idade do usuario e mostre na tela:
    // se a idade <16 : não pode votar
    // se a idade >=16 <18: pode votar, mas não é obrigatório
    // se a idade >=18 e <70: pode e deve votar
    // acima de 70: não é obrigatório votar, mas você pode

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade>=14 && idade<16){
            System.out.println("Você não pode votar!");
        }
        else if (idade>=16 && idade<18){
            System.out.println("Você pode votar, mas não é obrigatório!");
        }
        else if (idade>=18 && idade<70){
            System.out.println("Você deve votar!");
        }
        else if (idade>=70 && idade<=120){
            System.out.println("Você pode votar, mas nao é obrigatório!");
        }
        else {
            System.out.println("Idade inválida!");
        }

    }
}
