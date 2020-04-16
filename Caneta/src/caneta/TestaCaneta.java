//Lucas Schissel - POO1 - 2020.1

package caneta;

public class TestaCaneta {
    
    public static void main(String[] args) {
        Caneta A  = new Caneta();
        String marca1 = "BIC";
        String cor1 = "Azul";
        
        A.adicionaCaneta(marca1,cor1,1.5,100, true);       
        
        Caneta B  = new Caneta();
        String marca2 = "FaberCastel";
        String cor2 = "Vermelha";
        
        A.adicionaCaneta(marca2,cor2,2.0,90, true);  
       
        
        A.rabiscar();
        A.destampar();
        A.rabiscar();
        A.tampar();
        
        B.rabiscar();
        B.destampar();
        B.rabiscar();
        B.tampar();
    }
}
