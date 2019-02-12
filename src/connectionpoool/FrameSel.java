package connectionpoool;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class FrameSel extends JFrame {

	private JTextArea j;
	private JButton b;
	private String requete;
	private JPanel pan1, pan2;
	
	public FrameSel() {
		super("");
		this.setLayout(new BorderLayout());
		
		j= new JTextArea();
		b= new JButton();
		
		pan1 = new JPanel();
		pan1 = new JPanel();
		
		pan1.add(b);
		pan1.setLayout(new GridLayout());
		
		this.add(pan1,BorderLayout.NORTH);
		this.add(pan2,BorderLayout.CENTER);
		
		
	
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
