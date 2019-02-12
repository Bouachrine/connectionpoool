package connectionpoool;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;
public class pdsMain {

	  private static Connection c,c1;
	  
	public static void main(String[] args) {
	
		
		
		try {
			DataSource d =new DataSource();
			
			d.remplir();
			
			d.remplir();
			c1=d.renvoieConex();
			System.out.println(c1);
		
			d.clotAtr(c1);
			
		
			/*
			
			d.remetConex(c);
			
			
			System.out.println("\n");
			d.remplir();
			
			d.fermerConnection(c);
			d.afficherNv();
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}

