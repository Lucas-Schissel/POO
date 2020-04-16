//Lucas Schissel - POO1 - 2020.1
package caneta;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta; 
    private int carga;
    private boolean estado;
    
    public void adicionaCaneta(String m,String c,double p,int g,boolean e){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = g;
        this.estado = e;
    }
    
    public void rabiscar(){
        if(estado == true){ 
          System.out.printf("\nDestampe a caneta " + this.modelo +"/"+ this.cor +"/"+ this.ponta +" para rabiscar\n");
        }else{
          System.out.printf("Pode escrever com a caneta " + this.modelo +"/"+ this.cor +"/"+ this.ponta+"\n");   
        }
    }
    public void tampar(){
        this.estado = true;
         System.out.printf("A caneta " + this.modelo +"/"+ this.cor +"/"+ this.ponta+" foi tampada\n");  
    }
    public void destampar(){
        this.estado = false;
         System.out.printf("A caneta "+ this.modelo +"/"+ this.cor +"/"+ this.ponta +" foi destampada\n");  
    }
}
