//Lucas Schissel - POO1 - 2020.1

package contabancaria;

//Importaçoes

//Classe Conta e sua funçoes
public class Conta {
    
    String titular;
    int numero;
    int agencia;
    double saldo;
    String dataabertura;
    
    public String retornaDados(){
        return "\nTitular: " + this.titular
             + "\nNumero: " + this.numero 
             + "\nAgencia: " + this.agencia
             + "\nSaldo:   " + this.saldo
             + "\nData Abertura:" + this.dataabertura
             + "\n";
    }
    
}
