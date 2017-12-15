package gui.frame;

import java.awt.ComponentOrientation;
import model.TableManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu extends javax.swing.JFrame {

	private String number;
	public static boolean enable = true;

	public Menu(String tablenum) throws FileNotFoundException {
		initComponents();
		enable = true;
		Total.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Total.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Total.setAlignmentX(JTextArea.RIGHT_ALIGNMENT);
		this.number = tablenum;
		display.setEnabled(false);
		Total.setEnabled(false);
		newDisplay();
		jScrollPane2.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
		jScrollPane20.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPane20.getVerticalScrollBar().setUnitIncrement(16);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		jPanel3 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		display = new javax.swing.JTextArea();
		jPanel4 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		Total = new javax.swing.JTextField();
		jPanel6 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		jPanel1 = new javax.swing.JPanel();
		RicePlate = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		RiceBowl = new javax.swing.JButton();
		Porridge = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		PorkGreenCurry = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		BeefCurry = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		FishBallSoup = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		FriedFishCurry = new javax.swing.JButton();
		jLabel13 = new javax.swing.JLabel();
		CrabCurry = new javax.swing.JButton();
		jLabel14 = new javax.swing.JLabel();
		PanFriedSeafood = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		ChickenCashewNuts = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		StirFriedVegetables = new javax.swing.JButton();
		jLabel17 = new javax.swing.JLabel();
		FriedPork = new javax.swing.JButton();
		jLabel18 = new javax.swing.JLabel();
		Omelet = new javax.swing.JButton();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		CenturyEgg = new javax.swing.JButton();
		GrilledSeafood = new javax.swing.JButton();
		jLabel21 = new javax.swing.JLabel();
		GrilledChicken = new javax.swing.JButton();
		jLabel22 = new javax.swing.JLabel();
		ChickenWings = new javax.swing.JButton();
		jLabel23 = new javax.swing.JLabel();
		ChickenLegs = new javax.swing.JButton();
		jLabel24 = new javax.swing.JLabel();
		BeefSteak = new javax.swing.JButton();
		jLabel25 = new javax.swing.JLabel();
		DriedBeef = new javax.swing.JButton();
		jLabel26 = new javax.swing.JLabel();
		jScrollPane20 = new javax.swing.JScrollPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel27 = new javax.swing.JLabel();
		Water = new javax.swing.JButton();
		jLabel28 = new javax.swing.JLabel();
		Mineral = new javax.swing.JButton();
		Coke = new javax.swing.JButton();
		jLabel29 = new javax.swing.JLabel();
		IcedCoffee = new javax.swing.JButton();
		jLabel30 = new javax.swing.JLabel();
		IcedCocoa = new javax.swing.JButton();
		jLabel31 = new javax.swing.JLabel();
		IcedLemonTea = new javax.swing.JButton();
		jLabel32 = new javax.swing.JLabel();
		Latte = new javax.swing.JButton();
		jLabel33 = new javax.swing.JLabel();
		ThaiTea = new javax.swing.JButton();
		jLabel34 = new javax.swing.JLabel();
		jButton35 = new javax.swing.JButton();
		jLabel35 = new javax.swing.JLabel();
		jButton36 = new javax.swing.JButton();
		jLabel36 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("RESTAURANT POS (made by Kit&Bank)");

		jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		display.setColumns(20);
		display.setFont(new java.awt.Font("Monospaced", 0, 28)); // NOI18N
		display.setRows(5);
		jScrollPane1.setViewportView(display);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
		jLabel3.setText("Total:");

		Total.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		Total.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TotalActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(16, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Total,
								javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(7, 7, 7)));

		jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jButton2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
		jButton2.setText("Order");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
		jButton3.setText("Reset");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
		jButton5.setText("Back");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jButton1.setText("Receipt");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel6Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 95,
														Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel1.setPreferredSize(new java.awt.Dimension(893, 1680));

		RicePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/ricedisk.jpg"))); // NOI18N
		RicePlate.setMaximumSize(new java.awt.Dimension(185, 115));
		RicePlate.setMinimumSize(new java.awt.Dimension(185, 115));
		RicePlate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RicePlateActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel7.setText("Rice / Plate");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel8.setText("Rice / Bowl");

		RiceBowl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/ricetoh.jpg"))); // NOI18N
		RiceBowl.setMaximumSize(new java.awt.Dimension(185, 115));
		RiceBowl.setMinimumSize(new java.awt.Dimension(185, 115));
		RiceBowl.setPreferredSize(new java.awt.Dimension(185, 115));
		RiceBowl.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RiceBowlActionPerformed(evt);
			}
		});

		Porridge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/porridge.jpg"))); // NOI18N
		Porridge.setMaximumSize(new java.awt.Dimension(185, 115));
		Porridge.setMinimumSize(new java.awt.Dimension(185, 115));
		Porridge.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PorridgeActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel9.setText("Porridge");

		PorkGreenCurry.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/Thai-Green-Curry-Chicken.jpg"))); // NOI18N
		PorkGreenCurry.setMaximumSize(new java.awt.Dimension(185, 115));
		PorkGreenCurry.setMinimumSize(new java.awt.Dimension(185, 115));
		PorkGreenCurry.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PorkGreenCurryActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel10.setText("Pork green curry");

		BeefCurry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/beefcurry.jpg"))); // NOI18N
		BeefCurry.setMaximumSize(new java.awt.Dimension(185, 115));
		BeefCurry.setMinimumSize(new java.awt.Dimension(185, 115));
		BeefCurry.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BeefCurryActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel11.setText("Beef curry");

		FishBallSoup
				.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/fish-ball-s-0311-2.jpg"))); // NOI18N
		FishBallSoup.setMaximumSize(new java.awt.Dimension(185, 115));
		FishBallSoup.setMinimumSize(new java.awt.Dimension(185, 115));
		FishBallSoup.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				FishBallSoupActionPerformed(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel12.setText("Fish ball soup");

		FriedFishCurry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/fried fish.JPG"))); // NOI18N
		FriedFishCurry.setMaximumSize(new java.awt.Dimension(185, 115));
		FriedFishCurry.setMinimumSize(new java.awt.Dimension(185, 115));
		FriedFishCurry.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				FriedFishCurryActionPerformed(evt);
			}
		});

		jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel13.setText("Fried fish curry");

		CrabCurry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/crab meat curry.jpg"))); // NOI18N
		CrabCurry.setMaximumSize(new java.awt.Dimension(185, 115));
		CrabCurry.setMinimumSize(new java.awt.Dimension(185, 115));
		CrabCurry.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CrabCurryActionPerformed(evt);
			}
		});

		jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel14.setText("Crab meat yellow curry");

		PanFriedSeafood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/Panfried.jpg"))); // NOI18N
		PanFriedSeafood.setMaximumSize(new java.awt.Dimension(185, 115));
		PanFriedSeafood.setMinimumSize(new java.awt.Dimension(185, 115));
		PanFriedSeafood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PanFriedSeafoodActionPerformed(evt);
			}
		});

		jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel15.setText("Pan fried seafood");

		ChickenCashewNuts.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/gui/Menu_list/Chicken-cashew-nuts-featured-photo.jpg"))); // NOI18N
		ChickenCashewNuts.setMaximumSize(new java.awt.Dimension(185, 115));
		ChickenCashewNuts.setMinimumSize(new java.awt.Dimension(185, 115));
		ChickenCashewNuts.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ChickenCashewNutsActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel16.setText("Chicken with cashew nuts");

		StirFriedVegetables.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/Spicy-Garlic-Vegetable-StirFry.jpg"))); // NOI18N
		StirFriedVegetables.setMaximumSize(new java.awt.Dimension(185, 115));
		StirFriedVegetables.setMinimumSize(new java.awt.Dimension(185, 115));
		StirFriedVegetables.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				StirFriedVegetablesActionPerformed(evt);
			}
		});

		jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel17.setText("Stir-fried vegetables");

		FriedPork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/fried pork.jpg"))); // NOI18N
		FriedPork.setMaximumSize(new java.awt.Dimension(185, 115));
		FriedPork.setMinimumSize(new java.awt.Dimension(185, 115));
		FriedPork.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				FriedPorkActionPerformed(evt);
			}
		});

		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel18.setText("Fried pork with garlic");

		Omelet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/omelet.jpg"))); // NOI18N
		Omelet.setMaximumSize(new java.awt.Dimension(185, 115));
		Omelet.setMinimumSize(new java.awt.Dimension(185, 115));
		Omelet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OmeletActionPerformed(evt);
			}
		});

		jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel19.setText("Omelet");

		jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel20.setText("Century egg");

		CenturyEgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/century_egg_07.jpg"))); // NOI18N
		CenturyEgg.setMaximumSize(new java.awt.Dimension(185, 115));
		CenturyEgg.setMinimumSize(new java.awt.Dimension(185, 115));
		CenturyEgg.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CenturyEggActionPerformed(evt);
			}
		});

		GrilledSeafood.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/gui/Menu_list/GrilledSeafoodSalad18-thumb-596x350-350832.jpg"))); // NOI18N
		GrilledSeafood.setMaximumSize(new java.awt.Dimension(185, 115));
		GrilledSeafood.setMinimumSize(new java.awt.Dimension(185, 115));
		GrilledSeafood.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GrilledSeafoodActionPerformed(evt);
			}
		});

		jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel21.setText("Grilled seafood salad");

		GrilledChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/chicken.jpg"))); // NOI18N
		GrilledChicken.setMaximumSize(new java.awt.Dimension(185, 115));
		GrilledChicken.setMinimumSize(new java.awt.Dimension(185, 115));
		GrilledChicken.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GrilledChickenActionPerformed(evt);
			}
		});

		jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel22.setText("Grilled chicken");

		ChickenWings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/chicken wings.jpg"))); // NOI18N
		ChickenWings.setMaximumSize(new java.awt.Dimension(185, 115));
		ChickenWings.setMinimumSize(new java.awt.Dimension(185, 115));
		ChickenWings.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ChickenWingsActionPerformed(evt);
			}
		});

		jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel23.setText("Chicken wings");

		ChickenLegs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/chicken legs.jpeg"))); // NOI18N
		ChickenLegs.setMaximumSize(new java.awt.Dimension(185, 115));
		ChickenLegs.setMinimumSize(new java.awt.Dimension(185, 115));
		ChickenLegs.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ChickenLegsActionPerformed(evt);
			}
		});

		jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel24.setText("Chicken legs");

		BeefSteak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/beef steak.jpg"))); // NOI18N
		BeefSteak.setMaximumSize(new java.awt.Dimension(185, 115));
		BeefSteak.setMinimumSize(new java.awt.Dimension(185, 115));
		BeefSteak.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BeefSteakActionPerformed(evt);
			}
		});

		jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel25.setText("Beef steak");

		DriedBeef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/dried beef.jpg"))); // NOI18N
		DriedBeef.setMaximumSize(new java.awt.Dimension(185, 115));
		DriedBeef.setMinimumSize(new java.awt.Dimension(185, 115));
		DriedBeef.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DriedBeefActionPerformed(evt);
			}
		});

		jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel26.setText("Dried beef");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(RicePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(56, 56, 56).addComponent(RiceBowl, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jLabel7)
						.addGap(173, 173, 173).addComponent(jLabel8))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(Porridge, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(57, 57, 57).addComponent(PorkGreenCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(99, 99, 99).addComponent(jLabel9)
						.addGap(160, 160, 160).addComponent(jLabel10))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44)
						.addComponent(BeefCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(61, 61, 61).addComponent(FishBallSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jLabel11)
						.addGap(171, 171, 171).addComponent(jLabel12))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44)
						.addComponent(FriedFishCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(70, 70, 70).addComponent(CrabCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jLabel13)
						.addGap(106, 106, 106).addComponent(jLabel14))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44)
						.addComponent(PanFriedSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(64, 64, 64).addComponent(ChickenCashewNuts, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(77, 77, 77).addComponent(jLabel15)
						.addGap(89, 89, 89).addComponent(jLabel16))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(StirFriedVegetables, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72).addComponent(FriedPork, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(59, 59, 59).addComponent(jLabel17)
						.addGap(109, 109, 109).addComponent(jLabel18))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(Omelet, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72).addComponent(CenturyEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(109, 109, 109).addComponent(jLabel19)
						.addGap(179, 179, 179).addComponent(jLabel20))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(GrilledSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72).addComponent(GrilledChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(59, 59, 59).addComponent(jLabel21)
						.addGap(123, 123, 123).addComponent(jLabel22))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(ChickenWings, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72).addComponent(ChickenLegs, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(89, 89, 89).addComponent(jLabel23)
						.addGap(139, 139, 139).addComponent(jLabel24))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49)
						.addComponent(BeefSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(62, 62, 62).addComponent(DriedBeef, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(89, 89, 89).addComponent(jLabel25)
						.addGap(179, 179, 179).addComponent(jLabel26)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(47, 47, 47).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(RicePlate,
								javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(RiceBowl, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(15, 15, 15)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel7).addGroup(
										jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(jLabel8)))
						.addGap(20, 20, 20)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Porridge, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(PorkGreenCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(10, 10, 10)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel9).addComponent(jLabel10))
						.addGap(37, 37, 37)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(BeefCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(FishBallSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(3, 3, 3)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(jLabel11))
								.addComponent(jLabel12))
						.addGap(26, 26, 26)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(FriedFishCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(CrabCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(7, 7, 7)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel13)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(3, 3, 3).addComponent(jLabel14)))
						.addGap(17, 17, 17)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(PanFriedSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ChickenCashewNuts, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(3, 3, 3)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(jLabel15))
								.addComponent(jLabel16))
						.addGap(19, 19, 19)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(StirFriedVegetables, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(FriedPork, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(7, 7, 7)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel17).addComponent(jLabel18))
						.addGap(11, 11, 11)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Omelet, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(
										CenturyEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(9, 9, 9)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(jLabel19))
								.addComponent(jLabel20))
						.addGap(23, 23, 23)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(GrilledSeafood, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(GrilledChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel21).addComponent(jLabel22))
						.addGap(27, 27, 27)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(ChickenWings, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ChickenLegs, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(jLabel23))
								.addComponent(jLabel24))
						.addGap(23, 23, 23)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(BeefSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(DriedBeef, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(5, 5, 5)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel25).addComponent(jLabel26))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jScrollPane2.setViewportView(jPanel1);

		jTabbedPane1.addTab("Food", jScrollPane2);

		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel2.setPreferredSize(new java.awt.Dimension(501, 1050));
		jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel27.setText("Water / bottle");
		jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

		Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/water.jpg"))); // NOI18N
		Water.setPreferredSize(new java.awt.Dimension(120, 160));
		Water.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				WaterActionPerformed(evt);
			}
		});
		jPanel2.add(Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

		jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel28.setText("Mineral / bottle");
		jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

		Mineral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/mineral.jpg"))); // NOI18N
		Mineral.setPreferredSize(new java.awt.Dimension(120, 160));
		Mineral.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MineralActionPerformed(evt);
			}
		});
		jPanel2.add(Mineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

		Coke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/coke.png"))); // NOI18N
		Coke.setPreferredSize(new java.awt.Dimension(120, 160));
		Coke.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CokeActionPerformed(evt);
			}
		});
		jPanel2.add(Coke, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

		jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel29.setText("Coke");
		jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

		IcedCoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/coffe.jpg"))); // NOI18N
		IcedCoffee.setPreferredSize(new java.awt.Dimension(120, 160));
		IcedCoffee.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				IcedCoffeeActionPerformed(evt);
			}
		});
		jPanel2.add(IcedCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

		jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel30.setText("Iced coffee");
		jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

		IcedCocoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/cocoa.jpg"))); // NOI18N
		IcedCocoa.setPreferredSize(new java.awt.Dimension(120, 160));
		IcedCocoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				IcedCocoaActionPerformed(evt);
			}
		});
		jPanel2.add(IcedCocoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

		jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel31.setText("Iced cocoa");
		jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, -1, -1));

		IcedLemonTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/iced_tea_3.jpg"))); // NOI18N
		IcedLemonTea.setPreferredSize(new java.awt.Dimension(120, 160));
		IcedLemonTea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				IcedLemonTeaActionPerformed(evt);
			}
		});
		jPanel2.add(IcedLemonTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

		jLabel32.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel32.setText("Iced lemon tea");
		jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, -1, -1));

		Latte.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/ice-green-tea-latte-5-683x1024.jpg"))); // NOI18N
		Latte.setPreferredSize(new java.awt.Dimension(120, 160));
		Latte.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LatteActionPerformed(evt);
			}
		});
		jPanel2.add(Latte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

		jLabel33.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel33.setText("Iced green tea latte");
		jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 820, -1, -1));

		ThaiTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/thaitea.jpg"))); // NOI18N
		ThaiTea.setPreferredSize(new java.awt.Dimension(120, 160));
		ThaiTea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ThaiTeaActionPerformed(evt);
			}
		});
		jPanel2.add(ThaiTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, -1, -1));

		jLabel34.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel34.setText("Thai iced tea");
		jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 820, -1, -1));

		jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/beer-1.jpg"))); // NOI18N
		jButton35.setPreferredSize(new java.awt.Dimension(120, 160));
		jButton35.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton35ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 850, -1, -1));

		jLabel35.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel35.setText("Leo bottle");
		jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1020, -1, -1));

		jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Menu_list/sapporo.jpg"))); // NOI18N
		jButton36.setPreferredSize(new java.awt.Dimension(120, 160));
		jButton36.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton36ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 850, -1, -1));

		jLabel36.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
		jLabel36.setText("Sapporo bottle");
		jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1020, -1, -1));

		jScrollPane20.setViewportView(jPanel2);

		jTabbedPane1.addTab("Drinks", jScrollPane20);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(10, 10, 10)
				.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(10, 10, 10)
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(16, 16, 16).addComponent(jPanel6,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jPanel4,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(jPanel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jTabbedPane1.getAccessibleContext().setAccessibleName("tab1");

		setBounds(400, 165, 1229, 796);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		TableManager.resetMap();
		try {
			newDisplay();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
		}
		enable = true;
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		TableManager.resetMap();
		new Table().setVisible(true);
		this.dispose();
	}// GEN-LAST:event_jButton5ActionPerformed

	private void GrilledSeafoodActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_GrilledSeafoodActionPerformed
		TableManager.addDish("Grilled Chicken");
		preDisplay();

	}// GEN-LAST:event_GrilledSeafoodActionPerformed

	private void CenturyEggActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CenturyEggActionPerformed
		TableManager.addDish("Century Egg");
		preDisplay();
	}// GEN-LAST:event_CenturyEggActionPerformed

	private void OmeletActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OmeletActionPerformed
		TableManager.addDish("Omelet");
		preDisplay();
	}// GEN-LAST:event_OmeletActionPerformed

	private void FriedPorkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FriedPorkActionPerformed
		TableManager.addDish("Fried Pork with Garlic");
		preDisplay();
	}// GEN-LAST:event_FriedPorkActionPerformed

	private void StirFriedVegetablesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_StirFriedVegetablesActionPerformed
		TableManager.addDish("Stir Fried Vegetables");
		preDisplay();
	}// GEN-LAST:event_StirFriedVegetablesActionPerformed

	private void ChickenCashewNutsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ChickenCashewNutsActionPerformed
		TableManager.addDish("Chicken with Cashew Nuts");
		preDisplay();
	}// GEN-LAST:event_ChickenCashewNutsActionPerformed

	private void PanFriedSeafoodActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PanFriedSeafoodActionPerformed
		TableManager.addDish("Pan Fried Seafood");
		preDisplay();
	}// GEN-LAST:event_PanFriedSeafoodActionPerformed

	private void CrabCurryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CrabCurryActionPerformed
		TableManager.addDish("Crab Meat Yellow Curry");
		preDisplay();
	}// GEN-LAST:event_CrabCurryActionPerformed

	private void FriedFishCurryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FriedFishCurryActionPerformed
		TableManager.addDish("Fried Fish Curry");
		preDisplay();
	}// GEN-LAST:event_FriedFishCurryActionPerformed

	private void FishBallSoupActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FishBallSoupActionPerformed
		TableManager.addDish("Fish Ball Soup");
		preDisplay();
	}// GEN-LAST:event_FishBallSoupActionPerformed

	private void BeefCurryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BeefCurryActionPerformed
		TableManager.addDish("Beef Curry");
		preDisplay();
	}// GEN-LAST:event_BeefCurryActionPerformed

	private void PorkGreenCurryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PorkGreenCurryActionPerformed
		TableManager.addDish("Pork Green Curry");
		preDisplay();
	}// GEN-LAST:event_PorkGreenCurryActionPerformed

	private void PorridgeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PorridgeActionPerformed
		TableManager.addDish("Porridge");
		preDisplay();
	}// GEN-LAST:event_PorridgeActionPerformed

	private void RiceBowlActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RiceBowlActionPerformed
		TableManager.addDish("Rice (bowl)");
		preDisplay();
	}// GEN-LAST:event_RiceBowlActionPerformed

	private void RicePlateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RicePlateActionPerformed
		TableManager.addDish("Rice (plate)");
		preDisplay();
	}// GEN-LAST:event_RicePlateActionPerformed

	private void GrilledChickenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_GrilledChickenActionPerformed
		TableManager.addDish("Grilled Chicken");
		preDisplay();
	}// GEN-LAST:event_GrilledChickenActionPerformed

	private void ChickenWingsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ChickenWingsActionPerformed
		TableManager.addDish("Chicken Wings");
		preDisplay();
	}// GEN-LAST:event_ChickenWingsActionPerformed

	private void ChickenLegsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ChickenLegsActionPerformed
		TableManager.addDish("Chicken Legs");
		preDisplay();
	}// GEN-LAST:event_ChickenLegsActionPerformed

	private void BeefSteakActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BeefSteakActionPerformed
		TableManager.addDish("Beef Steak");
		preDisplay();
	}// GEN-LAST:event_BeefSteakActionPerformed

	private void DriedBeefActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DriedBeefActionPerformed
		TableManager.addDish("Dried Beef");
		preDisplay();
	}// GEN-LAST:event_DriedBeefActionPerformed

	private void WaterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_WaterActionPerformed
		TableManager.addDish("Water");
		preDisplay();
	}// GEN-LAST:event_WaterActionPerformed

	private void MineralActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MineralActionPerformed
		TableManager.addDish("Mineral Water");
		preDisplay();
	}// GEN-LAST:event_MineralActionPerformed

	private void CokeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CokeActionPerformed
		TableManager.addDish("Coke");
		preDisplay();
	}// GEN-LAST:event_CokeActionPerformed

	private void IcedCoffeeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IcedCoffeeActionPerformed
		TableManager.addDish("Iced Coffee");
		preDisplay();
	}// GEN-LAST:event_IcedCoffeeActionPerformed

	private void IcedCocoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IcedCocoaActionPerformed
		TableManager.addDish("Iced Cocoa");
		preDisplay();
	}// GEN-LAST:event_IcedCocoaActionPerformed

	private void IcedLemonTeaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IcedLemonTeaActionPerformed
		TableManager.addDish("Iced Lemon Tea");
		preDisplay();
	}// GEN-LAST:event_IcedLemonTeaActionPerformed

	private void LatteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LatteActionPerformed
		TableManager.addDish("Iced Green Tea");
		preDisplay();
	}// GEN-LAST:event_LatteActionPerformed

	private void ThaiTeaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ThaiTeaActionPerformed
		TableManager.addDish("Thai Iced Tea");
		preDisplay();
	}// GEN-LAST:event_ThaiTeaActionPerformed

	private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton35ActionPerformed
		TableManager.addDish("Leo (bottle)");
		preDisplay();
	}// GEN-LAST:event_jButton35ActionPerformed

	private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton36ActionPerformed
		TableManager.addDish("Sapporo (bottle)");
		preDisplay();
	}// GEN-LAST:event_jButton36ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		try {
			TableManager.ordertoText();
			TableManager.ordertoText(number);
		} catch (IOException ex) {
			Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
		}
		try {
			newDisplay();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_jButton1ActionPerformed
		if (enable){
		new Check_bills(number, this).setVisible(true);
		
		enable = false;
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void TotalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TotalActionPerformed

	}// GEN-LAST:event_TotalActionPerformed

	/**
	 * display the sorted quantity from text
	 */
	public void newDisplay() throws FileNotFoundException {
		String str = "";
		TableManager.getTable(number);
		Map<String, Integer> tableqty = TableManager.gettableQty();
		for (Map.Entry<String, Integer> newqty : tableqty.entrySet()) {
			String key = newqty.getKey();
			Integer value = newqty.getValue();
			str += String.format("%-25s %10d\n", key, value);
		}
		display.setText(str);
		TableManager.resetMap();
		String price = "" + TableManager.returnTotal(number);
		Total.setText(price);
		TableManager.resetMap();
	}

	/**
	 * display the current quantity
	 * 
	 * @throws FileNotFoundException
	 */
	public void preDisplay() {
		String str = "";
		for (Map.Entry<String, Integer> dish : TableManager.gettableQty().entrySet()) {
			String key = dish.getKey();
			Integer value = dish.getValue();
			str += String.format("%-25s %10d\n", key, value);
		}
		display.setText(str);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BeefCurry;
	private javax.swing.JButton BeefSteak;
	private javax.swing.JButton CenturyEgg;
	private javax.swing.JButton ChickenCashewNuts;
	private javax.swing.JButton ChickenLegs;
	private javax.swing.JButton ChickenWings;
	private javax.swing.JButton Coke;
	private javax.swing.JButton CrabCurry;
	private javax.swing.JButton DriedBeef;
	private javax.swing.JButton FishBallSoup;
	private javax.swing.JButton FriedFishCurry;
	private javax.swing.JButton FriedPork;
	private javax.swing.JButton GrilledChicken;
	private javax.swing.JButton GrilledSeafood;
	private javax.swing.JButton IcedCocoa;
	private javax.swing.JButton IcedCoffee;
	private javax.swing.JButton IcedLemonTea;
	private javax.swing.JButton Latte;
	private javax.swing.JButton Mineral;
	private javax.swing.JButton Omelet;
	private javax.swing.JButton PanFriedSeafood;
	private javax.swing.JButton PorkGreenCurry;
	private javax.swing.JButton Porridge;
	private javax.swing.JButton RiceBowl;
	private javax.swing.JButton RicePlate;
	private javax.swing.JButton StirFriedVegetables;
	private javax.swing.JButton ThaiTea;
	private javax.swing.JTextField Total;
	private javax.swing.JButton Water;
	private javax.swing.JTextArea display;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton35;
	private javax.swing.JButton jButton36;
	private javax.swing.JButton jButton5;
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
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane20;
	private javax.swing.JTabbedPane jTabbedPane1;
	// End of variables declaration//GEN-END:variables
}
