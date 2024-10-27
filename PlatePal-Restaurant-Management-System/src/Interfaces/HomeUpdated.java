
package Interfaces;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class HomeUpdated extends javax.swing.JFrame {

    private int frameSize;
    private Point framePosition;
    
    public HomeUpdated() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        updatePanel(new Customer());
        setNavDefaultC();
        jButton1.setBackground(new Color(255, 153, 0));
        jButton1.setForeground(Color.WHITE);
    }

    private void moveRight(){
        Thread t = new Thread(
                    () -> {
                        
                        for (int i = 200; i >= 55; i-=10) {
                            jPanel1.setPreferredSize(new Dimension(i,jPanel1.getHeight()));
                            SwingUtilities.updateComponentTreeUI(jPanel1);
                            
                            try {
                                Thread.sleep(8);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
         );
        t.start();
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        jButton11.setText("");
        
        jButton1.setHorizontalAlignment(SwingConstants.CENTER);
        jButton2.setHorizontalAlignment(SwingConstants.CENTER);
        jButton3.setHorizontalAlignment(SwingConstants.CENTER);
        jButton4.setHorizontalAlignment(SwingConstants.CENTER);
        jButton5.setHorizontalAlignment(SwingConstants.CENTER);
        jButton6.setHorizontalAlignment(SwingConstants.CENTER);
        jButton7.setHorizontalAlignment(SwingConstants.CENTER);
        jButton8.setHorizontalAlignment(SwingConstants.CENTER);
        jButton9.setHorizontalAlignment(SwingConstants.CENTER);
        jButton10.setHorizontalAlignment(SwingConstants.CENTER);
        jButton11.setHorizontalAlignment(SwingConstants.CENTER);
            
    }
    
    private void moveLeft(){
            jButton1.setHorizontalAlignment(SwingConstants.LEFT);
            jButton2.setHorizontalAlignment(SwingConstants.LEFT);
            jButton3.setHorizontalAlignment(SwingConstants.LEFT);
            jButton4.setHorizontalAlignment(SwingConstants.LEFT);
            jButton5.setHorizontalAlignment(SwingConstants.LEFT);
            jButton6.setHorizontalAlignment(SwingConstants.LEFT);
            jButton7.setHorizontalAlignment(SwingConstants.LEFT);
            jButton8.setHorizontalAlignment(SwingConstants.LEFT);
            jButton9.setHorizontalAlignment(SwingConstants.LEFT);
            jButton10.setHorizontalAlignment(SwingConstants.LEFT);
            jButton11.setHorizontalAlignment(SwingConstants.LEFT);
        Thread t = new Thread(
                    () -> {
                        for (int i = 55; i <= 200; i+=10) {
                            jPanel1.setPreferredSize(new Dimension(i,jPanel1.getHeight()));
                            SwingUtilities.updateComponentTreeUI(jPanel1);
                            
                            try {
                                Thread.sleep(8);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
            
            );
        t.start();


            jButton1.setText("Customer");
            jButton2.setText("Product");
            jButton3.setText("Sales");
            jButton4.setText("Attendance");
            jButton5.setText("Stock");
            jButton6.setText("Inventory");
            jButton7.setText("Backup");
            jButton8.setText("GRN");
            jButton9.setText("Return");
            jButton10.setText("PO");
            jButton11.setText("Report");
            
            
            
    }
    
    private void updatePanel(JPanel panel) {
    jPanel4.removeAll();  
    jPanel4.add(panel, BorderLayout.CENTER);  
    jPanel4.revalidate();  // Refresh layout
    jPanel4.repaint();  // Update display
    }
    
      private void setNavDefaultC() {
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        jButton10.setBackground(Color.WHITE);
        jButton11.setBackground(Color.WHITE);
        
        jButton1.setForeground(Color.BLACK);
        jButton2.setForeground(Color.BLACK);
        jButton3.setForeground(Color.BLACK);
        jButton4.setForeground(Color.BLACK);
        jButton5.setForeground(Color.BLACK);
        jButton6.setForeground(Color.BLACK);
        jButton7.setForeground(Color.BLACK);
        jButton8.setForeground(Color.BLACK);
        jButton9.setForeground(Color.BLACK);
        jButton10.setForeground(Color.BLACK);
        jButton11.setForeground(Color.BLACK);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 509));
        jPanel1.setLayout(new java.awt.GridLayout(11, 1, 0, 2));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/user.png"))); // NOI18N
        jButton1.setText("Customer");
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(0);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/box.png"))); // NOI18N
        jButton2.setText("Product");
        jButton2.setFocusable(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sales.png"))); // NOI18N
        jButton3.setText("Sales");
        jButton3.setFocusable(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/calendar (1).png"))); // NOI18N
        jButton4.setText("Attendance");
        jButton4.setFocusable(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/stock.png"))); // NOI18N
        jButton5.setText("Stock");
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-inventory-32.png"))); // NOI18N
        jButton6.setText("Inventory");
        jButton6.setFocusable(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backup.png"))); // NOI18N
        jButton7.setText("Backup");
        jButton7.setFocusable(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/grn.png"))); // NOI18N
        jButton8.setText("GRN");
        jButton8.setFocusable(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/return.png"))); // NOI18N
        jButton9.setText("Return");
        jButton9.setFocusable(false);
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/po.png"))); // NOI18N
        jButton10.setText("PO");
        jButton10.setFocusable(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/report.png"))); // NOI18N
        jButton11.setText("Report");
        jButton11.setFocusable(false);
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 153));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/menu.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setPreferredSize(new java.awt.Dimension(50, 32));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/share.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Plate Pal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 669, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            moveRight();
            
        }else{
            moveLeft();
            
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        frameSize = this.getExtendedState();
        framePosition = this.getLocation();
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (this.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            this.setExtendedState(JFrame.NORMAL);
        } else {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        updatePanel(new Customer());
        setNavDefaultC();
        jButton1.setBackground(new Color(255, 153, 0));
        jButton1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        updatePanel(new Product());
        setNavDefaultC();
        jButton2.setBackground(new Color(255, 153, 0));
        jButton2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        updatePanel(new Sales());
        setNavDefaultC();
        jButton3.setBackground(new Color(255, 153, 0));
        jButton3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        updatePanel(new Attendance());
        setNavDefaultC();
        jButton4.setBackground(new Color(255, 153, 0));
        jButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        updatePanel(new Stock());
        setNavDefaultC();
        jButton5.setBackground(new Color(255, 153, 0));
        jButton5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        updatePanel(new Inventory());
        setNavDefaultC();
        jButton6.setBackground(new Color(255, 153, 0));
        jButton6.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        updatePanel(new Backup());
        setNavDefaultC();
        jButton7.setBackground(new Color(255, 153, 0));
        jButton7.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        updatePanel(new GRN());
        setNavDefaultC();
        jButton8.setBackground(new Color(255, 153, 0));
        jButton8.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        updatePanel(new Return());
        setNavDefaultC();
        jButton9.setBackground(new Color(255, 153, 0));
        jButton9.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        updatePanel(new PurchaseOrder());
        setNavDefaultC();
        jButton10.setBackground(new Color(255, 153, 0));
        jButton10.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        updatePanel(new Report());
        setNavDefaultC();
        jButton11.setBackground(new Color(255, 153, 0));
        jButton11.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton11MouseClicked

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        this.setExtendedState(frameSize);
        this.setLocation(framePosition);
    }//GEN-LAST:event_formWindowDeiconified

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUpdated().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
