//Lucas Schissel - POO1 - 2020.1
package pedidos;

public class produto {
    private int codigo;
    private double valor;
    private String descricao;
    
    public produto(int c,double v,String d){
        setCodigo(c);
        setValor(v);
        setDescricao(d);        
    }
    
    public void mostraProduto(){
        System.out.printf("-----------------------------------------------------------\n");
        System.out.printf("ID: "+getCodigo()+" Valor: "+getValor()+" Descricao: "+getDescricao());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
    
    
    
}
