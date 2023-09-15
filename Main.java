import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    final int x1 = 0; //final variable
    final double y1 = 65.34; //double variable
    int x2 = 1; //int variable
    double y2 = (12.5 * x2) + 20.71; //arithmetic operators
    double slope = 0;
    boolean slopeIsPos = false;  //boolean variable
    
    
    
    System.out.println("What is your favorite number?"); //println statement
    Scanner s = new Scanner(System.in); //scanner 
    String favNum = s.nextLine(); //user input
    System.out.println("...");
    System.out.println(favNum + " is kinda a boring number."); //concatenation
    System.out.println("Anyways, time for serious buisness."); //string literal
    System.out.println();
    
    
    
    System.out.println("The coordinates of the first point are (" + x1 + ", " + y1 + ")");
    System.out.println("The coordinates of the second point are (" + x2 + ", " + y2 + ")");
    
    slope = (y2 - y1) / (x2 - x1); //compound expression
    System.out.println("The slope between the two points is " + slope);
    
    slopeIsPos = (slope > 0); //boolean expression
    System.out.println("Is the slope between the two points positive?: " + slopeIsPos);
    System.out.println();
    
    
    
    System.out.println("Guess how much to add/subtract from x2 to make the slope between point one and point two positive.");
    int tempx = x2;
    tempx ++; //increment assignment operator
    double tempy = (12.5 * tempx) + 20.71;
    System.out.println("Here's a hint, y2 when you add 1 to x2 is " + tempy +".");
    s = new Scanner(System.in);
    int deltax2 = s.nextInt();
    x2 += deltax2; //compound assignment operator
    y2 = (12.5 * x2) + 20.71;

    
    System.out.println("The coordinates of the first point are (" + x1 + ", " + y1 + ")");
    System.out.println("The coordinates of the second point are (" + x2 + ", " + y2 + ")");
    
    slope = (y2 - y1) / (x2 - x1);
    System.out.println("The slope between the two points is " + slope);
    
    slopeIsPos = (slope > 0);
    System.out.println("Is the slope between the two points positive?: " + slopeIsPos);
  }
}
    
