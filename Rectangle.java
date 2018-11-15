import javax.swing.JOptionPane;

public class Rectangle {
// Variables
	private double side1, side2;
	private double perimeter;
	private double area;
	private double diagonal;
// Constructor
	public Rectangle() {
		setVarsToZero();
		setSides();
		calcarea();
		calcperim();
		calcDiagonal();
		showVars();
	}
	//Methods
	private void showVars() {
		String msg = 
				"Side 1: " + side1 + "    Side 2: " + side2 
				+ "    Area:   " + area 
				+ "    Perimeter:   " + perimeter
				+ "    Diagonal:   " + diagonal;
		
		
		JOptionPane.showConfirmDialog(null, msg);
	}//end show vars
	
	private void setVarsToZero() {
		side1 = 0.0;
		side2 = 0.0;
		perimeter = 0.0;
		area = 0.0;

	}// end set vars to 0
	
	private void setSides() {
		boolean a = true;
		while (a) {
			try {			
				side1 = Double.parseDouble(JOptionPane.showInputDialog("Rectangle: Enter Side 1:  "));
				a = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}
		boolean b = true;
		while (b) {
			try {			
				side2 = Double.parseDouble(JOptionPane.showInputDialog("Rectangle: Enter Side 2:  "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}
	}//end set sides
	private void calcarea() {
		area = side1*side2;
	}//end calc area
	// Methods
	private void calcperim() {
		perimeter = side1*2 + side2*2;
	}//end calc perim
	private void calcDiagonal() {
		diagonal = Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));
	}

}
