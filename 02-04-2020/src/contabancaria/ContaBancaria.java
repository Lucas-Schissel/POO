//Lucas Schissel - POO1 - 2020.1

package contabancaria;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class ContaBancaria {


    public static void main(String[] args) {
 
        Conta Lucas = new Conta();
        String nome = "Lucas Schissel";
        String data = date();
        
        Lucas.adicionaConta(nome,228,199620,10000.50,data);
        
        Lucas.retornaDados();        
        Lucas.sacarConta(1000.50);
        Lucas.retornaDados();
        Lucas.depositarConta(3000.00);
        Lucas.retornaDados(); 
        Lucas.rendimentoConta(0.02);
        Lucas.retornaDados(); 
        

    }
    
}
