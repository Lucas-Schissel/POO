/*
 * Lucas Schissel POO2
 */
package exe2;

public class baralho {
    private carta coringa;
    
    public void mostrar(carta c){
        try{
            System.out.printf("Carta: " + c.getValor() + " de " + c.getNaipe());
            System.out.printf("\n");
        }catch (Exception e){
            System.out.printf("Argumento não encontrado");
            System.out.printf("\n");
        }
    }
 
    
}
