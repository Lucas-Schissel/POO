//Lucas Schissel - POO1 - 2020.1
package swing;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_soma = new javax.swing.JButton();
        btn_subtrai = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_multiplica = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Lucas");

        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_subtrai.setText("-");
        btn_subtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtraiActionPerformed(evt);
            }
        });

        btn_divide.setText("/");
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });

        btn_multiplica.setText("*");
        btn_multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicaActionPerformed(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        display.setEditable(false);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                            .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_multiplica, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_soma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_subtrai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(display)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_8)
                        .addComponent(btn_9)
                        .addComponent(btn_soma))
                    .addComponent(btn_7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_5)
                        .addComponent(btn_6)
                        .addComponent(btn_subtrai))
                    .addComponent(btn_4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_divide)
                    .addComponent(btn_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0)
                    .addComponent(btn_multiplica)
                    .addComponent(btn_igual))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int indice = 0;
    Boolean calculo = false;
    Boolean digite = false;
    String numeros[] = new String[100];
    
    
    
    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
       if(indice == 0){
          display.setText(""); 
       }else{
        int stop = 0;
        String num1 = "";
        String num2 = "";
        String operacao = "";
        double resultado = 0;
        boolean continua = false;
        boolean operar = false;
        String msg = "";

        for(int i=0 ; i<100 ;i++){
            if((numeros[i] != null) && (numeros[i] != "+") && (numeros[i] != "-") 
            && (numeros[i] != "/") && (numeros[i] != "*")){
                num1 = num1.concat(numeros[i]);
            }else if(numeros[i] == "+"){
                if(operar == false){
                operacao = "soma";
                operar = true;
                stop = i;
                break;
                }else{
                    display.setText("Nao é permitido mais de uma funçao!");
                }
            }else if(numeros[i] == "-"){
                if(operar == false){
                operacao = "sub";
                operar = true;
                stop = i;
                break;
                }else{
                    display.setText("Nao é permitido mais de uma funçao!");
                }
            }else if(numeros[i] == "/"){
                if(operar == false){
                operacao = "div";
                operar = true;
                stop = i;
                break;
                }else{
                    display.setText("Nao é permitido mais de uma funçao!");
                }
            }else if(numeros[i] == "*"){
                if(operar == false){
                operacao = "mut";
                operar = true;
                stop = i;
                break;
                }else{
                    display.setText("Nao é permitido mais de uma funçao!");
                }
            }
        }

        if(operacao == ""){
            display.setText(num1);
        }else{

            for(int i=stop+1 ; i<100 ;i++){
                if((numeros[i] != null) && (numeros[i] != "+") && (numeros[i] != "-") 
                && (numeros[i] != "/") && (numeros[i] != "*")){
                    num2 = num2.concat(numeros[i]);
                    continua = true;
                }
            }

            if(num2 != "" && continua == true){

            double v1 = Double.parseDouble(num1);
            double v2 = Double.parseDouble(num2);

            if(operacao == "soma"){
               resultado = v1 + v2;
            }

            if(operacao == "sub"){
               resultado = v1 - v2;
            }

            if(operacao == "div"){
               if((v1 == 0) ||(v2== 0)){
                   msg = "Valor nao pode ser calculado.";
               }else{ 
               resultado = v1 / v2;
               }
            }

            if(operacao == "mut"){
               if((v1 == 0) ||(v2== 0)){
                   msg = "Valor nao pode ser calculado.";
               }else{
               resultado = v1 * v2;
               }
            }    
            
            if(msg == ""){
                display.setText("Resultado:" + String.valueOf(resultado));
            }else{
                display.setText("Resultado:" + msg);
            }
            
            calculo = true;
            }else{  
                JOptionPane.showMessageDialog(this, "Digite um numero antes da igualdade!", "Erro!",JOptionPane.WARNING_MESSAGE); 
                //display.setText("Digite um numero antes da igualdade!");    
            }
            stop=0;
            indice=0;
            num1 = "";
            num2 = "";
            operacao = "";
            digite=false;
            }
       }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_multiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicaActionPerformed
       if(indice == 0){
          display.setText("Digite um numero antes da operaçao!"); 
       }else if(digite == true){
          JOptionPane.showMessageDialog(this, "Voce ja colocou uma operaçao!", "Erro!",JOptionPane.WARNING_MESSAGE);
       }else{
       String num = "*";
       String anterior = display.getText();
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice]= num;
       indice = indice +1;
       digite = true;
       }
    }//GEN-LAST:event_btn_multiplicaActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
       if(indice == 0){
          display.setText("Digite um numero antes da operaçao!"); 
       }else if(digite == true){
          JOptionPane.showMessageDialog(this, "Voce ja colocou uma operaçao!", "Erro!",JOptionPane.WARNING_MESSAGE);
       }else{
       String num = "/";
       String anterior = display.getText();
       String novo = anterior.concat(num);
       display.setText(novo); 
       numeros[indice]= num;
      indice = indice +1;
      digite=true;
       }
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_subtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtraiActionPerformed
       if(indice == 0){
          display.setText("Digite um numero antes da operaçao!"); 
       }else if(digite == true){
          JOptionPane.showMessageDialog(this, "Voce ja colocou uma operaçao!", "Erro!",JOptionPane.WARNING_MESSAGE);
       }else{
       String num = "-";
       String anterior = display.getText();
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice]= num;
       indice = indice +1;
       digite=true;
       }
    }//GEN-LAST:event_btn_subtraiActionPerformed

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed
       if(indice == 0){
          display.setText("Digite um numero antes da operaçao!"); 
       }else if(digite == true){
         JOptionPane.showMessageDialog(this, "Voce ja colocou uma operaçao!", "Erro!",JOptionPane.WARNING_MESSAGE);
       }else{
       String num = "+";
       String anterior = display.getText();
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice] = num;
       indice = indice +1;
       digite=true;
       }
    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        double numero = 0;
        String num = "0";
        String anterior;
        if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        }        
        String novo = anterior.concat(num);
        display.setText(novo);
        numeros[indice]= num;
        indice = indice +1;
       
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
         double numero = 1;
        String num = "1";
        String anterior;
        if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        } 
        String novo = anterior.concat(num);
        display.setText(novo);
        numeros[indice]= num;
        indice = indice +1;
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        double numero = 2;
        String num = "2";
        String anterior;
        if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        } 
        String novo = anterior.concat(num);
        display.setText(novo);
        numeros[indice]= num;
        indice = indice +1;
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        double numero = 3;
        String num = "3";
        String anterior;
        if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        } 
        String novo = anterior.concat(num);
        display.setText(novo);
        numeros[indice]= num;
        indice = indice +1;
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        double numero = 4;
        String num = "4";
        String anterior;
       if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        }  
        String novo = anterior.concat(num);
        display.setText(novo);
        numeros[indice]= num;
        indice = indice +1;
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        double numero = 5;
        String num = "5";
        String anterior;
        if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        } 
        String novo = anterior.concat(num);
        display.setText(novo);
        numeros[indice]= num;
        indice = indice +1;
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
       double numero = 6;
       String num = "6";
       String anterior;
       if(calculo== true){ 
            anterior = "";
            calculo = false;            
        }else{
            anterior = display.getText();
        } 
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice]= num;
       indice = indice +1;
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
       double numero = 7;
       String num = "7";
       String anterior;
       if(calculo== true){ 
            anterior = "";
            calculo = false;            
       }else{
            anterior = display.getText();
       }  
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice]= num;
       indice = indice +1;
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
       double numero = 8;
       String num = "8";
       String anterior;
       if(calculo== true){ 
            anterior = "";
            calculo = false;            
       }else{
            anterior = display.getText();
       } 
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice]= num;
       indice = indice +1;
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
       double numero = 9;
       String num = "9";
       String anterior;
       if(calculo== true){ 
            anterior = "";
            calculo = false;            
       }else{
            anterior = display.getText();
       }  
       String novo = anterior.concat(num);
       display.setText(novo);
       numeros[indice]= num;
       indice = indice +1;
    }//GEN-LAST:event_btn_9ActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        
   
    }//GEN-LAST:event_displayActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplica;
    private javax.swing.JButton btn_soma;
    private javax.swing.JButton btn_subtrai;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}
