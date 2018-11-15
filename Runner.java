import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		
		String answer;
		JOptionPane.showMessageDialog(null, "Hello, welcome to the geometry programs made by Gabe Covino!!!");
		
		//Instantiate each class
		String cont;
		cont = "y";
		while((cont.equals("Y")) || (cont.equals("y")) || (cont.equals("Yes")) || (cont.equals("yes"))) {
			String validAnswer = "F";
			while(validAnswer == "F") {
					validAnswer = "T";
					answer = JOptionPane.showInputDialog(null, "Please enter your selection: triangle(t), rectangle(r), circle(c), sphere(s), or cuboid(C)");
					if ((answer.equals("t")) || (answer.equals("Triangle")) || (answer.equals("triangle"))) {
						Triangle myTriangle = new Triangle();
					}
					else if ((answer.equals("r")) || (answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
						Rectangle myRectangle = new Rectangle();
					}
					else if ((answer.equals("c")) || (answer.equals("Circle")) || (answer.equals("circle"))) {
						Circle myCircle = new Circle();
					}
					else if ((answer.equals("s")) || (answer.equals("Sphere")) || (answer.equals("sphere"))) {
						Sphere mySphere = new Sphere();
					}
					else if ((answer.equals("C")) || (answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
						Cuboid myCuboid = new Cuboid();
					}
					else {
						
						validAnswer = "F";
						JOptionPane.showMessageDialog(null, "I don't know what that is!");
					}
					
			}//end validanswer loop 
			
			cont = JOptionPane.showInputDialog(null, "Do you want to select another operation?(y/n)");
			
		}//end cont loop
		
		JOptionPane.showMessageDialog(null, "Goodbye! :)");
		
	}//end static void

}//end class runner
