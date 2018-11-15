import javax.swing.JOptionPane;

public class Cuboid {
// Variables
	private double side1, side2, side3;
	private double surfaceArea;
	private double volume;
	
// Constructor
	public Cuboid() {
		setVarsToZero();
		setSides();
		calcVolume();
		calcSurfaceArea();
		showVars();
	}
//Methods
	private void showVars() {
		String msg = 
				"Side 1: " + side1 + "    Side 2: " + side2 + "    Side 3: " + side3
				+ "    Volume:  " + volume 
				+ "    Surface Area:  " + surfaceArea;
		
		
		JOptionPane.showConfirmDialog(null, msg);
	}//end show vars
	
	private void setVarsToZero() {
		side1 = 0.0;
		side2 = 0.0;
		surfaceArea = 0.0;
		volume = 0.0;

	}// end set vars to 0
	
	private void setSides() {
		boolean a = true;
		while (a) {
			try {			
				side1 = Double.parseDouble(JOptionPane.showInputDialog("Cuboid: Enter Side 1:  "));
				a = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}		
		boolean b = true;
		while (b) {
			try {			
				side2 = Double.parseDouble(JOptionPane.showInputDialog("Cuboid: Enter Side 2:  "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}		
		boolean c = true;
		while (c) {
			try {			
				side3 = Double.parseDouble(JOptionPane.showInputDialog("Cuboid: Enter Side 3:  "));
				c = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}
	}//end set sides
	private void calcVolume() {
		volume = side1*side2*side3;
	}//end calc area
	// Methods
	private void calcSurfaceArea() {
		surfaceArea = (side1*side2)*2 + (side2*side3)*2 + (side1*side3)*2;
	}//end calc perim

}
