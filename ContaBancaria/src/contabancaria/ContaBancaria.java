//Lucas Schissel - POO1 - 2020.1

package contabancaria;


public class ContaBancaria {


    public static void main(String[] args) {
 
        Conta Lucas = new Conta();
        Lucas.titular = "Lucas Schissel";
        Lucas.agencia = 228;
        Lucas.numero = 199620;
        Lucas.saldo = 10000.50;
        Lucas.dataabertura = "20/05/2018";
        
        Lucas.retornaDados();        
        Lucas.sacarConta(1000.50);
        Lucas.retornaDados();
        Lucas.depositarConta(3000.00);
        Lucas.retornaDados(); 
        Lucas.rendimentoConta(0.02);
        Lucas.retornaDados(); 
        

    }
    
}
