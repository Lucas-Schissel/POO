//Lucas Schissel - POO1 - 2020.1
package estudante;


public class Estudante {
    private int codigo;
    private String nome;
    private String dataNasc;
    private double notaMat;
    private double notaPort;
    private double notaCien;
    
    public void nome(int c,String n){
        setCodigo(c);
        setNome(n);       
    }
    
    public void setNotas(double m, double p, double c){
        setNotaMat(m);
        setNotaPort(p);
        setNotaCien(c);
    }
    
    public void calculaMedia(){
        double media = (getNotaMat()+getNotaPort()+getNotaCien())/3;
        System.out.printf("A média do estudande: "
                                + getNome()
                                +" é: "
                                + media
                                +"\n");
    }
    
     public void calculaMedia(int e){
        double media = ((getNotaMat()+getNotaPort()+getNotaCien())/3)+e;
        System.out.printf("A média acrescida do estudande: "
                                + getNome()
                                +" é: "
                                + media
                                +"\n");
    }
     
    public void exibiDados(){  
        System.out.printf("\nCodigo: " + getCodigo()
                         + "\nNome: " + getNome() 
                         + "\nData Nascimento: " + getDataNasc()
                         + "\nNota Mat:   " + getNotaMat()
                         + "\nNota Por:" + getNotaPort()
                         + "\nNota Cien:" + getNotaCien()                     
                         );
        calculaMedia();
        
    }
     
    // Gets e Setters 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getNotaMat() {
        return notaMat;
    }

    public void setNotaMat(double notaMat) {
        this.notaMat = notaMat;
    }

    public double getNotaPort() {
        return notaPort;
    }

    public void setNotaPort(double notaPort) {
        this.notaPort = notaPort;
    }

    public double getNotaCien() {
        return notaCien;
    }

    public void setNotaCien(double notaCien) {
        this.notaCien = notaCien;
    }
     
     
}
