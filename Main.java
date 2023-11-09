import java.util.Scanner;
public class
Main
{
  public static void main(String[] args)
  {

    Calculator c = new Calculator((int)(Math.random() * 100)); //constructing object + method from Math class

    c.intro(); //calling void nonstatic method through object
    c.setCoord2(c.getFavNum()); //calling non-void method as a parameter
    c.printMath(0); //actual parameter
    c.askForGuess();
    c.printMath(1);

  }
}
    
