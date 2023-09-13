public class Main
{
  public static void main(String[] args)
  {
    final int x1 = 3;
    final double y1 = 65.34;
    final int x2 = 5;
    final double y2 = 20.71;
    double slope = 0;
    boolean slopeIsPos = false; 
    
    System.out.println("The coordinates of the first point are (" + x1 + ", " + y1 + ")");
    System.out.println("The coordinates of the second point are (" + x2 + ", " + y2 + ")");
    
    slope = (y2 - y1) / (x2 - x1);
    System.out.println("The slope between the two points is " + slope);
    
    slopeIsPos = (slope > 0);
    System.out.println("Is the slope between the two points positive?: " + slopeIsPos);
  }
}
    
