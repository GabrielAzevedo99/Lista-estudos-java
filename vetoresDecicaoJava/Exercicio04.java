/*4.Escrever se um ano informado pelo usuário é bissexto ou não.
Um ano é bissexto quando é (divisível por 400) oué (divisível por 4 enão por 100); */

package lista.vetoresDecicaoJava;

import java.util.Scanner;

public class Exercicio04 {
    
     public static void main(String[] args) {
    
    Scanner texto = new Scanner(System.in);
    
    System.out.printf("Digite o ano: ");
    int ano = texto.nextInt();
    
    if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
       System.out.printf("O ano e Bisiestos"); 
        
    }else 
        System.out.printf("O ano NAO e Bisiestos");
    
}
}