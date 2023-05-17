/*5.Ler 2 valores fracionários e perguntar qual operação aritmética o usuário quer fazer com eles.
Usar switch..case. Informar o resultado da operação. */

package lista.vetoresDecicaoJava;

import java.util.Scanner;

public class Exercicio05 {
    
     public static void main(String[] args) {
    
    Scanner texto = new Scanner(System.in);
    
    System.out.printf("Digite um valor ");
    double n1 = texto.nextDouble();
    
    System.out.printf("Digite Outro valor ");
    double n2 = texto.nextDouble();
    
    System.out.printf("Digite a operacao aritmetica ");
    String Opera = texto.next();
    
    switch(Opera){
        case "+":
   System.out.println(""+(n1 + n2));
   break;
        case "-":
   System.out.println("" + (n1 - n2));
   break;
        case "/":
   System.out.println("" + n1 / n2);
   break;
        case "*":
   System.out.println("" + n1 * n2);
   break;
    default:
   System.out.println("Desconhecido");
   break;
    }
    
}
}

