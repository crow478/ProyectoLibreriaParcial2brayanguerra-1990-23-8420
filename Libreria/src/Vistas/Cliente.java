package Vistas;

import Modelo.ClienteDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente extends javax.swing.JInternalFrame {

    ClienteDao dao = new ClienteDao();
    DefaultTableModel modelo = new DefaultTableModel();

    public Cliente() {
        initComponents();
        listar();
    }

    void listar() {
        List<Modelo.Cliente> lista = dao.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getDpi();  // Corregido el índice
            ob[2] = lista.get(i).getNombres();  // Corregido el índice
            ob[3] = lista.get(i).getDireccion();  // Corregido el índice
            ob[4] = lista.get(i).getEstado();  // Corregido el índice
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdpi = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtdire = new javax.swing.JTextField();
        txtcombo = new javax.swing.JComboBox<>();
        btnagg = new javax.swing.JButton();
        btnactu = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setTitle("Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("DPI");

        jLabel2.setText("NOMBRES");

        jLabel3.setText("DIRECCION");

        jLabel4.setText("ESTADO");

        txtcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "0" }));

        btnagg.setText("AGREGAR");
        btnagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaggActionPerformed(evt);
            }
        });

        btnactu.setText("ACTUALIZAR");
        btnactu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactuActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(txtdpi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombres))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdire)
                            .addComponent(txtcombo, 0, 130, Short.MAX_VALUE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnagg)
                    .addComponent(btnactu)
                    .addComponent(btneliminar)
                    .addComponent(btnnuevo))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnnuevo)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DPI", "NOMBRES", "DIRECCION", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Métodos para obtener los valores de los campos
    String getDpi() {
        return txtdpi.getText();
    }

    String getId() {
        return txtnombres.getText(); // Asegúrate de que este sea el campo correcto
    }

    private String getNombres() {
        return txtnombres.getText();
    }

    private String getDireccion() {
        return txtdire.getText();
    }

    private String getEstado() {
        return (String) txtcombo.getSelectedItem();
    }

    private void limpiarCampos() {
        txtdpi.setText("");
        txtnombres.setText("");
        txtdire.setText("");
        txtcombo.setSelectedIndex(0);  // Resetea el combo
    }
    private void btnaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaggActionPerformed
      agregar();
        LimpiarTabla();
        listar();
   
    }//GEN-LAST:event_btnaggActionPerformed

    private void btnactuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactuActionPerformed
       actualizar();
        LimpiarTabla();
      listar();
      
    }//GEN-LAST:event_btnactuActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       eliminar();
       LimpiarTabla();
      listar();
      
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
         LimpiarTabla();
      listar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
void agregar() {
    String Dpi = txtdpi.getText();
    String Nombres = txtnombres.getText();
    String Direccion = txtdire.getText();
    String Estado = txtcombo.getSelectedItem().toString();

    // Validación de los campos
    if (Dpi.isEmpty() || Nombres.isEmpty() || Direccion.isEmpty() || Estado.equals("SELECCIONAR")) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
    } else {
        Object[] ob = new Object[4];
        ob[0] = Dpi;
        ob[1] = Nombres;
        ob[2] = Direccion;
        ob[3] = Estado;

        int resultado = dao.add(ob);  // ← capturamos el resultado

        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar el cliente.");
        }
    }
}

    void actualizar() {
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para actualizar.");
            return;
        }

        // Obtener los datos de la fila seleccionada
        int id = (int) tabla.getValueAt(filaSeleccionada, 0);
        String Dpi = txtdpi.getText();
        String Nombres = txtnombres.getText();
        String Direccion = txtdire.getText();
        String Estado = txtcombo.getSelectedItem().toString();

        // Validación de los campos
        if (Dpi.isEmpty() || Nombres.isEmpty() || Direccion.isEmpty() || Estado.equals("SELECCIONAR")) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        } else {
            Object[] ob = new Object[5];
            ob[0] = Dpi;
            ob[1] = Nombres;
            ob[2] = Direccion;
            ob[3] = Estado;
            ob[4] = id;
            int resultado = dao.actualizar(ob);
            if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Cliente actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el cliente.");
            }
        }
    }

    void eliminar() {
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para eliminar.");
            return;
        }

        int id = (int) tabla.getValueAt(filaSeleccionada, 0);
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            dao.eliminar(id);
            JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente.");
        }
    }

    void nuevo() {
        // Limpiar los campos de texto
        txtdpi.setText("");
        txtnombres.setText("");
        txtdire.setText("");
        txtcombo.setSelectedIndex(0);  // Restablecer el combo box
    }

    void LimpiarTabla() {
        // Limpiar las filas de la tabla antes de agregar los nuevos datos
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactu;
    private javax.swing.JButton btnagg;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> txtcombo;
    private javax.swing.JTextField txtdire;
    private javax.swing.JTextField txtdpi;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables

}