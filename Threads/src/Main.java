import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener {
	static JLabel cctText = new JLabel();

	static JLabel collegeText = new JLabel();


	public Main() {

		cctText.setHorizontalAlignment(JLabel.CENTER);
		collegeText.setHorizontalAlignment(JLabel.CENTER);


		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(4,1));

		this.add(cctText);

		JPanel first = new JPanel();
		JButton cct = new JButton("Start CCT Thread");
		cct.addActionListener(this);
		cct.setActionCommand("cct");
		first.add(cct);
		this.add(first);


		this.add(collegeText);

		JPanel second = new JPanel();
		JButton college = new JButton("Start College Thread");
		college.addActionListener(this);
		college.setActionCommand("college");
		second.add(college);
		this.add(second);

		validate();
		repaint();
	}

	public void cctThread() {
		cctText.setText("CCT Thread Started");
		Thread cct = new CCT();
		cct.start();
		validate();
		repaint();
	}

	public static void main(String[] args) {	
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("cct")) {
			cctThread();
		} else if (e.getActionCommand().equals("college")) {
			collegeThread();
		}

	}

	private void collegeThread() {
		collegeText.setText("College Thread Started");
		Thread college = new Thread(new College());
		college.start();	
		validate();
		repaint();
	}

}
