//Lucas Schissel - POO1 - 2020.1
package estudante;

public class TestaEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudante e1 = new Estudante();
       
       e1.nome(1,"Lucas Schissel");
       e1.setDataNasc("22-02-1996");
       e1.setNotas(10,8.5,6.5);
       
       e1.calculaMedia();
       e1.calculaMedia(1);       
       e1.exibiDados();
       
       System.out.printf("\n-----------------------------------------------------\n");
       
       Estudante e2 = new Estudante();
       
       e2.setNome("Halyssa Coppel");
       e2.setCodigo(2);
       e2.setDataNasc("28-02-1996");
       e2.setNotaMat(9.5);
       e2.setNotaPort(10);
       e2.setNotaCien(4.5);
       
       e2.calculaMedia();
       e2.calculaMedia(1);
       e2.exibiDados();
    }
    
}
