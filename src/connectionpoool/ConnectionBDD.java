package connectionpoool;

import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionBDD {
            public static Statement state1;
            public static ResultSet res;
            protected static Connection connect = null;
           
          

                
            public static Connection getInst(){
            	try {
                String url="jdbc:mysql://localhost:3306/test";
                String user="root";
                String password="";

                Object newInstance = Class.forName("com.mysql.jdbc.Driver");
            	connect= DriverManager.getConnection(url, user, password);
            	/*
            	JOptionPane.showMessageDialog(null,"The Connection is successfully established");
            */
            	}
                catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Error occured while connecting to database","",JOptionPane.ERROR_MESSAGE);
                    
                }
                 return connect;  
            }
            
    
            /*
            public static void main(String [] args ) {
            	ConnectionBDD c = new ConnectionBDD();
            	c.getInst();
            	c.closeInstance(c.getInst());
            }*/
            /*
            
            //Méthode requete de recherche
            public static ResultSet rechercher(String query){
                try {
                res=state1.executeQuery(query);
                }
                catch (Exception e) {
                e.printStackTrace();
                }
                return res;
                } 
            //Méthode d'ajout
            public static void ajouter(String query){
                try {
                state1.executeUpdate(query);
                System.out.println("Element ajouté a la base");
                }
                catch (Exception e) {
                e.printStackTrace();
                }     
                
                }   
            
            //Méthode de modification
            public static void modifier(String query){
                try {
                state1.executeUpdate(query);
                System.out.println("Element Modifié");
                }
                catch (Exception e){
                e.printStackTrace();
                }   
                }   
            //Méthode de supprimer
            public static void supprime(String query){
                try {
                state1.executeUpdate(query);
                System.out.println("Element supprimé");     
                }
                catch (Exception e) {
                e.printStackTrace();
                }   
                }
                */


}