//Lucas Schissel - POO1 - 2020.1
package lutador;

public class lutador{
    private String nome="";
    private String nacionalidade="";
    private int idade=0;
    private double altura=0;
    private double peso=0;
    private String categoria="";
    private int vitorias=0;
    private int derrotas=0;
    private int empates=0;
    
    public lutador(String no, String na, int id, double al, double ps, int vt, int dr, int ep){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(ps);
        setVitorias(vt);
        setDerrotas(dr);
        setEmpates(ep);
        
    }
    
    private void setarCategoria() {
        if(peso < 52.2){
            setCategoria("Invalido");
        }else if(peso <= 70.3){
            setCategoria("Leve");
        }else if(peso <= 83.9){
            setCategoria("Médio");
        }else if(peso <= 120.2){
            setCategoria("Pesado");
        }else{
            setCategoria("Invalido");
        }
    }
    
    public void apresentar(){
        System.out.printf("\nNome: " + getNome()
                         + "\nCategorias: " + getCategoria()
                         + "\nVitorias: " + getVitorias()
                         + "\nDerrotas: " + getDerrotas()
                         + "\nEmpates: " + getEmpates()
                         + "\n");
        System.out.printf("------------------------------------------------------\n");
    }
    
    public void status(){
        System.out.printf("\nNome: " + getNome()
                         + "\nNacionalidade: " + getNacionalidade()
                         + "\nIdade: " + getIdade()
                         + "\nAltura: " + getAltura()
                         + "\nPeso: " + getPeso()
                         + "\nVitorias: " + getVitorias()
                         + "\nDerrotas: " + getDerrotas()
                         + "\nEmpates: " + getEmpates()
                         + "\n");
        System.out.printf("------------------------------------------------------\n");
        
    }
    
    public void ganharLuta(){
        int n = getVitorias()+1;
        setVitorias(n);
    }
    
    public void perderLuta(){
        int n = getDerrotas()+1;
        setDerrotas(n);   
    }
    
    public void empatarLuta(){
        int n = getEmpates()+1;
        setEmpates(n);
    }
    
    
    //Getter e Setters

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
        setarCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria(String categoria){
        this.categoria = categoria;
    }   

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
     
}
