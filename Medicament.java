package outil;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import javax.swing.table.TableColumnModel;

import net.proteanit.sql.DbUtils;



public class Medicament {
	static String nomB1;
	static String nomB2;
	static String nomB3;
	static JTable tabmed = new JTable();
	static JComboBox medcombo = new JComboBox();
	static JComboBox combonom2 =new JComboBox();
	
	
	
	static void fenmedicament(JPanel PanM ,JFrame FenM) {
    	   
		
    	 PanM.removeAll();
   		 PanM.validate();
   		 PanM.repaint();
   		 
   		 update(); 
   		  nomB1=null;
   		  nomB2=null;
   		  nomB3=null;
   		 
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& LES IMAGES &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		 
   		ImageIcon R = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\Return.png");
   		ImageIcon ADD = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\add.png");
   		ImageIcon EDIT = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\edit.png");
   		ImageIcon A = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\ajout.png");
   		ImageIcon U = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\refresh.png");
   		
   		 
   		           
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIN IMAGES   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  		
   		
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& AJOUTER DANS LE BUTTON AJOUTER MEDICAMENT &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		
   		JPanel pnaj =new JPanel();
   		pnaj.setBounds(40,50 ,450,380);
   		pnaj.setLayout(null);
   		pnaj.setBackground(Color.black);
		
		JTextField nom =new JTextField();
	    nom.setBorder(new LineBorder(Color.black, 1));
		nom.setBounds(240, 100, 120, 20);
		nom.setBackground(Color.white);
		
		JTextField labo =new JTextField();
	    labo.setBorder(new LineBorder(Color.black, 1));
		labo.setBounds(240, 240, 100, 20);
		labo.setBackground(Color.white);
		
		JLabel labeltit =new JLabel("- Ajouter votre médicament :");
		labeltit.setBounds(60, 30, 300,40);
		labeltit.setForeground(Color.white);
		labeltit.setFont(new Font("Times New Roman" ,3,25));
		
		JLabel labelnom =new JLabel("-Nom Médicament :");
		labelnom.setBounds(65, 100, 190,20);
		labelnom.setForeground(Color.white);
		
		JLabel labelbilan =new JLabel("-Bilan demande:");
		labelbilan.setBounds(65, 140, 190,20);
		labelbilan.setForeground(Color.white);
		
		JLabel nombilan =new JLabel("<html>- Clairance rénale :<br>- La Bilirubine :<br>- la Tgo/Tgp :</html>");
		nombilan.setBounds(190, 120, 110,100);
		nombilan.setForeground(Color.white);
		
		JCheckBox chek1 = new JCheckBox();
		chek1.setBounds(320, 150, 50, 10);
		chek1.setForeground(Color.CYAN);
		chek1.setBackground(Color.black);
		
		
		JCheckBox chek2 = new JCheckBox();
		chek2.setBounds(320, 168, 50, 10);
		chek2.setForeground(Color.CYAN);
		chek2.setBackground(Color.black);
		
		JCheckBox chek3 = new JCheckBox();
		chek3.setBounds(320, 185, 50, 10);
		chek3.setForeground(Color.CYAN);
		chek3.setBackground(Color.black);
		
		JLabel labellabo =new JLabel("-N° labo :");
		labellabo.setBounds(110, 240, 190,20);
		labellabo.setForeground(Color.white);
		
		JButton ajout =new JButton("Ajouter");
		ajout.setBounds(170, 320, 80, 30);
	    ajout.setBackground(Color.white);
		ajout.setFont(new Font("Georgia",5,10));
   		
   		pnaj.add(nombilan);
   		pnaj.add(labelbilan);
   		pnaj.add(nom);
   		pnaj.add(labo);
   		pnaj.add(chek1);
   		pnaj.add(chek2);
   		pnaj.add(chek3);
   		pnaj.add(labeltit);
   		pnaj.add(labelnom);
   		pnaj.add(ajout);
   		pnaj.add(labellabo);
   	
   		
 // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& 		
   		
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& AJOUTER DANS LE BUTTON SUPPRIMER MEDICAMENT  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		
   		JPanel pnsp =new JPanel();
   		pnsp.setBounds(20,70 ,450,300);
   		pnsp.setLayout(null);
   		pnsp.setBackground(Color.black);
   		
		
		medcombo.setBorder(new LineBorder(Color.black, 1));
		medcombo.setBounds(220, 100, 140, 20);
		medcombo.setBackground(Color.white);
		
		JLabel labeltit1 =new JLabel("- Supprimer Un médicament :");
		labeltit1.setBounds(40, 30, 350,40);
		labeltit1.setForeground(Color.white);
		labeltit1.setFont(new Font("Times New Roman" ,3,25));
		
		JLabel labelnom1 =new JLabel("-Nom Médicament :");
		labelnom1.setBounds(45, 100, 190,20);
		labelnom1.setForeground(Color.white);
		
	    JButton sup =new JButton("supprimer");
		sup.setBounds(170, 220, 100, 30);
	    sup.setBackground(Color.white);
		sup.setFont(new Font("Georgia",5,10));
		
   		pnsp.add(medcombo);
   		pnsp.add(labeltit1);
   		pnsp.add(labelnom1);
   		pnsp.add(sup);
   		
   	 // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& 
   		
  //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& AJOUTER DANS LE BUTTON AJOUTER REGLES &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		JPanel pnajr =new JPanel();
   		pnajr.setBounds(40,70 ,460,350);
   		pnajr.setLayout(null);
   		pnajr.setBackground(Color.black);
   		
   		
   		
	    combonom2.setBorder(new LineBorder(Color.black, 1));
	    combonom2.setBounds(240, 100, 130, 22);
		combonom2.setBackground(Color.white);
		
		
   		String[] petStrings = { "Clairance rénale", "Bilirubine ", "Tgo/Tgp "};
   		
   		JComboBox combonom3 = new JComboBox(petStrings);
		combonom3.setBorder(new LineBorder(Color.black, 1));
		combonom3.setBounds(240, 140, 120, 22);
	    combonom3.setBackground(Color.white);
	    
	    JTextField max =new JTextField();
	    max.setBorder(new LineBorder(Color.black, 1));
		max.setBounds(240, 180, 100, 20);
		max.setBackground(Color.white);
		
		JTextField min =new JTextField();
	    min.setBorder(new LineBorder(Color.black, 1));
		min.setBounds(240, 220, 100, 20);
		min.setBackground(Color.white);
		
		JTextField resultat =new JTextField();
	    resultat.setBorder(new LineBorder(Color.black, 1));
		resultat.setBounds(220, 260, 180, 25);
		resultat.setBackground(Color.white);
		
		
		JLabel labeltit2 =new JLabel("- Ajouter une régle :");
		labeltit2.setBounds(100, 30, 300,40);
		labeltit2.setForeground(Color.white);
		labeltit2.setFont(new Font("Times New Roman" ,3,25));
		
		JLabel labelnom2 =new JLabel("- Nom Médicament :");
		labelnom2.setBounds(65, 100, 190,20);
		labelnom2.setForeground(Color.white);
		
		JLabel labelbilan2 =new JLabel("- Bilan demande:");
		labelbilan2.setBounds(65, 140, 190,20);
		labelbilan2.setForeground(Color.white);
		
		JLabel labelmax =new JLabel("- Valeur max :");
		labelmax.setBounds(65, 180, 190,20);
		labelmax.setForeground(Color.white);
		
		JLabel labelmin =new JLabel("- Valeur min :");
		labelmin.setBounds(65, 220, 190,20);
		labelmin.setForeground(Color.white);
		
		JLabel labelresultat =new JLabel("- Résultat :");
		labelresultat.setBounds(65, 260, 180,20);
		labelresultat.setForeground(Color.white);
		
		JButton ajouterregle = new JButton("Ajouter");
		ajouterregle.setBounds(180, 305, 80, 20);
		ajouterregle.setBackground(Color.white);
		ajouterregle.setFont(new Font("Georgia",5,10));
			
		
		pnajr.add(combonom2);
		pnajr.add(combonom3);
		pnajr.add(labeltit2);
		pnajr.add(max);
		pnajr.add(min);
		pnajr.add(ajouterregle);
		pnajr.add(resultat);
		pnajr.add(labelmax);
		pnajr.add(labelmin);
		pnajr.add(labelresultat);
		pnajr.add(labelnom2);
		pnajr.add(labelbilan2);
		
   		
  //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& BUTTON RETOUR  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&   		
   		
   		JButton RETOUR =new JButton();
   		RETOUR.setBounds(5, 5, 60, 40);
   		RETOUR.setBorderPainted(false);
   		RETOUR.setIcon(R);
   		RETOUR.setBackground(Color.white);
   		RETOUR.setToolTipText("cliquez pour retournez a la page principale");
   		
   		 
	      
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& PRINCIPAL &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	     
		
		  JScrollPane scrol =new JScrollPane();
	   	    scrol.createHorizontalScrollBar();
	   		scrol.setBounds(20, 100, 500, 320);
	   	    tabmed.setBounds(20, 20, 460, 280);
	   	    tabmed.setRowHeight(25);
	   		tabmed.setForeground(Color.white);
	   		tabmed.setBackground(Color.black);
	   		scrol.setViewportView(tabmed);
	   	    
         JLabel titremed =new JLabel(" Liste Des médicament :");
			titremed.setBounds(120, 40, 350,40);
			titremed.setForeground(Color.black);
			titremed.setFont(new Font("Times New Roman" ,3,25));
			

	     JLabel refreshing =new JLabel(" Refresh ");
	   	 refreshing.setBounds(260, 460, 70,40);
	   	 refreshing.setForeground(Color.black);
	   	 refreshing.setFont(new Font("Times New Roman" ,3,15));
   	     	
   		 
		JButton ajom =new JButton();
		ajom.setBounds(550, 50, 85, 85);
		ajom.setBorderPainted(false);
		ajom.setIcon(ADD);
		ajom.setBackground(Color.black);
		
		
		JButton supm =new JButton();
		supm.setBounds(550, 200,85, 85);
		supm.setBorderPainted(false);
		supm.setIcon(EDIT);
		supm.setBackground(Color.black);
		
		JButton updateb =new JButton();
		updateb.setBounds(250, 440,70, 30);
		updateb.setBorderPainted(false);
		updateb.setIcon(U);
		updateb.setBackground(Color.black);
        

		JButton ajoR =new JButton();
		ajoR.setBounds(550, 350,85, 85);
		ajoR.setBorderPainted(false);
		ajoR.setIcon(A);
		ajoR.setBackground(Color.black);
		
		
		
		JLabel L1 =new JLabel("<html>1-Ajouter Médicament</html>");
   		L1.setBounds(550, 140, 100, 50);
   		L1.setForeground(Color.BLACK);
   		L1.setFont(new Font("Times New Roman" ,3,17));
   		
   		JLabel L2 =new JLabel("<html>2-Supprimer Médicament</html>");
   		L2.setBounds(550, 290, 100, 50);
   		L2.setForeground(Color.BLACK);
   		L2.setFont(new Font("Times New Roman" ,3,17));
   		
   		JLabel L3 =new JLabel("<html>3-Ajouter Des Régles</html>");
   		L3.setBounds(555, 440, 100, 50);
   		L3.setForeground(Color.BLACK);
   		L3.setFont(new Font("Times New Roman" ,3,17));
   		
   	  
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  	
   		
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ACTIONS BUTTONS   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		
  //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& AJOUTE MED &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		
ajom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PanM.removeAll();
				PanM.validate();
				PanM.repaint();
				PanM.add(L3);
				PanM.add(ajoR);
				PanM.add(RETOUR);
				PanM.add(refreshing);
				PanM.add(updateb);
				PanM.add(ajom);
				PanM.add(supm);
				PanM.add(L1);
				PanM.add(L2);
				PanM.add(pnaj);
				
				FenM.setContentPane(PanM);
			}
		});

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& SUP MED &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

supm.addActionListener(new ActionListener() {
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		PanM.removeAll();
		PanM.validate();
		PanM.repaint();
		PanM.add(L3);
		PanM.add(updateb);
		PanM.add(ajoR);
		PanM.add(RETOUR);
		PanM.add(refreshing);
		PanM.add(ajom);
		PanM.add(supm);
		PanM.add(L1);
		PanM.add(L2);
		PanM.add(pnsp);
		
		medcombo.removeAllItems();
		Medicament.suprimermed();
		
		FenM.setContentPane(PanM);
		
		
		
		
		
	}
});
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& REFRESH &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

updateb.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	  
	  
	    PanM.removeAll();
		PanM.validate();
		PanM.repaint();
		PanM.add(L3);
		PanM.add(ajoR);
		PanM.add(scrol);
		PanM.add(RETOUR);
		PanM.add(refreshing);
		PanM.add(updateb);
		PanM.add(titremed);
		PanM.add(ajom);
		PanM.add(supm);
		PanM.add(L1);
		PanM.add(L2);
		
		update();
		FenM.setContentPane(PanM);

	}
});
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& AJOUTE REGLES &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
ajoR.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PanM.removeAll();
		PanM.validate();
		PanM.repaint();
		PanM.add(RETOUR);
		PanM.add(ajom);
		PanM.add(supm);
		PanM.add(L1);
		PanM.add(L2);
		PanM.add(L3);
		PanM.add(updateb);
		PanM.add(refreshing);
		PanM.add(ajoR);
		PanM.add(pnajr);
		
		combonom2.removeAllItems();
		Medicament.ajouterregle();
		
		FenM.setContentPane(PanM);
		
		
		
		
	}
});


//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
ajouterregle.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Connection cnx =null;
		 cnx = connexionmysql.connectbd();
		String sql =  " insert into regles (nom_medi ,type_bilan , min ,max , resultat) VALUES ( ?, ?, ?, ?, ?)";
		
		
        try {
        	
        	PreparedStatement preparedStatement;
			preparedStatement = cnx.prepareStatement(sql);
			preparedStatement.setString(1,combonom2.getSelectedItem().toString());
			preparedStatement.setString(2,combonom3.getSelectedItem().toString());
			preparedStatement.setString(3,min.getText().toString());
			preparedStatement.setString(4,max.getText().toString());
			preparedStatement.setString(5,resultat.getText().toString());
			
			preparedStatement.execute();
			JOptionPane.showMessageDialog(null, " Régle Ajoutée !");
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
        
        combonom2.setSelectedItem(null);
        min.setText(null);
        max.setText(null);
        resultat.setText(null);
	}
});
		
ajout.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		  Connection cnx =null;
			 
			 
			cnx = connexionmysql.connectbd();
			
			
		    String sql = "insert into liste_medicament (nom_med ,labo_de_fab ,bilan_1_CR ,bilan_2_Bilo , bilan_3_TGOTGP) VALUES (? , ?, ?, ?, ? ) ";
		    
			try {
				PreparedStatement preparedStatement;
				preparedStatement = cnx.prepareStatement(sql);
				preparedStatement.setString(1,nom.getText().toString());
				preparedStatement.setString(2,labo.getText().toString());
				
				 if(nom.getText().equals("")||(labo.getText().equals("")))
					 
				  {
					
					  JOptionPane.showMessageDialog(null, "Remplissez Les Champs Vides" );
				  }else
				  {
				if(chek1.isSelected()) {
					
					preparedStatement.setString(3,nomB1);
					}
				else {preparedStatement.setString(3, null);}
					
				
					if(chek2.isSelected()) {
					    preparedStatement.setString(4,nomB2);
					   
					    
					}
					else {preparedStatement.setString(4, null);}
					
					
				   if(chek3.isSelected()){
					 
			preparedStatement.setString(5,nomB3);
			  
			   }
				   else {preparedStatement.setString(5, null);}
				   
				
				   preparedStatement.execute();
				   JOptionPane.showMessageDialog(null, "Médicament Ajoutée !");
				   
				
				  }} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			labo.setText(null);
			nom.setText(null);
			chek1.setSelected(false);
			chek2.setSelected(false);
			chek3.setSelected(false);
		
			
	}});
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& action RETOUR &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

RETOUR.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		afterlogin.fenafterlogin(PanM, FenM);
		PanM.setBackground(new Color(194, 158, 255));
		
		
	}
}); 

sup.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PreparedStatement preparedStatement = null;
		  Connection cnx =null;
			cnx = connexionmysql.connectbd();
		
		String sql = " delete from liste_medicament where nom_med = ?  ";
		try {
			preparedStatement=cnx.prepareStatement(sql);
			preparedStatement.setString(1,medcombo.getSelectedItem().toString() );
			
			preparedStatement.execute();
			JOptionPane.showMessageDialog(null, "Medicament Supprimer !");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		int index =medcombo.getSelectedIndex();
		medcombo.removeItemAt(index);
		medcombo.setSelectedItem(null);
		
		
	}
});


chek1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		nomB1 = "+";
	}
});

chek2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		nomB2 = "+";
	}
});
chek3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		nomB3 = "+";
	}
});


	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

    PanM.add(L3);
    PanM.add(ajoR);
   	PanM.add(ajom);	
   	PanM.add(titremed);
   	PanM.add(refreshing);
	PanM.add(supm);
	PanM.add(L1);
	PanM.add(L2);
   	PanM.add(RETOUR);
   	PanM.add(updateb);
    PanM.add(scrol);
   	FenM.setContentPane(PanM);
   	
   

	}
   
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Methode AJOUTER REGLE &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
	
 public static void ajouterregle()  {	
   	PreparedStatement preparedStatement = null;
    ResultSet resultSet;
    Connection cnx =null;
	cnx = connexionmysql.connectbd();
	
	String sql = " select * from liste_medicament ";
	try {
		preparedStatement=cnx.prepareStatement(sql);
		
		resultSet = preparedStatement.executeQuery();
		
	while (resultSet.next())
	
	{
		
		String name = resultSet.getString("nom_med").toString();
		 combonom2.addItem(name);
		
    }
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
 }
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		 
   	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  METHODE SUPPRIMER MEDICAMENT   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	 
   
   		 
 public static void suprimermed() {  		 
   		 
	 PreparedStatement preparedStatement = null;
	    ResultSet resultSet;
	    Connection cnx =null;
		cnx = connexionmysql.connectbd();
		
		String sql = " select * from liste_medicament ";
		try {
			preparedStatement=cnx.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
		while(resultSet.next())
		{
			String name = resultSet.getString("nom_med").toString();
			medcombo.addItem(name);
			
			
		}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   		 
}
 
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
 
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Methode UPDATE &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
public static void update() {
	
	PreparedStatement preparedStatement = null;
    ResultSet resultSet =null;
    Connection cnx =null;
	cnx = connexionmysql.connectbd();
	
	try {
		String sql = " Select nom_med , labo_de_fab , bilan_1_CR ,bilan_2_Bilo ,bilan_3_TGOTGP  from liste_medicament";
		preparedStatement = cnx.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();
	
		
		tabmed.setModel(DbUtils.resultSetToTableModel(resultSet));
		
				
		TableColumnModel columnModel = tabmed.getColumnModel();
   		columnModel.getColumn(0).setPreferredWidth(80);
   		columnModel.getColumn(1).setPreferredWidth(20);
   		columnModel.getColumn(2).setPreferredWidth(30);
   		columnModel.getColumn(3).setPreferredWidth(35);
   		columnModel.getColumn(4).setPreferredWidth(35);
   			
	} 
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
}

}

