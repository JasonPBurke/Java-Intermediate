import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Proj08Runner extends JFrame {// implement here or make a new class and implement there

 JSlider slider;
 JLabel sliderLabel;
 JPanel myPanel;
 JFrame displayWindow;

	 public Proj08Runner(){ // constructor

		System.out.println("Proj08");
		System.out.println("Jason Burke");
    	System.out.println();

		displayWindow = new JFrame();// INSTANTIATE A FRAME OBJECT TO PLACE BUTTONS AND LABEL ON
		displayWindow.setSize(216,108);
		displayWindow.setTitle("Jason Burke");


		sliderLabel = new JLabel("50");	// create a JLabel and assign starting text
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100 , 50);// create a jslider and give position,min,max,and slider starting point

															  // the default for this would create it the same way(w/no args).
		slider.setMajorTickSpacing(10);// major tick mark every 10
		slider.setMinorTickSpacing(2);// minor tick mark every 2
		slider.setPaintTicks(true);// paint the tick marks under the slider
		slider.setPaintLabels(true);// paint the 10, 20, 30 etc under the slider


		myPanel = new JPanel();// create a JPanel.  we will put the JLabel on it so we can center the label on the frame.
		myPanel.add(sliderLabel, "Center");// add the slider label to the panel
		displayWindow.getContentPane().add(myPanel, "North");// add the panel(w/label) to the JFrame object

		displayWindow.getContentPane().add(slider, "Center");
		displayWindow.setVisible(true);
		displayWindow.addWindowListener(new MyWindowListener());

		//Instantiate a listener object for the Scrollbar and register it to receive notification of adjustment events. 
		MyScrollbarListener myScrollbarListener = new MyScrollbarListener();
	    //Note that the Scrollbar listener is not added as a ScrollbarListener but rather is added as a ChangeListener.
		slider.addChangeListener(myScrollbarListener);

	 }// end constructor

	class MyScrollbarListener implements ChangeListener{
		
		public void stateChanged(ChangeEvent e){

			int value = slider.getValue();   
			sliderLabel.setText("" + value);
		}// stateChanged() overridden method		
	}// end class MyScrollbarListener

}// end class Proj09Runner

class MyWindowListener extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end class MyWindowListener
