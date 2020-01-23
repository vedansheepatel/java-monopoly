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
    boolean turn;
    private Screen s;
    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        this.s = s;
        board = new Board();
        player1 = new Player("Bob", 1500, 0, true);
        player2 = new Player("Billy", 1500, 0, false);
        die = new Die();
        
        player1BalanceTitle.setText(player1.getName() + "'s Balance:");
        player2BalanceTitle.setText(player2.getName() + "'s Balance:");
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
        player1ShowBalance = new javax.swing.JTextField();
        viewInformation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showPlayer1Properties = new javax.swing.JTextArea();
        numOfProperties1 = new javax.swing.JTextField();
        player2ShowBalance = new javax.swing.JTextField();
        player1BalanceTitle = new javax.swing.JLabel();
        player2BalanceTitle = new javax.swing.JLabel();
        numOfProperties2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        showPlayer2Properties = new javax.swing.JTextArea();
        mortgage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        player1ShowBalance.setEditable(false);
        player1ShowBalance.setText("1500");
        player1ShowBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ShowBalanceActionPerformed(evt);
            }
        });

        viewInformation.setText("View Card");
        viewInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInformationActionPerformed(evt);
            }
        });

        showPlayer1Properties.setEditable(false);
        showPlayer1Properties.setColumns(20);
        showPlayer1Properties.setRows(5);
        jScrollPane1.setViewportView(showPlayer1Properties);

        numOfProperties1.setEditable(false);
        numOfProperties1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfProperties1ActionPerformed(evt);
            }
        });

        player2ShowBalance.setEditable(false);
        player2ShowBalance.setText("1500");
        player2ShowBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ShowBalanceActionPerformed(evt);
            }
        });

        player1BalanceTitle.setText("jLabel1");

        player2BalanceTitle.setText("jLabel2");

        numOfProperties2.setEditable(false);
        numOfProperties2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfProperties2ActionPerformed(evt);
            }
        });

        showPlayer2Properties.setColumns(20);
        showPlayer2Properties.setRows(5);
        jScrollPane2.setViewportView(showPlayer2Properties);

        mortgage.setText("Mortgage");
        mortgage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mortgageActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\Downloads\\monopoly picture.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(player1ShowBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player1BalanceTitle)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numOfProperties1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numOfProperties2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player2BalanceTitle)
                            .addComponent(player2ShowBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dieFace, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(viewInformation)
                                .addGap(18, 18, 18)
                                .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(mortgage)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dieFace, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(mortgage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1BalanceTitle)
                    .addComponent(player2BalanceTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1ShowBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2ShowBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numOfProperties2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfProperties1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (player1.getBalance() <= 0){
            JOptionPane.showMessageDialog(null, "You do not have money, consider mortgaging your properties");
        }
        if (player2.getBalance() <= 0){
            JOptionPane.showMessageDialog(null, "You do not have money, consider mortgaging your properties");
        }
player1ShowBalance.setText("" + player1.getBalance());
player2ShowBalance.setText("" + player2.getBalance());
        switch (this.die.getFace()) {
            case 1:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 1.gif"));
                if (turn == false) {
                    turn = true;
                    player1.add1(die);
                    this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
              
                } else {
                    turn = false;
                    player2.add1(die);
                    this.boardPanel1.setLocation(2, board.getX(player2.getCurrentPosition()), board.getY(player2.getCurrentPosition()));
                }
                break;
            case 2:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 2.png"));
                if (turn == false) {
                    turn = true;
                    player1.add2(die);
                    this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                } else {
                    turn = false;
                    player2.add2(die);
                    this.boardPanel1.setLocation(2, board.getX(player2.getCurrentPosition()), board.getY(player2.getCurrentPosition()));
                }
                break;
            case 3:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 3.png"));
                if (turn == false) {
                    turn = true;
                    player1.add3(die);
                    this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                } else {
                    turn = false;
                    player2.add3(die);
                    this.boardPanel1.setLocation(2, board.getX(player2.getCurrentPosition()), board.getY(player2.getCurrentPosition()));
                }
                break;
            case 4:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 4.png"));
                if (turn == false) {
                    turn = true;
                    player1.add4(die);
                    this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                } else {
                    turn = false;
                    player2.add4(die);
                    this.boardPanel1.setLocation(2, board.getX(player2.getCurrentPosition()), board.getY(player2.getCurrentPosition()));
                }
                break;
            case 5:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 5.png"));
                if (turn == false) {
                    turn = true;
                    player1.add5(die);
                    this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                } else {
                    turn = false;
                    player2.add5(die);
                    this.boardPanel1.setLocation(2, board.getX(player2.getCurrentPosition()), board.getY(player2.getCurrentPosition()));
                }
                break;
            case 6:
                dieFace.setIcon(new javax.swing.ImageIcon("Dice 6.png"));
                if (turn == false) {
                    turn = true;
                    player1.add6(die);
                    this.boardPanel1.setLocation(1, board.getX(player1.getCurrentPosition()), board.getY(player1.getCurrentPosition()));
                } else {
                    turn = false;
                    player2.add6(die);
                    this.boardPanel1.setLocation(2, board.getX(player2.getCurrentPosition()), board.getY(player2.getCurrentPosition()));
                }
                break;
        }
        
        //if players land on the tax sqaure, they have to pay $200 to the bamk
        if (board.getName(player1.getCurrentPosition()).contains("Tax")) {
          
            JOptionPane.showMessageDialog(null, player1.getName() + " has landed on a Tax Sqaure. Paying $200 to bank.");
            player1.takeMoney(200);
            player1ShowBalance.setText("" + player1.getBalance());
            turn = !turn;
        }
        if (board.getName(player2.getCurrentPosition()).contains("Tax")) {
            JOptionPane.showMessageDialog(null, player2.getName() + " has landed on a Tax Sqaure. Paying $200 to bank.");
            player2.takeMoney(200);
            turn = !turn;
            player2ShowBalance.setText("" + player2.getBalance());
        }
        //if they players land on go to jail sqaure they are moved to the jail square
        if (board.getName(player1.getCurrentPosition()).equals("Go To Jail")) {
            JOptionPane.showMessageDialog(null, player1.getName() + " has to go to Jail. Bye bye");
            this.boardPanel1.setLocation(1, board.getX(10), board.getY(10));
            player1.setPosition(10);
            
        }
        if (board.getName(player2.getCurrentPosition()).equals("Go To Jail")) {
            JOptionPane.showMessageDialog(null, player2.getName() + " has to go to Jail. Bye bye");
            this.boardPanel1.setLocation(2, board.getX(10), board.getY(10));
            player2.setPosition(10);
            
           }
        //if a player lands on a property owned by the opponent, they have to pay the listed rent of that property
        if (board.getName(player2.getCurrentPosition()).equals(player1.findProperty(board.getName(player2.getCurrentPosition())))) {
            if (player1.findPropertyP(board.getName(player2.getCurrentPosition())).isMortgaged == false){
            JOptionPane.showMessageDialog(null, player2.getName() + " has to pay rent to " + player1.getName());
            player2.takeMoney(board.getRent(player2.getCurrentPosition()));
            player1.addMoney(board.getRent(player2.getCurrentPosition()));
            player1ShowBalance.setText("" + player1.getBalance());
            player2ShowBalance.setText("" + player2.getBalance());
            turn = !turn;
           }
        }
        if (board.getName(player1.getCurrentPosition()).equals(player2.findProperty(board.getName(player1.getCurrentPosition())))) {
           if (player2.findPropertyP(board.getName(player1.getCurrentPosition())).isMortgaged == false){
            JOptionPane.showMessageDialog(null, player1.getName() + " has to pay rent to " + player2.getName());
            player1.takeMoney(board.getRent(player1.getCurrentPosition()));
            player2.addMoney(board.getRent(player1.getCurrentPosition()));
            player1ShowBalance.setText("" + player1.getBalance());
            player2ShowBalance.setText("" + player2.getBalance());
            turn = !turn;
            }
        }

        this.repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed

        if (turn) {
            player1.addProperty(board.getProperty(player1.getCurrentPosition()), board.getPrice(player1.getCurrentPosition()));
            player1ShowBalance.setText("" + player1.getBalance());
            showPlayer1Properties.setText("" + player1.getProperties());
            numOfProperties1.setText("Properties owned:" + player1.getNumOfProperties());
        }
        if (!turn) {
            player2.addProperty(board.getProperty(player2.getCurrentPosition()), board.getPrice(player2.getCurrentPosition()));
            player2ShowBalance.setText("" + player2.getBalance());
            showPlayer2Properties.setText("" + player2.getProperties());
            numOfProperties2.setText("Properties owned:" + player2.getNumOfProperties());
        }
    }//GEN-LAST:event_buyActionPerformed

    private void viewInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInformationActionPerformed
        // TODO add your handling code here:
        if (turn) {
            if (board.getName(player1.getCurrentPosition()).contains("Avenue") || board.getName(player1.getCurrentPosition()).contains("Railroad") || board.getName(player1.getCurrentPosition()).contains("Gardens") || board.getName(player1.getCurrentPosition()).contains("Place")) {
                JOptionPane.showMessageDialog(null, board.getName(player1.getCurrentPosition()) + "\n Price: $" + board.getPrice(player1.getCurrentPosition()) + "\n Rent: $" + board.getRent(player1.getCurrentPosition()));
            } else if (board.getName(player1.getCurrentPosition()).equals("Electricity Company") || board.getName(player1.getCurrentPosition()).equals("Water Works")) {
                JOptionPane.showMessageDialog(null, board.getName(player1.getCurrentPosition()) + "\n Price: $" + board.getPrice(player1.getCurrentPosition()) + "\n Rent: $" + board.getRent(player1.getCurrentPosition()) * die.getFace());
            }else{
               JOptionPane.showMessageDialog(null, board.getName(player1.getCurrentPosition())); 
            }
        }
        if (!turn) {
            if (board.getName(player2.getCurrentPosition()).contains("Avenue") || board.getName(player2.getCurrentPosition()).contains("Railroad") || board.getName(player2.getCurrentPosition()).contains("Gardens") || board.getName(player2.getCurrentPosition()).contains("Place")) {
                JOptionPane.showMessageDialog(null, board.getName(player2.getCurrentPosition()) + "\n Price: $" + board.getPrice(player2.getCurrentPosition()) + "\n Rent: $" + board.getRent(player2.getCurrentPosition()));
            } else if (board.getName(player2.getCurrentPosition()).equals("Electricity Company") || board.getName(player2.getCurrentPosition()).equals("Water Works")) {
                JOptionPane.showMessageDialog(null, board.getName(player2.getCurrentPosition()) + "\n Price: $" + board.getPrice(player2.getCurrentPosition()) + "\n Rent: $" + board.getRent(player2.getCurrentPosition()) * die.getFace());
            }else{
               JOptionPane.showMessageDialog(null, board.getName(player2.getCurrentPosition())); 
            }
        }
      
    }//GEN-LAST:event_viewInformationActionPerformed

    private void player1ShowBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ShowBalanceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_player1ShowBalanceActionPerformed

    private void player2ShowBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ShowBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ShowBalanceActionPerformed

    private void numOfProperties1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfProperties1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfProperties1ActionPerformed

    private void numOfProperties2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfProperties2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfProperties2ActionPerformed

    private void mortgageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mortgageActionPerformed
        
        if (!turn){
        Mortgage m = new Mortgage(player1);
        m.setVisible(true);
        }
        if (turn){
            Mortgage m = new Mortgage (player2);
            m.setVisible(true);
        }
            
    }//GEN-LAST:event_mortgageActionPerformed

    
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mortgage;
    private javax.swing.JTextField numOfProperties1;
    private javax.swing.JTextField numOfProperties2;
    private javax.swing.JLabel player1BalanceTitle;
    private javax.swing.JTextField player1ShowBalance;
    private javax.swing.JLabel player2BalanceTitle;
    private javax.swing.JTextField player2ShowBalance;
    private javax.swing.JTextArea showPlayer1Properties;
    private javax.swing.JTextArea showPlayer2Properties;
    private javax.swing.JButton viewInformation;
    // End of variables declaration//GEN-END:variables
}
