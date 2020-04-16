//Lucas Schissel - POO1 - 2020.1

package contabancaria;

//Importaçoes

//Classe Conta e sua funçoes
public class Conta {
    
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    private String dataabertura;
    
    public void retornaDados(){
        System.out.printf("\nTitular: " + this.titular
                         + "\nNumero: " + this.numero 
                         + "\nAgencia: " + this.agencia
                         + "\nSaldo:   " + this.saldo
                         + "\nData Abertura:" + this.dataabertura
                         + "\n");
    }
    
    public void adicionaConta(String t,int n,int a,double s,String d){
        this.titular = t;
        this.numero = n;
        this.agencia = a;
        this.saldo = s;
        this.dataabertura = d;
    }
    
    public void sacarConta(double valor){
        this.saldo = this.saldo - valor;   
    }
    
    public void depositarConta(double valor){
        this.saldo = this.saldo + valor;  
    }
    
    public void rendimentoConta(double taxa){
        this.saldo = this.saldo * (1 + taxa);  
    }
    
    
}
