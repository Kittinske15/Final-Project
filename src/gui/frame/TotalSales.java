/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.frame;

import java.io.FileNotFoundException;
import java.util.Map;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

import model.TableManager;

public class TotalSales extends javax.swing.JFrame {

	public TotalSales() {
		initComponents();
                jScrollPane1.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
		jTextArea1.setEnabled(false);
		String str = "";
		try {
			TableManager.getTable();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Map<String, Integer> tableqty = TableManager.gettableQty();
		for (Map.Entry<String, Integer> newqty : tableqty.entrySet()) {
			String key = newqty.getKey();
			Integer value = newqty.getValue();
			str += String.format("%-25s %10d\n", key, value);
		}
		jTextArea1.setText(str);
		TableManager.resetMap();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESTAURANT POS (made by Kit&Bank)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 520));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total Sales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 517, 479, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Background/stucco_texture2035.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        setBounds(700, 180, 478, 627);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
