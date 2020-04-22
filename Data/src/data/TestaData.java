//Lucas Schissel - POO1 - 2020.1


package data;

public class TestaData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Dia Mes Ano
        Data teste1 = new Data();
        Data teste2 = new Data();
        
        teste1.setData(29,2,2016);
        teste1.getData(); 
        
        teste2.setData(29,0,2019);      
        teste2.getData();
    }
    
}