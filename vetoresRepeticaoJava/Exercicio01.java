//1.Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.

package lista.vetoresRepeticaoJava;

import java.util.Scanner;

public class Exercicio01 {
    
     public static void main(String[] args) {
    
    Scanner texto = new Scanner(System.in);
    
    for(int i = 1000; i <= 1999; i++){
        System.out.println(i);
        if (i % 11 == 5){
         System.out.println(i + " dividido por 11 tem resto 5");   
        }
    }
    
}
}
