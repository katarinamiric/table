/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import ui.components.IViewData;

/**
 *
 * @author student1
 */
public class FormViewComboboxMath extends javax.swing.JDialog implements IViewData {

    /**
     * Creates new form FormViewComboboxMath
     */
    public FormViewComboboxMath(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populateForm();
        Controller.getInstance().register(this);
        JDialog thisForm = this;

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                Controller.getInstance().removeView(thisForm);
                System.out.println("This dialog has been removed: " + thisForm);
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

         cmbValues.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               int selected = cmbValues.getSelectedIndex();
               Controller.getInstance().select(selected);
            }

            
        });
//        cmbValues.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent arg0) {
//                int selected = cmbValues.getSelectedIndex();
//                Controller.getInstance().select(selected);
//            }
//
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbValues = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View-combobox");

        jLabel1.setText("Values:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmbValues, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<model.Math> cmbValues;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void populateForm() {
        List<model.Math> values = Controller.getInstance().getMaths();
        cmbValues.setModel(new DefaultComboBoxModel(values.toArray()));     //popunjava Combobox
    }

    @Override
    public void refreshData() {
        populateForm();
    }

    @Override
    public void selectRow(int selected) {
        cmbValues.setSelectedIndex(selected);
    }

    
}