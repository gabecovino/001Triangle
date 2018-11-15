

import javax.swing.JOptionPane;

public class Circle {
// Variables
	private double r;
	private double circum;
	private double area;
// Constructor
	public Circle() {
		setVarsToZero();
		setRadius();
		calccircum();
		calcarea();
		showVars();
	}
//Methods
	public void showVars() {
		String msg = 
				"Radius: " + r
				+ "    Area:  " + area 
				+ "    Circumfrence:  " + circum;
		
		
		JOptionPane.showConfirmDialog(null, msg);
	}//end show vars
	
	public void setVarsToZero() {
		r = 0.0;
		circum = 0.0;
		area = 0.0;

	}// end set vars to 0
	
	public void setRadius() {
		boolean a = true;
		while (a) {
			try {			
				r = Double.parseDouble(JOptionPane.showInputDialog("Circle: Enter Radius:  "));
				a = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}		

	}//end set sides
	private void calcarea() {
		
		area = (Math.pow(r, 2.0))*Math.PI;
		
	}

	private void calccircum() {
		
		circum = Math.PI*(r*2);
		
	}
	// Methods

}//end class circle
