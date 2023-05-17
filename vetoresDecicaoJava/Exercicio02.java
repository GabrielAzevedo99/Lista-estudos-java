/*2.Calcular a multa: Leia a velocidade de um carro e a velocidade máxima para a rua:

1.Informe 50 reais se estiver até 10km/h acima;
2.Informe 100 reais se estiver entre 11km/h e 30km/h acima;
3.Informe 300 reais se estiver acima de 31km/h acima; */

package lista.vetoresDecicaoJava; 

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
    
    Scanner texto = new Scanner(System.in);
    
    System.out.printf("Digite a velocidade do automovel: ");
    int velo = texto.nextInt();
    
    System.out.printf("Digite a velocidade maxima da rua: ");
    int max = texto.nextInt();
    
    int acima = max - velo;
    
    if(acima == 1 && acima <= 10){ 
        System.out.printf("Multa de 50 Reais");
    }
     if(acima >= 11 && acima < 31){ 
        System.out.printf("Multa de 100 Reais");
    }
      if(acima >= 31){ 
        System.out.printf("Multa de 300 Reais");
    }
    
}
}    
