package exam.codewriting;

//import java.util.Scanner;

//import edu.princeton.cs.introcs.StdDraw;

public class Q05 {

	/*
	For this problem we wish to construct a method named countValue that will count and
	return the number of times a particular value appears in an integer array. For example if you were given
	an array:
	
	int [] a = {1, 3, 1};
	
	The call to countValue(a, 1) would return 2, however the call to countValue(a, 9) would return 0.
	You should assume that the array given as an input could be any size, and your method should work
	appropriately. It is not necessary to use recursion for this problem. Complete the method below:
	*/
	public static int countValue (int[] a, int findMe ) {
		int i = 0;
		int count = 0;
		return countValueHelper(a, findMe, i, count);
	}

	public static int countValueHelper(int [] a, int findMe, int i, int count){
		if (i == a.length){
			return count;
		}
		if (a[i] == findMe){
			count++;
		}
		return countValueHelper(a, findMe, i+1, count);
	}


	public static void main ( String[] args ) {
		int[] a = {1, 3, 1, 2, 1};
		System.out.println(countValue(a, 3));
	}

}
