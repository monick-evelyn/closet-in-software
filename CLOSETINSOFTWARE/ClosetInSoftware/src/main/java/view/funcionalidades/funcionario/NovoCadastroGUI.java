package view.funcionalidades.funcionario;
import view.funcionalidades.funcionario.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Funcionario;
import mysql.FuncionarioBD;
import view.FuncionarioGUI;
import view.FuncionarioGUI;
import static view.FuncionarioGUI.funcionariosJTable;

public class NovoCadastroGUI extends javax.swing.JFrame {

    public NovoCadastroGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecharJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomeCompletoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        funcaoComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        salarioTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        salvarJButton = new javax.swing.JButton();
        limparJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        cpfTxt = new javax.swing.JFormattedTextField();
        crachaTxt = new javax.swing.JTextField();
        telefoneTxt = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR FUNCIONÁRIO");

        fecharJButton.setBackground(new java.awt.Color(153, 51, 255));
        fecharJButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fecharJButton.setForeground(new java.awt.Color(255, 255, 255));
        fecharJButton.setText("X");
        fecharJButton.setBorderPainted(false);
        fecharJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(164, 164, 164)
                .addComponent(fecharJButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fecharJButton))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome completo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 64, -1, -1));

        nomeCompletoTxt.setBackground(new java.awt.Color(51, 0, 51));
        nomeCompletoTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeCompletoTxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nomeCompletoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 63, 501, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("End. de Crachá:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 105, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 105, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 146, -1, -1));

        emailTxt.setBackground(new java.awt.Color(51, 0, 51));
        emailTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 145, 290, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 146, -1, -1));

        senhaTxt.setBackground(new java.awt.Color(51, 0, 51));
        senhaTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        senhaTxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(senhaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 145, 195, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Função:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 187, -1, -1));

        funcaoComboBox.setBackground(new java.awt.Color(51, 0, 51));
        funcaoComboBox.setEditable(true);
        funcaoComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        funcaoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        funcaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chefe", "Gerente", "Atendente" }));
        jPanel1.add(funcaoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 186, 202, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salário: R$");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 187, -1, -1));

        salarioTxt.setBackground(new java.awt.Color(51, 0, 51));
        salarioTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salarioTxt.setForeground(new java.awt.Color(255, 255, 255));
        salarioTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salarioTxtKeyTyped(evt);
            }
        });
        jPanel1.add(salarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 186, 166, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 236, -1, -1));

        salvarJButton.setBackground(new java.awt.Color(51, 255, 51));
        salvarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvarJButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarJButton.setText("Salvar");
        salvarJButton.setBorderPainted(false);
        salvarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salvarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 88, -1));

        limparJButton.setBackground(new java.awt.Color(153, 51, 255));
        limparJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        limparJButton.setForeground(new java.awt.Color(255, 255, 255));
        limparJButton.setText("Limpar");
        limparJButton.setBorderPainted(false);
        limparJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(limparJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, -1));

        cancelarJButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelarJButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarJButton.setText("Cancelar");
        cancelarJButton.setBorderPainted(false);
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        cpfTxt.setBackground(new java.awt.Color(51, 0, 51));
        cpfTxt.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cpfTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfTxtKeyTyped(evt);
            }
        });
        jPanel1.add(cpfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 104, 211, -1));

        crachaTxt.setBackground(new java.awt.Color(51, 0, 51));
        crachaTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        crachaTxt.setForeground(new java.awt.Color(255, 255, 255));
        crachaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                crachaTxtKeyTyped(evt);
            }
        });
        jPanel1.add(crachaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 104, 220, -1));

        telefoneTxt.setBackground(new java.awt.Color(51, 0, 51));
        telefoneTxt.setForeground(new java.awt.Color(255, 255, 255));
        try {
            telefoneTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefoneTxtKeyTyped(evt);
            }
        });
        jPanel1.add(telefoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 235, 187, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 64, 16, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 105, 16, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("*");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 146, 16, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("*");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 105, 16, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 236, 16, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 146, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Deve ter 8 dígitos!");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_fecharJButtonActionPerformed

    private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarJButtonActionPerformed

    private void cpfTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_cpfTxtKeyTyped

    private void salarioTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_salarioTxtKeyTyped

    private void salvarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarJButtonActionPerformed
        // TODO add your handling code here:
        if (nomeCompletoTxt.getText().isBlank() || crachaTxt.getText().isEmpty() || 
                emailTxt.getText().isBlank() || cpfTxt.getText().isEmpty() || 
                telefoneTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos indicados com *, eles são obrigatórios.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            String nomeCompleto = nomeCompletoTxt.getText();
            int enderecoCracha = Integer.parseInt(crachaTxt.getText());
            int cpf = Integer.parseInt(cpfTxt.getText());
            String email = emailTxt.getText();
            String senha = senhaTxt.getText();
            Double salario = Double.valueOf(salarioTxt.getText());
            int telefone = Integer.parseInt(telefoneTxt.getText()); 
            String funcao = funcaoComboBox.getSelectedItem().toString();
            
            Funcionario funcionario = new Funcionario(nomeCompleto, email, senha, funcao, 
                    cpf, enderecoCracha, salario, telefone);
                int linhasAfetadasInsercaoFuncionario = FuncionarioBD.inserirFuncionario(funcionario);
                
                if (linhasAfetadasInsercaoFuncionario == 1) {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", 
                      "", JOptionPane.INFORMATION_MESSAGE);
                    FuncionarioGUI.adicionarFuncionarioNaTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro! Nenhuma adição foi realizada.");
                }
        }
    }//GEN-LAST:event_salvarJButtonActionPerformed

    private void limparJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparJButtonActionPerformed
        // TODO add your handling code here:
        nomeCompletoTxt.setText("");
        crachaTxt.setText("");
        cpfTxt.setText("");
        emailTxt.setText("");
        senhaTxt.setText("");
        salarioTxt.setText("");
        telefoneTxt.setText("");
        
    }//GEN-LAST:event_limparJButtonActionPerformed

    private void crachaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crachaTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_crachaTxtKeyTyped

    private void telefoneTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_telefoneTxtKeyTyped

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
            java.util.logging.Logger.getLogger(NovoCadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoCadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoCadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoCadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCadastroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JFormattedTextField cpfTxt;
    private javax.swing.JTextField crachaTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton fecharJButton;
    private javax.swing.JComboBox<String> funcaoComboBox;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limparJButton;
    private javax.swing.JTextField nomeCompletoTxt;
    private javax.swing.JTextField salarioTxt;
    private javax.swing.JButton salvarJButton;
    private javax.swing.JTextField senhaTxt;
    private javax.swing.JFormattedTextField telefoneTxt;
    // End of variables declaration//GEN-END:variables
public void receberFuncao(String novaFuncao) {
        funcaoComboBox.addItem(novaFuncao);
    }
}
