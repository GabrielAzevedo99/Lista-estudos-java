/*2.Colocar estas duas linhas iniciais no método Main():
Randomrnd= newRandom(); // Inicia Aleatório 
int x = rnd.nextInt(100); //Gera um número aleatório (0 –99)
1.Faça um laço de repetição que solicite ao usuário digitar um número;
2.O laço encerra quando o usuário acertar o número;
3.Se o número do usuário for menor que o oculto, escrever: “MAIOR”,
se o número do usuário for maior que o oculto, escrever: “MENOR”. */

package lista.vetoresRepeticaoJava;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

    
    public static void main(String[] args) {
        
    Random rnd = new Random(); // Inicia Aleatório 
    int x = rnd.nextInt(100); //Gera um número aleatório (0 –99)
    
    Scanner texto = new Scanner(System.in);

    int n = 0;
    
   for(int i = n; i != x; i++){
      
      System.out.printf("Digite um numero ");
      n = texto.nextInt();
      
      if(n > x){
          System.out.println("numero maior");
      }
      if(n < x){
          System.out.println("numero menor");
      }
      
      if(n == x){
          System.out.println("VOCE ACERTOU");
          break;
      }
       
   }
}
    }
