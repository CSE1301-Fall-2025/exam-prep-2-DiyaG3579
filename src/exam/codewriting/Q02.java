package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q02 {

	/**
	* Draw a dashed line from (x,0) to (x,1)
	* on a standard StdDraw canvas. The length of the
	* dashes and the space between the dashes should
	* both be 0.02.
	* @param x is the x coordinate for the dashed line
	*
	**/
	public static void dashedLine(double x, double y) {
		if (y >= 1.0){
			return;
		}
		StdDraw.line(x, y, x, y+0.02);
		dashedLine(x, y + 0.04);
	}

	public static void main(String[] args) {
		double x = 0.25;
		double y = 0.0;
		dashedLine(x,y);
	}

}
