package outil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class connexionmysql {
	
	Connection conn = null ;
   public static Connection connectbd() {
	   String url = "jdbc:mysql://localhost:3306/medicament";
		String username ="root";
		String password ="akrammessi1234#";
	  try {
		  Connection conn =DriverManager.getConnection(url, username, password);
		  return conn ;
	  } catch (SQLException e1) {
			
		
	  JOptionPane.showMessageDialog(null, e1);
	return null;
}}}
