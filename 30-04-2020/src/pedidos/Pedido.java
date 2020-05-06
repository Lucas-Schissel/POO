//Lucas Schissel - POO1 - 2020.1
package pedidos;

public class Pedido {
    private double valor_total = 0;
    
    public void adicionar_item(ItemPedido item){
        setValor_total(item.getSubtotal());        
    }
        
    public void obter_total(){
        System.out.printf("Total do pedido:" +  getValor_total() + "\n");
    }      
    
    //Getters e Setters
    
    private double getValor_total() {
        return valor_total;
    }

    private void setValor_total(double valor_total) {
        this.valor_total += valor_total;
    }   
       
}
