package exam.codewriting;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Q13 {
//Figure out a project that utilizes StdDraw with movement, Recursion, and Methods
public static Boolean testHelper(int a, int i){
    if (i >= a){
        return false;
    }
    return true;
}
public static void circley(double x, double y, double r, int a, int i){
    if (i >= a){
        return;
    }
    StdDraw.pause(1000);
    StdDraw.circle(x, y, r);
    circley(x, y, r+0.02, a, i+1); 
}
public static void random(double x, double y, double r, int a, int i){
    if (i>= a){
        return;
    }
    StdDraw.pause(1000);
    int c1 = (int) (Math.random()*255 + 1);
    int c2 = (int) (Math.random()*255 + 1);
    int c3 = (int) (Math.random()*255 + 1);
    StdDraw.setPenColor(c1, c2, c3);
    StdDraw.filledCircle(x,y,r);
    random(Math.random(),Math.random(), r, a, i+1);
}
public static void movement(double x, double y, double speed){
    if (x >= 0.85 && y >= 0.85){
        return;
    }   
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.circle(x,y,0.05);
        movement(x + speed, y + speed, speed);
}
public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How much scenery would you like?");
    int duration = scan.nextInt();
    int i = 0;
    circley(0.5, 0.5, 0.01, duration, i);
    StdDraw.clear();
    StdDraw.filledRectangle(0.9, 0.9, 0.05, 0.05);
    random(0.5, 0.5, 0.1, duration, i);
    scan.close();
    double moverX = 0.5;
	double moverY = 0.5;
	double moverSpeed = 0.01;
    movement(moverX, moverY, moverSpeed);
}
}
