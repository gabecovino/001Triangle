

import javax.swing.JOptionPane;

public class Triangle {

	// Variables
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	// Constructor
	public Triangle() {
		setVarsToZero();
		setSides();
		calcPerim();
		calcarea();
		showVars();
		calcangles();
	}
	// Methods
	public void showVars() {
		String msg = 
				"Side A: " + sideA + "    Side B: " + sideB 
				+ "    Side C: " + sideC 
				+ "    Area:  " + theArea 
				+ "    Perimeter:  " + perimeter;
		
		
		JOptionPane.showConfirmDialog(null, msg);
	}//end show vars
	
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;

	}// end set vars to 0
	
	public void setSides() {
		//System.out.println("Enter Side A:  ");
		//sideA = keyboard.nextDouble();		
		//System.out.println("Enter Side B:  ");
		//sideB = keyboard.nextDouble();		
		//System.out.println("Enter Side C:  ");
		//sideC = keyboard.nextDouble();
		boolean a = true;
		while (a) {
			try {			
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Triangle: Enter Side A:  "));
				a = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}
		boolean b = true;
		while (b) {
			try {			
				sideB = Double.parseDouble(JOptionPane.showInputDialog("Triangle: Enter Side B:  "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}
		boolean c = true;
		while (c) {
			try {			
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Triangle: Enter Side C:  "));
				c = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "That is not a valid input, please enter a number.");
			}
		}
	}//end set sides
	
	public void calcPerim() {
		perimeter = sideA + sideB + sideC;
	}// end calc perim


	public void calcarea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		theArea = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
		
	}//end calc area



	public void calcangles() {
		double angleA, angleB, angleC;
		double cosA, cosB, cosC;
		cosA = (Math.pow(sideB,2.0) + Math.pow(sideC,2.0)-Math.pow(sideA,2.0))/(2 * sideB * sideC);
		cosB = (Math.pow(sideC,2.0) + Math.pow(sideA,2.0)-Math.pow(sideB,2.0))/(2 * sideC * sideA);
		cosC = (Math.pow(sideA,2.0) + Math.pow(sideB,2.0)-Math.pow(sideC,2.0))/(2 * sideA * sideB);
		angleA = Math.toDegrees(Math.acos(cosA));
		angleB = Math.toDegrees(Math.acos(cosB));
		angleC = Math.toDegrees(Math.acos(cosC));
		JOptionPane.showMessageDialog(null,"Angle A =" + angleA + "    Angle B =" + angleB + "    Angle C =" + angleC);
	}// end calc angles

} // end class Triangle
