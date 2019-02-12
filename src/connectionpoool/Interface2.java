package connectionpoool;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Interface2  extends JFrame implements ActionListener{

	private JPanel panelBas;
	private JPanel panelMil, panelS, panelMilH, panelMilB;
	private JButton b3, b4, b5, b6, b7;
	private JLabel b8;
	
	public Interface2() {
		super("Interface 2");
		this.setLayout(new BorderLayout());
		
		b3 = new JButton("Log Out");
		b4 = new JButton("SELECT");
		b5 = new JButton("DELETE");
		b6 = new JButton("INSERT");
		b7 = new JButton("UPDATE");
		b8= new JLabel("      ");
		
		panelBas =new JPanel();
		panelMil = new JPanel();
		panelMilH = new JPanel();
		panelMilB = new JPanel();
		panelS = new JPanel();
		
		panelS.setLayout(new GridLayout());
		panelS.add(b8);
	
		
		
		//panelMil.setLayout(new GridLayout(1,2));
		panelMil.add(panelMilH);
		panelMil.add(panelMilB);
		
		panelMilH.add(b4);
		panelMilH.add(b5);
		panelMilB.add(b6);
		panelMilB.add(b7);
		panelBas.setLayout(new GridLayout());
		panelBas.add(b3);
		
		
		b3.addActionListener(this);
		this.add(panelS,BorderLayout.NORTH );
		this.add(panelMil, BorderLayout.CENTER);
		this.add(panelBas, BorderLayout.SOUTH);
		/*this.add(panelMil, new GridLayout(2,2));*/
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
public void actionPerformed(ActionEvent event) {
		
		if(event.getSource()==b3) {
			
			DataSource.remetConex(Interface.c);
			System.out.println(JDBCConnectionPool.connex);
			
			DataSource.clotAtr(Interface.c);
			System.out.println(JDBCConnectionPool.connex);
			
		Interface i=new Interface();
			
		}

}
	}

