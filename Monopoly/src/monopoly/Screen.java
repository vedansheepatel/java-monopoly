/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import javax.swing.JOptionPane;

/**
 *
 * @author patev6618
 */
public class Screen extends javax.swing.JFrame {
    
    private Die die;
    private Player player1;
    private Player player2;
    private Board board;
    int x = 100;

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        die = new Die();
        board = new Board();
        player1 = new Player("Bob", 1500, 0);
        player2 = new Player("Billy", 1500, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        dieFace = new javax.swing.JLabel();
        boardPanel1 = new monopoly.BoardPanel();
        buy = new javax.swing.JButton();
        showBalance = new javax.swing.JTextField();
        viewInformation = new javax.swing.JButton();
        propertiesList = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Roll Die");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boardPanel1.setPreferredSize(new java.awt.Dimension(700, 700));

        javax.swing.GroupLayout boardPanel1Layout = new javax.swing.GroupLayout(boardPanel1);
        boardPanel1.setLayout(boardPanel1Layout);
        boardPanel1Layout.setHorizontalGroup(
            boardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        boardPanel1Layout.setVerticalGroup(
            boardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        buy.setText("Buy");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        showBalance.setEditable(false);
        showBalance.setText("1500");
        showBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBalanceActionPerformed(evt);
            }
        });

        viewInformation.setText("View Card");
        viewInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInformationActionPerformed(evt);
            }
        });

        propertiesList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertiesListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(propertiesList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dieFace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(viewInformation)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(dieFace, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(94, 94, 94)
                        .addComponent(showBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(propertiesList, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // dieFace.repaint();
        //player1.setLocation(600, 750);
        // this.repaint();
        
        switch (this.die.getFace()) {
            case 1:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 1.gif"));
                player1.add1(die);
                this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                break;
            case 2:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 2.png"));
                player1.add2(die);
                this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                break;
            case 3:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 3.png"));
                player1.add3(die);
                this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                break;
            case 4:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 4.png"));
                player1.add4(die);
                this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                break;
            case 5:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 5.png"));
                player1.add5(die);
                this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                break;
            case 6:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 6.png"));
                player1.add6(die);
                this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                break;
        }
        
        if (board.getName(player1.getCurrentPosition()).contains("Tax")) {
            JOptionPane.showMessageDialog(null, "You landed on a Tax Sqaure. Paying $200 to bank.");
            player1.takeMoney(200);
            showBalance.setText("" + player1.getBalance());
        }
        
        this.repaint();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        
        player1.addProperty(board.getProperty(player1.getCurrentPosition()), board.getPrice(player1.getCurrentPosition()));
        showBalance.setText("" + player1.getBalance());
        propertiesList.setText("" + player1.getProperties());
        
    }//GEN-LAST:event_buyActionPerformed
    
    private void viewInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInformationActionPerformed
        // TODO add your handling code here:
        if (board.getName(player1.getCurrentPosition()).contains("Avenue") || board.getName(player1.getCurrentPosition()).contains("Railroad") || board.getName(player1.getCurrentPosition()).contains("Place") || board.getName(player1.getCurrentPosition()).contains("Gardens") || board.getName(player1.getCurrentPosition()).contains("Place")) {
            JOptionPane.showMessageDialog(null, board.getName(player1.getCurrentPosition()) + "\n Price: $" + board.getPrice(player1.getCurrentPosition()) + "\n Rent: $" + board.getRent(player1.getCurrentPosition()));
        } else if (board.getName(player1.getCurrentPosition()).equals("Electricity Company") || board.getName(player1.getCurrentPosition()).equals("Water Works")) {
            JOptionPane.showMessageDialog(null, board.getName(player1.getCurrentPosition()) + "\n Price: $" + board.getUtilityPrice(player1.getCurrentPosition()) + "\n Mortgage: $" + board.getUtilityMortgage(player1.getCurrentPosition()));
        }
        
    }//GEN-LAST:event_viewInformationActionPerformed
    
    private void propertiesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertiesListActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_propertiesListActionPerformed
    
    private void showBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBalanceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_showBalanceActionPerformed

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private monopoly.BoardPanel boardPanel1;
    private javax.swing.JButton buy;
    private javax.swing.JLabel dieFace;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField propertiesList;
    private javax.swing.JTextField showBalance;
    private javax.swing.JButton viewInformation;
    // End of variables declaration//GEN-END:variables
}
