//Lucas Schissel - POO1 - 2020.1
package caneta;

public class Caneta {
    String modelo;
    String cor;
    double ponta; 
    int carga;
    boolean estado;
    
    public void rabiscar(){
        if(estado == true){ 
          System.out.printf("Destampe a caneta " + this.modelo +"/"+ this.cor +"/"+ this.ponta +" para rabiscar\n");
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
