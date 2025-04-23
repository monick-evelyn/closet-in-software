package view;
import java.lang.Object;
import java.util.Objects;
import logica.Roupa;
import mysql.RoupaBD;
import view.funcionalidades.roupa.AdicionarRoupaGUI;
import view.funcionalidades.roupa.AlterarRoupaGUI;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class RoupaGUI extends javax.swing.JFrame {
    
    public RoupaGUI() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) roupasJTable.getModel();
        roupasJTable.setRowSorter(new TableRowSorter(modelo));
        
        adicionarRoupaNaTabela();
    }
    // MÉTODO DE ADICIONAR PRODUTO NA TABELA
    public static void adicionarRoupaNaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) roupasJTable.getModel();
        modelo.setNumRows(0);
        RoupaBD roupaBD = new RoupaBD();
        
        for (Roupa r: roupaBD.selecionarTodasAsRoupas()) {
            
            modelo.addRow(new Object[]{
                r.getCodigoReferencia(),
                r.getPrecoDeVenda(),
                r.getPrecoDeCusto(),
                r.getTamanho(),
                r.getTipo(),
                r.getMarca(),
                r.getCategoriaEtaria(),
                r.getCor(),
                r.getGeneroDaRoupa(),
                r.getMaterial(),
                r.getQuantidadeDeEstoque()
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        roupasJTable = new javax.swing.JTable();
        adicionarJButton = new javax.swing.JButton();
        editarJButton = new javax.swing.JButton();
        ExcluirJButton = new javax.swing.JButton();
        pesquisarJButton = new javax.swing.JButton();
        codigoPesquisadoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Closet In Software");

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

        produtoJButton.setBackground(new java.awt.Color(153, 0, 255));
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
                .addGap(0, 188, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(funcionarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 51, 255));
        jPanel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("| Roupas");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("__________________________________________________________________________________________________________________________________________________________________");

        roupasJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roupasJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REF", "Preço", "Preço de Custo", "Tamanho", "Tipo", "Marca", "Categoria Etária", "Cor", "Gênero", "Material", "Quant. estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        roupasJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roupasJTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(roupasJTable);
        if (roupasJTable.getColumnModel().getColumnCount() > 0) {
            roupasJTable.getColumnModel().getColumn(2).setResizable(false);
            roupasJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        adicionarJButton.setBackground(new java.awt.Color(0, 204, 51));
        adicionarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarJButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarJButton.setText("Adicionar");
        adicionarJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        adicionarJButton.setBorderPainted(false);
        adicionarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarJButtonActionPerformed(evt);
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

        codigoPesquisadoTxt.setBackground(new java.awt.Color(204, 204, 204));
        codigoPesquisadoTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoPesquisadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoPesquisadoTxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite o REF da roupa:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Obs.: Ao adicionar ou editar um atributo numeral, utilize o \".\" apenas para diferenciar  reais de centavos. Ex.: 1538.50");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(adicionarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(editarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ExcluirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoPesquisadoTxt))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pesquisarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel4))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarJButton)
                    .addComponent(editarJButton)
                    .addComponent(ExcluirJButton)
                    .addComponent(pesquisarJButton)
                    .addComponent(codigoPesquisadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
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
    }//GEN-LAST:event_produtoJButtonActionPerformed

    private void funcionarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioButtonActionPerformed
        // TODO add your handling code here:
        FuncionarioGUI funcionarioGUI = new FuncionarioGUI();
        this.dispose();
        funcionarioGUI.setVisible(true);
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

    private void inicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioButtonActionPerformed
        // TODO add your handling code here
        TelaInicialGUI telaInicialGUI = new TelaInicialGUI();
        this.dispose();
        telaInicialGUI.setVisible(true);
    }//GEN-LAST:event_inicioButtonActionPerformed

    private void adicionarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarJButtonActionPerformed
        // TODO add your handling code here:
        AdicionarRoupaGUI adicionarProdutoGUI = new AdicionarRoupaGUI();
        adicionarProdutoGUI.setVisible(true);
    }//GEN-LAST:event_adicionarJButtonActionPerformed

    private void editarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarJButtonActionPerformed
        // TODO add your handling code here:
        if (roupasJTable.getSelectedRow() != -1) {
            RoupaBD roupaBD = new RoupaBD();
            //Roupa roupa = RoupaBD.selecionarRoupa((int)roupasJTable.getValueAt(roupasJTable.getSelectedRow(),0));
            AlterarRoupaGUI alterarRoupa = new AlterarRoupaGUI();
            //Passando dados para adicionarRoupaGUI
            AlterarRoupaGUI.codigoRefTxt.setText(roupasJTable.getValueAt(roupasJTable.getSelectedRow(),0).toString());
            AlterarRoupaGUI.precoVendaTxt.setText(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 1).toString());
            AlterarRoupaGUI.precoCustoTxt.setText(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 2).toString());
            AlterarRoupaGUI.tamanhoComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 3));
            AlterarRoupaGUI.tipoComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 4));
            AlterarRoupaGUI.marcaComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 5));
            AlterarRoupaGUI.categoriaEtariaComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 6));
            AlterarRoupaGUI.corComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 7));
            AlterarRoupaGUI.generoComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 8));
            AlterarRoupaGUI.materialComboBox.setSelectedItem(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 9));
            AlterarRoupaGUI.quantEstoqueTxt.setText(roupasJTable.getValueAt(roupasJTable.getSelectedRow(), 10).toString());
            
            alterarRoupa.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha para editar dados.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_editarJButtonActionPerformed

    private void ExcluirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel roupasModel = (DefaultTableModel) roupasJTable.getModel();
        String refLinha = "";
        
        if (roupasJTable.getSelectedRow() != -1) {
            refLinha = roupasJTable.getValueAt(roupasJTable.getSelectedRow(),0).toString();
            int codigoExcluir = Integer.parseInt(refLinha);
            Roupa roupaExcluir = RoupaBD.selecionarRoupa(codigoExcluir);
            
            if (!Objects.equals(roupaExcluir, null))  {
                int resposta = JOptionPane.showConfirmDialog(null, 
                        "Você tem certeza que deseja excluir a \n" + roupaExcluir.toString() + "?");
                //0 = sim. 1 = não. 2 = cancelar; -1 = fechar.
                if (resposta == 0) {
                    //Colar método remover roupa;
                    int linhasAfetadasRemocao = RoupaBD.removerRoupa(codigoExcluir);
               
                    if (linhasAfetadasRemocao == 1) {
                        //roupasJTable.removerLinha(roupasJTable.getSelectedRow());
                        JOptionPane.showMessageDialog(null, "Roupa excluida com sucesso!");

                        adicionarRoupaNaTabela();
                        
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
        if (codigoPesquisadoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa preencher o campo para realizar uma pesquisa.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(codigoPesquisadoTxt.getText());
            Roupa RoupaPesquisada = RoupaBD.selecionarRoupa(codigo);
            
            if (!Objects.equals(RoupaPesquisada,null)) {
                JOptionPane.showMessageDialog(null, "Roupa encontrada: \n" + RoupaPesquisada.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma roupa foi encontrada com o código de referência: " + codigo,
                    "Error",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_pesquisarJButtonActionPerformed

    private void codigoPesquisadoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoPesquisadoTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_codigoPesquisadoTxtKeyTyped

    private void roupasJTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roupasJTableKeyReleased

    }//GEN-LAST:event_roupasJTableKeyReleased

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
            java.util.logging.Logger.getLogger(RoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoupaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JButton adicionarJButton;
    private javax.swing.JButton clienteButton;
    private javax.swing.JTextField codigoPesquisadoTxt;
    private javax.swing.JButton editarJButton;
    private javax.swing.JButton funcionarioButton;
    private javax.swing.JButton inicioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisarJButton;
    private javax.swing.JButton produtoJButton;
    public static javax.swing.JTable roupasJTable;
    private javax.swing.JButton vendasButton;
    // End of variables declaration//GEN-END:variables
}
