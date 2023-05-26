/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class TelaCadastroFilmes extends javax.swing.JFrame {

    Conexao con_cliente;
     
    public TelaCadastroFilmes() {
        initComponents();
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tblfilmes order by id");
        preencherTabela();
        posicionarRegistro();
        tblFilmes.setAutoCreateRowSorter(true);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAqs = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        jTable = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        BtnNovo = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_pesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQtdTot = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("id");

        jLabel2.setText("Título");

        jLabel3.setText("Data Aquisição");

        jLabel4.setText("Quantidade Disp");

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Título", "Data Aquisição", "Qtd Disp", "Qtd Tot"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFilmesMouseClicked(evt);
            }
        });
        tblFilmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblFilmesKeyPressed(evt);
            }
        });
        jTable.setViewportView(tblFilmes);

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/352470_backspace_icon.png"))); // NOI18N
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/352024_arrow_forward_icon.png"))); // NOI18N
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/352560_before_navigate_icon.png"))); // NOI18N
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/352468_arrow_right_icon.png"))); // NOI18N
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });

        BtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7787547_plus_add_new_year_create_icon.png"))); // NOI18N
        BtnNovo.setText("Novo");
        BtnNovo.setToolTipText("");
        BtnNovo.setActionCommand("");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2639912_save_icon.png"))); // NOI18N
        btnGravar.setText("Salvar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/326714_pencil_translate_write_icon.png"))); // NOI18N
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/9036038_trash_sharp_icon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setText("Pesquise pelo nome do Filme:");

        txt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisaActionPerformed(evt);
            }
        });
        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyReleased(evt);
            }
        });

        jLabel5.setText("Quantidade Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAqs, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtQtdTot))
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnPrimeiroRegistro)
                                    .addGap(176, 176, 176)
                                    .addComponent(btnVoltarUmRegistro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAvancarUmRegistro)
                                    .addGap(178, 178, 178)
                                    .addComponent(btnUltimoRegistro))
                                .addComponent(jTable, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGravar))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTable, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimeiroRegistro)
                    .addComponent(btnUltimoRegistro)
                    .addComponent(btnAvancarUmRegistro)
                    .addComponent(btnVoltarUmRegistro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void tblFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilmesMouseClicked
       int linha_selecionada = tblFilmes.getSelectedRow();
        txtCod.setText(tblFilmes.getValueAt(linha_selecionada, 0).toString());
        txtTitulo.setText(tblFilmes.getValueAt(linha_selecionada, 1).toString());
        txtAqs.setText(tblFilmes.getValueAt(linha_selecionada, 2).toString());
        txtQtd.setText(tblFilmes.getValueAt(linha_selecionada, 3).toString());
        txtQtdTot.setText(tblFilmes.getValueAt(linha_selecionada, 4).toString());
        
            
    }//GEN-LAST:event_tblFilmesMouseClicked

    private void tblFilmesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFilmesKeyPressed
int linha_selecionada = tblFilmes.getSelectedRow();
        txtCod.setText(tblFilmes.getValueAt(linha_selecionada, 0).toString());
        txtTitulo.setText(tblFilmes.getValueAt(linha_selecionada, 1).toString());
        txtAqs.setText(tblFilmes.getValueAt(linha_selecionada, 2).toString());
        txtQtd.setText(tblFilmes.getValueAt(linha_selecionada, 3).toString());
        txtQtdTot.setText(tblFilmes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblFilmesKeyPressed

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed
       try{
           con_cliente.resultset.first();
           mostrar_Dados();
       }catch(SQLException erro){
        JOptionPane.showMessageDialog(null,"Não foi possivel acessar o primeiro registro:  "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed
        try{
           con_cliente.resultset.last();
           mostrar_Dados();
        }catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no último registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnVoltarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUmRegistroActionPerformed
       try{
       con_cliente.resultset.previous();
       mostrar_Dados();
       }catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no registro anterior: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnVoltarUmRegistroActionPerformed

    private void btnAvancarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarUmRegistroActionPerformed
       try{
        con_cliente.resultset.next();
        mostrar_Dados();
       }catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no proximo registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAvancarUmRegistroActionPerformed

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
       txtCod.setText("");
       txtTitulo.setText("");
       txtAqs.setText("");
       txtQtd.setText("");
       txtQtdTot.setText("");
       txtCod.requestFocus();
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
      String titulo = txtTitulo.getText();
      String dt_aquisicao = txtAqs.getText();
      String qtd_disp = txtQtd.getText();
      String qtd_tot = txtQtdTot.getText();
      try{
          String insert_sql="insert into tblfilmes (titulo,dt_aquisicao, qtd_disp, qtd_tot) values ('" + titulo + "','" + dt_aquisicao + "','" + qtd_disp + "','" + qtd_tot + "')";
          con_cliente.statement.executeUpdate(insert_sql);
          JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
          con_cliente.executaSQL("select * from tblfilmes order by id");
          con_cliente.resultset.first();
          preencherTabela();
          mostrar_Dados();
      
      }catch (SQLException errosql){
       JOptionPane.showMessageDialog(null, "\n Erro na gravação  :\n"+errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
      String titulo = txtTitulo.getText();
      String data_aquisicao = txtAqs.getText();
      String qtd_disp = txtQtd.getText();
      String qtd_tot = txtQtdTot.getText();
      String sql="";
      String msg="";
      
      try{
          if(txtCod.getText().equals("")){
             sql="insert into tblfilmes (titulo, qtd_disp, qtd_tot, dt_aquisicao) values ('"+ titulo +"','"+ qtd_disp +"','"+ qtd_tot +"','"+ data_aquisicao +"')";
             msg="Gravação de um novo registro";
          }else{
           sql="update tblfilmes set titulo='"+ titulo +"', qtd_disp='"+ qtd_disp +"', qtd_tot='"+ qtd_tot +"', dt_aquisicao='"+ data_aquisicao +"' where id ="+ txtCod.getText();
           msg="Alteração de registro";
          }
          
          con_cliente.statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null,msg+" realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
          
          con_cliente.executaSQL("select * from tblfilmes order by id");
          con_cliente.resultset.first();
          preencherTabela();
          mostrar_Dados();
          
      }catch(SQLException errosql){
       JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n"+errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
      
      
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String sql="";
        try{
           int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja excluir o registro:", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
           if (resposta == 0){
               sql = "delete from tblfilmes where id = " + txtCod.getText();
               int excluir = con_cliente.statement.executeUpdate(sql);
           if (excluir == 1){
               JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem de Programa", JOptionPane.INFORMATION_MESSAGE);
               con_cliente.executaSQL("select * from tblfilmes order by id");
               con_cliente.resultset.first();
               preencherTabela();
               posicionarRegistro();
           }   
           else{
               JOptionPane.showMessageDialog(null,"Operação cancelada pelo usuario!!","Mensagem de Programa",JOptionPane.INFORMATION_MESSAGE);
              }
           }
        }catch (SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro na exclusão :"+excecao, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisaActionPerformed

    private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyReleased
       try{
        String pesquisa = "select * from tblfilmes where titulo like '" + txt_pesquisa.getText()+ "%'";
        con_cliente.executaSQL(pesquisa);
        
        if(con_cliente.resultset.first()){
         preencherTabela();
        }
        else{
            JOptionPane.showMessageDialog(null,"\n Não existe dados com este paramêtro!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);  
        }
      }catch(SQLException errosql){
          JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_txt_pesquisaKeyReleased

    public void posicionarRegistro(){
        try{
         con_cliente.resultset.first();
         mostrar_Dados();
        }catch(SQLException erro){
        JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados(){
      try{
          txtCod.setText(con_cliente.resultset.getString("id"));
          txtTitulo.setText(con_cliente.resultset.getString("titulo"));
          txtAqs.setText(con_cliente.resultset.getString("dt_aquisicao"));
          txtQtd.setText(con_cliente.resultset.getString("qtd_disp"));
          txtQtdTot.setText(con_cliente.resultset.getString("qtd_tot"));
          
      }catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }
    
    public void preencherTabela(){
       tblFilmes.getColumnModel().getColumn(0).setPreferredWidth(4);
       tblFilmes.getColumnModel().getColumn(1).setPreferredWidth(150);
       tblFilmes.getColumnModel().getColumn(2).setPreferredWidth(11);
       tblFilmes.getColumnModel().getColumn(3).setPreferredWidth(14);
       tblFilmes.getColumnModel().getColumn(4).setPreferredWidth(100);
       
       DefaultTableModel modelo = (DefaultTableModel) tblFilmes.getModel();
       modelo.setNumRows(0);
       
       try{
           con_cliente.resultset.beforeFirst();
           while (con_cliente.resultset.next()){
               modelo.addRow(new Object[]{
               con_cliente.resultset.getString("id"),con_cliente.resultset.getString("titulo"),con_cliente.resultset.getString("dt_aquisicao"),con_cliente.resultset.getString("qtd_disp"), con_cliente.resultset.getString("qtd_tot")
               });
           }
       }catch (SQLException erro){
           JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
       }
   }
    
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
            java.util.logging.Logger.getLogger(TelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancarUmRegistro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltarUmRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTextField txtAqs;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtQtdTot;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
