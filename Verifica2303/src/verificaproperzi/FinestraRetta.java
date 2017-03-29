/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaproperzi;

/**
 *
 * @author studente
 */
public class FinestraRetta extends javax.swing.JFrame {

    /**
     * Creates new form FinestraRetta
     */
    public FinestraRetta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TestoA = new javax.swing.JTextField();
        testo1 = new javax.swing.JLabel();
        TestoB = new javax.swing.JTextField();
        testo2 = new javax.swing.JLabel();
        TestoC = new javax.swing.JTextField();
        testo3 = new javax.swing.JLabel();
        BottoneImposta = new javax.swing.JButton();
        testo4 = new javax.swing.JLabel();
        RisultatoEquazione = new javax.swing.JLabel();
        testo5 = new javax.swing.JLabel();
        RisultatoTipo = new javax.swing.JLabel();
        testo6 = new javax.swing.JLabel();
        XPunto = new javax.swing.JTextField();
        testo7 = new javax.swing.JLabel();
        YPunto = new javax.swing.JTextField();
        testo8 = new javax.swing.JLabel();
        BottoneVerificaPunto = new javax.swing.JButton();
        EsitoVerifica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TestoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestoAActionPerformed(evt);
            }
        });

        testo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        testo1.setText("x +");

        TestoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestoBActionPerformed(evt);
            }
        });

        testo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        testo2.setText("y + ");

        TestoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestoCActionPerformed(evt);
            }
        });

        testo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        testo3.setText("= 0");

        BottoneImposta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BottoneImposta.setText("Imposta");
        BottoneImposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneImpostaActionPerformed(evt);
            }
        });

        testo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        testo4.setText("Equazione:");

        RisultatoEquazione.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RisultatoEquazione.setText("?");

        testo5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        testo5.setText("Tipo retta:");

        RisultatoTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RisultatoTipo.setText("?");

        testo6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        testo6.setText("P (");

        XPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XPuntoActionPerformed(evt);
            }
        });

        testo7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        testo7.setText(",");

        YPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YPuntoActionPerformed(evt);
            }
        });

        testo8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        testo8.setText(")");

        BottoneVerificaPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BottoneVerificaPunto.setText("Verifica punto");
        BottoneVerificaPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneVerificaPuntoActionPerformed(evt);
            }
        });

        EsitoVerifica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EsitoVerifica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EsitoVerifica.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TestoA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(testo1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(testo5)
                        .addComponent(testo4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RisultatoTipo)
                            .addComponent(RisultatoEquazione))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TestoB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(testo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TestoC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(testo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(BottoneImposta)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EsitoVerifica)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(testo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(XPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testo7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testo8)))
                .addGap(43, 43, 43)
                .addComponent(BottoneVerificaPunto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TestoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testo1)
                    .addComponent(TestoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testo2)
                    .addComponent(TestoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testo3)
                    .addComponent(BottoneImposta))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testo4)
                    .addComponent(RisultatoEquazione))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testo5)
                    .addComponent(RisultatoTipo))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testo6)
                    .addComponent(XPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testo7)
                    .addComponent(YPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testo8)
                    .addComponent(BottoneVerificaPunto))
                .addGap(18, 18, 18)
                .addComponent(EsitoVerifica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TestoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TestoAActionPerformed

    private void TestoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TestoBActionPerformed

    private void TestoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TestoCActionPerformed

    private void XPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XPuntoActionPerformed

    private void YPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YPuntoActionPerformed

    private void BottoneImpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneImpostaActionPerformed
        try {
            String lettura1 = this.TestoA.getText();
            double a = Double.parseDouble(lettura1);
            String lettura2 = this.TestoB.getText();
            double b = Double.parseDouble(lettura2);
            String lettura3 = this.TestoC.getText();
            double c = Double.parseDouble(lettura3);
            if ((a == 0) && (b == 0)) {
                FinestraErrore fin = new FinestraErrore();
                fin.setVisible(true);
                fin.setTitle("ERRORE");
                fin.testo.setText("I valori di 'a' e 'b' non possono essere entrambi nulli");
            } else {
                Retta r = new Retta(a, b, c);
                this.RisultatoEquazione.setText(r.stampa());
                this.RisultatoTipo.setText(r.getTipo());
            }
        } catch (Exception e) {
            FinestraErrore fin = new FinestraErrore();
            fin.setVisible(true);
            fin.setTitle("ERRORE");
            fin.testo.setText("Devono essere inseriti tutti e tre i campi");
        }
    }//GEN-LAST:event_BottoneImpostaActionPerformed

    private void BottoneVerificaPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneVerificaPuntoActionPerformed
        try {
            String lettura1 = this.TestoA.getText();
            double a = Double.parseDouble(lettura1);
            String lettura2 = this.TestoB.getText();
            double b = Double.parseDouble(lettura2);
            String lettura3 = this.TestoC.getText();
            double c = Double.parseDouble(lettura3);
            if ((a != 0) || (b != 0)) {
                Retta r = new Retta(a, b, c);
                String lettura4 = this.XPunto.getText();
                double x = Double.parseDouble(lettura4);
                String lettura5 = this.YPunto.getText();
                double y = Double.parseDouble(lettura5);
                if (r.appartiene(x, y) == true) {
                    this.EsitoVerifica.setText("Il punto appartiene alla retta");
                } else {
                    this.EsitoVerifica.setText("Il punto NON appartiene alla retta");
                }
            }
        } catch (Exception e) {
            FinestraErrore fin = new FinestraErrore();
            fin.setVisible(true);
            fin.setTitle("ERRORE");
            fin.testo.setText("Devono essere inseriti tutti e tre i campi");
        }
    }//GEN-LAST:event_BottoneVerificaPuntoActionPerformed

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
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraRetta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottoneImposta;
    private javax.swing.JButton BottoneVerificaPunto;
    private javax.swing.JLabel EsitoVerifica;
    private javax.swing.JLabel RisultatoEquazione;
    private javax.swing.JLabel RisultatoTipo;
    private javax.swing.JTextField TestoA;
    private javax.swing.JTextField TestoB;
    private javax.swing.JTextField TestoC;
    private javax.swing.JTextField XPunto;
    private javax.swing.JTextField YPunto;
    private javax.swing.JLabel testo1;
    private javax.swing.JLabel testo2;
    private javax.swing.JLabel testo3;
    private javax.swing.JLabel testo4;
    private javax.swing.JLabel testo5;
    private javax.swing.JLabel testo6;
    private javax.swing.JLabel testo7;
    private javax.swing.JLabel testo8;
    // End of variables declaration//GEN-END:variables
}
