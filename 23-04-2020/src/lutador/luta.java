//Lucas Schissel - POO1 - 2020.1
package lutador;

import java.util.Random;


public class luta{
    private lutador desafiado;
    private lutador desafiante;
    private boolean aprovada;
             
    public void marcarLuta(lutador d1, lutador d2){
       System.out.printf("#######################################################\n"); 
       boolean exame;
            if((d1.getCategoria() == d2.getCategoria()) && (d1.getNome() != d2.getNome())){
               exame = true;
               setDesafiado(d1);
               setDesafiante(d2); 
               setAprovada(exame);             
               
               System.out.printf("\n                    Luta marcada!!!                  \n");
               System.out.printf("................."+ d1.getNome() +" x "+ d2.getNome() + ".................\n");
               
            }else{
               exame = false;
               setAprovada(false);
               System.out.printf("\n                   Luta nao marcada               \n");
               
            }
        lutar();
        System.out.printf("\n#######################################################\n");
    }
    
    private void lutar(){
        
        System.out.printf("\n                       ...UFC...                        \n");
        boolean valor=getAprovada();
        if(valor==true){
                     
           Random ale = new Random();
           int resultado = ale.nextInt(3);
           
           switch(resultado){
               case 0:  
                        System.out.printf("                     Luta empatou!                  \n");    
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
               case 1:
                        System.out.printf("                  Ganhador:" + getDesafiado().getNome() + "\n");
                         this.desafiado.ganharLuta();
                         this.desafiante.perderLuta();    
                        break;
               case 2:
                        System.out.printf("                   Ganhador:" + getDesafiante().getNome() + "\n");
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta(); 
                        break;
           }         
         
        }else{
            System.out.printf("Luta foi suspensa por ter duas categoria incompativel\n");
        }
        
    }
            
     //Getter e Setters

    public lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    /**
     *
     * @param aprovada
     */
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
           
}
