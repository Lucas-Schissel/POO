//Lucas Schissel - POO1 - 2020.1

package caneta;

public class TestaCaneta {
    
    public static void main(String[] args) {
        Caneta A  = new Caneta();
        A.modelo = "Bic";
        A.cor = "Azul";
        A.ponta = 1.5;
        A.carga = 100;
        A.estado = true;
        
        Caneta B  = new Caneta();
        B.modelo = "FaberCastel";
        B.cor = "Vermelha";
        B.ponta = 0.5;
        B.carga = 80;
        B.estado = true;
        
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
