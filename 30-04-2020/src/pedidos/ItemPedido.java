//Lucas Schissel - POO1 - 2020.1
package pedidos;

public class ItemPedido{
    private int quantidade;
    private produto pdr;
    private double subtotal;
    
    public ItemPedido(produto pdr,int qtd){
        setSubtotal(pdr.getValor()*qtd);
    }  
    
    public void MostraItem(){
        System.out.printf("-"+getQuantidade());
        System.out.printf("-"+getPdr());
    }

    //Getters e Setters..........................................

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public produto getPdr() {
        return pdr;
    }

    public void setPdr(produto pdr) {
        this.pdr = pdr;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
   

          
}
