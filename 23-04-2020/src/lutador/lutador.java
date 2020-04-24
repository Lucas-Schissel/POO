//Lucas Schissel - POO1 - 2020.1
package lutador;

public class lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
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
        }else if(peso < 83.9){
            setCategoria("Médio");
        }else if(peso < 120.2){
            setCategoria("Pesado");
        }
    }
    
    public void apresentar(){
        System.out.printf("\nNome: " + getNome()
                         + "\nPeso:" + getPeso()
                         + "\nCategorias:" + getCategoria()
                         + "\nVitorias:" + getVitorias()
                         + "\nDerrotas:" + getDerrotas()
                         + "\nEmpates:" + getEmpates()
                         + "\n");
        System.out.printf("-----------------------------------------------------\n");
    }
    
    public void status(){
        System.out.printf("\nNome: " + getNome()
                         + "\nNacionalidade" + getNacionalidade()
                         + "\nIdade: " + getIdade()
                         + "\nAltura:   " + getAltura()
                         + "\nPeso:" + getPeso()
                         + "\nVitorias:" + getVitorias()
                         + "\nDerrotas:" + getDerrotas()
                         + "\nEmpates:" + getEmpates()
                         + "\n");
        System.out.printf("-----------------------------------------------------\n");
        
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
        
    }
    
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    
    
    //Getter e Setters

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    private double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
        setarCategoria();
    }

    private String getCategoria() {
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
