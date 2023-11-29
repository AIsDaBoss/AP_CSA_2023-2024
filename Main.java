import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Calculator c = new Calculator((int)(Math.random() * 100)); //constructing object + method from Math class

    c.intro(); //calling void nonstatic method through object
    c.setCoord2(c.getFavNum()); //calling non-void method as a parameter
    c.printMath(0); //actual parameter
    c.askForGuess();
    c.printMath(1);

    System.out.println("Restarting...");

    Calculator c1 = new Calculator((int)(Math.random() * 100));

    c1.intro();
    c1.equals(c);//comparing objects with an original equals method
    c1.setCoord2(c.getFavNum());
    c1.printMath(0);
    c1.askForGuess();
    c1.printMath(1);

  }
}
    
