import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.Border;
import javax.swing.border.AbstractBorder;

class Proj07Runner extends JFrame {

	// declared here to allow inner-classes access
	JLabel label;
	JPanel panel;

	public Proj07Runner(){// constructor

		System.out.println("Proj07");
		System.out.println("Jason Burke");
    	System.out.println();

		JFrame displayWindow = new JFrame();// INSTANTIATE A FRAME OBJECT TO PLACE BUTTONS AND LABEL ON
		displayWindow.setSize(250,100);
		displayWindow.setTitle("Jason Burke");
		displayWindow.setLayout(new FlowLayout(FlowLayout.CENTER));// constructor type 2

		// INSTANTIATE  1 LABEL AND 2 BUTTON OBJECTS
		label = new JLabel("Left");
		JButton leftButton = new JButton("Left");
		JButton rightButton = new JButton("Right");

		// MAKE LABEL OPAQUE SO THAT WE CAN SEE THE YELLOW BACKGROUND
		label.setOpaque(true);

		// SET LABEL BACKGROUND COLOR/ text color
		label.setForeground(Color.red);
		label.setBackground(Color.yellow);
		

		// ADD AN ACTION LISTENER TO THE BUTTONS
		leftButton.addActionListener( new ButtonPressed() );
		rightButton.addActionListener( new ButtonPressed() );

		// ADD WINDOW LISTENER TO EXIT WHEN x IS PRESSED
		QuitListener quit = new QuitListener();
		displayWindow.addWindowListener(quit);

		// ADD THE JBUTTONS AND THE JPANEL TO THE JFRAME
		displayWindow.getContentPane().add(leftButton);
		displayWindow.getContentPane().add(label);
		displayWindow.getContentPane().add(rightButton);
		displayWindow.setVisible(true);


	}// end constructor

	// ACTION CLASS LISTENER FOR BUTTON PRESSES
	class ButtonPressed implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		label.setText(e.getActionCommand());
		}
	} // end class ButtonPressed

	class QuitListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}// end class QuitListener

}// end class Proj07Runner
