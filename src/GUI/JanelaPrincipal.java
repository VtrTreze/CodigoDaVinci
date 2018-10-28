package GUI;

import java.awt.event.MouseAdapter;
import javax.swing.JTable;

/**
 *
 * @author Victor Rodrigues
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabTarefasPend = new javax.swing.JTabbedPane();
        scrollPaneMinhasTarefas = new javax.swing.JScrollPane();
        tblMinhasTarefas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCreateTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabTarefasPend.setToolTipText("Tarefas Pendentes");

        tblMinhasTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", null, null, "Criar página do produto \"X\"", "Iniciada (Em atraso)", "24/11/2018", "26/11/2018"},
                {"02", null, null, "Ajustar layout da tela de login", "Finalizada", "10/10/2018", "25/10/2018"},
                {"03", null, null, "Criar banco de dados do cliente \"X\"", "Cancelada", "01/01/2001", "01/02/2001"},
                {"04", null, null, "Verificar problemas em sistema \"Y\"", "Finalizada", "25/12/2017", "30/12/2017"}
            },
            new String [] {
                "ID", "Prioridade", "Nome", "Descrição", "Status", "Data da solicitação", "Prazo final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMinhasTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMinhasTarefasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMinhasTarefasMousePressed(evt);
            }
        });
        scrollPaneMinhasTarefas.setViewportView(tblMinhasTarefas);

        tabTarefasPend.addTab("Minhas Tarefas", scrollPaneMinhasTarefas);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        tabTarefasPend.addTab("Criadas por mim", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setEnabled(false);
        jScrollPane3.setViewportView(jTable3);

        tabTarefasPend.addTab("Todas as tarefas", jScrollPane3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mais antigo primeiro", "Mais recente primeiro", "Em aberto", "Iniciadas", "Concluidas", "Canceladas", "Prioridade Baixa", "Prioridade Média", "Prioridade Alta" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        btnCreateTask.setText("Criar tarefa");
        btnCreateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabTarefasPend, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCreateTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabTarefasPend, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        tabTarefasPend.getAccessibleContext().setAccessibleName("Tarefas Pendentes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCreateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTaskActionPerformed
        CriarTarefa painelCriarTarefa = new CriarTarefa();
        painelCriarTarefa.setVisible(true);
    }//GEN-LAST:event_btnCreateTaskActionPerformed

    private void tblMinhasTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMinhasTarefasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMinhasTarefasMouseClicked

    private void tblMinhasTarefasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMinhasTarefasMousePressed

        if (evt.getClickCount() == 2 && tblMinhasTarefas.getSelectedRow() != -1) {
            Object id = tblMinhasTarefas.getValueAt(tblMinhasTarefas.getSelectedRow(), 0);
            Object nome = tblMinhasTarefas.getValueAt(tblMinhasTarefas.getSelectedRow(), tblMinhasTarefas.getSelectedColumn());
            Object descricao = tblMinhasTarefas.getValueAt(tblMinhasTarefas.getSelectedRow(), tblMinhasTarefas.getSelectedColumn());
            
            EditarTarefa editar = new EditarTarefa(nome.toString(), descricao.toString());
            
            editar.editar();

            editar.setVisible(true);
        }
    }//GEN-LAST:event_tblMinhasTarefasMousePressed

    public static void main(String args[]) {

        JanelaPrincipal janela = new JanelaPrincipal();
        JTable minhasTarefas = new JTable();

        minhasTarefas.addMouseListener(new MouseAdapter() {

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateTask;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JScrollPane scrollPaneMinhasTarefas;
    private javax.swing.JTabbedPane tabTarefasPend;
    private javax.swing.JTable tblMinhasTarefas;
    // End of variables declaration//GEN-END:variables
}
