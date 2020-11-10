/*
 * Lucas Schissel POO2
 */
package exe2;

import java.io.IOException;
import java.util.Random;

public class Jogo {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException{
        
        carta c[] = new carta[52];
    
        c[0] = new carta("2","Ouro");
        c[1] = new carta("3","Ouro");
        c[2] = new carta("4","Ouro");
        c[3] = new carta("5","Ouro");
        c[4] = new carta("6","Ouro");
        c[5] = new carta("7","Ouro");
        c[6] = new carta("8","Ouro");
        c[7] = new carta("9","Ouro");
        c[8] = new carta("10","Ouro");
        c[9] = new carta("J","Ouro");
        c[10] = new carta("Q","Ouro");
        c[11] = new carta("K","Ouro");
        c[12] = new carta("As","Ouro");
        
        c[13] = new carta("2","Espada");
        c[14] = new carta("3","Espada");
        c[15] = new carta("4","Espada");
        c[16] = new carta("5","Espada");
        c[17] = new carta("6","Espada");
        c[18] = new carta("7","Espada");
        c[19] = new carta("8","Espada");
        c[20] = new carta("9","Espada");
        c[21] = new carta("10","Espada");
        c[22] = new carta("J","Espada");
        c[23] = new carta("Q","Espada");
        c[24] = new carta("K","Espada");
        c[25] = new carta("As","Espada");
        
        c[26] = new carta("2","Copas");
        c[27] = new carta("3","Copas");
        c[28] = new carta("4","Copas");
        c[29] = new carta("5","Copas");
        c[30] = new carta("6","Copas");
        c[31] = new carta("7","Copas");
        c[32] = new carta("8","Copas");
        c[33] = new carta("9","Copas");
        c[34] = new carta("10","Copas");
        c[35] = new carta("J","Copas");
        c[36] = new carta("Q","Copas");
        c[37] = new carta("K","Copas");
        c[38] = new carta("As","Copas");
        
        c[39] = new carta("2","Paus");
        c[40] = new carta("3","Paus");
        c[41] = new carta("4","Paus");
        c[42] = new carta("5","Paus");
        c[43] = new carta("6","Paus");
        c[44] = new carta("7","Paus");
        c[45] = new carta("8","Paus");
        c[46] = new carta("9","Paus");
        c[47] = new carta("10","Paus");
        c[48] = new carta("J","Paus");
        c[49] = new carta("Q","Paus");
        c[50] = new carta("K","Paus");
        c[51] = new carta("As","Paus");
        
        baralho truco = new baralho();
        
        Random ale1 = new Random();
        
        int valor1 = ale1.nextInt(51);
        
        try{        
            if(valor1 >= 0 || valor1 <=51);  
        }catch(Exception e){
            System.out.printf("Valor Invalido");
            System.out.printf("\n");
        }finally{
            truco.mostrar(c[valor1]);  
        }
        
                     
        
    }
        
}
