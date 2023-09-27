import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {

    Calculator c = new Calculator(); //constructor

    c.intro();
    c.setCoord2(c.getFavNum());
    c.printMath(0); //actual parameter
    c.askForGuess();
    c.printMath(1);

  }
}
    
