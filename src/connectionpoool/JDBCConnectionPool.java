package connectionpoool;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class JDBCConnectionPool {
		
		protected  static ArrayList<Connection> connex;
	
	public JDBCConnectionPool() {
		connex = new ArrayList<Connection>(20);
		
	}
	 
	public  static void remplir(){
		for(int i=0; i<2;i++) { 
		connex.add(ConnectionBDD.getInst());
		}
		/*
	  JOptionPane.showMessageDialog(null,"le nombre maximum de connexion atteint resseyer plus tard ","",JOptionPane.ERROR_MESSAGE);
		*/
	}
	
	
	public  static Connection getConnection() {
		 
			return connex.remove(0);
		

		}

	public static boolean retourner(Connection con) { 
			 return  connex.add(con);
			}
	
	
	public static void fermerConnection(Connection connect) {
		
		try {
			for(int i=0; i<2; i++) {
       	 if (connect !=null) {
       		
       		 connect.close();
       		 connex.remove(0);
       	 }
       			 /*
       			JOptionPane.showMessageDialog(null,"Sisconnection Is Performed");
       			*/
       			 }
			
		}     	 
		
       	 catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error occured while deconnecting to database");
            }
	
		}
	}
	
	
	
	
		
