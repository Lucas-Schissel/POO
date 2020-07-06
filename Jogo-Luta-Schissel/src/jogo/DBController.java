/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliente
 */
public class DBController {
    private String nomeBanco;
    private Connection conexao;
    
    DBController(String nomeBanco){
        this.nomeBanco = nomeBanco;        
    }
    
    boolean conectar(){
        File f = new File(this.nomeBanco);
         
        //Verifica se o arquivo do banco existe
        if (!f.exists()){
            return false;
        }
        
        try{
            Class.forName("org.sqlite.JDBC");
            this.conexao = DriverManager.getConnection("jdbc:sqlite:"+this.nomeBanco);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    void desconectar(){
        try { 
            this.conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     boolean cadastrar( String nome, 
                        String nacionalidade,
                        String categoria, 
                        int vitorias, 
                        int derrotas,
                        int empates){
        String ins = "INSERT INTO lutadores(nome,nacionalidade,categoria,vitorias,derrotas,empates)"
                   + "VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement stnt;
            stnt = this.conexao.prepareStatement(ins);
            stnt.setString(1,nome);
            stnt.setString(2,nacionalidade);
            stnt.setString(3,categoria); 
            stnt.setInt(4,vitorias); 
            stnt.setInt(5,derrotas); 
            stnt.setInt(6,empates); 
            
            stnt.executeUpdate();
            
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
     
     ResultSet carregarLutadores(){
         String sel = "SELECT nome,nacionalidade,categoria,vitorias,derrotas,empates FROM lutadores ORDER BY vitorias DESC";
         
         try{
             Statement stnt = this.conexao.createStatement();
             ResultSet rset = stnt.executeQuery(sel);
             return rset;
             
         }catch(Exception e){
             return null;
         }
     }
     
     int quantidade(){
          String qtd = "SELECT COUNT(id) FROM lutadores";
         
         try{
             Statement stnt = this.conexao.createStatement();
             ResultSet rset = stnt.executeQuery(qtd);
             int val =  ((Number) rset.getObject(1)).intValue();
             return val;
             
         }catch(Exception e){
             return 0;
         }
     }
     
     String lutador1(int id,int dado){
         String sel = "SELECT id,nome,nacionalidade,categoria FROM lutadores WHERE id =" + id;
         
         try{
             Statement stnt = this.conexao.createStatement();
             ResultSet rset = stnt.executeQuery(sel);
             String lutador1 = ((String) rset.getObject(dado));
             return lutador1;
             
         }catch(Exception e){
             return null;
         }
     }
     
     String lutador2(int id,int dado){
         String sel = "SELECT id,nome,nacionalidade,categoria FROM lutadores WHERE id =" + id;
         
         try{
             Statement stnt = this.conexao.createStatement();
             ResultSet rset = stnt.executeQuery(sel);
             String lutador2 = ((String) rset.getObject(dado));
             return lutador2;
             
         }catch(Exception e){
             return null;
         }
     }
    
     
     void lutaganha(int v,String nome){ 
        try {
            String ins = "UPDATE lutadores SET vitorias = vitorias + ?  WHERE nome = ? ";
            
            PreparedStatement stnt;
            stnt = this.conexao.prepareStatement(ins);
            stnt.setInt(1,v);
            stnt.setString(2,nome); 
            
            stnt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
        }         
        
    } 
     
    void lutaperder(int v,String nome){ 
        try {
            String ins = "UPDATE lutadores SET derrotas = derrotas + ?  WHERE nome = ? ";
            
            PreparedStatement stnt;
            stnt = this.conexao.prepareStatement(ins);
            stnt.setInt(1,v);
            stnt.setString(2,nome); 
            
            stnt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
        }          
        
    }  
    
    void lutaempatar(int v,String nome){ 
        try {
            String ins = "UPDATE lutadores SET empates = empates + ?  WHERE nome = ? ";
            
            PreparedStatement stnt;
            stnt = this.conexao.prepareStatement(ins);
            stnt.setInt(1,v);
            stnt.setString(2,nome); 
            
            stnt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    } 
    
    String colocacao(){
         String sel = "SELECT nome FROM lutadores ORDER BY vitorias DESC";
         
         try{
             Statement stnt = this.conexao.createStatement();
             ResultSet rset = stnt.executeQuery(sel);
             String lutador = ((String) rset.getObject(1));
             return lutador;
             
         }catch(Exception e){
             return null;
         }
     }
        
     
     
}
