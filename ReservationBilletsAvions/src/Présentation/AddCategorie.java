package Pr�sentation;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

public class AddCategorie extends JFrame {

	  int idRetourne;
	  String remiseRetourne;
	  String nomRetourne;
	  
	    public AddCategorie() {
	    	 setTitle("Ajouter Categorie");
	        initComponents();
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jLabel7 = new javax.swing.JLabel();
	        jTextField5 = new javax.swing.JTextField();
	        jTextField7 = new javax.swing.JTextField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(102, 102, 102));

	        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

	        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
	        jLabel1.setText("Ajouter Cat�gorie");

	        jLabel3.setText("Nom cat�gorie :");

	        jLabel5.setText("Remise cat�gorie :");

	        jButton1.setBackground(new java.awt.Color(255, 255, 153));
	        jButton1.setText("AJOUTER");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	///
	                //jButton1ActionPerformed(evt);
	            	 nomRetourne= jTextField7.getText();
	     	        remiseRetourne =jTextField5.getText(); 
	     	        if(nomRetourne.equals("")||remiseRetourne.equals("")){
	     	        	// jLabel7.setText("Attention un ou plusieurs champs sont vides!");
	     	        JOptionPane.showMessageDialog(null, "Attention un ou plusieurs champs sont vides !!","Champs Vide",JOptionPane.OK_OPTION);
	     	            }
	     	        else{
	     	        try {
	     	        	  double d = new Double(remiseRetourne);
						M�tier.Admin.ajouterCategorie(nomRetourne, d);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	     	        //jLabel7.setText("La mise � jour est bien effectu�.");
	     	        JOptionPane.showMessageDialog(null, "Bien Ajouter ","Nouvelle Cat�gorie",JOptionPane.INFORMATION_MESSAGE);
	     	        
	     	        }
	            }
	        });

	        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
	        jLabel7.setForeground(new java.awt.Color(0, 51, 51));

	        jTextField5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField5ActionPerformed(evt);
	            }
	        });

	        jTextField7.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField7ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1Layout.setHorizontalGroup(
	        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
	        			.addContainerGap())
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addGap(0, 62, Short.MAX_VALUE)
	        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
	        			.addGap(36))
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addGap(37)
	        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
	        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
	        					.addGap(13)))
	        			.addContainerGap(102, Short.MAX_VALUE))
	        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
	        			.addGap(105)
	        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(118, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addGap(23)
	        			.addComponent(jLabel1)
	        			.addGap(54)
	        			.addComponent(jLabel3)
	        			.addGap(18)
	        			.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	        			.addGap(18)
	        			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	        			.addGap(18)
	        			.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	        			.addGap(48)
	        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
	        			.addGap(18)
	        			.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(39, Short.MAX_VALUE))
	        );
	        jPanel1.setLayout(jPanel1Layout);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
	       /////
	    }                                        

	    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

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
	            java.util.logging.Logger.getLogger(AddCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(AddCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(AddCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(AddCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new AddCategorie().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JTextField jTextField5;
	    private javax.swing.JTextField jTextField7;
	    // End of variables declaration   
}
