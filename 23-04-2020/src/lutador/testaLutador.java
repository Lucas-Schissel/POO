//Lucas Schissel - POO1 - 2020.1
package lutador;

public class testaLutador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               	
         lutador one =  new lutador("Pretty Boy","França",31,1.75,68.9,11,2,1);
         lutador two =  new lutador("Putscrip","Brasil",29,1.68,57.8,14,2,3);
         lutador three =  new lutador("Snapshadow","Estado Unidos",35,1.65,80.9,12,2,1);
         lutador four =  new lutador("Dead Code","Austrália",28,1.93,81.6,13,0,2);
         lutador five =  new lutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3);
         lutador six =  new lutador("Nerdaard","Estado Unidos",30,1.81,105.7,12,2,4);
       
         one.apresentar();
         two.apresentar();
         three.apresentar();
         four.apresentar();
         five.apresentar();
         six.apresentar();
       
       
       
     
    }
    
}
