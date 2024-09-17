package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        fecha.setText(formato.format(sistFecha));
        Timer tiempo = new Timer(100, new Menu.horas());
        tiempo.start();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    class horas implements ActionListener{ 
        public void actionPerformed(ActionEvent e){
            Date sistHora = new Date();
            String pmAm ="hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            hora.setText(String.format(format.format(sistHora),hoy));
        }
    }
    
    void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation((dimension.width -Dframe.height)/2,(dimension.height-Dframe.width)/2);
        frame.show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        cerrar = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        venta = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        ventamedi = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        compras = new javax.swing.JMenuItem();
        datos = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        consulta = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        VentanaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        VentanaPrincipal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                VentanaPrincipalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        fecha.setText("FECHA");
        fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hora.setText("HORA");
        hora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FARMACIA 3 B");

        jLabel2.setText("BIENVENIDO ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logof.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                        .addGap(188, 387, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha)
                        .addGap(18, 18, 18)
                        .addComponent(hora)))
                .addContainerGap())
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(hora)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.jpg"))); // NOI18N
        jMenu5.setText("MENU");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu5.add(jSeparator7);

        jMenuItem1.setText("ACTUALIZACIONES");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);
        jMenu5.add(jSeparator8);

        jMenuItem2.setText("VERSION");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);
        jMenu5.add(jSeparator9);

        cerrar.setText("CERRAR SECCION");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jMenu5.add(cerrar);
        jMenu5.add(jSeparator12);

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu5.add(salir);
        jMenu5.add(jSeparator13);

        jMenuBar1.add(jMenu5);

        venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20200608-WA0025.jpg"))); // NOI18N
        venta.setText("VENTA");
        venta.add(jSeparator5);

        ventamedi.setText("GENERAR VENTAS");
        ventamedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventamediActionPerformed(evt);
            }
        });
        venta.add(ventamedi);
        venta.add(jSeparator6);

        jMenuBar1.add(venta);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20200608-WA0026.jpg"))); // NOI18N
        jMenu1.setText("COMPRAR");

        compras.setText("COMPRAS");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jMenu1.add(compras);

        jMenuBar1.add(jMenu1);

        datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20200608-WA0027.jpg"))); // NOI18N
        datos.setText("DATOS");
        datos.add(jSeparator2);

        jMenuItem5.setText("MEDICAMENTO");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        datos.add(jMenuItem5);
        datos.add(jSeparator1);

        jMenuItem6.setText("LABORATORIO");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        datos.add(jMenuItem6);
        datos.add(jSeparator3);

        jMenuItem7.setText("CLIENTE");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        datos.add(jMenuItem7);
        datos.add(jSeparator4);

        jMenuBar1.add(datos);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMG-20200608-WA0028.jpg"))); // NOI18N
        jMenu8.setText("REPORTE");
        jMenu8.add(jSeparator10);

        consulta.setText("CONSUTA");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        jMenu8.add(consulta);
        jMenu8.add(jSeparator11);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null,"PROGRAMA VERSION ALFA","PANTALLA INFORMACION",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ventamediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventamediActionPerformed
        VentasForm vf = new VentasForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_ventamediActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        MedicamentoForm md = new MedicamentoForm();
        CentrarVentana(md);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        LaboratorioForm lab = new LaboratorioForm();
        CentrarVentana(lab);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ClienteForm c = new ClienteForm();
        CentrarVentana(c);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null,"PROXIMA ACTUALIZACION DATOS ACTUALIZAR FOTO","PANTALLA INFORMACION",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        CompraForm com = new CompraForm();
        CentrarVentana(com);
    }//GEN-LAST:event_comprasActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        Consulta con=new Consulta();
        CentrarVentana(con);
    }//GEN-LAST:event_consultaActionPerformed

    private void VentanaPrincipalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_VentanaPrincipalAncestorAdded

    }//GEN-LAST:event_VentanaPrincipalAncestorAdded

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        JOptionPane.showMessageDialog(null, "CERRADO FORZOSO");
        System.exit(0);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        JOptionPane.showMessageDialog(null,"HASTA LA PROXIMA","PANTALLA INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        JOptionPane.showMessageDialog(null, "CERRADO FORZOSO");
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel VentanaPrincipal;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JMenuItem compras;
    private javax.swing.JMenuItem consulta;
    private javax.swing.JMenu datos;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenu venta;
    private javax.swing.JMenuItem ventamedi;
    // End of variables declaration//GEN-END:variables
      
}
