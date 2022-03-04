package outil;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class afterlogin {
     static void fenafterlogin(JPanel pa ,JFrame fa) {
    	 
    	 pa.removeAll();
 		 pa.validate();
 		 pa.repaint();
 		 
 // ................................. images.............................................................
 		 
 		ImageIcon R = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\Return.png");
 		ImageIcon M = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\antibiotic.png");
 		ImageIcon C = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\calculator.png");
 		ImageIcon RU = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\rules.png");
 		  
 		 
 	JButton b =new JButton();
		b.setBounds(5, 5, 60, 40);
		b.setBorderPainted(false);
		b.setIcon(R);
		b.setBackground(new Color(194, 158, 255));
		b.setToolTipText("cliquez pour retournez a la page principale");
        b.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			int a = JOptionPane.showConfirmDialog(null, "Voulez-Vous vraiment Sortir!","Confirm",JOptionPane.YES_NO_OPTION);
    			if (a==0)
    			{
    				home.main(null);
    			}
    			
    			
    		}
    		
    	});
		
		JLabel MED =new JLabel("1-Medicaments");
		MED.setBounds(50, 300, 180, 50);
		MED.setForeground(Color.BLACK);
		MED.setFont(new Font("Times New Roman" ,3,25));
   		
   		JLabel BIL =new JLabel("2-Deduire la dose");
   		BIL.setBounds(250, 300, 180, 50);
   		BIL.setForeground(Color.BLACK);
   		BIL.setFont(new Font("Times New Roman" ,3,23));	
   		
   		JLabel REG =new JLabel("3-à Propos de l'app");
   		REG.setBounds(470, 300, 250, 50);
   		REG.setForeground(Color.BLACK);
   		REG.setFont(new Font("Times New Roman" ,3,21));
		
		
		JButton b1 =new JButton();
		b1.setBounds(70, 150, 120, 120);
		b1.setBorderPainted(false);
		b1.setIcon(M);
		b1.setBackground(Color.black);
		b1.setToolTipText("1-Medicaments");
		
		
		JButton b2 =new JButton();
		b2.setBounds(280, 150, 120, 120);
		b2.setBorderPainted(false);
		b2.setIcon(C);
		b2.setBackground(Color.black);
		b2.setToolTipText("2-Deduire la dose");
		
		JButton b3 =new JButton();
		b3.setBounds(490, 150, 120, 120);
		b3.setBorderPainted(false);
		b3.setIcon(RU);
		b3.setBackground(Color.black);
		b3.setToolTipText("3-About Our Application");
		
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ACTIONS BUTTONS&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			Medicament.fenmedicament(pa, fa);
			 pa.setBackground(Color.white);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calculeladose.fencalcule(pa, fa);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		      apropos.fenregles(pa, fa);
		      pa.setBackground(new Color(185, 212, 183));
			}
		});
		
		
		pa.add(MED);
		pa.add(BIL);
		pa.add(REG);
		pa.add(b);
		pa.add(b3);
		pa.add(b2);
		pa.add(b1);
		
		fa.setContentPane(pa);
		
		
		
     }
}




