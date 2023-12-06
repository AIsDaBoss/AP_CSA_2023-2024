import java.util.Scanner;

public class Calculator
{

    private final int x1 = 0; //final variable
    private double y1 = 65.34; //double variable
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

    public boolean equals(Calculator other)
    {
        return favNum==other.favNum; //original equals method
    }

    public void intro() //void method
    {
        System.out.println("What is your favorite number?"); //println statement
        Scanner s = new Scanner(System.in); //scanner
        int fN = s.nextInt(); //user input
        System.out.println("..."); //string literal
        System.out.println("You mean " + ((double)fN + 0.1) + ", right?"); //cast int to double
        if(((fN >0 && fN <=100) && (fN %7 !=0)) || (fN %2 ==0)) //logical operators (!,&&,||)
        {
            System.out.println("Okay, fair enough. Good number. \nAnyways, time for serious business.");
        } else {
            System.out.println("Well that\'s kinda a boring number. \nAnyways, time for serious business."); //escape sequence
        }
        System.out.println();
        favNum = fN;
    }

    public void setCoord2(int x, double y) // nonstatic void method with parameters
    {
        y1 = Math.pow((favNum * x1),2) + 20.71;
        x2 = x;
        y2 = y;
    }

    public void setCoord2(int x) //overloaded method
    {
        y1 = Math.pow((favNum * x1),2) + 20.71;
        x2 = x;
        y2 = Math.pow((favNum * x2),2) + 20.71; //arithmetic operators
    }

    public void setCoord2()
    {
        y1 = Math.pow((favNum * x1),2) + 20.71;
        x2 = favNum;
        y2 = Math.pow((favNum * x2),2) + 20.71;
    }

    public void printMath(int g)
    {
        boolean goal = !slopeIsPos;
        System.out.println("The coordinates of the first point are (" + x1 + ", " + y1 + ")"); //concatenation of strings and literals
        System.out.println("The coordinates of the second point are (" + x2 + ", " + y2 + ")");

        slope = (y2 - y1) / (x2 - x1); //compound expression
        System.out.println("The slope between the two points is " + slope);

        slopeIsPos = (slope > 0); //boolean expression
        System.out.println("Is the slope between the two points positive?: " + slopeIsPos);

        if(g == 0) //relational operator/control flow
        {
            System.out.println();
        } else if (g == 1) //else if statement
        {
            if(goal) //if statement
            {
                if (slopeIsPos){ //nested if statement
                    System.out.println("Great job!"); //string literal
                } else{ //else statement
                    System.out.println("Hmm...Not quite.");
                    //System.out.println("Here is a point that would have worked: (" + (x2 + 3);
                }
            }else {
                if (!slopeIsPos) { //logical operator not (!)
                    System.out.println("Great job!");
                } else {
                    System.out.println("Hmm...Not quite.");
                }
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
        double tempy = Math.pow((favNum * tempx),2) + 20.71;
        System.out.println("Here\'s a hint: when you add 1 to x2, y2 is " + tempy +".");
        Scanner s = new Scanner(System.in);
        int deltax2 = s.nextInt();
        x2 += deltax2; //compound assignment operator
        y2 = Math.pow((favNum * x2),2) + 20.71;

    }

    public void printFace()
    {
        for(int y = 0; y < 4; y++) {
            if (y == 0 || y == 3) {
                for (int x = 0; x < 7; x++) {
                    System.out.print("x");
                }
                System.out.println();
            }
            if (y == 1) {
                for (int x = 0; x < 2; x++) {
                    System.out.print("x(.)");
                }
                System.out.println("x");
            }
            if (y == 2) {
                System.out.println("xx[---]x");
            }
        }
        System.out.println();
    }


}
//xxxxxxx
//x(.)x(.)x
//xx[---]x
//xxxxxxx
//
//