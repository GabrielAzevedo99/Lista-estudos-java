package lista.vetoresDecicaoJava;

//1.Ler 3 números fracionários do teclado e informar se o primeiro é maior do que a soma dos dois últimos;

import java.util.Scanner;


public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro numero");
        double n1 = texto.nextDouble();
        
        System.out.printf("Digite o segundo numero");
        double n2 = texto.nextDouble();
        
        System.out.printf("Digite o terceiro numero");
        double n3 = texto.nextDouble();
        
        double soma = n2 + n3;
        
        if(n1 > soma){
            System.out.printf("O n1 e maior que a soma de n2 e n3");
        }else
            System.out.printf("n1 NAO e maior que a soma de n1 e n2");
    
    }
    
}
