//Lucas Schissel - POO1 - 2020.1
package lutador;

import java.util.Random;

public class testaLutador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         lutador homen[] = new lutador[6];      	
         homen[0] =  new lutador("PrettyBoy","França",31,1.75,68.9,11,2,1);
         homen[1] =  new lutador("Putscrip","Brasil",29,1.68,57.8,14,2,3);
         homen[2] =  new lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);
         homen[3] =  new lutador("DeadCode","Australia",28,1.93,81.6,13,1,2);
         homen[4] =  new lutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3);
         homen[5] =  new lutador("Nerdaard","EUA",30,1.81,105.7,12,2,4);
                  
         luta ufc123 = new luta();
         
         
             Random ale1 = new Random();
             Random ale2 = new Random();
             int valor1 = ale1.nextInt(3);
             int valor2 = ale2.nextInt(6);
             homen[valor1].status();
             homen[valor2].status();
             ufc123.marcarLuta(homen[valor1],homen[valor2]);
             homen[valor1].apresentar();
             homen[valor2].apresentar();
        
    }
}
