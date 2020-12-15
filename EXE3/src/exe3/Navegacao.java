//EXE3
//LUCAS SCHISSEL POO2

package exe3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Navegacao {
    public static void mostraInfo(Numeros n){
        System.out.println(n.getNum());
    }
    
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);  
        ArrayList dados = new ArrayList();       
        Set<Numeros> numbers;              
        numbers = new HashSet<Numeros>();
        int num,sair=9999;
        
     //Ciclo whille de repetição permite digitar dados até que se digite zero para sair.
     
        while(sair != 0){  
            System.out.println("Digite qualquer número ou '0'ZERO para finalizar a inserção: ");     
            num = input.nextInt();
                if(num != 0){//A condição serve para impedir que o zero seja lançado como numero no array list.
                     dados.add(num); 
                }
            sair = num;
        }       
        
    //Adiciona os elementos digitados ao array list dados        
        numbers.addAll(dados); 
        
    //Exercicio 01 - exibe utilizando o foreach (2º Lista)
     
        dados.forEach((n) -> Navegacao.mostraInfo((Numeros) n));
        
         
     }
}
