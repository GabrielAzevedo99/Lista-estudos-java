/*1.Armazenar um arrayde 10 números inteiros:
•Solicitar ao usuário que informe cada um destes números; ou
•Gerar 10 números aleatórios para o array:
–Randomrnd= newRandom();//Inicia Aleatório [Fora do laço]
–array[indice]= rnd.nextInt(100); //Gera um número aleatório
 */

package lista.vetoresArraysJava;

import java.util.Arrays;
import java.util.Random;

public class ExerciciosArrays {

    public static void main(String[] args) {
        
        int[] x = new int[10];
        Random rnd = new Random();
        
        for (int i = 0; i < 10; i++) {
            x[i] = rnd.nextInt(100); // Gera um número aleatório entre 0 e 99
        
        }

    //2.Mostrar o array na sequência adquirida/gerada;
    
    System.out.println("ordenação de numeros conforme gerados");
    
     for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
     
    //3.Colocar todo o arrayem ordem crescente;
    
         System.out.println("ordenação de numeros em ordem cresente");
        
       
        Arrays.sort(x); //Ordena o array em ordem crescente
        
        
     //4.Mostrar o array ordenado na tela.

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
    }
    } 
}

