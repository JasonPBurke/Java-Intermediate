import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
	int xCoor;
	int yCoor;

	MyFrame(String name){
		this.setTitle("Burke, Jason");
		this.setSize(300, 200);
		this.setName(name);
	}// end constructor

	public void paint(Graphics g) {
		// display x/y info on the frame object

		//g.setColor(Color.RED); // set text color to red
		g.drawString("" + xCoor + ", " + yCoor, xCoor, yCoor);
	}// end overridden paint()
}// end class MyFrame


class Proj06Runner extends Frame{
	public Proj06Runner(){// constructor

		System.out.println("Jason Burke");
    	System.out.println();

		// OBJECT #1
		// CREATE A VISUAL TEXTFIELD OBJECT
		TextField myTextField = new TextField("This TextField does nothing");
		myTextField.setName("TextField1");

		// OBJECT #2
		// CREATE 2 VISUAL BUTTON OBJECTS
		Button Button1 = new Button("This Button does nothing");
		Button1.setName("Button1");
		Button Button2 = new Button("Button");
		Button2.setName("Button2");

		// OBJECT #3
		// CREATE A VISUAL FRAME OBJECT
		MyFrame myFrame = new MyFrame("Frame1");

		// ADD THE BUTTONS AND THE TEXTFIELD TO THE FRAME OBJECT
		myFrame.add("North", Button1);
		myFrame.add("West", Button2);
		myFrame.add("South", myTextField);
		myFrame.setVisible(true);
		// INSTANTIATE And REGISTER A MOUSEMOTIONLISTENER OBJECT TO PROCESS MOUSE MOTION EVENTS ON THE FRAME BOJECT
		MyMouseMotionProcessor mouseMotionProc = new MyMouseMotionProcessor(myFrame);
		myFrame.addMouseMotionListener(mouseMotionProc); // REGISTER

		// INSTANTIATE AND REGISTER A LISTENER OBJCET WHICH WILL TERMINATE 
		// THE PROGRAM WHEN THE USER CLOSES THE FRAME OBJECT.
		WProc1 winProcCmd1 = new WProc1();
		myFrame.addWindowListener(winProcCmd1);

	}// end constructor
}// end class Proj05Runner


class MyMouseMotionProcessor extends MouseMotionAdapter {
	MyFrame refToFrame1; // save a reference to the Frame

	MyMouseMotionProcessor(MyFrame inFrame1) {
		// save incoming object reference
		refToFrame1 = inFrame1;
	}// end constructor

	public void mouseMoved(MouseEvent e) {
		// get the x/y coordinates of mouse pointer and store in instance of the Frame object
		refToFrame1.xCoor = e.getX();
		refToFrame1.yCoor = e.getY();
		refToFrame1.setForeground(Color.red);
		//refToFrame1.setColor(Color.red);
		refToFrame1.repaint(); // force a repaint to display the coordinate info
	}// end mouseMoved()

	public void mouseDragged(MouseEvent e) {
		// get the x/y coordinates of mouse pointer and store in instance of the Frame object
		refToFrame1.xCoor = e.getX();
		refToFrame1.yCoor = e.getY();
		refToFrame1.setForeground(Color.black);
		refToFrame1.repaint();
	}// end mouseDragged()
}// end class MyMouseMotionProcessor


//The following listener class is used to terminate the
// program when the user closes the Frame object.
class WProc1 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}// end windowClosing()
}// end class WProc1 