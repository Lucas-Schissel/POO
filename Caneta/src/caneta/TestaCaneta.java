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
        
        A.rabiscar();
        A.destampar();
        A.rabiscar();
        A.tampar();
    }
}
