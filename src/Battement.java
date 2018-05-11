import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Battement extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Battement(){
	super ("Battements") ;
	JPanel newContentPane = new JPanel(new BorderLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setContentPane(newContentPane);
}
	
	public static void main(String[] args) {
	Battement fenetre = new Battement();
	fenetre.setBounds(400, 400, 300, 200);
	fenetre.setResizable(true);
	fenetre.setVisible(true);
	

}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}