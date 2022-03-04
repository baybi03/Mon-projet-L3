package outil;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class apropos {

	 static void fenregles(JPanel PanR ,JFrame FenR) {
	       
    	 PanR.removeAll();
   		 PanR.validate();
   		 PanR.repaint();
   		 
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& LES IMAGES &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		 
   		ImageIcon R = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\Return.png");
   		ImageIcon P1 = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\pharmacist.png");
   	
   		           
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIN IMAGES   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   		
   		
   	    JLabel pic1 =new JLabel();
   	    pic1.setBounds(280, 30, 120, 150);
   	    pic1.setIcon(P1);
   	    
   	    

   		
			
		
   	    
   	  JLabel text =new JLabel(" à ProPos : ");
 	    text.setBounds(30, 140, 120, 100);
 	    text.setFont(new Font("Times New Roman" ,3,20));
 	    text.setForeground(Color.black);
 	    
 		  JLabel right =new JLabel(" Copyright © 2021 All Rights Reserved ");
 	 	    right.setBounds(480, 470, 200, 20);
 	 	    right.setFont(new Font("Times New Roman" ,3,12));
 	 	    right.setForeground(Color.black);
 	    
 	   JLabel text1 =new JLabel(" Notre projet,notre concept et notre outils. ");
	    text1.setBounds(30, 180, 300, 100);
	    text1.setFont(new Font("Times New Roman" ,3,17));
	    text1.setForeground(Color.black);
   				
	    JTextArea area = new JTextArea();
	    area.setBounds(30, 260, 650, 200);
	    area.setRequestFocusEnabled(false);
	    area.setText(" * Notre application doit rendre le travail plus facile aux médecin et obtenez des résultats"
	    		+ "\n plus précis,aussi l’avantage de diminuer le temps d’attente des patients.\n"
	    		+"\n * Dans cette projet ou spécifiquement on a utilise le Langage java avec l'Editeur\n Eclipse IDE , et MYSQL pour la Gestion de BD .\n"
	    		+ "\n * Généralement L’application doit satisfaire le user médecin . ");
	    area.setFont(new Font("Times New Roman" ,3,17));
	   area.setForeground(Color.black);
	   area.setBackground(new Color(185, 212, 183));
   		
   		
   		
   		
   		
   		JButton b =new JButton();
		b.setBounds(5, 5, 60, 40);
		b.setBorderPainted(false);
		b.setIcon(R);
		b.setBackground(new Color(185, 212, 183));
		b.setToolTipText("cliquez pour retournez a la page principale");
		b.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				afterlogin.fenafterlogin(PanR, FenR);
				PanR.setBackground(new Color(194, 158, 255));
			}
		}); 
   		 
    PanR.add(text);
    PanR.add(text1);
	PanR.add(pic1);	
	PanR.add(area);
	PanR.add(b);
   	PanR.add(right);
   	FenR.setContentPane(PanR);
   		 
   		 
   		 
   		 
   		 
   		 
   		 
   		 
}}
