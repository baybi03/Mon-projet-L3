package outil;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import com.sun.javafx.css.StyleCacheEntry.Key;

import java.sql.Connection;



public class home {
	
	 static JLabel clocklabel = new JLabel();

	public static void main(String[] args) {
		
		
		//...........................................text..............................................
		
		
//.......................................................SQL..............................................................		 
	
		
		
		
		
		//try {
		///	Connection conn = DriverManager.getConnection(url, username, password);
			
			
			
			//String sql = "INSERT INTO liste_medicament (code_medicament,nom_medicament,laboratoire_de_fabrication) VALUES (? , ? , ?)";
			//PreparedStatement statement = conect.prepareStatement(sql);
			///statement.setString(1, "N2");
			//statement.setString(2, "ACIDE ZOLIDRONIQUE");
			//statement.setString(3, "LABO n1");
			
			//int rows = statement.executeUpdate();
			//if (rows > 0 ) {
				//System.out.println("connected succesfully");
		//	}
		//	statement.close();
		//	conn.close();
			//System.out.println("succesfully connected");
			
		//} catch (SQLException e1) {
	//		System.out.println("Oops , error");
	//		e1.printStackTrace();
	//	}
	
//...........................................................SQL..............................................................		
		
		String text = "<html> hey   doctor !   </html>";
		
		 
		//.........................................end text.................................................
		
	//......................... images...............................................................
		
   ImageIcon med = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide à l'adaptation posologique de medicaments\\images\\med1.png");
   ImageIcon doc = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\doctor1.png");
   ImageIcon log = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\login.png");
   ImageIcon useri = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\user.png");
   ImageIcon passi = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\lock.png");
   ImageIcon login = new ImageIcon("C:\\Users\\akram\\eclipse-workspace\\outil d'aide adpm\\images\\enter1.png");
   
   
 //.........................  end images...............................................................
   
   
   
 // .............................................. separator....................................  
   
   JSeparator r =new JSeparator();
   r.setBackground(Color.white);
   r.setBounds(120, 230, 150, 50);
   
   JSeparator r2 =new JSeparator();
   r2.setBackground(Color.white);
   r2.setBounds(120, 300, 150, 50);
   
   JSeparator r3 =new JSeparator(SwingConstants.VERTICAL);
   r3.setBackground(Color.white);
   r3.setBounds(210, 350, 150, 50);
   
   
 //............................... end separator..............................................................  
   
   
JFrame home = new JFrame();
home.setTitle("Outil d'aide à l'adaptation posologique de medicaments");
home.setLayout(null);
home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
home.setUndecorated(true);
home.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);


JLabel ecrilabel = new JLabel(text);
ecrilabel.setBounds(90, 240, 180, 150);
ecrilabel.setForeground(Color.BLACK);
ecrilabel.setFont(new Font("Tw Cen MT" ,3,25));


clocklabel.setBounds(35, 400, 280, 100);
clocklabel.setForeground(Color.BLACK);
clocklabel.setFont(new Font("Tw Cen MT" ,3,25));


JTextArea f =new JTextArea(" Welcome To Your Space . ");
f.setBounds(50, 350, 200, 20);
f.setBackground(Color.LIGHT_GRAY);
f.setRequestFocusEnabled(false);
f.setIgnoreRepaint(false);
f.setFont(new Font("Tw Cen MT", 3,18));
f.setForeground(Color.BLACK);

JTextArea f1 =new JTextArea(" Copyright © 2021 All Rights Reserved ");
f1.setBounds(180, 480, 250, 20);
f1.setRequestFocusEnabled(false);
f1.setBackground(Color.black);
f1.setFont(new Font("Tw Cen MT", 3,12));
f1.setForeground(Color.cyan);

JLabel doclabel =new JLabel();
doclabel.setBounds(20, 10, 300, 300);
doclabel.setIcon(doc);

JLabel userlabel =new JLabel();
userlabel.setBounds(70, 200, 40, 40);
userlabel.setIcon(useri);

JLabel passlabel =new JLabel();
passlabel.setBounds(70, 270, 40, 40);
passlabel.setIcon(passi);

JLabel loglabel =new JLabel();
loglabel.setBounds(130, 20, 150, 150);
loglabel.setIcon(log);



JLabel mtplabel =new JLabel("Forgot your password ? ");
mtplabel.setBounds(60, 360, 150, 40);
mtplabel.setFont(new Font("Italic", 2, 11));
mtplabel.setForeground(Color.cyan);
mtplabel.addMouseListener(new MouseAdapter() {
 
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		mtplabel.setForeground(Color.cyan);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		mtplabel.setForeground(Color.lightGray);
	}
	
	});


JPanel pp = new JPanel(new GridBagLayout());
pp.setLayout(null);
pp.setBackground(Color.white);

JPanel p1 = new JPanel(new GridBagLayout());
p1.setLayout(null);
p1.setBounds(0, 0, 300, 500);
p1.setBackground(Color.LIGHT_GRAY);

JPanel p2 = new JPanel(new GridBagLayout());
p2.setLayout(null);
p2.setBounds(300, 0, 400, 500);
p2.setBackground(Color.black);

JTextField user = new JTextField("Username");
user.setForeground(Color.gray);
user.setFont(new Font("Italic", 2, 12));
user.addFocusListener(new FocusListener() {
	
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		 if (user.getText().isEmpty()) {
	            user.setForeground(Color.gray);
	            user.setText("Username");
	        }
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if (user.getText().equals("Username")) {
            user.setText("");
            user.setForeground(Color.cyan);
        }}}
	);  
user.setBounds(120, 200, 150, 30);
user.setBorder(new LineBorder(Color.black, 1));
user.setBackground(Color.black);

JPasswordField pass = new JPasswordField("Password");
pass.setForeground(Color.gray);
pass.setFont(new Font("Italic", 2, 12));
pass.setBounds(120, 270, 150, 30);
pass.setBorder(new LineBorder(Color.black, 1));
pass.setBackground(Color.black);
pass.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		String username = user.getText().toString();
	    String password = pass.getText().toString();
	    
	    Connection cnx =null;
		 
		 
		cnx = connexionmysql.connectbd();
		
		
	    String sql = "select username , userpassword from users ";
	    try {
	    	PreparedStatement preparedStatement  = cnx.prepareStatement(sql);
	    	ResultSet resultSet = preparedStatement.executeQuery();
	   int i =0 ; 
	  if(username.equals("")||(password.equals("")))
	  {
		  JOptionPane.showMessageDialog(null, "Remplissez Les Champs Vides" );
	  }else
	  {
		  while (resultSet.next()) {
				String username1 = resultSet.getString("username");
				String password1 = resultSet.getString("userpassword"); 
				
			   if(username1.equals(username)&& password1.equals(password))
			   {
				 
				   i=1 ;
				   afterlogin.fenafterlogin(pp, home);
				   
			   }
			   }
			  if(i==0)
				  JOptionPane.showMessageDialog(null, " Connexion Echouée , Information Incorrects");
	  }
	 
	    
	    }catch (SQLException e2) {
			
			e2.printStackTrace();
		}
		
	   
	    pp.setBackground(new Color(194, 158, 255));
	}

	}
		
	});

pass.addFocusListener(new FocusListener() {
	
	@SuppressWarnings("deprecation")
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		 if (pass.getText().isEmpty()) {
	            pass.setForeground(Color.cyan);
	            pass.setText("");
	        }
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if (pass.getText().equals("Password")) {
            pass.setText("");
            pass.setForeground(Color.cyan);
        }}}
	);  

JCheckBox chk = new JCheckBox("show password");
chk.setBounds(130, 305, 120, 20);
chk.setForeground(Color.CYAN);
chk.setBackground(Color.black);
chk.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(chk.isSelected())
		{
			pass.setEchoChar((char)0);
		}else {
			
			pass.setEchoChar('•');
		}
	}
});

// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& LOGIN &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
JButton b =new JButton("LOGIN");
b.setBorderPainted(false);
b.setBounds(230, 360, 110, 30);
b.setBackground(Color.black);
b.setIcon(login);
b.setFont(new Font("italic", 2, 12));
b.setForeground(Color.white);

b.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String username = user.getText().toString();
	    String password = pass.getText().toString();
	    
	    Connection cnx =null;
		 
		 
		cnx = connexionmysql.connectbd();
		
		
	    String sql = "select username , userpassword from users ";
	    try {
	    	PreparedStatement preparedStatement  = cnx.prepareStatement(sql);
	    	ResultSet resultSet = preparedStatement.executeQuery();
	   int i =0 ; 
	  if(username.equals("")||(password.equals("")))
	  {
		  JOptionPane.showMessageDialog(null, "Remplissez Les Champs Vides" );
	  }else
	  {
		  while (resultSet.next()) {
				String username1 = resultSet.getString("username");
				String password1 = resultSet.getString("userpassword"); 
				
			   if(username1.equals(username)&& password1.equals(password))
			   {
				   //JOptionPane.showMessageDialog(null, "Connexion Reussite");
				   i=1 ;
				  afterlogin.fenafterlogin(pp, home);
				   
			   }
			   }
			  if(i==0) {
				  JOptionPane.showMessageDialog(null, " Connexion Echouée , Information Incorrects");
	  }
	 
	  }
	    }catch (SQLException e2) {
			
			e2.printStackTrace();
		}
		
	 
	    pp.setBackground(new Color(194, 158, 255));
	    
	}
});

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

home.setVisible(true);
home.setResizable(false);// bach mtkbarch la fenetre.
home.setSize(700, 530);
home.setIconImage(med.getImage());
home.setLocationRelativeTo(null);

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FORGOT PASSWORD &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
			
mtplabel.addMouseListener(new MouseAdapter() {
 
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		fenlogn();
	}
});		
	


pp.add(doclabel);
pp.add(ecrilabel);
pp.add(p2);
pp.add(p1);
p1.add(f);
p1.add(clocklabel);
p2.add(f1);
p2.add(b);
p2.add(mtplabel);
p2.add(r3);
p2.add(userlabel);
p2.add(passlabel);
p2.add(pass);
p2.add(chk);
p2.add(r2);
p2.add(user);
p2.add(r);
p2.add(loglabel);
home.setContentPane(pp);

clock ();

	}

public static void fenlogn () {
	
	
	JFrame home2 = new JFrame();
	home2.setTitle("Chercher votre mot de passe ");
	home2.setLayout(null);
    home2.setUndecorated(true);
	home2.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
	
	home2.setVisible(true);
	home2.setResizable(false);// bach mtkbarch la fenetre.
	home2.setSize(450, 250);
	
	home2.setLocationRelativeTo(null);
	
	JPanel pano = new JPanel() ;
	pano.setLayout(null);
	pano.setBackground(new Color(153, 153, 255));
	
	
	
	JTextField text1 =new JTextField();
	text1.setBounds(180, 60, 100, 30);	
	text1.setBorder(new LineBorder(Color.black, 1));
	text1.setBackground(Color.white);
	text1.setForeground(Color.black);
	text1.setFont(new Font("Italic", 2, 12));
	
	JTextField text2 =new JTextField();
    text2.setBounds(180, 110, 120, 30);	
	text2.setBorder(new LineBorder(Color.black, 1));
	text2.setBackground(Color.white);
	text2.setEditable(false);
	text2.setForeground(Color.black);
	text2.setFont(new Font("Italic", 2, 12));
	
	JLabel namelabel =new JLabel("username :");
	namelabel.setBounds(100, 55, 70, 40);
	namelabel.setForeground(Color.black);
	
	JLabel passlabel =new JLabel("password :");
	passlabel.setBounds(100, 105, 70, 40);
	passlabel.setForeground(Color.black);
	
	JLabel entr =new JLabel(" entre votre username :");
	entr.setBounds(120, 15, 250, 40);
	entr.setForeground(Color.black);
	entr.setFont(new Font("Times New Roman" ,3,17));
	
	
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& 	KEY ADPTER &&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	text1.addKeyListener(new KeyAdapter() {
		
		@Override
		public void keyReleased(KeyEvent e) {
			
		 	PreparedStatement preparedStatement = null;
		    ResultSet resultSet;
		    Connection cnx =null;
			cnx = connexionmysql.connectbd();
			
			String username = text1.getText().toString();
			String sql = " select userpassword from users  where username = ?";
           
			try {
				preparedStatement =cnx.prepareStatement(sql);
				preparedStatement.setString(1, username);
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next())
				{
					String pass = resultSet.getString("userpassword");
					text2.setText(pass);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	
	});
	
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIN KEY ADAPTER &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	pano.add(entr);
	pano.add(passlabel);
	pano.add(namelabel);
	pano.add(text2);
	pano.add(text1);
	home2.setContentPane(pano);
	
	
}
public static void clock () {
	
	Thread clock = new Thread()
	{
		public void run ()
		{
			try {
				while(true) {
				Calendar cal = new GregorianCalendar();
				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH);
				int year = cal.get(Calendar.YEAR);
				
				int second = cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				
				clocklabel.setText(""+hour+":"+minute+":"+second+"    "+year+"/"+month+"/"+day+".");
				sleep(1000);
				}	
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	};
	
	clock.start();
	
	

}

}
