package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q04 {

	/*
	We wish to create a method to create and fill an array of doubles. Complete the fillDoubleArray
	method below by first creating an array of doubles of size n. You should then iterate through the array
	and fill it by reading doubles from the Scanner in parameter. The method should then return the filled
	array.
	 */
	public static double[] fillDoubleArray (int n, Scanner in, int i, double [] x) {
		if (i == n){
			return x;
		}
		System.out.println("What x coordinate would you like");
		x[i] = in.nextDouble();
		return fillDoubleArray(n, in, i+1, x);
	}
	public static double [] fillDoubleArrayY (int n, Scanner in, int i, double [] y){
			if (i == n){
			return y;
		}
		System.out.println("What y coordinate would you like");
		y[i] = in.nextDouble();
		return fillDoubleArrayY(n, in, i+1, y);
	}

	/*
	We wish to make a program that draws user-defined polygons. You should first request the user to specify
	how many sides the polygon should have. Then, use the fillDoubleArray method from the previous
	part to create the two necessary arrays before drawing the polygon. The main method has already been
	started for you:
	 */
	public static void main ( String[] args ) {
		Scanner in = new Scanner (System .in);
		System.out.println("How many sides would you like your polygon to have?");
		int sides = in.nextInt();
		int i = 0;
		double [] x = new double [sides];
		double [] y = new double [sides];
		fillDoubleArray(sides,in, i, x);
		fillDoubleArrayY(sides, in, i, y);
		System.out.println("Would you like it filled");
		Boolean ans = in.nextBoolean();		
		System.out.println(ans);
		StdDraw.setPenColor(107, 117, 220);
		if (ans = true){
			StdDraw.filledPolygon(x,y);
		}
		else{
			StdDraw.polygon(x,y);
		}
	}

}
