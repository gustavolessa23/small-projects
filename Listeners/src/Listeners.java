import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Listeners extends JFrame implements WindowListener, KeyListener{

	public Listeners() {
		
	setSize(400,400);
	setVisible(true);
	addWindowListener(this);
	JPanel panel = new JPanel();
	JTextField typingArea = new JTextField(20);
	typingArea.addKeyListener(this);
	panel.add(typingArea);
	this.add(panel);
	
	repaint();
	validate();
	
	
	
	
	}
	public static void main(String[] args) {
		new Listeners();
	}
	
	private void displayInfo(KeyEvent e, String keyStatus){
		System.out.println(e.getKeyChar());
	}

	@Override
	public void windowClosing(WindowEvent e) {

		int safe = JOptionPane.showConfirmDialog(this, "Are you sure to close this window?", "Really Closing?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(safe == JOptionPane.YES_OPTION){
		    setDefaultCloseOperation(DISPOSE_ON_CLOSE);//yes
		} else if (safe == JOptionPane.NO_OPTION) {
		    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//cancel
		} 
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {	
		displayInfo(e, "KeyPressed");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
