import java.util.Scanner;

public class Calculator
{

    private final int x1 = 0; //final variable
    private final double y1 = 65.34; //double variable
    private int x2; //int variable
    private double y2;
    private double slope = 0;
    private boolean slopeIsPos = false;  //boolean variable

    private int favNum; //private instance variable

    public int getFavNum() //accessor, non-void method
    {
        return favNum;
    }

    public Calculator(int x, Double y) //constructor
    {
        x2 = x;
        y2 = y;
    }

    public Calculator(int x) //overloaded constructor
    {
        x2 = x;
    }

    public Calculator(Double y)
    {
        y2 = y;
    }

    public String toString() //toString method for object
    {
        return(String.valueOf(slope)); //method from the string class
    }

    public void intro() //void method
    {
        System.out.println("What is your favorite number?"); //println statement
        Scanner s = new Scanner(System.in); //scanner
        int fN = s.nextInt(); //user input
        System.out.println("..."); //string literal
        System.out.println("You mean " + ((double)fN + 0.1) + ", right?"); //cast int to double
        System.out.println("Well that\'s kinda a boring number. \nAnyways, time for serious business."); //escape sequence
        System.out.println();
        favNum = fN;
    }

    public void setCoord2(int x, double y) // nonstatic void method with parameters
    {
        x2 = x;
        y2 = y;
    }

    public void setCoord2(int x) //overloaded method
    {
        x2 = x;
        y2 = (favNum * x2) + 20.71; //arithmetic operators
    }

    public void setCoord2()
    {
        x2 = favNum;
        y2 = (favNum * x2) + 20.71;
    }

    public void printMath(int g)
    {
        if(g == 0)
        {
            System.out.println("The coordinates of the first point are (" + x1 + ", " + y1 + ")"); //concatenation of strings and literals
            System.out.println("The coordinates of the second point are (" + x2 + ", " + y2 + ")");

            slope = (y2 - y1) / (x2 - x1); //compound expression
            System.out.println("The slope between the two points is " + slope);

            slopeIsPos = (slope > 0); //boolean expression
            System.out.println("Is the slope between the two points positive?: " + slopeIsPos);
            System.out.println();
        } else if (g == 1) //else if statement
        {
            System.out.println("The coordinates of the first point are (" + x1 + ", " + y1 + ")");
            System.out.println("The coordinates of the second point are (" + x2 + ", " + y2 + ")");

            slope = (y2 - y1) / (x2 - x1); //compound expression
            System.out.println("The slope between the two points is " + slope);

            slopeIsPos = (slope > 0); //boolean expression
            System.out.println("Is the slope between the two points positive?: " + slopeIsPos);
            if (slopeIsPos){
                System.out.println("Great job!"); //string literal
            } else{
                System.out.println("Hmm...");
                //System.out.println("Here is a point that would have worked: (" + (x2 + 3);
            }
        }
    }

    public void askForGuess()
    {
        if(!slopeIsPos) //if statement
        {
            System.out.println("Guess how much to add/subtract from x2 to make the slope between point one and point two positive.");
        }
        else //else statement
        {
            System.out.println("Guess how much to add/subtract from x2 to make the slope between point one and point two negative.");
        }
        int tempx = x2;
        tempx ++; //increment assignment operator
        double tempy = (12.5 * tempx) + 20.71;
        System.out.println("Here\'s a hint, y2 when you add 1 to x2 is " + tempy +".");
        Scanner s = new Scanner(System.in);
        int deltax2 = s.nextInt();
        x2 += deltax2; //compound assignment operator
        y2 = (12.5 * x2) + 20.71;

    }


}
