package exam.codewriting;

//import java.util.Scanner;

//import edu.princeton.cs.introcs.StdDraw;

public class Q07 {

	/*
	We wish to create a method to compute and return a rolling sum of values from 1 to n, where
	n is a positive integer. For example:
			rollingSum(5) would return 15 
			rollingSum(3) would return 6
	Complete the method. You may use either iteration or recursion.
	*/
	
	public static int rollingSum (int n, int sum) {
		if (n == 0){
			return sum;
		}
		sum = sum + n;
		return rollingSum(n-1, sum);
	}
	
	public static void main ( String[] args ) {
		int sum = 0;
		System.out.println(rollingSum(5, sum)); //should be 15
		System.out.println(rollingSum(3, sum)); //should be 6
	}

}
