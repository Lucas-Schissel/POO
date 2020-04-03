//Lucas Schissel - POO1 - 2020.1

package contabancaria;


public class ContaBancaria {


    public static void main(String[] args) {
 
        Conta Lucas = new Conta();
        Lucas.titular = "Lucas Schissel";
        Lucas.agencia = 228;
        Lucas.numero = 199620;
        Lucas.saldo = 8534.50;
        Lucas.dataabertura = "20/05/2018";
        
        String retornaDados = Lucas.retornaDados();
        System.out.print(retornaDados);
    }
    
}
