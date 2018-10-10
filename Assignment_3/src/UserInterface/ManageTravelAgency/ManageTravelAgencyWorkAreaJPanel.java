/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterace.ManageTravelAgency;

import Business.Airliner;
import Business.travelOffice;
import Business.TravelAgency;
import UserInterface.ManageAirliners.ManageAirplaneJPanel;
import UserInterface.ManageAirliners.flightWorkArea;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankitaroy
 */
public class ManageTravelAgencyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyWorkAreaJPanel
     */
    private final TravelAgency travelAgency;
    private final JPanel userProcessContainer;
    
    public ManageTravelAgencyWorkAreaJPanel(JPanel userProcessContainer,TravelAgency travelAgency ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.travelAgency=travelAgency;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        AirlinerBtn = new javax.swing.JButton();
        OfficeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayTable = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manage Travel Agency");

        AirlinerBtn.setText("Airliners");
        AirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlinerBtnActionPerformed(evt);
            }
        });

        OfficeBtn.setText("Office");
        OfficeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficeBtnActionPerformed(evt);
            }
        });

        DisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name"
            }
        ));
        jScrollPane1.setViewportView(DisplayTable);

        searchBtn.setText("Search Airliners");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(AirlinerBtn)
                            .addGap(183, 183, 183)
                            .addComponent(OfficeBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(addBtn)
                            .addGap(35, 35, 35)
                            .addComponent(viewBtn)
                            .addGap(55, 55, 55)
                            .addComponent(updateBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(backBtn)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AirlinerBtn)
                        .addComponent(OfficeBtn))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(searchBtn)))
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addBtn)
                        .addComponent(viewBtn)
                        .addComponent(updateBtn))
                    .addGap(71, 71, 71)
                    .addComponent(backBtn)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlinerBtnActionPerformed
        // TODO add your handling code here:
        
        fillTable();
    }//GEN-LAST:event_AirlinerBtnActionPerformed

    private void OfficeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficeBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<travelOffice> al = travelAgency.getOfficeList();
        DefaultTableModel dtm = (DefaultTableModel)DisplayTable.getModel();
        dtm.setRowCount(0);
        for ( travelOffice vs : al){
            Object row[] = new Object[10];
            row[0]= vs;
            row[1]= vs.getName();

            dtm.addRow(row);
        }
    }//GEN-LAST:event_OfficeBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Airliner> al = travelAgency.getAirlinerList();
        DefaultTableModel dtm = (DefaultTableModel)DisplayTable.getModel();
        dtm.setRowCount(0);
        String searchValue = searchTxt.getText();
        for (Airliner vs : al){

            if(vs.getName().equalsIgnoreCase(searchValue)||searchValue.equals(String.valueOf(vs.getId()))){
                Object row[] = new Object[10];
                row[0]= vs;
                row[1]= vs.getName();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        Object vs;
        if(btnValue==0){
            JOptionPane.showMessageDialog(null,"Select Airline or office");
            return;
        }
        int a = DisplayTable.getSelectedRow();
        if (a != -1){
            vs = DisplayTable.getValueAt(a, 0);
        }
        else{
            JOptionPane.showMessageDialog(null,"Nothing Selected");
            return;
        }
        if(btnValue==1){

            ManageTravelAgencyWorkAreaJPanel panel = new ManageTravelAgencyWorkAreaJPanel (userProcessContainer, (TravelAgency) vs);
            userProcessContainer.add("AirplanesJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        Object vs;
        if(btnValue==0){
            JOptionPane.showMessageDialog(null,"Table empty");
            return;
        }
        int a = DisplayTable.getSelectedRow();
        if (a != -1){
            vs = DisplayTable.getValueAt(a, 0);
        }
        else{
            JOptionPane.showMessageDialog(null,"Nothing Selected");
            return;
        }
        if(btnValue==1){
            ManageAirplaneJPanel panel = new ManageAirplaneJPanel(userProcessContainer, (Airliner)vs);
            userProcessContainer.add("AirplanesJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_viewBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:

        if(btnValue==0){
            JOptionPane.showMessageDialog(null,"Select Airline or office");
            return;
        }

        if(btnValue==1){
            Airliner vs = travelAgency.addAirliner();
            flightWorkArea panel = new flightWorkArea (userProcessContainer, vs);
            userProcessContainer.add("AirplanesJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AirlinerBtn;
    private javax.swing.JTable DisplayTable;
    private javax.swing.JButton OfficeBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        
           ArrayList<Airliner> al = travelAgency.getAirlinerList();
        DefaultTableModel dtm = (DefaultTableModel)DisplayTable.getModel();
        dtm.setRowCount(0);
        for (Airliner vs : al){
            Object row[] = new Object[10];
            row[0]= vs;
            row[1]= vs.getName();
            dtm.addRow(row);
        }
    }

    private flightWorkArea newflightWorkArea(JPanel userProcessContainer, Airliner vs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
