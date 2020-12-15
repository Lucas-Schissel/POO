//EXE3
//LUCAS SCHISSEL POO2

package exe3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EXE3 {

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
           
          
     //Exercicio 01 - exibe utilizando o Iterator (1º Lista)
     
        System.out.println("Lista de Dados: ");
        Iterator N = numbers.iterator();
         while (N.hasNext()){
             Object element = N.next();
             System.out.println(element + "");
         }
        
         
        int total;
        total = (int) numbers.stream().count();     
        System.out.println("Quantidade de Dados: " + total);   
        
        int total2;
        total2 =  (int) dados.stream().reduce(0, (accum,e)->accum+e);
        
        
    }
    
}
