//3.Ler 3 valores em qualquer ordem e escrever eles em ordem crescente;

package lista.vetoresDecicaoJava;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    
        public static void main(String[] args) {
    
    Scanner texto = new Scanner(System.in);
    
    System.out.printf("Digite o primeiro valor: ");
    int n1 = texto.nextInt();
    
    System.out.printf("Digite o segundo valor: ");
    int n2 = texto.nextInt();
    
    System.out.printf("Digite o terceiro valor: ");
    int n3 = texto.nextInt();
    
    int[] valor = {n1, n2, n3};
        Arrays.sort(valor);

        System.out.println("Valores em ordem crescente: " + valor[2] + ", " + valor[1] + ", " + valor[0]);
    }
    
        }
    
