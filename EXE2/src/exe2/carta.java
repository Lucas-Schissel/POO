/*
 * Lucas Schissel POO2
 */
package exe2;

public final class carta {
    
    private String Valor;
    private String Naipe;
    
    public carta(String v,String n){
        setValor(v);
        setNaipe(n);
    }

    public String getValor() {
        return Valor;
    }
    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    public String getNaipe() {
        return Naipe;
    }
    public void setNaipe(String Nipe) {
        this.Naipe = Nipe;
    }
    
    
    
    
}
