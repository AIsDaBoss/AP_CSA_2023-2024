import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {

    Calculator c = new Calculator(3); //constructing object

    c.intro(); //calling void nonstatic method through object
    c.setCoord2(c.getFavNum()); //calling non-void method as a parameter
    c.printMath(0); //actual parameter
    c.askForGuess();
    c.printMath(1);

  }
}
    
