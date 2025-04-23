package view.funcionalidades.roupa;
import view.funcionalidades.roupa.*;
import javax.swing.JOptionPane;
import logica.Roupa;
import mysql.RoupaBD;
import view.RoupaGUI;

public class AlterarRoupaGUI extends javax.swing.JFrame {

    public AlterarRoupaGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fecharJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoRefTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precoVendaTxt = new javax.swing.JTextField();
        precoCustoTxt = new javax.swing.JTextField();
        quantEstoqueTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox<>();
        adicionarTipoButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        generoComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        marcaComboBox = new javax.swing.JComboBox<>();
        adicionarMarcaButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        categoriaEtariaComboBox = new javax.swing.JComboBox<>();
        tamanhoComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        materialComboBox = new javax.swing.JComboBox<>();
        adicionarMaterialButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        corComboBox = new javax.swing.JComboBox<>();
        adicionarCorButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        limparJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        resultadoJLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));

        fecharJButton.setBackground(new java.awt.Color(153, 51, 255));
        fecharJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fecharJButton.setForeground(new java.awt.Color(255, 255, 255));
        fecharJButton.setText("X");
        fecharJButton.setBorderPainted(false);
        fecharJButton.setFocusPainted(false);
        fecharJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDITAR DADOS DE ROUPA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(182, 182, 182)
                .addComponent(fecharJButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fecharJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REF.:");

        codigoRefTxt.setBackground(new java.awt.Color(51, 0, 51));
        codigoRefTxt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        codigoRefTxt.setForeground(new java.awt.Color(255, 255, 255));
        codigoRefTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoRefTxtActionPerformed(evt);
            }
        });
        codigoRefTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoRefTxtKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preço de venda: R$");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço de custo: R$");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quant. em estoque:");

        precoVendaTxt.setBackground(new java.awt.Color(51, 0, 51));
        precoVendaTxt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        precoVendaTxt.setForeground(new java.awt.Color(255, 255, 255));
        precoVendaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoVendaTxtActionPerformed(evt);
            }
        });
        precoVendaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoVendaTxtKeyTyped(evt);
            }
        });

        precoCustoTxt.setBackground(new java.awt.Color(51, 0, 51));
        precoCustoTxt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        precoCustoTxt.setForeground(new java.awt.Color(255, 255, 255));
        precoCustoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoCustoTxtActionPerformed(evt);
            }
        });
        precoCustoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoCustoTxtKeyTyped(evt);
            }
        });

        quantEstoqueTxt.setBackground(new java.awt.Color(51, 0, 51));
        quantEstoqueTxt.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        quantEstoqueTxt.setForeground(new java.awt.Color(255, 255, 255));
        quantEstoqueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantEstoqueTxtActionPerformed(evt);
            }
        });
        quantEstoqueTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantEstoqueTxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");

        tipoComboBox.setBackground(new java.awt.Color(51, 0, 51));
        tipoComboBox.setEditable(true);
        tipoComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tipoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blusa", "Camisa", "Cropped", "Vestido", "Calça", "Short", "Saia", "Macacão", "Macaquito" }));
        tipoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoComboBoxActionPerformed(evt);
            }
        });

        adicionarTipoButton.setBackground(new java.awt.Color(51, 0, 51));
        adicionarTipoButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarTipoButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarTipoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mais.png"))); // NOI18N
        adicionarTipoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarTipoButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gênero: ");

        generoComboBox.setBackground(new java.awt.Color(51, 0, 51));
        generoComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        generoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Unissex" }));
        generoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tamanho:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Marca:");

        marcaComboBox.setBackground(new java.awt.Color(51, 0, 51));
        marcaComboBox.setEditable(true);
        marcaComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marcaComboBox.setForeground(new java.awt.Color(255, 255, 255));
        marcaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adidas", "Nike", "LL modas" }));

        adicionarMarcaButton.setBackground(new java.awt.Color(51, 0, 51));
        adicionarMarcaButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarMarcaButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarMarcaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mais.png"))); // NOI18N
        adicionarMarcaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMarcaButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Categoria Etária:");

        categoriaEtariaComboBox.setBackground(new java.awt.Color(51, 0, 51));
        categoriaEtariaComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        categoriaEtariaComboBox.setForeground(new java.awt.Color(255, 255, 255));
        categoriaEtariaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantil", "Jovenil", "Adulto" }));

        tamanhoComboBox.setBackground(new java.awt.Color(51, 0, 51));
        tamanhoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        tamanhoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG", "EXTRAG" }));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Material:");

        materialComboBox.setBackground(new java.awt.Color(51, 0, 51));
        materialComboBox.setEditable(true);
        materialComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        materialComboBox.setForeground(new java.awt.Color(255, 255, 255));
        materialComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algodão", "Poliéster" }));

        adicionarMaterialButton.setBackground(new java.awt.Color(51, 0, 51));
        adicionarMaterialButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarMaterialButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarMaterialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mais.png"))); // NOI18N
        adicionarMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMaterialButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cor:");

        corComboBox.setBackground(new java.awt.Color(51, 0, 51));
        corComboBox.setEditable(true);
        corComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        corComboBox.setForeground(new java.awt.Color(255, 255, 255));
        corComboBox.setMaximumRowCount(20);
        corComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Branco", "Azul", "Vermelho", "Amarelo" }));

        adicionarCorButton.setBackground(new java.awt.Color(51, 0, 51));
        adicionarCorButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarCorButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarCorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mais.png"))); // NOI18N
        adicionarCorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCorButtonActionPerformed(evt);
            }
        });

        salvarButton.setBackground(new java.awt.Color(51, 255, 51));
        salvarButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        limparJButton.setBackground(new java.awt.Color(153, 0, 255));
        limparJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        limparJButton.setForeground(new java.awt.Color(255, 255, 255));
        limparJButton.setText("Limpar");
        limparJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparJButtonActionPerformed(evt);
            }
        });

        cancelarJButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelarJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelarJButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarJButton.setText("Cancelar");
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("*");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("*");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("*");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("*");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("*");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("*");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("*");

        resultadoJLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        resultadoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultadoJLabel.setText(" ");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Você não pode alterar o REF!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(7, 7, 7)
                                                .addComponent(materialComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(marcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(corComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionarTipoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                            .addComponent(adicionarCorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(adicionarMarcaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(adicionarMaterialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(limparJButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(precoVendaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(codigoRefTxt))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(categoriaEtariaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tamanhoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(quantEstoqueTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(precoCustoTxt))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelarJButton)
                                .addGap(0, 209, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigoRefTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantEstoqueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(precoVendaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoCustoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarTipoButton)
                    .addComponent(jLabel7)
                    .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(categoriaEtariaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(adicionarCorButton)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(marcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarMarcaButton)
                    .addComponent(tamanhoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materialComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(adicionarMaterialButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultadoJLabel)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(cancelarJButton)
                    .addComponent(limparJButton))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarTipoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarTipoButtonActionPerformed
        // TODO add your handling code here:
        String novoTipo = JOptionPane.showInputDialog("Digite o novo tipo: ");
        if (novoTipo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo, ele é obrigatório para esta função.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            tipoComboBox.addItem(novoTipo);
        }
    }//GEN-LAST:event_adicionarTipoButtonActionPerformed

    private void tipoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoComboBoxActionPerformed

    private void quantEstoqueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantEstoqueTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantEstoqueTxtActionPerformed

    private void precoCustoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoCustoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoCustoTxtActionPerformed

    private void precoVendaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoVendaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoVendaTxtActionPerformed

    private void codigoRefTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoRefTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoRefTxtActionPerformed

    private void fecharJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_fecharJButtonActionPerformed

    private void generoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoComboBoxActionPerformed

    private void adicionarMarcaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMarcaButtonActionPerformed
        // TODO add your handling code here:
        String novaMarca = JOptionPane.showInputDialog("Digite o nova marca: ");
        if (novaMarca.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo, ele é obrigatório para esta função.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            marcaComboBox.addItem(novaMarca);
        }
    }//GEN-LAST:event_adicionarMarcaButtonActionPerformed

    private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarJButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here
        
        if (codigoRefTxt.getText().isEmpty() || precoVendaTxt.getText().isEmpty() ||  
                precoCustoTxt.getText().isEmpty() || quantEstoqueTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos indicados com *, eles são obrigatórios.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            Roupa roupa = RoupaBD.selecionarRoupa((int)RoupaGUI.roupasJTable.getValueAt(RoupaGUI.roupasJTable.getSelectedRow(),0));
            
            roupa.setPrecoDeVenda(Double.parseDouble(precoVendaTxt.getText()));
            roupa.setPrecoDeCusto(Double.parseDouble(precoCustoTxt.getText()));
            roupa.setTamanho(tamanhoComboBox.getSelectedItem().toString());
            roupa.setTipo(tipoComboBox.getSelectedItem().toString());
            roupa.setMarca(marcaComboBox.getSelectedItem().toString());
            roupa.setCategoriaEtaria(categoriaEtariaComboBox.getSelectedItem().toString());
            roupa.setCor(corComboBox.getSelectedItem().toString());
            roupa.setGeneroDaRoupa(generoComboBox.getSelectedItem().toString());
            roupa.setMaterial(materialComboBox.getSelectedItem().toString());
            roupa.setQuantidadeDeEstoque(Integer.parseInt(quantEstoqueTxt.getText()));
            
            int linhasAfetadasAlteracaoRoupa = RoupaBD.alterarDadosDaRoupa(roupa);
            if (linhasAfetadasAlteracaoRoupa == 1) {
                JOptionPane.showMessageDialog(null, "Os dados foram atualizados com sucesso!");
                RoupaGUI.adicionarRoupaNaTabela();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Nenhuma alteração foi realizada.",
                        "Error", JOptionPane.WARNING_MESSAGE);
            }   
        }
        
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void codigoRefTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoRefTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_codigoRefTxtKeyTyped

    private void quantEstoqueTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantEstoqueTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_quantEstoqueTxtKeyTyped

    private void precoVendaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoVendaTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_precoVendaTxtKeyTyped

    private void precoCustoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoCustoTxtKeyTyped
        // TODO add your handling code here:
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume(); //verificar carcateres digitados
        }
    }//GEN-LAST:event_precoCustoTxtKeyTyped

    private void limparJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparJButtonActionPerformed
        // TODO add your handling code here:
        codigoRefTxt.setText("");
        quantEstoqueTxt.setText("");
        precoVendaTxt.setText("");
        precoCustoTxt.setText("");
    }//GEN-LAST:event_limparJButtonActionPerformed

    private void adicionarCorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCorButtonActionPerformed
        // TODO add your handling code here:
        String novaCor = JOptionPane.showInputDialog("Digite o nova cor: ");
        if (novaCor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo, ele é obrigatório para esta função.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            corComboBox.addItem(novaCor);
        }
    }//GEN-LAST:event_adicionarCorButtonActionPerformed

    private void adicionarMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMaterialButtonActionPerformed
        // TODO add your handling code here:
        String novoMaterial = JOptionPane.showInputDialog("Digite o novo material: ");
        if (novoMaterial.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo, ele é obrigatório para esta função.", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            materialComboBox.addItem(novoMaterial);
        }
    }//GEN-LAST:event_adicionarMaterialButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarRoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarRoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarRoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarRoupaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarRoupaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarCorButton;
    private javax.swing.JButton adicionarMarcaButton;
    private javax.swing.JButton adicionarMaterialButton;
    private javax.swing.JButton adicionarTipoButton;
    private javax.swing.JButton cancelarJButton;
    public static javax.swing.JComboBox<String> categoriaEtariaComboBox;
    public static javax.swing.JTextField codigoRefTxt;
    public static javax.swing.JComboBox<String> corComboBox;
    private javax.swing.JButton fecharJButton;
    public static javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    public static javax.swing.JComboBox<String> marcaComboBox;
    public static javax.swing.JComboBox<String> materialComboBox;
    public static javax.swing.JTextField precoCustoTxt;
    public static javax.swing.JTextField precoVendaTxt;
    public static javax.swing.JTextField quantEstoqueTxt;
    private javax.swing.JLabel resultadoJLabel;
    private javax.swing.JButton salvarButton;
    public static javax.swing.JComboBox<String> tamanhoComboBox;
    public static javax.swing.JComboBox<String> tipoComboBox;
    // End of variables declaration//GEN-END:variables
public void receberTipo(String novoTipo) {
        tipoComboBox.addItem(novoTipo);
    }
public void receberCor(String novaCor) {
        corComboBox.addItem(novaCor);
    }
public void receberMarca(String novaMarca) {
        marcaComboBox.addItem(novaMarca);
    }
public void receberMaterial(String novoMaterial) {
        materialComboBox.addItem(novoMaterial);
    }
}
