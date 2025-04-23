package view;
import logica.Funcionario;
import mysql.FuncionarioBD;
import view.FuncionarioGUI;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.FuncionarioGUI.funcionariosJTable;
import view.funcionalidades.funcionario.AdicionarFuncionarioGUI;
import view.funcionalidades.funcionario.NovoCadastroGUI;

public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entrarJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cadastroJButton = new javax.swing.JButton();
        senhaTxt = new javax.swing.JPasswordField();
        loginTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Closet in Software");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closet-in-software-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 0, 300, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Acessar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("___________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 81, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Login:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 115, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 187, -1, -1));

        entrarJButton.setBackground(new java.awt.Color(153, 0, 153));
        entrarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        entrarJButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarJButton.setText("Entrar");
        entrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(entrarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 264, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Não possui login?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 336, -1, -1));

        cadastroJButton.setBackground(new java.awt.Color(153, 0, 153));
        cadastroJButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastroJButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastroJButton.setText("Cadastre-se!");
        cadastroJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cadastroJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 335, 109, -1));

        senhaTxt.setBackground(new java.awt.Color(204, 204, 204));
        senhaTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        senhaTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(senhaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 218, 250, -1));

        loginTxt.setBackground(new java.awt.Color(204, 204, 204));
        loginTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(0, 0, 0));
        loginTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginTxtKeyTyped(evt);
            }
        });
        jPanel1.add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("(endereço de crachá)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroJButtonActionPerformed
        // TODO add your handling code here:
        NovoCadastroGUI novoCadastro = new NovoCadastroGUI();
        novoCadastro.setVisible(true);
        /*AdicionarFuncionarioGUI addFuncionario = new AdicionarFuncionarioGUI();
        addFuncionario.setVisible(true);*/
    }//GEN-LAST:event_cadastroJButtonActionPerformed

    private void entrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJButtonActionPerformed
        // TODO add your handling code here:
        
        if (loginTxt.getText().isBlank() || String.valueOf(senhaTxt.getPassword()).isBlank()) {
            JOptionPane.showConfirmDialog(null, "Preencha os campos!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            int login = Integer.parseInt(loginTxt.getText());
            String senha = String.valueOf(senhaTxt.getPassword());
        
            Funcionario funcionario = FuncionarioBD.selecionarFuncionario(login);
            if (!Objects.equals(funcionario, null)) {
                    if (senha.equals(funcionario.getSenha())) {
                        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!", 
                    "", JOptionPane.INFORMATION_MESSAGE);
                        TelaInicialGUI telaInicial = new TelaInicialGUI();
                        this.dispose();
                        telaInicial.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta. Tente novamente.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
                    }   
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_entrarJButtonActionPerformed

    private void loginTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_loginTxtKeyTyped

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroJButton;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginTxt;
    private javax.swing.JPasswordField senhaTxt;
    // End of variables declaration//GEN-END:variables
}
