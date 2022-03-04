package outil;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class calculeladose {
	
	static JComboBox combonommedcal =new JComboBox();

	 static void fencalcule(JPanel PanB ,JFrame FenB) {
	       
    	 PanB.removeAll();
   		 PanB.validate();
   		 PanB.repaint();
   		 
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& LES IMAGES &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		 
   		ImageIcon R = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\Return.png");
   		 
   		           
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIN IMAGES   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  		 
   		JButton b =new JButton();
		b.setBounds(5, 5, 60, 40);
		b.setBorderPainted(false);
		b.setIcon(R);
		b.setBackground(Color.white);
		b.setToolTipText("cliquez pour retournez a la page principale");
		
		
		
		JButton bcalcule =new JButton("Deduire la dose");
		bcalcule.setBounds(300, 390, 150, 25);
		bcalcule.setBorderPainted(false);
		bcalcule.setBackground(Color.white);
		
		
		 
		combonommedcal.setBorder(new LineBorder(Color.black, 1));
	    combonommedcal.setBounds(350, 150, 150, 22);
		combonommedcal.setBackground(Color.white);	
		
		 JTextField textclairance =new JTextField();
		 textclairance.setBorder(new LineBorder(Color.black, 1));
		 textclairance.setBounds(350, 230, 100, 20);
		 textclairance.setBackground(Color.white);
			
		JTextField textbilirubine =new JTextField();
		textbilirubine.setBorder(new LineBorder(Color.black, 1));
		textbilirubine.setBounds(350, 270, 100, 20);
		textbilirubine.setBackground(Color.white);
			
		JTextField texttgotgp =new JTextField();
		texttgotgp.setBorder(new LineBorder(Color.black, 1));
		texttgotgp.setBounds(350, 310, 100, 20);
		texttgotgp.setBackground(Color.white);
		

		JTextField result =new JTextField();
		result.setBorder(new LineBorder(Color.black, 1));
		result.setBounds(250, 435, 250, 35);
		result.setBackground(Color.white);
		
		JLabel labelresult =new JLabel("- Resultat :");
		labelresult.setBounds(160, 440, 100,20);
		labelresult.setForeground(Color.white);
		
		
		JLabel resultat =new JLabel(" Entrer les valeurs de test de votre patient : ");
		resultat.setBounds(175, 70, 380, 50);
		resultat.setForeground(Color.white);
		resultat.setFont(new Font("Times New Roman" ,3,21));
		
			
			JLabel labelmed =new JLabel("- Nom Médicament :");
			labelmed.setBounds(200, 150, 150,20);
			labelmed.setForeground(Color.white);
			
			JLabel labelclai =new JLabel("- Clairance :");
			labelclai.setBounds(220, 230, 120,20);
			labelclai.setForeground(Color.white);
			
			JLabel labelbili =new JLabel("- Bilirubine :");
			labelbili.setBounds(220, 270, 120,20);
			labelbili.setForeground(Color.white);
			
			
			
			JLabel labeltgo =new JLabel("- Tgo/Tgp :");
			labeltgo.setBounds(220, 310, 120,20);
			labeltgo.setForeground(Color.white);
			
			JSeparator separe = new JSeparator(SwingConstants.VERTICAL);
			separe.setBounds(550, 140, 20, 220);
			separe.setBackground(Color.white);
		
			JSeparator separe1 = new JSeparator(SwingConstants.VERTICAL);
			separe1.setBounds(150, 140, 20, 220);
			separe1.setBackground(Color.white);
		
		
		
		
		
		
		
		
		
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ACTION BUTTONS &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
		
		
		
		
		
		
		b.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				afterlogin.fenafterlogin(PanB, FenB);
				PanB.setBackground(new Color(194, 158, 255));
				
			}
		}); 
		
		
			bcalcule.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				 PreparedStatement preparedStatement = null;
				 ResultSet resultSet;
				 Connection cnx =null;
			     cnx = connexionmysql.connectbd();	
				
			     String sql = " select * from regles ";	
			     
			     try {
			    	 
			    	 
			    	 
					preparedStatement=cnx.prepareStatement(sql);
					resultSet = preparedStatement.executeQuery();
					if(textbilirubine.getText().equals("")||(textclairance.getText().equals(""))||(texttgotgp.getText().equals("")))
						 
					  {
						
						  JOptionPane.showMessageDialog(null, "Remplissez Les Champs Vides" );
				
					  }	else {
					while(resultSet.next())
					{
					int ch =resultSet.getInt("max");
					int ch1 =resultSet.getInt("min");
					int ch4= Integer.parseInt(textclairance.getText());
					int ch5= Integer.parseInt(textbilirubine.getText());
					int ch6= Integer.parseInt(texttgotgp.getText());
					
					if(combonommedcal.getSelectedItem().equals(resultSet.getString("nom_medi"))){
						

				    if(resultSet.getString("type_bilan").equals("Clairance rénale")) {
					if((ch1<=ch4 ) && (ch>=ch4))
					{
						result.setText(resultSet.getString("resultat"));
						
						
						
					}
						
							
					}
				     if(resultSet.getString("type_bilan").equals("Bilirubine")) {
				    	
				    	if((ch1<=ch5 ) && (ch>=ch5))
						{
				    		
				    		result.setText(resultSet.getString("resultat"));
						}
				    	
				    }
				      if(resultSet.getString("type_bilan").equals("Tgo/Tgp")) {
				    	
				    	if((ch1<=ch6 ) && (ch>=ch6))
						{
				    	
				    		result.setText(resultSet.getString("resultat"));
						}
				    	
				    }
				    
				      
				    
				    }
					 
					 
					}
				
					
					
					}        

		textbilirubine.setText(null);
		textclairance.setText(null);
		texttgotgp.setText(null);
		
			     		
			     		
					
					
					
	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			     
			     
			     
			     
			     
			}
		});   		 
		
   		 
   		 
  //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& 		 
   		 
   	PanB.add(b);
   
   	PanB.add(labeltgo);
   	PanB.add(labelresult);
   	PanB.add(labelbili);
   	PanB.add(labelclai);
   	PanB.add(labelmed);
   	PanB.add(texttgotgp);
   	PanB.add(textbilirubine);
   	PanB.add(textclairance);
   	PanB.add(separe);
   	PanB.add(separe1);
   	PanB.add(bcalcule);
   	PanB.add(result);
   	PanB.add(resultat);
   	
   	PanB.add(combonommedcal);
   	
   	PanB.setBackground(new Color(51, 77, 77));
   	FenB.setContentPane(PanB);
   	
   	
   	combonommedcal.removeAllItems();
   	ajoutmedcal();
	 }   		 
   		 
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  		 
   		 
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& METHODE AJOUT TO COMBOBOX CALCUE &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&   
   		 

	 
	 public static void ajoutmedcal()  {	
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
		 combonommedcal.addItem(name);
		
    }
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
 } 		 
		 }
