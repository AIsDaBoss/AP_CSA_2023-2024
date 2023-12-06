public class Algorithms{
  
  public static int digits(int x){ //returns # of digits
    if(x ==0) {return 1;}
    int i= 0;
    for(x = Math.abs(x); x > 0; i++) x /= 10; //for loop
    return i;
  }

  public static boolean isDivisibleBy(int a, int b){ //returns if a is divisble by b
    return a%b ==0;
  }

  public static int oddSum(int a, int b){ //returns the sum of all odd numbers between a and b, inclusive
    int i;
    int f;
    int x=0;
    if (a < b){
      i = a;
      f = b;
    }
    else {
      i = b;
      f = a;
    }
    while(i<=f){
      if(Math.abs(i%2) == 1) x += i;
      i++;
    }
    return x;
  }

  public static int tenSum(int a, int b){ //returns the sum of all multiples of 10 between a and b, inclusive
    int i;
    int f;
    int x=0;
    if (a < b){
      i = a;
      f = b;
    }
    else {
      i = b;
      f = a;
    }
    while(i<=f){
      if(Math.abs(i%10) == 0) x += i;
      i++;
    }
    return x;
  }

  public static int digitSum(int x){ //returns the sum of the digits of x
    int i = 0;
    while(Math.abs(x)>0){
      i += x%10;
      x /= 10;
    }
    return i;
  }

  public static int twoPow(int x){ //returns the largest power of two less than or equal to x (for x>0)
    int i = 1;
    while(i <= x){
      i *= 2;
    }
    return i/2;
  }

  public static int onesDigit(int x){ //returns the ones digit of x
    return Math.abs(x%10);
  }

  public static int truncOnes(int x){ //returns x with the ones digit truncated
    return x/10;
  }

  public static int evenDigits(int x){ //returns the number of even digits in x
    x = Math.abs(x);
    int c = 0;
    while (x > 0){
      if((x % 10) % 2 == 0) c++;
      x /= 10;
    }
    return c;
  }

  public static boolean secInFirst(String a, String b){ // returns whether the second string occurs in the first
    return a.indexOf(b) != -1;
  }

  public static String reverseChars(String s){ //returns s backwards
    String x = "";
    while(s.length() > 0){
      x = s.charAt(0) + x;
      s = s.substring(1);
    }
    return x;
  }

  public static boolean isPalindrome(String s) { //returns whether string s is a palindrome
    return s.equals(reverseChars(s));
  }

  public static int occurrences(String a, String b){ // returns the number of occurrences of b in a
    int c = 0;
    while (a.indexOf(b) != -1) {
      c ++;
      a = a.substring(0, a.indexOf(b)) + a.substring(a.indexOf(b) + b.length());
    }
    return c;
  }

  public static String mostCommonChar(String s){ //returns the most common character in string s
    int i = 0;
    String c = s.substring(0,1);
    while(i < s.length()){
      if (occurrences(s, c) < occurrences(s, s.substring(i,i+1))) c = s.substring(i,i+1);
      i++;
    }
    return c;
  }
}