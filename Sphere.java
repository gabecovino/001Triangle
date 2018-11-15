

import javax.swing.JOptionPane;

public class Sphere {
// Variables
	private double r;
	private double surfaceArea;
	private double volume;
// Constructor
	public Sphere() {
		setVarsToZero();
		setRadius();
		calcSurfaceArea();
		calcVolume();
		showVars();
	}
//Methods
	public void showVars() {
		String msg = 
				"Radius:  " + r
				+ "    Volume:  " + volume 
				+ "    Surface Area:  " + surfaceArea;
		
		
		JOptionPane.showConfirmDialog(null, msg);
	}//end show vars
	
	public void setVarsToZero() {
		r = 0.0;
		surfaceArea = 0.0;
		volume = 0.0;

	}// end set vars to 0
	
	public void setRadius() {
		boolean a = true;
		while (a) {
			try {			
				r = Double.parseDouble(JOptionPane.showInputDialog("Sphere: Enter Radius:  "));
				a = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}		

	}//end set sides
	private void calcVolume() {
		
		volume = (4*((Math.pow(r, 3.0))*Math.PI))/3;
		
	}//end calc volume

	private void calcSurfaceArea() {
		
		surfaceArea = 4*Math.PI*(Math.pow(r,2.0));
		
	}//end calc surface area
	// Methods

}//end class circle
