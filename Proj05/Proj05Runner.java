import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class MyFrame extends JFrame {

	int xCoor; 
	int yCoor;

	public void paint(Graphics g) {// override paint to draw the x/y on the screen
		super.paint(g);// CLEAR THE PREVIOUS COORDINATES ON THE PANEL
		g.drawString("" + xCoor + ", " + yCoor, xCoor, yCoor);// DRAW COORDINATES ON PANEL
	}// end paint() override
}// end class MyFrame

class MyPanel extends Panel{
	int xCoor;
	int yCoor;
	
	MyPanel(){
		setBounds(new Rectangle( 0, 0, this.getWidth(), this.getHeight()));// SET THE PANEL SIZE/POSITION
	}
	
	public void paint(Graphics g){
		g.drawString("" + xCoor + ", " + yCoor, xCoor, yCoor);
	}
}// end class MyPanel

class Proj05Runner {
	public Proj05Runner(){// constructor

		System.out.println("Proj05");
		System.out.println("Jason Burke");
    	System.out.println();

		MyFrame displayWindow = new MyFrame();// INSTANTIATE A FRAME OBJECT AND SET SOME VARS
		displayWindow.setSize(200,200);
		displayWindow.setTitle("Jason Burke");
		displayWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// DISABLE THE WINDOW'S CLOSE ON 'X' 

		// INSTANTIATE PANEL AND BUTTON OBJECTS
		MyPanel myPanel = new MyPanel();
		JButton theButton = new JButton("Quit");

		// ADD THE PANEL AND BUTTON OBJECT TO THE FRAME OBJECT AND
		// PLACE THE OBJECTS IN CORRECT POSITIONS ON THE FRAME
		displayWindow.getContentPane().add(myPanel, "Center");
		displayWindow.getContentPane().add(theButton, "North");
		displayWindow.setVisible(true);// MAKE FRAME OBJECT VISIBLE
		
		// REGISTER AN ACTIONLISTENER OBJECT ON THE JBUTTON...make the button close the program
		theButton.addActionListener(new QuitListener());

		// TRACK THE X, Y COORDINATES AND ADD THEM THE THE DISPLAYWINDOW
		MouseProc mouseProcCmd = new MouseProc(myPanel);

		// ADD A MOUSELISTENER TO THE PANEL TO ALERT FOR MOUSE PRESSED SO WE CAN PLOT THE X,Y
		myPanel.addMouseListener(mouseProcCmd);

	}// end constructor
}// end class Proj05Runner

// MONITOR THE PANEL FOR MOUSE PRESSES AND DISPLAY COORDINATES WHEN PRESSED
class MouseProc extends MouseAdapter {
	MyPanel refToPanel;

	MouseProc(MyPanel inPanel) {
		refToPanel = inPanel;
	}// end constructor

	public void mousePressed(MouseEvent e) {
		refToPanel.xCoor = e.getX();
		refToPanel.yCoor = e.getY();
		refToPanel.repaint();
	}// end mousePressed() method
}// end class MouseProc

// DEFINE AN ACTIONLISTENER CLASS SO WE CAN TERMINATE THE PROGRAM ON PRESS OF QUIT BUTTON
class QuitListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}// end class QuitListener