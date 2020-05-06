//Lucas Schissel - POO1 - 2020.1
package pedidos;

//Importaçoes
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException{
        int menu =2;
        int item = 1;
        produto pdr[] = new produto[11];
        ItemPedido ped[] = new ItemPedido[10];
        
        pdr[1] = new produto(1,2500.00,"Computador     ");
        pdr[2] = new produto(2,500.00,"Monitor        ");
        pdr[3] = new produto(3,50.00,"Mouse          ");
        pdr[4] = new produto(4,250.00,"Teclado        ");
        pdr[5] = new produto(5,150.00,"Placa de Rede  ");
        pdr[6] = new produto(6,350.00,"Impressora     ");
        pdr[7] = new produto(7,25.00,"Pen Drive      ");
        pdr[8] = new produto(8,425.00,"Processador    ");
        pdr[9] = new produto(9,1255.00,"Placa Mae      ");
        pdr[10] = new produto(10,585.00,"Memoria       ");   
        
        Pedido p1 = new Pedido();
        
        do{
        System.out.printf("Menu de Opçoes:\n");
        System.out.printf("1 - Adicionar item ao pedido:\n");
        System.out.printf("2 - Apresentar total de pedido:\n");
        Scanner opcao1 = new Scanner(System.in);
        menu = opcao1.nextInt();
        limpatela();
    
            if( menu == 1){
                int produto,quantidade;
                System.out.printf("Escolha uma opcao entre os Produtos: \n");
                
                for(int i=1; i<11;i++){
                System.out.printf(i +" - "+ pdr[i].getDescricao() + "R$: " + pdr[i].getValor() + "\n");
                }  
                
                 Scanner opcao2 = new Scanner(System.in);
                 produto = opcao2.nextInt();   
                 limpatela();
                 
                 System.out.printf("Digite a quantidade: \n");
                 quantidade = opcao2.nextInt();
                 ped[item] = new ItemPedido(pdr[produto],quantidade);                 
                 p1.adicionar_item(ped[item]);
                 item = item+1;
                 limpatela();
            }
        
        }while(menu!= 2);
        
         p1.obter_total();    
        
    }
    
    public static void limpatela(){
       try {
        Robot robot = new Robot();
        robot.setAutoDelay(10);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
    }   
   
    
}
