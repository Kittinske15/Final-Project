package gui.frame;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import model.TableManager;

public class Table extends javax.swing.JFrame {

	public Table() {
		initComponents();
		jLabel1.setOpaque(true);
		jLabel1.setBackground(java.awt.Color.yellow);
		jLabel7.setOpaque(true);
		jLabel7.setBackground(java.awt.Color.yellow);
		jLabel8.setOpaque(true);
		jLabel8.setBackground(java.awt.Color.yellow);
		jLabel2.setOpaque(true);
		jLabel2.setBackground(java.awt.Color.yellow);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		Table7 = new javax.swing.JButton();
		Table17 = new javax.swing.JButton();
		Table4 = new javax.swing.JButton();
		Table3 = new javax.swing.JButton();
		Table2 = new javax.swing.JButton();
		Table8 = new javax.swing.JButton();
		Table6 = new javax.swing.JButton();
		Table9 = new javax.swing.JButton();
		Table12 = new javax.swing.JButton();
		Table10 = new javax.swing.JButton();
		Table5 = new javax.swing.JButton();
		Table13 = new javax.swing.JButton();
		Table14 = new javax.swing.JButton();
		Table16 = new javax.swing.JButton();
		Table11 = new javax.swing.JButton();
		Table15 = new javax.swing.JButton();
		Table18 = new javax.swing.JButton();
		Table1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		Table19 = new javax.swing.JButton();
		Table20 = new javax.swing.JButton();
		jButton22 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jButton29 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("RESTAURANT POS (made by Kit&Bank)");
		setBackground(new java.awt.Color(102, 204, 255));
		setResizable(false);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		Table7.setBackground(new java.awt.Color(0, 153, 255));
		Table7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table7.setText("Table7");
		Table7.setToolTipText("");
		Table7.setName("7"); // NOI18N
		Table7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table7ActionPerformed(evt);
			}
		});
		getContentPane().add(Table7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 110, 90));

		Table17.setBackground(new java.awt.Color(153, 102, 0));
		Table17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table17.setText("Table17");
		Table17.setName("17"); // NOI18N
		Table17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table17ActionPerformed(evt);
			}
		});
		getContentPane().add(Table17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 90, 80));

		Table4.setBackground(new java.awt.Color(255, 153, 153));
		Table4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table4.setText("Table4");
		Table4.setName("4"); // NOI18N
		Table4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table4ActionPerformed(evt);
			}
		});
		getContentPane().add(Table4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 90));

		Table3.setBackground(new java.awt.Color(255, 153, 153));
		Table3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table3.setText("Table3");
		Table3.setName("3"); // NOI18N
		Table3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table3ActionPerformed(evt);
			}
		});
		getContentPane().add(Table3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, 90));

		Table2.setBackground(new java.awt.Color(255, 153, 153));
		Table2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table2.setText("Table2");
		Table2.setName("2"); // NOI18N
		Table2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table2ActionPerformed(evt);
			}
		});
		getContentPane().add(Table2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 70));

		Table8.setBackground(new java.awt.Color(0, 153, 255));
		Table8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table8.setText("Table8");
		Table8.setName("8"); // NOI18N
		Table8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table8ActionPerformed(evt);
			}
		});
		getContentPane().add(Table8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 80, 70));

		Table6.setBackground(new java.awt.Color(255, 153, 153));
		Table6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table6.setText("Table6");
		Table6.setName("6"); // NOI18N
		Table6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table6ActionPerformed(evt);
			}
		});
		getContentPane().add(Table6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 110, 90));

		Table9.setBackground(new java.awt.Color(0, 153, 255));
		Table9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table9.setText("Table9");
		Table9.setName("9"); // NOI18N
		Table9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table9ActionPerformed(evt);
			}
		});
		getContentPane().add(Table9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 128, 99));

		Table12.setBackground(new java.awt.Color(0, 153, 255));
		Table12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table12.setText("Table12");
		Table12.setName("12"); // NOI18N
		Table12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table12ActionPerformed(evt);
			}
		});
		getContentPane().add(Table12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 128, 99));

		Table10.setBackground(new java.awt.Color(0, 153, 255));
		Table10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table10.setText("Table10");
		Table10.setName("10"); // NOI18N
		Table10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table10ActionPerformed(evt);
			}
		});
		getContentPane().add(Table10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 128, 99));

		Table5.setBackground(new java.awt.Color(255, 153, 153));
		Table5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table5.setText("Table5");
		Table5.setName("5"); // NOI18N
		Table5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table5ActionPerformed(evt);
			}
		});
		getContentPane().add(Table5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 379, 110, 90));

		Table13.setBackground(new java.awt.Color(153, 102, 0));
		Table13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table13.setText("Table13");
		Table13.setAutoscrolls(true);
		Table13.setName("13"); // NOI18N
		Table13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table13ActionPerformed(evt);
			}
		});
		getContentPane().add(Table13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 128, 99));

		Table14.setBackground(new java.awt.Color(153, 102, 0));
		Table14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table14.setText("Table14");
		Table14.setName("14"); // NOI18N
		Table14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table14ActionPerformed(evt);
			}
		});
		getContentPane().add(Table14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, 90, 70));

		Table16.setBackground(new java.awt.Color(153, 102, 0));
		Table16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table16.setText("Table16");
		Table16.setName("16"); // NOI18N
		Table16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table16ActionPerformed(evt);
			}
		});
		getContentPane().add(Table16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 90, 80));

		Table11.setBackground(new java.awt.Color(0, 153, 255));
		Table11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table11.setText("Table11");
		Table11.setName("11"); // NOI18N
		Table11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table11ActionPerformed(evt);
			}
		});
		getContentPane().add(Table11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 128, 99));

		Table15.setBackground(new java.awt.Color(153, 102, 0));
		Table15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table15.setText("Table15");
		Table15.setName("15"); // NOI18N
		Table15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table15ActionPerformed(evt);
			}
		});
		getContentPane().add(Table15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 90, 80));

		Table18.setBackground(new java.awt.Color(153, 102, 0));
		Table18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table18.setText("Table18");
		Table18.setName("18"); // NOI18N
		Table18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table18ActionPerformed(evt);
			}
		});
		getContentPane().add(Table18, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 210, 90, 80));

		Table1.setBackground(new java.awt.Color(255, 153, 153));
		Table1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table1.setText("Table1");
		Table1.setName("1"); // NOI18N
		Table1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table1ActionPerformed(evt);
			}
		});
		getContentPane().add(Table1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 139, 110, 90));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("BAR");
		jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel1AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 200, 70, 400));

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("BAR");
		jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel2AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 430));

		Table19.setBackground(new java.awt.Color(255, 51, 51));
		Table19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table19.setText("Table19");
		Table19.setName("19"); // NOI18N
		Table19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table19ActionPerformed(evt);
			}
		});
		getContentPane().add(Table19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 280, 80));

		Table20.setBackground(new java.awt.Color(255, 51, 51));
		Table20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		Table20.setText("Table20");
		Table20.setName("20"); // NOI18N
		Table20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Table20ActionPerformed(evt);
			}
		});
		getContentPane().add(Table20, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 110, 120));

		jButton22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton22.setText("Total sales");
		jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 170, 30));

		jButton23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton23.setText("End day");
		jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 170, 30));

		jButton29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
		jButton29.setText("Logout");
		jButton29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton29ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 170, 30));

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("BAR");
		jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel7AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 270, 90));

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("BAR");
		jLabel8.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel8AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 280, 100));

		setBounds(400, 175, 1153, 744);
	}// </editor-fold>//GEN-END:initComponents

	private void Table18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table18ActionPerformed
		Menu table18 = null;
		try {
			table18 = new Menu("18");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table18.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table18ActionPerformed

	private void Table17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table17ActionPerformed
		Menu table17 = null;
		try {
			table17 = new Menu("17");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table17.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table17ActionPerformed

	private void Table16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table16ActionPerformed
		Menu table16 = null;
		try {
			table16 = new Menu("16");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table16.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table16ActionPerformed

	private void Table15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table15ActionPerformed
		Menu table15 = null;
		try {
			table15 = new Menu("15");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table15.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table15ActionPerformed

	private void Table14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table14ActionPerformed
		Menu table14 = null;
		try {
			table14 = new Menu("14");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table14.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table14ActionPerformed

	private void Table13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table13ActionPerformed
		Menu table13 = null;
		try {
			table13 = new Menu("13");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table13.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table13ActionPerformed

	private void Table12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table12ActionPerformed
		Menu table12 = null;
		try {
			table12 = new Menu("12");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table12.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table12ActionPerformed

	private void Table11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table11ActionPerformed
		Menu table11 = null;
		try {
			table11 = new Menu("11");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table11.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table11ActionPerformed

	private void Table10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table10ActionPerformed
		Menu table10 = null;
		try {
			table10 = new Menu("10");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table10.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table10ActionPerformed

	private void Table9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table9ActionPerformed
		Menu table9 = null;
		try {
			table9 = new Menu("9");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table9.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table9ActionPerformed

	private void Table8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table8ActionPerformed
		Menu table8 = null;
		try {
			table8 = new Menu("8");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table8.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table8ActionPerformed

	private void Table7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table7ActionPerformed
		Menu table7 = null;
		try {
			table7 = new Menu("7");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table7.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table7ActionPerformed

	private void Table6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table6ActionPerformed
		Menu table6 = null;
		try {
			table6 = new Menu("6");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table6.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table6ActionPerformed

	private void Table5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table5ActionPerformed
		Menu table5 = null;
		try {
			table5 = new Menu("5");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table5.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table5ActionPerformed

	private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jLabel1AncestorAdded

	}// GEN-LAST:event_jLabel1AncestorAdded

	private void Table20ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table20ActionPerformed
		Menu table20 = null;
		try {
			table20 = new Menu("20");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table20.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table20ActionPerformed

	private void Table19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table19ActionPerformed
		Menu table19 = null;
		try {
			table19 = new Menu("19");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table19.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table19ActionPerformed

	private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jLabel2AncestorAdded
		// TODO add your handling code here:
	}// GEN-LAST:event_jLabel2AncestorAdded

	private void Table4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table4ActionPerformed
		Menu table4 = null;
		try {
			table4 = new Menu("4");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table4.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table4ActionPerformed

	private void Table3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table3ActionPerformed
		Menu table3 = null;
		try {
			table3 = new Menu("3");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table3.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table3ActionPerformed

	private void Table2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table2ActionPerformed
		Menu table2 = null;
		try {
			table2 = new Menu("2");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table2.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_Table2ActionPerformed

	private void Table1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Table1ActionPerformed
		Menu table1 = null;
		try {
			table1 = new Menu("1");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		table1.setVisible(true);
		this.dispose();

	}// GEN-LAST:event_Table1ActionPerformed

	private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton29ActionPerformed
		try {
			new Login().setVisible(true);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
		}
		this.dispose();
	}// GEN-LAST:event_jButton29ActionPerformed

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton22ActionPerformed
		new TotalSales().setVisible(true);
	}// GEN-LAST:event_jButton22ActionPerformed

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton23ActionPerformed
		int show = JOptionPane.showConfirmDialog(null, "This action will clear every orders, are you sure to continue?  (this can't be undone)", "WARNING!", JOptionPane.OK_OPTION);
		JFrame error = new JFrame("CHECK!!!");
		error.setSize(401, 401);
		if (show == JOptionPane.OK_OPTION) {
			for (int i = 0; i < 20; i++) {
				String tablenumber = "";
				try {
					TableManager.resetText(tablenumber + i);
				} catch (IOException ex) {
					Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			try {
				TableManager.resetText();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				new Login().setVisible(true);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
			this.dispose();

		} else {
			error.dispose();

		}

	}// GEN-LAST:event_jButton23ActionPerformed

	private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jLabel7AncestorAdded
	}// GEN-LAST:event_jLabel7AncestorAdded

	private void jLabel8AncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jLabel8AncestorAdded

	}// GEN-LAST:event_jLabel8AncestorAdded

	public void openTable() {

	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Table1;
	private javax.swing.JButton Table10;
	private javax.swing.JButton Table11;
	private javax.swing.JButton Table12;
	private javax.swing.JButton Table13;
	private javax.swing.JButton Table14;
	private javax.swing.JButton Table15;
	private javax.swing.JButton Table16;
	private javax.swing.JButton Table17;
	private javax.swing.JButton Table18;
	private javax.swing.JButton Table19;
	private javax.swing.JButton Table2;
	private javax.swing.JButton Table20;
	private javax.swing.JButton Table3;
	private javax.swing.JButton Table4;
	private javax.swing.JButton Table5;
	private javax.swing.JButton Table6;
	private javax.swing.JButton Table7;
	private javax.swing.JButton Table8;
	private javax.swing.JButton Table9;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton29;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	// End of variables declaration//GEN-END:variables
}
