/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Brais
 */
public class GUI extends javax.swing.JFrame {

    private int player = 1;
    private int winner = 0;
    private int moves = 0;
    private int table[][] = new int[3][3];
    /**
     * Creates new form GUI
     */
    public GUI() {
        
        initComponents();
        getContentPane().setBackground(Color.orange);
        setGame();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button00 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        playerLabel = new javax.swing.JLabel();
        buttonReset = new javax.swing.JButton();
        winnerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3 en Raya");
        setBackground(java.awt.Color.orange);
        setResizable(false);

        button00.setBackground(new java.awt.Color(204, 204, 204));
        button00.setName(""); // NOI18N
        button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button00ActionPerformed(evt);
            }
        });

        button01.setBackground(new java.awt.Color(204, 204, 204));
        button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button01ActionPerformed(evt);
            }
        });

        button02.setBackground(new java.awt.Color(204, 204, 204));
        button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button02ActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(204, 204, 204));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setBackground(new java.awt.Color(204, 204, 204));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.setBackground(new java.awt.Color(204, 204, 204));
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button20.setBackground(new java.awt.Color(204, 204, 204));
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        button21.setBackground(new java.awt.Color(204, 204, 204));
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });

        button22.setBackground(new java.awt.Color(204, 204, 204));
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });

        playerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonReset.setText("Reiniciar");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        winnerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        winnerLabel.setForeground(new java.awt.Color(255, 51, 51));
        winnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(winnerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(winnerLabel)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        resetGame();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        pressButton(button12);
        table[1][2] = player;
        checkWinner(1,2);
    }//GEN-LAST:event_button12ActionPerformed

    private void button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button00ActionPerformed
        pressButton(button00);
        table[0][0] = player;
        checkWinner(0,0);
    }//GEN-LAST:event_button00ActionPerformed

    private void button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button01ActionPerformed
        pressButton(button01);
        table[0][1] = player;
        checkWinner(0,1);
    }//GEN-LAST:event_button01ActionPerformed

    private void button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button02ActionPerformed
        pressButton(button02);
        table[0][2] = player;
        checkWinner(0,1);

    }//GEN-LAST:event_button02ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        pressButton(button10);
        table[1][0] = player;
        checkWinner(1,0);

    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        pressButton(button11);
        table[1][1] = player;
        checkWinner(1,1);
    }//GEN-LAST:event_button11ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        pressButton(button20);
        table[2][0] = player;
        checkWinner(2,0);
    }//GEN-LAST:event_button20ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        pressButton(button21);
        table[2][1] = player;
        checkWinner(2,1);
    }//GEN-LAST:event_button21ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        pressButton(button22);
        table[2][2] = player;
        checkWinner(2,2);
    }//GEN-LAST:event_button22ActionPerformed

    
    public void pressButton(JButton btn){
        btn.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/" + player + ".png")));
        moves++;
        btn.setEnabled(false);
    }
    
    public void checkWinner(int x, int y){
        for(int i = 0; i < 3; i++){
            if(table[x][i] != player)
                break;
            if(i == 2){
                winner = player;
            }
        }
        
        for(int i = 0; i < 3; i++){
            if(table[i][y] != player)
                break;
            if(i == 2){
                winner = player;
            }
        }
        
        if(x == y){
            for(int i = 0; i < 3; i++){
                if(table[i][i] != player)
                    break;
                if(i == 2){
                    winner = player;
                }
            }
        }

        if(x + y == 2){
            for(int i = 0; i < 3; i++){
                if(table[i][(2)-i] != player)
                    break;
                if(i == 2){
                   winner = player;
                }
            }
        }
        
        if(moves == 9){
             winnerLabel.setText("Tablas");
        } else if(winner != 0) {
            winnerLabel.setText("Ganador el jugador " + winner);
            disableButtons();
        } else {
            changePlayer();
        }
   
    }
    
    public void changePlayer(){
        if(player == 1){
            player = 2;
        } else {
            player = 1;
        }
        
        playerLabel.setText("Turno: Jugador " + player);
    }
    
    public void disableButtons(){

        button00.setEnabled(false);
        button01.setEnabled(false);
        button02.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
    }
    
    public void setGame(){
        playerLabel.setText("Turno: Jugador " + player);
        
        button00.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button01.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button02.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button10.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button11.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button12.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button20.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button21.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
        button22.setIcon(new ImageIcon(getClass().getResource("../imagenes/fondo.png")));
    }
    
    public void resetGame(){

        player = 1;
        moves = 0;
        winner = 0;
        table = new int[3][3];
        winnerLabel.setText("");
        playerLabel.setText("Turno: Jugador " + player);
     
        button00.setEnabled(true);
        button01.setEnabled(true);
        button02.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button20.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        
        button00.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button01.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button02.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button20.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button21.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
        button22.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/disabled.png")));
    }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button00;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    private javax.swing.JButton buttonReset;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JLabel winnerLabel;
    // End of variables declaration//GEN-END:variables
}
