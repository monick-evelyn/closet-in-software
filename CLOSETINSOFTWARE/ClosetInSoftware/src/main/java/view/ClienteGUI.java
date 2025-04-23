package view;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Cliente;
import mysql.ClienteBD;
import mysql.RoupaBD;
import view.funcionalidades.cliente.AdicionarClienteGUI;
import view.funcionalidades.cliente.AlterarClienteGUI;

public class ClienteGUI extends javax.swing.JFrame {

    
    public ClienteGUI() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) clientesJTable.getModel();
        clientesJTable.setRowSorter(new TableRowSorter(modelo));
        
        adicionarClienteNaTabela();
    }
    public static void adicionarClienteNaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) clientesJTable.getModel();
        
        modelo.setNumRows(0);
        ClienteBD clienteBD = new ClienteBD();
        
        for (Cliente c: clienteBD.selecionarTodosOsClientes()) {
            
            modelo.addRow(new Object[]{
                c.getNomeCompleto(),
                c.getCpf(),
                c.getEmail(),
                c.getGenero(),
                c.getTelefone(),
                c.getDataDeNascimento(),
                c.getFkIdRoupa()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        inicioButton = new javax.swing.JButton();
        produtoJButton = new javax.swing.JButton();
        funcionarioButton = new javax.swing.JButton();
        clienteButton = new javax.swing.JButton();
        vendasButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adicionarJButton1 = new javax.swing.JButton();
        editarJButton = new javax.swing.JButton();
        ExcluirJButton = new javax.swing.JButton();
        pesquisarJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        clientePesquisarTxt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Closet in Software");

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));

        inicioButton.setBackground(new java.awt.Color(51, 0, 51));
        inicioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inicioButton.setForeground(new java.awt.Color(255, 255, 255));
        inicioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silhueta-de-icone-de-casa.png"))); // NOI18N
        inicioButton.setText("                  Início");
        inicioButton.setBorderPainted(false);
        inicioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        produtoJButton.setBackground(new java.awt.Color(51, 0, 51));
        produtoJButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        produtoJButton.setForeground(new java.awt.Color(255, 255, 255));
        produtoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cabide.png"))); // NOI18N
        produtoJButton.setText("           Produtos");
        produtoJButton.setBorderPainted(false);
        produtoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoJButtonActionPerformed(evt);
            }
        });

        funcionarioButton.setBackground(new java.awt.Color(51, 0, 51));
        funcionarioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        funcionarioButton.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionarios.png"))); // NOI18N
        funcionarioButton.setText("   Funcionários");
        funcionarioButton.setBorderPainted(false);
        funcionarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioButtonActionPerformed(evt);
            }
        });

        clienteButton.setBackground(new java.awt.Color(153, 0, 255));
        clienteButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clienteButton.setForeground(new java.awt.Color(255, 255, 255));
        clienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        clienteButton.setText("            Clientes");
        clienteButton.setBorderPainted(false);
        clienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteButtonActionPerformed(evt);
            }
        });

        vendasButton.setBackground(new java.awt.Color(51, 0, 51));
        vendasButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        vendasButton.setForeground(new java.awt.Color(255, 255, 255));
        vendasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas.png"))); // NOI18N
        vendasButton.setText("             Vendas");
        vendasButton.setBorderPainted(false);
        vendasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(produtoJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(funcionarioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(clienteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vendasButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(funcionarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        clientesJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "CPF", "E-mail", "Gênero", "Telefone", "Data de Nascimento", "ID de roupa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientesJTable);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("| Clientes");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("_____________________________________________________________________________________________________________________________________________________");

        adicionarJButton1.setBackground(new java.awt.Color(51, 255, 51));
        adicionarJButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarJButton1.setForeground(new java.awt.Color(255, 255, 255));
        adicionarJButton1.setText("Adicionar");
        adicionarJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarJButton1ActionPerformed(evt);
            }
        });

        editarJButton.setBackground(new java.awt.Color(0, 153, 153));
        editarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editarJButton.setForeground(new java.awt.Color(255, 255, 255));
        editarJButton.setText("Editar");
        editarJButton.setBorderPainted(false);
        editarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarJButtonActionPerformed(evt);
            }
        });

        ExcluirJButton.setBackground(new java.awt.Color(255, 0, 0));
        ExcluirJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ExcluirJButton.setForeground(new java.awt.Color(255, 255, 255));
        ExcluirJButton.setText("Excluir");
        ExcluirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirJButtonActionPerformed(evt);
            }
        });

        pesquisarJButton.setBackground(new java.awt.Color(153, 51, 255));
        pesquisarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesquisarJButton.setForeground(new java.awt.Color(255, 255, 255));
        pesquisarJButton.setText("Pesquisar");
        pesquisarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite o CPF do cliente para pesquisar:");

        clientePesquisarTxt.setBackground(new java.awt.Color(204, 204, 204));
        clientePesquisarTxt.setForeground(new java.awt.Color(0, 0, 0));
        try {
            clientePesquisarTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adicionarJButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExcluirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientePesquisarTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarJButton1)
                    .addComponent(editarJButton)
                    .addComponent(ExcluirJButton)
                    .addComponent(pesquisarJButton)
                    .addComponent(clientePesquisarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void produtoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoJButtonActionPerformed
        // TODO add your handling code here:
        RoupaGUI produtoGUI = new RoupaGUI();
        this.dispose();
        produtoGUI.setVisible(true);
    }//GEN-LAST:event_produtoJButtonActionPerformed

    private void funcionarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioButtonActionPerformed
        // TODO add your handling code here:
        FuncionarioGUI funcionarioGUI = new FuncionarioGUI();
        this.dispose();
        funcionarioGUI.setVisible(true);
    }//GEN-LAST:event_funcionarioButtonActionPerformed

    private void clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteButtonActionPerformed

    private void vendasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasButtonActionPerformed
        // TODO add your handling code here:
        VendaGUI vendaGUI = new VendaGUI();
        this.dispose();
        vendaGUI.setVisible(true);
    }//GEN-LAST:event_vendasButtonActionPerformed

    private void inicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioButtonActionPerformed
        // TODO add your handling code here:
        TelaInicialGUI telaInicialGUI = new TelaInicialGUI();
        this.dispose();
        telaInicialGUI.setVisible(true);
    }//GEN-LAST:event_inicioButtonActionPerformed

    private void adicionarJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarJButton1ActionPerformed
        // TODO add your handling code here:
        AdicionarClienteGUI adicionarCliente = new AdicionarClienteGUI();
        adicionarCliente.setVisible(true);
    }//GEN-LAST:event_adicionarJButton1ActionPerformed

    private void editarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarJButtonActionPerformed
        // TODO add your handling code here:
        if (clientesJTable.getSelectedRow() != -1) {
            ClienteBD clienteBD = new ClienteBD();
            AlterarClienteGUI alterarCliente = new AlterarClienteGUI();
            
            AlterarClienteGUI.nomeCompletoTxt.setText(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 0).toString());
            AlterarClienteGUI.cpfTxt.setText(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 1).toString());
            AlterarClienteGUI.emailTxt.setText(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 2).toString());
            AlterarClienteGUI.generoComboBox.setSelectedItem(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 3).toString());
            AlterarClienteGUI.telefoneTxt.setText(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 4).toString());
            AlterarClienteGUI.dataNascimentoTxt.setText(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 5).toString());
            int fkIdRoupa = Integer.parseInt(clientesJTable.getValueAt(clientesJTable.getSelectedRow(), 6).toString());
            int refRoupa = RoupaBD.pegarRefRoupa(fkIdRoupa);
            AlterarClienteGUI.refRoupaTxt.setText(String.valueOf(refRoupa));
            
            alterarCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha para editar dados.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_editarJButtonActionPerformed

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel clientesModel = (DefaultTableModel) clientesJTable.getModel();
        String cpfLinha = "";
        
        if (clientesJTable.getSelectedRow() != -1) {
            cpfLinha = clientesJTable.getValueAt(clientesJTable.getSelectedRow(),1).toString();
            int cpfExcluir = Integer.parseInt(cpfLinha);
            Cliente clienteExcluir = ClienteBD.selecionarCliente(cpfExcluir);
            
            if (!Objects.equals(clienteExcluir, null))  {
                int resposta = JOptionPane.showConfirmDialog(null, 
                        "Você tem certeza que deseja excluir a \n" + clienteExcluir.toString() + "?");
                //0 = sim. 1 = não. 2 = cancelar; -1 = fechar.
                if (resposta == 0) {
                    //Colar método remover roupa;
                    int linhasAfetadasRemocao = ClienteBD.removerCliente(cpfExcluir);
               
                    if (linhasAfetadasRemocao == 1) {
                        //roupasJTable.removerLinha(roupasJTable.getSelectedRow());
                        JOptionPane.showMessageDialog(null, "Roupa excluida com sucesso!");

                        adicionarClienteNaTabela();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro! Nenhuma remoção foi realizada.", 
                                "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha para excluir a roupa.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ExcluirJButtonActionPerformed

    private void pesquisarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarJButtonActionPerformed
        // TODO add your handling code here:
        if (clientePesquisarTxt.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Você precisa preencher o campo para realizar uma pesquisa.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigoPesquisado = Integer.parseInt(clientePesquisarTxt.getText());
            Cliente clientePesquisado = ClienteBD.selecionarCliente(codigoPesquisado);
            if (!Objects.equals(clientePesquisado,null)) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado(a): \n" + clientePesquisado.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente foi encontrado com o cpf: " + codigoPesquisado,
                        "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_pesquisarJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JButton adicionarJButton1;
    private javax.swing.JButton clienteButton;
    private javax.swing.JFormattedTextField clientePesquisarTxt;
    public static javax.swing.JTable clientesJTable;
    private javax.swing.JButton editarJButton;
    private javax.swing.JButton funcionarioButton;
    private javax.swing.JButton inicioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarJButton;
    private javax.swing.JButton produtoJButton;
    private javax.swing.JButton vendasButton;
    // End of variables declaration//GEN-END:variables
}
