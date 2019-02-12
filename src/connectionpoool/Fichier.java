package connectionpoool;

import java.io.*;

import javax.swing.JOptionPane;
public class Fichier{

	private String sequence;
public static String s11,s12;


   public String  toto(String s)
   {
      try
      {
    	  File f =new File("C:\\Users\\bouac\\eclipse-workspace\\connectionpoool\\src\\connectionpoool\\motdepasse.txt");
          String ligne="";
         int ctr = 0;
         BufferedReader br = new BufferedReader(new FileReader(f));

         //lecture du fichier texte

try {
            while ((ligne = br.readLine()) != null)

            {

               if (ligne.startsWith(s))
               {

                  int index = ligne.indexOf(":");
                  String champ11 = ligne.substring(index +1);

                  System.out.println(champ11);
                  String [] tab=ligne.split(":");
                   sequence=tab[1];
                  ctr++;
               }
            }


            if(ctr == 0)
            {
            	JOptionPane.showMessageDialog(null,"erreur: pas de ligne de ce mot de passe :","",JOptionPane.ERROR_MESSAGE);
              Interface i=new Interface ();
      
            }

}
         finally
         {
         // dans tous les cas, on ferme nos flux
            br.close();
         }
      }
      catch(Exception e) {
    	  e.printStackTrace();
      }

   return sequence;
   }

      public void afficher2(String champSequence_1 ,String champSequence_2) {

    	String s1=toto(champSequence_1);
    	String s2= toto(champSequence_2);
    	  s11=s1;
    	  s12=s2;
    	
    	
   }

}