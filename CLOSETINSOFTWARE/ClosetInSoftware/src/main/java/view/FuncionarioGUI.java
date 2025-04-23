package view;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Funcionario;
import mysql.FuncionarioBD;
import view.funcionalidades.funcionario.AdicionarFuncionarioGUI;
import view.funcionalidades.funcionario.AlterarFuncionarioGUI;

public class FuncionarioGUI extends javax.swing.JFrame {

    public FuncionarioGUI() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) funcionariosJTable.getModel();
        funcionariosJTable.setRowSorter(new TableRowSorter(modelo));
        
        adicionarFuncionarioNaTabela();
    }
    
    public static void adicionarFuncionarioNaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) funcionariosJTable.getModel();
        modelo.setNumRows(0);
        FuncionarioBD funcionario = new FuncionarioBD();
        
        for (Funcionario f: FuncionarioBD.selecionarTodosOsFuncionarios()) {
            modelo.addRow(new Object [] {
                f.getNomeCompleto(),
                f.getEmail(),
                f.getSenha(),
                f.getFuncao(),
                f.getCpf(),
                f.getEnderecoDeCracha(),
                f.getSalario(),
                f.getTelefone()
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
        funcionariosJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pesquisarJButton = new javax.swing.JButton();
        editarJButton = new javax.swing.JButton();
        ExcluirJButton = new javax.swing.JButton();
        adicionarJButton = new javax.swing.JButton();
        codigoPesquisarTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        funcionarioButton.setBackground(new java.awt.Color(153, 0, 255));
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

        clienteButton.setBackground(new java.awt.Color(51, 0, 51));
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

        funcionariosJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        funcionariosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Senha", "Função", "CPF", "END. CRACHÁ", "Salário", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(funcionariosJTable);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("| Funcionários");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("___________________________________________________________________________________________________________________________________________________");

        pesquisarJButton.setBackground(new java.awt.Color(153, 51, 255));
        pesquisarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesquisarJButton.setForeground(new java.awt.Color(255, 255, 255));
        pesquisarJButton.setText("Pesquisar");
        pesquisarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarJButtonActionPerformed(evt);
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

        adicionarJButton.setBackground(new java.awt.Color(51, 255, 51));
        adicionarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarJButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarJButton.setText("Adicionar");
        adicionarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarJButtonActionPerformed(evt);
            }
        });

        codigoPesquisarTxt.setBackground(new java.awt.Color(204, 204, 204));
        codigoPesquisarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoPesquisarTxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite o endereço de crachá do funcionário: ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Obs.: Ao adicionar ou editar um atributo numeral, utilize o \".\" apenas para diferenciar  reais de centavos. Ex.: 1538.50");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(adicionarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(editarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(ExcluirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(codigoPesquisarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(pesquisarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editarJButton)
                        .addComponent(adicionarJButton))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoPesquisarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesquisarJButton)
                        .addComponent(ExcluirJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioButtonActionPerformed
        // TODO add your handling code here
        TelaInicialGUI telaInicialGUI = new TelaInicialGUI();
        this.dispose();
        telaInicialGUI.setVisible(true);
    }//GEN-LAST:event_inicioButtonActionPerformed

    private void produtoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoJButtonActionPerformed
        // TODO add your handling code here:
        RoupaGUI produtoGUI = new RoupaGUI();
        this.dispose();
        produtoGUI.setVisible(true);
    }//GEN-LAST:event_produtoJButtonActionPerformed

    private void funcionarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionarioButtonActionPerformed

    private void clienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteButtonActionPerformed
        // TODO add your handling code here:
        ClienteGUI clienteGUI = new ClienteGUI();
        this.dispose();
        clienteGUI.setVisible(true);
    }//GEN-LAST:event_clienteButtonActionPerformed

    private void vendasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasButtonActionPerformed
        // TODO add your handling code here:
        VendaGUI vendaGUI = new VendaGUI();
        this.dispose();
        vendaGUI.setVisible(true);
    }//GEN-LAST:event_vendasButtonActionPerformed

    private void adicionarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarJButtonActionPerformed
        // TODO add your handling code here:
        AdicionarFuncionarioGUI adicionarFuncionario = new AdicionarFuncionarioGUI();
        adicionarFuncionario.setVisible(true);
    }//GEN-LAST:event_adicionarJButtonActionPerformed

    private void editarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarJButtonActionPerformed
        // TODO add your handling code here:
        
        if (funcionariosJTable.getSelectedRow() != -1) {
            FuncionarioBD funcionarioBD = new FuncionarioBD();
            AlterarFuncionarioGUI alterarFuncionario = new AlterarFuncionarioGUI();
            
            AlterarFuncionarioGUI.nomeCompletoTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),0).toString());
            AlterarFuncionarioGUI.emailTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),1).toString());
            AlterarFuncionarioGUI.senhaTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),2).toString());
            AlterarFuncionarioGUI.funcaoComboBox.setSelectedItem(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),3).toString());
            AlterarFuncionarioGUI.cpfTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),4).toString());
            AlterarFuncionarioGUI.crachaTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),5).toString());
            AlterarFuncionarioGUI.salarioTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),6).toString());
            AlterarFuncionarioGUI.telefoneTxt.setText(funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),7).toString());
            
            alterarFuncionario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha para editar dados.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_editarJButtonActionPerformed

    private void pesquisarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarJButtonActionPerformed
        // TODO add your handling code here:
        if (codigoPesquisarTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa preencher o campo para realizar uma pesquisa.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigoPesquisado = Integer.parseInt(codigoPesquisarTxt.getText()); 
            Funcionario funcionarioPesquisado = FuncionarioBD.selecionarFuncionario(codigoPesquisado);
            if (!Objects.equals(funcionarioPesquisado,null)) {
                JOptionPane.showMessageDialog(null, "Funcionário encontrado(a): \n" + funcionarioPesquisado.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum funcionário(a) foi encontrado(a) com o endereço de crachá: " + codigoPesquisado,
                        "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_pesquisarJButtonActionPerformed

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel funcionariosModel = (DefaultTableModel) funcionariosJTable.getModel();
        String refLinha = "";
        
        if (funcionariosJTable.getSelectedRow() != -1) {
            refLinha = funcionariosJTable.getValueAt(funcionariosJTable.getSelectedRow(),5).toString();
            int codigoExcluir = Integer.parseInt(refLinha);
            Funcionario funcionarioExcluir = FuncionarioBD.selecionarFuncionario(codigoExcluir);
            
            if (!Objects.equals(codigoExcluir, null))  {
                int resposta = JOptionPane.showConfirmDialog(null, 
                        "Você tem certeza que deseja excluir a \n" + funcionarioExcluir.toString() + "?");
                //0 = sim. 1 = não. 2 = cancelar; -1 = fechar.
                if (resposta == 0) {
                    //Colar método remover roupa;
                    int linhasAfetadasRemocao = FuncionarioBD.removerFuncionario(codigoExcluir);
               
                    if (linhasAfetadasRemocao == 1) {
                        //roupasJTable.removerLinha(roupasJTable.getSelectedRow());
                        JOptionPane.showMessageDialog(null, "Roupa excluida com sucesso!");

                        adicionarFuncionarioNaTabela();
                        
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

    private void codigoPesquisarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoPesquisarTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_codigoPesquisarTxtKeyTyped

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
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JButton adicionarJButton;
    private javax.swing.JButton clienteButton;
    private javax.swing.JTextField codigoPesquisarTxt;
    private javax.swing.JButton editarJButton;
    private javax.swing.JButton funcionarioButton;
    public static javax.swing.JTable funcionariosJTable;
    private javax.swing.JButton inicioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarJButton;
    private javax.swing.JButton produtoJButton;
    private javax.swing.JButton vendasButton;
    // End of variables declaration//GEN-END:variables
}
