//Lucas Schissel - POO1 - 2020.1
package data;

public class Data{
    private int dia;
    private int mes;
    private int ano;
    
        /* A verificaçao Inicial verifica se os numeros estao dentro do esperado, dias entre 1 e 31 , 
        mes entre 1 e 12 , ano maior que 0, só depois passando para um verificaçao especifica*/
    public void setData(int d,int m,int a) {
         if((d > 0 && d <32) && (m > 0 && m < 12) && (a>0)){
            if(verificaDia(d,m,a)==true){
                setDia(d);
                setMes(m);
                setAno(a);
            System.out.printf("Data valida!\n");
            }else{
            System.out.printf("Data Invalida!\n");
            }   
        
        }else{
            System.out.printf("Dados Invalidos!\n");
        }
    }
    
    /*A funçao verificaDia recebe dia, mes e ano, como parametro e verifica a relaçao de dia com o mes
    retornado true ou false*/
    private boolean verificaDia(int d,int m,int a){
        boolean resultado=false;
          boolean tipo_ano = verificaBisexto(a);
          int tipo_mes = verificaMes(m,tipo_ano);  
                    if(d <= tipo_mes){
                        resultado = true;
                    }
           return resultado;
    }
    
    /* A funçao verificaMes recebe uma variavel int m para mes, e uma variavel boolean a para ano, que comparara
    o limite de dias para o mes em relaçao ao ano quando este for bisexto, sendo que true representa bisexto
    o retorno sera o limite de dias para aquele mes em relaçao ao ano.
    */
    private int verificaMes(int m,boolean a){
        int limite; 
        
        //fevereiro.
        switch (m) {
            case 2:
                if(a == true){
                    limite = 29;
                }else{
                    limite = 28;
                }
                // janeiro,março,maio,julho,agosto,outubro,dezembro .      
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                limite = 31;
                //abril,junho,setembro,novembro.
                break;
            default:
                limite = 30;
                break;
        }
        return limite;
    }
    
    /* A funçao verificaBisexto é recursiva, e recebe o ano como parametro, a ideia é que seja sempre
    diminuido 4 anos do ano atual até que este chege a 0, se a condiçao for satisfeita o ano é bisexto,
    quando for um ano normal o resultado da diminuiçao de 4 anos vai resultar em um valor final que nao 
    é zero, sendo o retorno boolean para ambos os casos, sendo true para bisexto e false para normal*/
    
    private boolean verificaBisexto(int a){
        boolean anob;
            if(a==0){
                anob = true;
                return anob;
            }
            if(a<3){
                anob = false;
                return anob;
            }
    return verificaBisexto(a-4);
    }
    
    public void getData(){
        if((this.dia != 0) && (this.mes !=0 ) && (this.ano != 0)){
            System.out.printf("Dia: " + this.dia
                            + "\nMes: " + this.mes
                            + "\nAno: " + this.ano
                            + "\n\n");
        }else{
            System.out.printf("Nao é possivel buscar essa data:\n");
        }
    }       

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
}