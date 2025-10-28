package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q12 {

	public static void rDraw ( double xCtr , double yCtr , double size ) {
		if (size < 0.05) {	
		return;
		}
		StdDraw.square(xCtr, yCtr, size);
		rDraw(xCtr + size, yCtr - size, size/2);
		rDraw(xCtr - size, yCtr + size, size/2);
		cDraw(xCtr + size, yCtr - size, size/2);
		cDraw(xCtr - size, yCtr + size, size/2);
	}

	public static void cDraw(double xCtr, double yCtr, double size){
		if (size < 0.0001){
			return;
		}
		if (size < 0.05){
			StdDraw.circle(xCtr, yCtr, size);
			cDraw(xCtr - size, yCtr + size, size/2);
			cDraw(xCtr + size, yCtr - size, size/2);
		}
		
		
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion

		rDraw (0.5 , 0.5 , 0.25);
	}

}
